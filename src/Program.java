
public class Program {
	private final static Program pro = new Program();
	
	//instructions
	public final int IMM = -1,LC = -2,LI = -3,SC = -4,SI = -5,PUSH = -6,JMP = -7,JZ = -8,JNZ = -9,CALL = -10,
			ENT = -11,ADJ = -12,LEV = -13,LEA = -14,OR = -15,XOR = -16,AND = -17,EQ = -18,NE = -19,LT = -20,LE = -21,
			GT = -22,GE = -23,SHL = -24,SHR = -25,ADD = -26,SUB = -27,MUL = -28,DIV = -29,MOD = -30,
			EXIT = -31,OPEN = -32,CLOSE = -33,READ = -34,PRTF = -35,MALC = -36,MSET = -37,MCMP = -38,
			ID = -39, NUM = -40, LIFD = -41, LCFD = -42, SITD = -43, SCTD = -44;
	
	// type of variable/function
	public final int CHAR = -1, INT = -2, PTR = -3;
	// type of declaration.
	public final int GLOBAL = -1, LOCAL = -2, FUN = -3, SYS = -4;
	
	public int argc,argv;

	public class Identifier{
		int Token;				//ID
		int Hash;				//hash value
		String Name;			
		int Type;				// int | char | ptr...
		int Class;				// global | local | number
		int Value;				// the adress of function
		int BType;
		int BClass;
		int BValue;
		public Identifier() {
			// TODO Auto-generated constructor stub
			Token = Hash = Type = Class = Value =
					BType = BClass = BValue = 0;
			Name = "";
		}
	}
	
	public int MemorySize;			// default size of text/data/stack
	int[] TextSegment;				//text segment
	int[] StackSegment;				//stack segment
	byte[] DataSegment;				//data segment
	Identifier[] Symbols;					//symbols table
	
	int _textpos;
	int pc, bp, sp, ax, cycle; 		// virtual machine registers
	
	private Program(){
		MemorySize = 256 * 1024;	
		try{
			TextSegment = new int[MemorySize];
			StackSegment = new int[MemorySize];
			DataSegment = new byte[MemorySize];
			Symbols = new Identifier[MemorySize];
			for(int i = 0; i < MemorySize; ++i){
				Symbols[i] = new Identifier();
			}
		}catch (Exception e) {  
            e.printStackTrace();  
            return ;  
        }  
		
		Symbols[0].Name = "main";
		Symbols[0].Token = ID;
		Symbols[0].Hash = 'm';
		for(int i = 1; i < Symbols[0].Name.length(); ++i){
			Symbols[0].Hash = Symbols[0].Hash * 147 + Symbols[0].Name.charAt(i); 
		}
		
		_textpos = 0;
		bp = 0;
		ax = 0;
		pc = 0;
		sp = MemorySize;
		StackSegment[--sp] = EXIT;
	}
	
	public static Program getInstance(){
		return pro;
	}
	
	private byte[] inttobytearray(int integer){
		int bytenum = (40 - Integer.numberOfLeadingZeros(integer<0?~integer:integer))/8;
		byte[] bytearray = new byte[4];
		for(int n = 0; n < bytenum; n++){
			bytearray[3-n] = (byte)(integer>>>(n*8));
		}
		return bytearray;
	}
	
	private int bytearraytoint(byte[] b, int offset){
		int value = 0;
		for(int i = 0;i < 4; i++){
			int shift = (4-1-i)*8;
			value += (b[i + offset] & 0x000000FF) << shift;
		}
		return value;
	}
	
