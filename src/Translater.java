
public class Translater extends InterpreterBaseVisitor<Object> {
	
	private int expr_type;		//remember expr's type
	private int bp_pos;			//remember params's number
	private int local_pos;		//remember localid's number
	private int data_pos;		//remember datasegment's index
	private int id_index = 0;	//remember currend_id's position
	private int _class;			//remember decl global or local
	
	@Override
	public Object visitGlobal_declaration(InterpreterParser.Global_declarationContext ctx) {
		// TODO Auto-generated method stub
		_class = Program.getInstance().GLOBAL;
		if (ctx.enum_decl() != null) {
			visit(ctx.enum_decl());
		}
		if(ctx.variable_decl() != null){
			visit(ctx.variable_decl());
		}
		if(ctx.function_decl() != null){
			visit(ctx.function_decl());		
		}
		return null;
	}
	
	@Override
	public Object visitEnum_decl(InterpreterParser.Enum_declContext ctx) {
		// TODO Auto-generated method stub
		int val = 0;
		for(int i = 1; i < ctx.id().size(); ++i){
			//visit(ctx.ID(i));
			visit(ctx.id(i));
			if (i - 1 < ctx.NUM().size()){
				val = Integer.valueOf(ctx.NUM(i-1).getText());
			}
			Program.getInstance().Symbols[id_index].Class = Program.getInstance().NUM;
			Program.getInstance().Symbols[id_index].Type = Program.getInstance().INT;
			Program.getInstance().Symbols[id_index].Value = val++;
		}
		return null;
	}
	
	@Override
	public Object visitVariable_decl(InterpreterParser.Variable_declContext ctx) {
		// TODO Auto-generated method stub
		int type = Program.getInstance().INT;
		String t = ctx.type().getText().toString();
		if(t.charAt(0) == 'i'){
			for(int i = 3; i < t.length(); ++i){
				if(t.charAt(i)=='*')
					type += Program.getInstance().PTR;
			}
		}else if (t.charAt(0) == 'c'){
			type = Program.getInstance().CHAR;
			for(int i = 4; i < t.length(); ++i){
				if(t.charAt(i)=='*')
					type += Program.getInstance().PTR;
			}
		}
		
		for(int i = 0; i < ctx.id().size(); ++i){
			visit(ctx.id(i));
			if(Program.getInstance().Symbols[id_index].Class == _class){
				System.out.println("duplicate identifier declaration");
				System.exit(-1);
			}
			
			if(_class == Program.getInstance().GLOBAL){
				Program.getInstance().Symbols[id_index].Value = data_pos;
				data_pos += 4;
			}
			else{
				Program.getInstance().Symbols[id_index].BType = Program.getInstance().Symbols[id_index].Type;
				Program.getInstance().Symbols[id_index].BClass = Program.getInstance().Symbols[id_index].Class;
				Program.getInstance().Symbols[id_index].Value = ++local_pos;
			}
			Program.getInstance().Symbols[id_index].Type = type;
			Program.getInstance().Symbols[id_index].Class = _class;
		}
		
		return null;
	}
	
	@Override
	public Object visitFunction_decl(InterpreterParser.Function_declContext ctx) {
		// TODO Auto-generated method stub
		int type = Program.getInstance().INT;
		String t = ctx.type().getText().toString();
		if(t.charAt(0) == 'i'){
			for(int i = 3; i < t.length(); ++i){
				if(t.charAt(i)=='*')
					type += Program.getInstance().PTR;
			}
		}else if (t.charAt(0) == 'c'){
			type = Program.getInstance().CHAR;
			for(int i = 4; i < t.length(); ++i){
				if(t.charAt(i)=='*')
					type += Program.getInstance().PTR;
			}
		}
		visit(ctx.id());
		if(Program.getInstance().Symbols[id_index].Class != 0){
			System.out.println("duplicate function declaration");
			System.exit(-1);
		}
		Program.getInstance().Symbols[id_index].Type = type;
		Program.getInstance().Symbols[id_index].Class = Program.getInstance().FUN;
		Program.getInstance().Symbols[id_index].Value = Program.getInstance()._textpos + 1;
		visit(ctx.parameter_decl());
		
		_class = Program.getInstance().LOCAL;
		visit(ctx.body_decl());
		
		id_index = 0;
		while(Program.getInstance().Symbols[id_index].Token != 0){
			if(Program.getInstance().Symbols[id_index].Class == Program.getInstance().LOCAL){
				Program.getInstance().Symbols[id_index].Class = Program.getInstance().Symbols[id_index].BClass;
				Program.getInstance().Symbols[id_index].Type = Program.getInstance().Symbols[id_index].BType;
				Program.getInstance().Symbols[id_index].Value = Program.getInstance().Symbols[id_index].BValue;
			}
			id_index++;
		}
		return null;
	}
	
