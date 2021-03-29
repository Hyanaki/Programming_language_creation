// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g 2017-11-12 15:32:47
package parser;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class XGDLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int ID=4;
    public static final int INT=5;
    public static final int EXPONENT=6;
    public static final int FLOAT=7;
    public static final int COMMENT=8;
    public static final int WS=9;
    public static final int ESC_SEQ=10;
    public static final int STRING=11;
    public static final int CHAR=12;
    public static final int HEX_DIGIT=13;
    public static final int UNICODE_ESC=14;
    public static final int OCTAL_ESC=15;

    // delegates
    // delegators

    public XGDLexer() {;} 
    public XGDLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public XGDLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:3:7: ( '-' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:3:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:4:7: ( 'Transform' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:4:9: 'Transform'
            {
            match("Transform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:5:7: ( ';' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:5:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:6:7: ( 'type' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:6:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:7:7: ( '=' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:7:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:8:7: ( 'nom' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:8:9: 'nom'
            {
            match("nom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:9:7: ( 'Translation' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:9:9: 'Translation'
            {
            match("Translation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:10:7: ( '{' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:10:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:11:7: ( ',' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:12:7: ( '}' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:12:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:13:7: ( 'Rotation' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:13:9: 'Rotation'
            {
            match("Rotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:14:7: ( 'Scale' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:14:9: 'Scale'
            {
            match("Scale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:15:7: ( 'Group' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:15:9: 'Group'
            {
            match("Group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:16:7: ( 'Geometry' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:16:9: 'Geometry'
            {
            match("Geometry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:17:7: ( 'Cone' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:17:9: 'Cone'
            {
            match("Cone"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:18:7: ( 'Material' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:18:9: 'Material'
            {
            match("Material"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:19:7: ( ':' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:20:7: ( 'Sphere' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:20:9: 'Sphere'
            {
            match("Sphere"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:21:7: ( 'Cylinder' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:21:9: 'Cylinder'
            {
            match("Cylinder"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:22:7: ( 'Cube' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:22:9: 'Cube'
            {
            match("Cube"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:23:7: ( 'Teapot' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:23:9: 'Teapot'
            {
            match("Teapot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:24:7: ( 'Tetrahedron' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:24:9: 'Tetrahedron'
            {
            match("Tetrahedron"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:25:7: ( 'Torus' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:25:9: 'Torus'
            {
            match("Torus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:26:7: ( 'Ka' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:26:9: 'Ka'
            {
            match("Ka"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:27:7: ( 'Kd' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:27:9: 'Kd'
            {
            match("Kd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:28:7: ( 'Ks' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:28:9: 'Ks'
            {
            match("Ks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:29:7: ( 'd' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:29:9: 'd'
            {
            match('d'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:30:7: ( 'Ns' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:30:9: 'Ns'
            {
            match("Ns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:31:7: ( 'textureScale' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:31:9: 'textureScale'
            {
            match("textureScale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:32:7: ( 'textureFile' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:32:9: 'textureFile'
            {
            match("textureFile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:33:7: ( '<' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:33:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:34:7: ( '>' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:34:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:35:7: ( '/' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:35:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:36:7: ( 'Root' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:36:9: 'Root'
            {
            match("Root"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:37:7: ( '(' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:37:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:38:7: ( ')' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:38:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:39:7: ( '*' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:39:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:40:7: ( '+' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:40:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:41:7: ( 'animation' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:41:9: 'animation'
            {
            match("animation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:27:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:27:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:27:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:30:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:30:7: ( '0' .. '9' )+
            {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:30:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:30:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:34:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:34:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:34:9: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:34:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    match('.'); 
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:34:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:34:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:34:37: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:34:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:35:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:35:13: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:35:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:35:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:35:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:36:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:36:9: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:36:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:40:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='/') ) {
                    alt13=1;
                }
                else if ( (LA13_1=='*') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:40:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:40:14: (~ ( '\\n' | '\\r' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:40:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:40:28: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:40:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:41:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:41:14: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='*') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1=='/') ) {
                                alt12=2;
                            }
                            else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:41:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:44:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:44:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:52:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:52:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:52:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:52:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:52:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:55:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:55:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:55:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                alt15=1;
            }
            else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:55:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:55:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:59:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:59:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:59:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:59:33: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:59:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:62:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:62:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:66:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:66:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:67:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:68:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:73:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>='0' && LA19_1<='3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2>='0' && LA19_2<='7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4>='0' && LA19_4<='7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;}
                    }
                    else {
                        alt19=3;}
                }
                else if ( ((LA19_1>='4' && LA19_1<='7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3>='0' && LA19_3<='7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:73:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:73:14: ( '0' .. '3' )
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:73:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:73:25: ( '0' .. '7' )
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:73:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:73:36: ( '0' .. '7' )
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:73:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:74:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:74:14: ( '0' .. '7' )
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:74:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:74:25: ( '0' .. '7' )
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:74:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:75:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:75:14: ( '0' .. '7' )
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:75:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:80:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:80:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
        int alt20=46;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:244: ID
                {
                mID(); 

                }
                break;
            case 41 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:247: INT
                {
                mINT(); 

                }
                break;
            case 42 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:251: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 43 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:257: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 44 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:265: WS
                {
                mWS(); 

                }
                break;
            case 45 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:268: STRING
                {
                mSTRING(); 

                }
                break;
            case 46 :
                // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:1:275: CHAR
                {
                mCHAR(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\2\56\3\uffff";
    static final String DFA9_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "33:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\2\uffff\1\33\1\uffff\1\33\1\uffff\1\33\3\uffff\5\33\1\uffff\1"+
        "\33\1\63\1\33\2\uffff\1\66\4\uffff\1\33\1\uffff\1\70\4\uffff\17"+
        "\33\1\112\1\113\1\114\1\uffff\1\115\2\uffff\1\33\1\uffff\6\33\1"+
        "\125\12\33\4\uffff\5\33\1\145\1\33\1\uffff\1\33\1\150\4\33\1\155"+
        "\1\33\1\157\5\33\1\166\1\uffff\2\33\1\uffff\1\171\1\33\1\173\1\33"+
        "\1\uffff\1\33\1\uffff\4\33\1\u0082\1\33\1\uffff\2\33\1\uffff\1\u0086"+
        "\1\uffff\6\33\1\uffff\3\33\1\uffff\11\33\1\u009a\1\u009b\1\u009c"+
        "\1\u009d\1\33\1\u009f\4\33\4\uffff\1\u00a4\1\uffff\4\33\1\uffff"+
        "\1\u00a9\1\u00aa\1\33\1\u00ac\2\uffff\1\u00ad\2\uffff";
    static final String DFA20_eofS =
        "\u00ae\uffff";
    static final String DFA20_minS =
        "\1\11\1\uffff\1\145\1\uffff\1\145\1\uffff\1\157\3\uffff\1\157\1"+
        "\143\1\145\1\157\1\141\1\uffff\1\141\1\60\1\163\2\uffff\1\52\4\uffff"+
        "\1\156\1\uffff\1\56\4\uffff\2\141\1\162\1\160\1\170\1\155\1\157"+
        "\1\141\1\150\2\157\1\156\1\154\1\142\1\164\3\60\1\uffff\1\60\2\uffff"+
        "\1\151\1\uffff\1\156\1\160\1\162\1\165\1\145\1\164\1\60\1\141\1"+
        "\164\1\154\1\145\1\165\1\155\1\145\1\151\2\145\4\uffff\1\155\1\163"+
        "\1\157\1\141\1\163\1\60\1\165\1\uffff\1\164\1\60\1\145\1\162\1\160"+
        "\1\145\1\60\1\156\1\60\1\162\1\141\1\146\1\164\1\150\1\60\1\uffff"+
        "\1\162\1\151\1\uffff\1\60\1\145\1\60\1\164\1\uffff\1\144\1\uffff"+
        "\1\151\1\164\1\157\1\141\1\60\1\145\1\uffff\1\145\1\157\1\uffff"+
        "\1\60\1\uffff\1\162\1\145\1\141\1\151\1\162\1\164\1\uffff\1\144"+
        "\1\106\1\156\1\uffff\1\171\1\162\1\154\1\157\1\155\1\151\1\162\1"+
        "\143\1\151\4\60\1\156\1\60\2\157\1\141\1\154\4\uffff\1\60\1\uffff"+
        "\2\156\1\154\1\145\1\uffff\2\60\1\145\1\60\2\uffff\1\60\2\uffff";
    static final String DFA20_maxS =
        "\1\175\1\uffff\1\162\1\uffff\1\171\1\uffff\1\157\3\uffff\1\157"+
        "\1\160\1\162\1\171\1\141\1\uffff\1\163\1\172\1\163\2\uffff\1\57"+
        "\4\uffff\1\156\1\uffff\1\145\4\uffff\1\141\1\164\1\162\1\160\1\170"+
        "\1\155\1\164\1\141\1\150\2\157\1\156\1\154\1\142\1\164\3\172\1\uffff"+
        "\1\172\2\uffff\1\151\1\uffff\1\156\1\160\1\162\1\165\1\145\1\164"+
        "\1\172\1\141\1\164\1\154\1\145\1\165\1\155\1\145\1\151\2\145\4\uffff"+
        "\1\155\1\163\1\157\1\141\1\163\1\172\1\165\1\uffff\1\164\1\172\1"+
        "\145\1\162\1\160\1\145\1\172\1\156\1\172\1\162\1\141\1\154\1\164"+
        "\1\150\1\172\1\uffff\1\162\1\151\1\uffff\1\172\1\145\1\172\1\164"+
        "\1\uffff\1\144\1\uffff\1\151\1\164\1\157\1\141\1\172\1\145\1\uffff"+
        "\1\145\1\157\1\uffff\1\172\1\uffff\1\162\1\145\1\141\1\151\1\162"+
        "\1\164\1\uffff\1\144\1\123\1\156\1\uffff\1\171\1\162\1\154\1\157"+
        "\1\155\1\151\1\162\1\143\1\151\4\172\1\156\1\172\2\157\1\141\1\154"+
        "\4\uffff\1\172\1\uffff\2\156\1\154\1\145\1\uffff\2\172\1\145\1\172"+
        "\2\uffff\1\172\2\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\5\1\uffff\1\10\1\11\1\12\5\uffff"+
        "\1\21\3\uffff\1\37\1\40\1\uffff\1\43\1\44\1\45\1\46\1\uffff\1\50"+
        "\1\uffff\1\52\1\54\1\55\1\56\22\uffff\1\33\1\uffff\1\53\1\41\1\uffff"+
        "\1\51\21\uffff\1\30\1\31\1\32\1\34\7\uffff\1\6\17\uffff\1\4\2\uffff"+
        "\1\42\4\uffff\1\17\1\uffff\1\24\6\uffff\1\27\2\uffff\1\14\1\uffff"+
        "\1\15\6\uffff\1\25\3\uffff\1\22\23\uffff\1\13\1\16\1\23\1\20\1\uffff"+
        "\1\2\4\uffff\1\47\4\uffff\1\7\1\26\1\uffff\1\36\1\35";
    static final String DFA20_specialS =
        "\u00ae\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\1\uffff\1\37\4\uffff\1\40"+
            "\1\26\1\27\1\30\1\31\1\10\1\1\1\35\1\25\12\34\1\17\1\3\1\23"+
            "\1\5\1\24\2\uffff\2\33\1\15\3\33\1\14\3\33\1\20\1\33\1\16\1"+
            "\22\3\33\1\12\1\13\1\2\6\33\4\uffff\1\33\1\uffff\1\32\2\33\1"+
            "\21\11\33\1\6\5\33\1\4\6\33\1\7\1\uffff\1\11",
            "",
            "\1\42\11\uffff\1\43\2\uffff\1\41",
            "",
            "\1\45\23\uffff\1\44",
            "",
            "\1\46",
            "",
            "",
            "",
            "\1\47",
            "\1\50\14\uffff\1\51",
            "\1\53\14\uffff\1\52",
            "\1\54\5\uffff\1\56\3\uffff\1\55",
            "\1\57",
            "",
            "\1\60\2\uffff\1\61\16\uffff\1\62",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\64",
            "",
            "",
            "\1\65\4\uffff\1\65",
            "",
            "",
            "",
            "",
            "\1\67",
            "",
            "\1\35\1\uffff\12\34\13\uffff\1\35\37\uffff\1\35",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72\22\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\101\4\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\146",
            "",
            "\1\147",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\156",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\160",
            "\1\161",
            "\1\162\5\uffff\1\163",
            "\1\164",
            "\1\165",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\167",
            "\1\170",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\172",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\174",
            "",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008f\14\uffff\1\u008e",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u009e",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00ab",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}