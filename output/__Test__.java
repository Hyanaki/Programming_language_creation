import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import parser.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        XGDLexer lex = new XGDLexer(new ANTLRFileStream("C:\\Users\\quent\\Desktop\\TPcin\\TP2\\fichiers_test\\test1.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        XGDParser g = new XGDParser(tokens, 49100, null);
        try {
            g.root();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}