	@Override
	public Object visitParameter_decl(InterpreterParser.Parameter_declContext ctx) {
		// TODO Auto-generated method stub
		int type, params = 0;
		for(int i = 0; i < ctx.id().size(); ++i){
			type = Program.getInstance().INT;
			String t = ctx.type(i).getText().toString();
			if(t.charAt(0) == 'i'){
				for(int j = 3; j < t.length(); ++j){
					if(t.charAt(j)=='*')
						type += Program.getInstance().PTR;
				}
			}else if (t.charAt(0) == 'c'){
				type = Program.getInstance().CHAR;
				for(int j = 4; j < t.length(); ++j){
					if(t.charAt(j)=='*')
						type += Program.getInstance().PTR;
				}
			}
			visit(ctx.id(i));
			if(Program.getInstance().Symbols[id_index].Class == Program.getInstance().LOCAL){
				System.out.println("duplicate the function's local identifier");
				System.exit(-1);
			}
			Program.getInstance().Symbols[id_index].BType = Program.getInstance().Symbols[id_index].Type;
			Program.getInstance().Symbols[id_index].Type = type;
			Program.getInstance().Symbols[id_index].BClass = Program.getInstance().Symbols[id_index].Class;
			Program.getInstance().Symbols[id_index].Class = Program.getInstance().LOCAL;
			Program.getInstance().Symbols[id_index].BValue = Program.getInstance().Symbols[id_index].Value;
			Program.getInstance().Symbols[id_index].Value = params++;
		}
		bp_pos = params + 1;
		return null;
	}
	
	@Override
	public Object visitBody_decl(InterpreterParser.Body_declContext ctx) {
		// TODO Auto-generated method stub
		local_pos = bp_pos;
		
		for(int i = 0; i < ctx.variable_decl().size(); ++i){
			visit(ctx.variable_decl(i));;			
		}
		
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().ENT;
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = local_pos - bp_pos;
		
		for(int i = 0; ctx.statement() != null && i < ctx.statement().size(); ++i){
			visit(ctx.statement(i));			
		}
		
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().LEV;
		
		return null;
	}
	
	@Override
	public Object visitString(InterpreterParser.StringContext ctx) {
		// TODO Auto-generated method stub
		String s ;
		
		if(ctx.Constant() != null){
			s = ctx.Constant().getText().toString();
		}else{
			s = ctx.StringLiteral().getText().toString();
		}
		System.out.println(s);
		char c = s.charAt(0);
		int last_pos = data_pos;
		int i = 1;
		int val = 0;
		while(i < s.length() - 1){
			val = (int)s.charAt(i++);
			if(val == '\\'){
				val = s.charAt(i++);
				if(val == 'n'){
					val = '\n';
				}
			}
			if(c == '"')
				Program.getInstance().DataSegment[++data_pos] = (byte)val;
		}
		
		if(c == '\''){		// ' '
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().IMM;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = val;
			expr_type = Program.getInstance().INT;
		}else{			//  "  "
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().IMM;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = last_pos;
			data_pos = (data_pos + 4) & (-4);
			expr_type = Program.getInstance().PTR;
		}
		return null;
	}
	
