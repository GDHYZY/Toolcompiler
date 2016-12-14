import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.server.LoaderHandler;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class InterpreterRunner {
	
	public static void main(String[] args) throws Exception {
		LoadFile("data.txt");
		Program.getInstance().eval();
	}
	
	private static void LoadFile(String filename){

		InputStream is = System.in;

		if (filename != null)
			try {
				is = new FileInputStream(filename);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		ANTLRInputStream input = null;
		try {
			input = new ANTLRInputStream(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		InterpreterLexer lexer = new InterpreterLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		InterpreterParser parser = new InterpreterParser(tokens);
		
		ParseTree tree = parser.program(); 	// begin parsing at rule 'prog'
		Translater tra = new Translater();
		tra.visit(tree);
		return;
	}
}