	private void fillinttobytearray(byte[] b, int offset, int integer){
		byte[] source = new byte[4];
		source = inttobytearray(integer);
		for(int i = 0; i < 4; i++){
			b[i+offset] = source[i];
		}
		return;
	}

	
	public int eval(){
		int op, tmp;
		cycle = 0;
		pc = Symbols[0].Value;
		if(pc == 0){
			System.out.println("can not find the main function");
			System.exit(-1);
		}
		
		TextSegment[++_textpos] = PUSH;
		int end = _textpos;
		TextSegment[++_textpos] = EXIT;
		
		while (true) {
	        cycle ++;
	        if(pc < 0){
	        	pc = end;
	        }
	        op = TextSegment[pc++]; // get next operation code
	      
	        System.out.print(cycle + "> ");
	        
	        if (op == IMM)       {System.out.print("IMM	"+TextSegment[pc]);ax = TextSegment[pc++];}                      // load immediate value to ax
	        else if (op == LCFD) {System.out.print("LCFD");ax = (char)DataSegment[ax];}
	        else if (op == LIFD) {System.out.print("LIFD");ax = bytearraytoint(DataSegment, ax);}
	        else if (op == LC)   {System.out.print("LC");ax = (char)StackSegment[ax];}                               // load character to ax, address in ax
	        else if (op == LI)   {System.out.print("LI");ax = (int)StackSegment[ax];}                                // load integer to ax, address in ax
	        else if (op == SCTD) {System.out.print("SCFD");ax = DataSegment[StackSegment[sp++]] = (byte)ax;}
	        else if (op == SITD) {System.out.print("SIFD"); fillinttobytearray(DataSegment, StackSegment[sp++], ax);}
	        else if (op == SC)   {System.out.print("SC");ax = StackSegment[StackSegment[sp++]] = (char)ax;}			// save character to address, value in ax, address on stack
	        else if (op == SI)   {System.out.print("SI");StackSegment[StackSegment[sp++]] = ax;}                     // save integer to address, value in ax, address on stack
	        else if (op == PUSH) {System.out.print("PUSH");StackSegment[--sp] = ax;}                   // push the value of ax onto the stack
	        else if (op == JMP)  {System.out.print("JMP	"+TextSegment[pc]);pc = TextSegment[pc];}                        // jump to the address
	        else if (op == JZ)   {System.out.print("JZ	"+TextSegment[pc]);pc = (ax!=0 ? pc + 1 : TextSegment[pc]);}     // jump if ax is zero
	        else if (op == JNZ)  {System.out.print("JNZ	"+TextSegment[pc]);pc = (ax!=0 ? TextSegment[pc] : pc + 1);}     // jump if ax is zero
	        else if (op == CALL) {System.out.print("CALL "+TextSegment[pc]);StackSegment[--sp] = (int)(pc+1); pc = TextSegment[pc];} // call subroutine
	        //else if (op == RET)  {pc = (int *)*sp++;}                              // return from subroutine;
	        else if (op == ENT)  {System.out.print("ENT	"+TextSegment[pc]);StackSegment[--sp] = (int)bp; bp = sp; sp = sp - TextSegment[pc++];} // make new stack frame
	        else if (op == ADJ)  {System.out.print("ADJ	"+TextSegment[pc]);sp = sp + TextSegment[pc++];}                 // add esp, <size>
	        else if (op == LEV)  {System.out.print("LEV");sp = bp; bp = (int)StackSegment[sp++]; pc = (int)StackSegment[sp++];}  // restore call frame and PC
	        else if (op == LEA)  {System.out.print("LEA	"+TextSegment[pc]);ax = (int)(bp + TextSegment[pc++]);}       // load address for arguments.

	        else if (op == OR)  {System.out.print("OR");ax = StackSegment[sp++] | ax;}
	        else if (op == XOR) ax = StackSegment[sp++] ^ ax;
	        else if (op == AND) {System.out.print("AND");ax = StackSegment[sp++] & ax;}
	        else if (op == EQ)  ax = StackSegment[sp++] == ax ? 1 : 0;
	        else if (op == NE)  ax = StackSegment[sp++] != ax ? 1 : 0;
	        else if (op == LT)  {System.out.print("SUB");ax = StackSegment[sp++] < ax ? 1 : 0;}
	        else if (op == LE)  ax = StackSegment[sp++] <= ax ? 1 : 0;
	        else if (op == GT)  {System.out.print("GT");ax = StackSegment[sp++] >  ax ? 1 : 0;}
	        else if (op == GE)  {System.out.print("GE");ax = StackSegment[sp++] >= ax ? 1 : 0;}
	        else if (op == SHL) ax = StackSegment[sp++] << ax;
	        else if (op == SHR) ax = StackSegment[sp++] >> ax;
	        else if (op == ADD) {System.out.print("ADD");ax = StackSegment[sp++] + ax;}
	        else if (op == SUB) {System.out.print("SUB");ax = StackSegment[sp++] - ax;}
	        else if (op == MUL) {System.out.print("MUL");ax = StackSegment[sp++] * ax;}
	        else if (op == DIV) ax = StackSegment[sp++] / ax;
	        else if (op == MOD) ax = StackSegment[sp++] % ax;

	        else if (op == EXIT) { System.out.println("exit("+ StackSegment[sp] +")"); return StackSegment[sp];}
//	        else if (op == OPEN) { ax = open((char *)sp[1], sp[0]); }
//	        else if (op == CLOS) { ax = close(*sp);}
//	        else if (op == READ) { ax = read(sp[2], (char *)sp[1], *sp); }
//	        else if (op == PRTF) { tmp = sp + pc[1]; ax = printf((char *)tmp[-1], tmp[-2], tmp[-3], tmp[-4], tmp[-5], tmp[-6]); }
//	        else if (op == MALC) { ax = (int)malloc(*sp);}
//	        else if (op == MSET) { ax = (int)memset((char *)sp[2], sp[1], *sp);}
//	        else if (op == MCMP) { ax = memcmp((char *)sp[2], (char *)sp[1], *sp);}
	        else {
	        	System.out.println("unknown instruction:" + op);
	            return -1;
	        }
	        System.out.println();
	    }
	}
}