	@Override
	public Object visitBinaryExpr(InterpreterParser.BinaryExprContext ctx) {
		// TODO Auto-generated method stub
		int tmp = expr_type;
		int addr;
		switch (ctx.op.getType()) {
		case InterpreterParser.Mul:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().MUL;
			expr_type = tmp;
			break;
		case InterpreterParser.Div:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().DIV;
			expr_type = tmp;
			break;
		case InterpreterParser.Mod:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().MOD;
			expr_type = tmp;
			break;
		case InterpreterParser.Add:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			expr_type = tmp;
			if (expr_type < Program.getInstance().PTR){
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().IMM;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = 4;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().MUL;
			}
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().ADD;
			break;
		case InterpreterParser.Sub:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			if(tmp > Program.getInstance().PTR && tmp == expr_type){
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().SUB;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().IMM;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = 4;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().DIV;
				expr_type = Program.getInstance().INT;
			}else if(tmp > Program.getInstance().PTR){
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().IMM;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = 4;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().MUL;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().SUB;
				expr_type = tmp;
			}else{
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().SUB;
				expr_type = tmp;
			}
			break;
		case InterpreterParser.Shl:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().SHL;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Shr:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().SHR;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Lt:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().LT;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Gt:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().GT;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Le:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().LE;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Ge:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().GE;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Eq:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().EQ;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Ne:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().NE;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.And:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().AND;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Xor:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().XOR;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Or:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().OR;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Lan:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().JZ;
			addr = ++Program.getInstance()._textpos;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[addr] = Program.getInstance()._textpos + 1;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Lor:
			visit(ctx.expr(0));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().JNZ;
			addr = ++Program.getInstance()._textpos;
			visit(ctx.expr(1));
			Program.getInstance().TextSegment[addr] = Program.getInstance()._textpos + 1;
			expr_type = Program.getInstance().INT;
			break;
		case InterpreterParser.Assign:
			visit(ctx.expr(0));
			tmp = expr_type;
			int id = id_index;
			if(Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program.getInstance().LC ||
					Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program.getInstance().LI ||
					Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program.getInstance().LIFD ||
					Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program.getInstance().LCFD){
				Program.getInstance().TextSegment[Program.getInstance()._textpos] = Program.getInstance().PUSH;
			}else{
				System.out.println("bad lefthandside value in assignment");
				System.exit(-1);
			}
			
			visit(ctx.expr(1));
			expr_type = tmp;
			if(Program.getInstance().Symbols[id].Class == Program.getInstance().LOCAL){
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = 
						(expr_type == Program.getInstance().CHAR) ? Program.getInstance().SC : Program.getInstance().SI;				
			}
			else if(Program.getInstance().Symbols[id].Class == Program.getInstance().GLOBAL){
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = 
						(expr_type == Program.getInstance().CHAR) ? Program.getInstance().SCTD : Program.getInstance().SITD;			
			}else{
				System.out.println("bad lefthandside value'class in assignment");
				System.exit(-1);
			}
			break;
		default:
			break;
		}	
		return null;
	}
	
	@Override
	public Object visitPostfixIncDec(InterpreterParser.PostfixIncDecContext ctx) {
		// TODO Auto-generated method stub
		visit(ctx.expr());
		if (Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program
				.getInstance().LC) {
			Program.getInstance().TextSegment[Program.getInstance()._textpos] = Program
					.getInstance().PUSH;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
					.getInstance().LC;
		} else if (Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program
				.getInstance().LI) {
			Program.getInstance().TextSegment[Program.getInstance()._textpos] = Program
					.getInstance().PUSH;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
					.getInstance().LI;
		} else if (Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program
				.getInstance().LIFD) {
			Program.getInstance().TextSegment[Program.getInstance()._textpos] = Program
					.getInstance().PUSH;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
					.getInstance().LIFD;
		} else if (Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program
				.getInstance().LCFD) {
			Program.getInstance().TextSegment[Program.getInstance()._textpos] = Program
					.getInstance().PUSH;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
					.getInstance().LCFD;
		} else {
			System.out.println("bad lefthandside value of postexpr");
			System.exit(-1);
		}
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
				.getInstance().PUSH;
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
				.getInstance().IMM;
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = (expr_type < Program
				.getInstance().PTR) ? 4 : 1;
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = (ctx.op
				.getType() == InterpreterParser.Inc) ? Program.getInstance().ADD
				: Program.getInstance().SUB;

		if (Program.getInstance().Symbols[id_index].Class == Program.getInstance().LOCAL) {
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = (expr_type == Program
					.getInstance().CHAR) ? Program.getInstance().SC : Program
					.getInstance().SI;
		} else if (Program.getInstance().Symbols[id_index].Class == Program
				.getInstance().GLOBAL) {
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = (expr_type == Program
					.getInstance().CHAR) ? Program.getInstance().SCTD : Program
					.getInstance().SITD;
		} else {
			System.out.println("bad expr'class in assignment");
			System.exit(-1);
		}

		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
				.getInstance().PUSH;
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
				.getInstance().IMM;
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = (expr_type < Program
				.getInstance().PTR) ? 4 : 1;
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = (ctx.op
				.getType() == InterpreterParser.Inc) ? Program.getInstance().SUB
				: Program.getInstance().ADD;
		return null;
	}
	
	@Override
	public Object visitUnaryExpr(InterpreterParser.UnaryExprContext ctx) {
		// TODO Auto-generated method stub
		if(ctx.op.getType() == InterpreterParser.Inc || ctx.op.getType() == InterpreterParser.Dec){
			visit(ctx.expr());
			if(Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program.getInstance().LC){
				Program.getInstance().TextSegment[Program.getInstance()._textpos] = Program.getInstance().PUSH;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().LC;
			}else if(Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program.getInstance().LI){
				Program.getInstance().TextSegment[Program.getInstance()._textpos] = Program.getInstance().PUSH;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().LI;
			}else if(Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program.getInstance().LIFD){
				Program.getInstance().TextSegment[Program.getInstance()._textpos] = Program.getInstance().PUSH;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().LIFD;
			}else if(Program.getInstance().TextSegment[Program.getInstance()._textpos] == Program.getInstance().LCFD){
				Program.getInstance().TextSegment[Program.getInstance()._textpos] = Program.getInstance().PUSH;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().LCFD;
			}else{
				System.out.println("bad lefthandside value of unaryexpr");
				System.exit(-1);
			}
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().IMM;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = 
					(expr_type < Program.getInstance().PTR)	? 4 : 1;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = (ctx.op
					.getType() == InterpreterParser.Inc) ? Program
					.getInstance().ADD : Program.getInstance().SUB;
			if (Program.getInstance().Symbols[id_index].Class == Program.getInstance().LOCAL) {
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = (expr_type == Program
						.getInstance().CHAR) ? Program.getInstance().SC
						: Program.getInstance().SI;
			} else if (Program.getInstance().Symbols[id_index].Class == Program.getInstance().GLOBAL) {
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = (expr_type == Program
						.getInstance().CHAR) ? Program.getInstance().SCTD
						: Program.getInstance().SITD;
			}
		}
		
		if(ctx.op.getType() == InterpreterParser.Not || ctx.op.getType() == InterpreterParser.Til){
			visit(ctx.expr());
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().IMM;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = 
					(ctx.op.getType() == InterpreterParser.Not)? 0 : -1;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = 
					(ctx.op.getType() == InterpreterParser.Not)? Program.getInstance().EQ :Program.getInstance().XOR;
			expr_type = Program.getInstance().INT;
		}
		
		if (ctx.op.getType() == InterpreterParser.Add
				|| ctx.op.getType() == InterpreterParser.Sub) {
			if (ctx.op.getType() == InterpreterParser.Add) {
				visit(ctx.expr());
				expr_type = Program.getInstance().INT;
			} else {
				if (ctx.expr().isEmpty()) {
					Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
							.getInstance().IMM;
					Program.getInstance().TextSegment[++Program.getInstance()._textpos] = -Integer
							.valueOf(ctx.NUM().getText());
				} else {
					Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
							.getInstance().IMM;
					Program.getInstance().TextSegment[++Program.getInstance()._textpos] = -1;
					Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
							.getInstance().PUSH;
					visit(ctx.expr());
					Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program
							.getInstance().MUL;
				}
				expr_type = Program.getInstance().INT;
			}
		}
		return null;
	}
	
	@Override
	public Object visitFunctionCall(InterpreterParser.FunctionCallContext ctx) {
		// TODO Auto-generated method stub
		int tmp = 0;
		visit(ctx.expr(0));
		int id = id_index;
		for(int i = 1; i < ctx.expr().size(); ++i){
			visit(ctx.expr(i));
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().PUSH;
			tmp++;
		}
		if(Program.getInstance().Symbols[id].Class == Program.getInstance().SYS){
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().Symbols[id].Value;
		}else if(Program.getInstance().Symbols[id].Class == Program.getInstance().FUN){
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().CALL;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().Symbols[id].Value;
		}
		else{
			System.exit(-1);
		}
		
		if(tmp > 0){
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().ADJ;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = tmp;
		}
		expr_type = Program.getInstance().Symbols[id].Type;
		return null;
	}
	
	@Override
	public Object visitIdentify(InterpreterParser.IdentifyContext ctx) {
		// TODO Auto-generated method stub
		visit(ctx.id());
		int id = id_index;
		expr_type = Program.getInstance().Symbols[id].Type;
		if(Program.getInstance().Symbols[id].Class == Program.getInstance().GLOBAL){
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().IMM;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().Symbols[id].Value;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = 
					(expr_type == Program.getInstance().CHAR) ? Program.getInstance().LCFD : Program.getInstance().LIFD;
		}else if(Program.getInstance().Symbols[id].Class == Program.getInstance().LOCAL){
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().LEA;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = 
					bp_pos - Program.getInstance().Symbols[id].Value;
			Program.getInstance().TextSegment[++Program.getInstance()._textpos] = 
					(expr_type == Program.getInstance().CHAR) ? Program.getInstance().LC : Program.getInstance().LI;
		}
		return null;
	}
	
	@Override
	public Object visitNumber(InterpreterParser.NumberContext ctx) {
		// TODO Auto-generated method stub
		int value = Integer.valueOf(ctx.NUM().getText());
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().IMM;
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = value;
		expr_type = Program.getInstance().INT;
		
		return null;
	}
	
	@Override
	public Object visitSingleIdentify(InterpreterParser.SingleIdentifyContext ctx) {
		// TODO Auto-generated method stub
		id_index = 0;
		String s = ctx.ID().getText();
		int hash = s.charAt(0);
		for (int j = 1; j < s.length();++j) {
			hash = hash * 147 + s.charAt(j);
		}
		
		while (Program.getInstance().Symbols[id_index].Token != 0) {
			if(Program.getInstance().Symbols[id_index].Hash == hash &&
					Program.getInstance().Symbols[id_index].Name.equals(s)){
				return null;
			}
			++id_index;
		}
		//store new ID
		Program.getInstance().Symbols[id_index].Token = Program.getInstance().ID;
		Program.getInstance().Symbols[id_index].Hash = hash;
		Program.getInstance().Symbols[id_index].Name = s;
		return null;
	}
	
	@Override
	public Object visitReturnStatement(InterpreterParser.ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		visit(ctx.expr());
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().LEV;
		return null;
	}
	

	@Override
	public Object visitIfStatement(InterpreterParser.IfStatementContext ctx) {
		// TODO Auto-generated method stub
		int b;
		visit(ctx.expr());
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().JZ;
		b = ++Program.getInstance()._textpos;
		visit(ctx.statement(0));
		if(ctx.statement().size() > 1){
			for(int i = 1; i < ctx.statement().size();++i){
				Program.getInstance().TextSegment[b] = Program.getInstance()._textpos + 3;
				Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().JMP;
				b = ++Program.getInstance()._textpos;
				visit(ctx.statement(i));
			}
		}
		Program.getInstance().TextSegment[b] = Program.getInstance()._textpos + 1;
		return null;
	}
	
	@Override
	public Object visitWhileStatement(InterpreterParser.WhileStatementContext ctx) {
		// TODO Auto-generated method stub
		int a,b;
		a = Program.getInstance()._textpos + 1;
		visit(ctx.expr());
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().JZ;
		b = ++Program.getInstance()._textpos;
		
		visit(ctx.statement());
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = Program.getInstance().JMP;
		Program.getInstance().TextSegment[++Program.getInstance()._textpos] = a;
		Program.getInstance().TextSegment[b] = Program.getInstance()._textpos + 1;
		
		return null;
	}
}
