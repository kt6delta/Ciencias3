/* The following code was generated by JFlex 1.4.3 on 2/03/21 16:17 */

package Analizador;
import java_cup.runtime.Symbol;/*Cup utiliza Simbolos*/

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/03/21 16:17 from the specification file
 * <tt>../Compilador/src/Analizador/LexicoCup.flex</tt>
 */
class LexicoCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  8,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 40,  9, 37,  0, 36, 38,  0, 43, 44, 35, 33,  3, 34, 50,  7, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 51, 49, 42, 32, 41,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1, 23,  1,  1,  1,  1,  1,  1,  1, 47,  0, 48,  0,  1, 
     0, 15, 10, 13, 21, 12, 20, 19, 14,  4,  1, 26, 17, 27,  5, 18, 
    30,  1, 16, 24,  6, 22, 31, 25, 28, 11, 29, 45, 39, 46,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\3\2\1\5\1\6"+
    "\20\2\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\2\1\33\4\2"+
    "\1\4\1\34\1\0\1\35\23\2\1\36\15\2\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\0\1\55\4\2"+
    "\1\56\6\2\1\57\15\2\1\60\13\2\1\61\11\2"+
    "\1\0\4\2\1\62\1\63\1\2\1\64\1\65\1\2"+
    "\1\66\1\2\1\67\2\2\1\70\1\71\2\2\1\72"+
    "\1\73\1\74\23\2\1\75\1\2\1\76\1\2\1\3"+
    "\3\2\1\77\1\100\1\2\1\101\1\2\1\102\2\2"+
    "\1\103\1\104\1\105\3\2\1\106\1\2\1\107\6\2"+
    "\1\110\1\111\1\2\1\112\5\2\1\113\1\2\1\114"+
    "\1\2\1\115\1\2\1\116\1\2\1\117\1\120\1\121"+
    "\1\122\1\123\1\124\1\125\1\126\1\2\1\127\1\2"+
    "\1\130\2\2\1\131\3\2\1\132\1\133\1\134\1\135"+
    "\1\136";

  private static int [] zzUnpackAction() {
    int [] result = new int[265];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478\0\u04ac"+
    "\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4\0\u0618\0\64"+
    "\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u0750\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\64\0\u0784\0\150"+
    "\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\64\0\u01d4\0\u01d4"+
    "\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0a28"+
    "\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8"+
    "\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0d68"+
    "\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08"+
    "\0\u0f3c\0\64\0\64\0\64\0\64\0\64\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\64\0\64\0\u0f70"+
    "\0\150\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\150\0\u1074\0\u10a8"+
    "\0\u10dc\0\u1110\0\u1144\0\u1178\0\150\0\u11ac\0\u11e0\0\u1214"+
    "\0\u1248\0\u127c\0\u12b0\0\u12e4\0\u1318\0\u134c\0\u1380\0\u13b4"+
    "\0\u13e8\0\u141c\0\150\0\u1450\0\u1484\0\u14b8\0\u14ec\0\u1520"+
    "\0\u1554\0\u1588\0\u15bc\0\u15f0\0\u1624\0\u1658\0\150\0\u168c"+
    "\0\u16c0\0\u16f4\0\u1728\0\u175c\0\u1790\0\u17c4\0\u17f8\0\u182c"+
    "\0\u1860\0\u1894\0\u18c8\0\u18fc\0\u1930\0\150\0\150\0\u1964"+
    "\0\150\0\150\0\u1998\0\150\0\u19cc\0\150\0\u1a00\0\u1a34"+
    "\0\150\0\150\0\u1a68\0\u1a9c\0\150\0\150\0\150\0\u1ad0"+
    "\0\u1b04\0\u1b38\0\u1b6c\0\u1ba0\0\u1bd4\0\u1c08\0\u1c3c\0\u1c70"+
    "\0\u1ca4\0\u1cd8\0\u1d0c\0\u1d40\0\u1d74\0\u1da8\0\u1ddc\0\u1e10"+
    "\0\u1e44\0\u1e78\0\150\0\u1eac\0\150\0\u1ee0\0\64\0\u1f14"+
    "\0\u1f48\0\u1f7c\0\150\0\150\0\u1fb0\0\150\0\u1fe4\0\150"+
    "\0\u2018\0\u204c\0\150\0\150\0\150\0\u2080\0\u20b4\0\u20e8"+
    "\0\150\0\u211c\0\150\0\u2150\0\u2184\0\u21b8\0\u21ec\0\u2220"+
    "\0\u2254\0\150\0\150\0\u2288\0\150\0\u22bc\0\u22f0\0\u2324"+
    "\0\u2358\0\u238c\0\150\0\u23c0\0\150\0\u23f4\0\150\0\u2428"+
    "\0\150\0\u245c\0\150\0\150\0\150\0\150\0\150\0\150"+
    "\0\150\0\150\0\u2490\0\150\0\u24c4\0\150\0\u24f8\0\u252c"+
    "\0\150\0\u2560\0\u2594\0\u25c8\0\150\0\150\0\150\0\150"+
    "\0\150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[265];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\5\1\12\1\13\1\3\1\14\1\15\1\3\1\16"+
    "\1\17\1\20\1\3\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\3\1\30\2\3\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\65\0\2\3\1\0\3\3\3\0"+
    "\26\3\26\0\1\4\64\0\1\5\4\0\1\5\54\0"+
    "\2\3\1\0\1\3\1\57\1\3\3\0\12\3\1\60"+
    "\13\3\25\0\2\3\1\0\3\3\3\0\5\3\1\61"+
    "\20\3\25\0\2\3\1\0\3\3\3\0\1\3\1\62"+
    "\2\3\1\63\1\3\1\64\17\3\33\0\1\65\30\0"+
    "\1\66\23\0\10\67\1\0\1\70\52\67\1\0\2\3"+
    "\1\0\3\3\3\0\1\3\1\71\4\3\1\72\17\3"+
    "\25\0\2\3\1\0\1\3\1\73\1\3\3\0\7\3"+
    "\1\74\12\3\1\75\3\3\25\0\2\3\1\0\1\76"+
    "\2\3\3\0\4\3\1\77\1\100\2\3\1\101\15\3"+
    "\25\0\2\3\1\0\3\3\3\0\14\3\1\102\11\3"+
    "\25\0\2\3\1\0\3\3\3\0\2\3\1\103\23\3"+
    "\25\0\2\3\1\0\3\3\3\0\10\3\1\104\15\3"+
    "\25\0\2\3\1\0\3\3\3\0\2\3\1\105\5\3"+
    "\1\106\15\3\25\0\2\3\1\0\3\3\3\0\5\3"+
    "\1\107\1\3\1\110\1\111\1\112\14\3\25\0\2\3"+
    "\1\0\3\3\3\0\2\3\1\113\5\3\1\114\15\3"+
    "\25\0\2\3\1\0\1\3\1\115\1\3\3\0\16\3"+
    "\1\116\7\3\25\0\2\3\1\0\2\3\1\117\3\0"+
    "\26\3\25\0\2\3\1\0\1\120\1\3\1\121\3\0"+
    "\1\3\1\122\1\3\1\123\1\124\12\3\1\125\6\3"+
    "\25\0\2\3\1\0\3\3\3\0\4\3\1\126\21\3"+
    "\25\0\2\3\1\0\3\3\3\0\5\3\1\127\20\3"+
    "\25\0\2\3\1\0\3\3\3\0\6\3\1\130\17\3"+
    "\25\0\2\3\1\0\3\3\3\0\10\3\1\131\15\3"+
    "\64\0\1\132\63\0\1\133\1\134\62\0\1\135\1\0"+
    "\1\136\61\0\1\137\63\0\1\140\71\0\1\141\64\0"+
    "\1\142\54\0\1\143\63\0\1\144\10\0\1\145\52\0"+
    "\1\146\11\0\1\147\53\0\1\150\22\0\2\3\1\0"+
    "\2\3\1\151\3\0\3\3\1\152\22\3\25\0\2\3"+
    "\1\0\3\3\3\0\21\3\1\153\4\3\25\0\2\3"+
    "\1\0\3\3\3\0\24\3\1\154\1\3\25\0\2\3"+
    "\1\0\3\3\3\0\6\3\1\155\17\3\25\0\2\3"+
    "\1\0\3\3\3\0\1\3\1\156\12\3\1\157\11\3"+
    "\24\0\10\65\1\0\53\65\1\0\2\3\1\0\2\3"+
    "\1\160\3\0\26\3\25\0\2\3\1\0\3\3\3\0"+
    "\2\3\1\161\23\3\25\0\2\3\1\0\3\3\3\0"+
    "\14\3\1\162\11\3\25\0\2\3\1\0\3\3\3\0"+
    "\16\3\1\163\7\3\25\0\2\3\1\0\2\3\1\164"+
    "\3\0\26\3\25\0\2\3\1\0\1\3\1\165\1\3"+
    "\3\0\26\3\25\0\2\3\1\0\3\3\3\0\5\3"+
    "\1\166\20\3\25\0\2\3\1\0\2\3\1\167\3\0"+
    "\16\3\1\170\7\3\25\0\2\3\1\0\1\3\1\171"+
    "\1\3\3\0\14\3\1\172\11\3\25\0\2\3\1\0"+
    "\2\3\1\173\3\0\26\3\25\0\2\3\1\0\2\3"+
    "\1\174\3\0\11\3\1\175\14\3\25\0\2\3\1\0"+
    "\1\3\1\176\1\3\3\0\26\3\25\0\2\3\1\0"+
    "\2\3\1\177\3\0\26\3\25\0\2\3\1\0\2\3"+
    "\1\200\3\0\26\3\25\0\2\3\1\0\3\3\3\0"+
    "\7\3\1\201\16\3\25\0\2\3\1\0\3\3\3\0"+
    "\10\3\1\202\15\3\25\0\2\3\1\0\3\3\3\0"+
    "\6\3\1\203\17\3\25\0\2\3\1\0\3\3\3\0"+
    "\2\3\1\204\23\3\25\0\2\3\1\0\3\3\3\0"+
    "\12\3\1\205\13\3\25\0\2\3\1\0\3\3\3\0"+
    "\14\3\1\206\11\3\25\0\2\3\1\0\1\207\2\3"+
    "\3\0\16\3\1\210\7\3\25\0\2\3\1\0\1\211"+
    "\2\3\3\0\26\3\25\0\2\3\1\0\3\3\3\0"+
    "\6\3\1\212\17\3\25\0\2\3\1\0\3\3\3\0"+
    "\11\3\1\213\11\3\1\214\2\3\25\0\2\3\1\0"+
    "\3\3\3\0\5\3\1\215\1\216\4\3\1\217\12\3"+
    "\25\0\2\3\1\0\3\3\3\0\16\3\1\220\7\3"+
    "\25\0\2\3\1\0\3\3\3\0\5\3\1\221\20\3"+
    "\25\0\2\3\1\0\3\3\3\0\10\3\1\222\15\3"+
    "\25\0\2\3\1\0\1\223\2\3\3\0\26\3\25\0"+
    "\2\3\1\0\1\224\2\3\3\0\26\3\25\0\2\3"+
    "\1\0\1\225\2\3\3\0\26\3\25\0\2\3\1\0"+
    "\1\226\2\3\3\0\26\3\25\0\2\3\1\0\1\227"+
    "\2\3\3\0\7\3\1\230\16\3\26\0\1\231\62\0"+
    "\2\3\1\0\3\3\3\0\7\3\1\232\16\3\25\0"+
    "\2\3\1\0\3\3\3\0\2\3\1\233\23\3\25\0"+
    "\2\3\1\0\3\3\3\0\2\3\1\234\23\3\25\0"+
    "\2\3\1\0\3\3\3\0\10\3\1\235\15\3\25\0"+
    "\2\3\1\0\3\3\3\0\2\3\1\236\23\3\25\0"+
    "\2\3\1\0\3\3\3\0\2\3\1\237\23\3\25\0"+
    "\2\3\1\0\3\3\3\0\5\3\1\240\20\3\25\0"+
    "\2\3\1\0\3\3\3\0\21\3\1\241\4\3\25\0"+
    "\2\3\1\0\3\3\3\0\2\3\1\242\23\3\25\0"+
    "\2\3\1\0\3\3\3\0\2\3\1\243\23\3\25\0"+
    "\2\3\1\0\3\3\3\0\6\3\1\244\17\3\25\0"+
    "\2\3\1\0\3\3\3\0\3\3\1\245\22\3\25\0"+
    "\2\3\1\0\3\3\3\0\2\3\1\246\23\3\25\0"+
    "\2\3\1\0\2\3\1\247\3\0\16\3\1\250\7\3"+
    "\25\0\2\3\1\0\2\3\1\251\3\0\26\3\25\0"+
    "\2\3\1\0\3\3\3\0\10\3\1\252\15\3\25\0"+
    "\2\3\1\0\3\3\3\0\14\3\1\253\11\3\25\0"+
    "\2\3\1\0\1\254\2\3\3\0\26\3\25\0\2\3"+
    "\1\0\3\3\3\0\11\3\1\255\14\3\25\0\2\3"+
    "\1\0\3\3\3\0\16\3\1\256\7\3\25\0\2\3"+
    "\1\0\3\3\3\0\10\3\1\257\15\3\25\0\2\3"+
    "\1\0\3\3\3\0\16\3\1\260\7\3\25\0\2\3"+
    "\1\0\3\3\3\0\5\3\1\261\20\3\25\0\2\3"+
    "\1\0\2\3\1\262\3\0\26\3\25\0\2\3\1\0"+
    "\1\263\2\3\3\0\5\3\1\264\20\3\25\0\2\3"+
    "\1\0\3\3\3\0\1\265\25\3\25\0\2\3\1\0"+
    "\3\3\3\0\10\3\1\266\15\3\25\0\2\3\1\0"+
    "\1\267\2\3\3\0\26\3\25\0\2\3\1\0\1\3"+
    "\1\270\1\3\3\0\26\3\25\0\2\3\1\0\1\271"+
    "\2\3\3\0\26\3\25\0\2\3\1\0\1\3\1\272"+
    "\1\3\3\0\26\3\25\0\2\3\1\0\3\3\3\0"+
    "\2\3\1\273\23\3\25\0\2\3\1\0\2\3\1\274"+
    "\3\0\26\3\25\0\2\3\1\0\3\3\3\0\14\3"+
    "\1\275\11\3\25\0\2\3\1\0\2\3\1\276\3\0"+
    "\26\3\25\0\2\3\1\0\1\3\1\277\1\3\3\0"+
    "\26\3\25\0\2\3\1\0\3\3\3\0\6\3\1\300"+
    "\17\3\25\0\2\3\1\0\2\3\1\301\3\0\26\3"+
    "\25\0\2\3\1\0\3\3\3\0\7\3\1\302\16\3"+
    "\25\0\2\3\1\0\1\3\1\303\1\3\3\0\26\3"+
    "\25\0\2\3\1\0\1\3\1\304\1\3\3\0\26\3"+
    "\25\0\2\3\1\0\3\3\3\0\13\3\1\305\12\3"+
    "\25\0\2\3\1\0\3\3\3\0\5\3\1\306\20\3"+
    "\26\0\1\231\51\0\1\307\10\0\2\3\1\0\3\3"+
    "\3\0\14\3\1\310\11\3\25\0\2\3\1\0\3\3"+
    "\3\0\16\3\1\311\7\3\25\0\2\3\1\0\3\3"+
    "\3\0\13\3\1\312\12\3\25\0\2\3\1\0\3\3"+
    "\3\0\17\3\1\313\6\3\25\0\2\3\1\0\3\3"+
    "\3\0\20\3\1\314\5\3\25\0\2\3\1\0\3\3"+
    "\3\0\6\3\1\315\17\3\25\0\2\3\1\0\3\3"+
    "\3\0\4\3\1\316\21\3\25\0\2\3\1\0\1\317"+
    "\2\3\3\0\26\3\25\0\2\3\1\0\2\3\1\320"+
    "\3\0\26\3\25\0\2\3\1\0\3\3\3\0\6\3"+
    "\1\321\17\3\25\0\2\3\1\0\3\3\3\0\16\3"+
    "\1\322\7\3\25\0\2\3\1\0\3\3\3\0\2\3"+
    "\1\323\23\3\25\0\2\3\1\0\2\3\1\324\3\0"+
    "\26\3\25\0\2\3\1\0\3\3\3\0\16\3\1\325"+
    "\7\3\25\0\2\3\1\0\1\3\1\326\1\3\3\0"+
    "\26\3\25\0\2\3\1\0\3\3\3\0\14\3\1\327"+
    "\11\3\25\0\2\3\1\0\3\3\3\0\7\3\1\330"+
    "\16\3\25\0\2\3\1\0\1\3\1\331\1\3\3\0"+
    "\26\3\25\0\2\3\1\0\3\3\3\0\11\3\1\332"+
    "\14\3\25\0\2\3\1\0\3\3\3\0\11\3\1\333"+
    "\14\3\25\0\2\3\1\0\1\3\1\334\1\3\3\0"+
    "\26\3\25\0\2\3\1\0\3\3\3\0\2\3\1\335"+
    "\23\3\25\0\2\3\1\0\3\3\3\0\10\3\1\336"+
    "\15\3\25\0\2\3\1\0\1\337\2\3\3\0\26\3"+
    "\25\0\2\3\1\0\3\3\3\0\3\3\1\340\22\3"+
    "\25\0\2\3\1\0\3\3\3\0\2\3\1\341\23\3"+
    "\25\0\2\3\1\0\3\3\3\0\12\3\1\342\13\3"+
    "\25\0\2\3\1\0\2\3\1\343\3\0\26\3\25\0"+
    "\2\3\1\0\3\3\3\0\3\3\1\344\22\3\25\0"+
    "\2\3\1\0\3\3\3\0\2\3\1\345\23\3\25\0"+
    "\2\3\1\0\2\3\1\346\3\0\26\3\25\0\2\3"+
    "\1\0\2\3\1\347\3\0\26\3\25\0\2\3\1\0"+
    "\3\3\3\0\13\3\1\350\12\3\25\0\2\3\1\0"+
    "\3\3\3\0\24\3\1\351\1\3\25\0\2\3\1\0"+
    "\3\3\3\0\2\3\1\352\23\3\25\0\2\3\1\0"+
    "\1\3\1\353\1\3\3\0\26\3\25\0\2\3\1\0"+
    "\1\3\1\354\1\3\3\0\26\3\25\0\2\3\1\0"+
    "\1\3\1\355\1\3\3\0\26\3\25\0\2\3\1\0"+
    "\2\3\1\356\3\0\26\3\25\0\2\3\1\0\3\3"+
    "\3\0\2\3\1\357\23\3\25\0\2\3\1\0\3\3"+
    "\3\0\7\3\1\360\16\3\25\0\2\3\1\0\3\3"+
    "\3\0\2\3\1\361\23\3\25\0\2\3\1\0\1\3"+
    "\1\362\1\3\3\0\26\3\25\0\2\3\1\0\3\3"+
    "\3\0\11\3\1\363\14\3\25\0\2\3\1\0\3\3"+
    "\3\0\13\3\1\364\12\3\25\0\2\3\1\0\3\3"+
    "\3\0\12\3\1\365\13\3\25\0\2\3\1\0\3\3"+
    "\3\0\3\3\1\366\22\3\25\0\2\3\1\0\2\3"+
    "\1\367\3\0\26\3\25\0\2\3\1\0\3\3\3\0"+
    "\21\3\1\370\4\3\25\0\2\3\1\0\3\3\3\0"+
    "\4\3\1\371\21\3\25\0\2\3\1\0\3\3\3\0"+
    "\12\3\1\372\13\3\25\0\2\3\1\0\1\373\2\3"+
    "\3\0\26\3\25\0\2\3\1\0\3\3\3\0\2\3"+
    "\1\374\23\3\25\0\2\3\1\0\3\3\3\0\5\3"+
    "\1\375\20\3\25\0\2\3\1\0\3\3\3\0\12\3"+
    "\1\376\13\3\25\0\2\3\1\0\3\3\3\0\14\3"+
    "\1\377\11\3\25\0\2\3\1\0\3\3\3\0\2\3"+
    "\1\u0100\23\3\25\0\2\3\1\0\2\3\1\u0101\3\0"+
    "\26\3\25\0\2\3\1\0\3\3\3\0\2\3\1\u0102"+
    "\23\3\25\0\2\3\1\0\3\3\3\0\7\3\1\u0103"+
    "\16\3\25\0\2\3\1\0\3\3\3\0\3\3\1\u0104"+
    "\22\3\25\0\2\3\1\0\3\3\3\0\2\3\1\u0105"+
    "\23\3\25\0\2\3\1\0\3\3\3\0\6\3\1\u0106"+
    "\17\3\25\0\2\3\1\0\3\3\3\0\13\3\1\u0107"+
    "\12\3\25\0\2\3\1\0\3\3\3\0\2\3\1\u0108"+
    "\23\3\25\0\2\3\1\0\3\3\3\0\2\3\1\u0109"+
    "\23\3\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9724];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\35\1\1\11\6\1\10\11\7\1\1\11"+
    "\1\0\42\1\16\11\1\0\60\1\1\0\55\1\1\11"+
    "\102\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[265];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){/*type es el tipo que se esta analizando y object value que analiza la cadena y es muy util para el manejo de errores*/
        return new Symbol(type, yyline, yycolumn, value);/*yyline es para la linea, yycolumn columna de lo que se esta analizando*/
    }
    /*Cadena sin analizar*/
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexicoCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexicoCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 69: 
          { return new Symbol(sym.Fgets, yychar, yyline, yytext());
          }
        case 95: break;
        case 91: 
          { return new Symbol(sym.Register, yychar, yyline, yytext());
          }
        case 96: break;
        case 6: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 97: break;
        case 47: 
          { return new Symbol(sym.Cin, yychar, yyline, yytext());
          }
        case 98: break;
        case 40: 
          { return new Symbol(sym.Operador_relacional_Diferente, yychar, yyline, yytext());
          }
        case 99: break;
        case 48: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 100: break;
        case 15: 
          { return new Symbol(sym.Operador_Logico_Not, yychar, yyline, yytext());
          }
        case 101: break;
        case 77: 
          { return new Symbol(sym.Define, yychar, yyline, yytext());
          }
        case 102: break;
        case 68: 
          { return new Symbol(sym.Float, yychar, yyline, yytext());
          }
        case 103: break;
        case 26: 
          { return new Symbol(sym.Dos_P, yychar, yyline, yytext());
          }
        case 104: break;
        case 51: 
          { return new Symbol(sym.Byte, yychar, yyline, yytext());
          }
        case 105: break;
        case 39: 
          { return new Symbol(sym.Operador_Logico_Or, yychar, yyline, yytext());
          }
        case 106: break;
        case 93: 
          { return new Symbol(sym.Volatile, yychar, yyline, yytext());
          }
        case 107: break;
        case 89: 
          { return new Symbol(sym.Default, yychar, yyline, yytext());
          }
        case 108: break;
        case 61: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 109: break;
        case 20: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 110: break;
        case 19: 
          { return new Symbol(sym.Parent_c, yychar, yyline, yytext());
          }
        case 111: break;
        case 64: 
          { return new Symbol(sym.Break, yychar, yyline, yytext());
          }
        case 112: break;
        case 4: 
          { /*Ignore*/
          }
        case 113: break;
        case 14: 
          { return new Symbol(sym.Operador_bit_a_bit_Or, yychar, yyline, yytext());
          }
        case 114: break;
        case 36: 
          { return new Symbol(sym.Operador_atribucion_porIgual, yychar, yyline, yytext());
          }
        case 115: break;
        case 38: 
          { return new Symbol(sym.Operador_Logico_And, yychar, yyline, yytext());
          }
        case 116: break;
        case 65: 
          { return new Symbol(sym.Catch, yychar, yyline, yytext());
          }
        case 117: break;
        case 79: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 118: break;
        case 42: 
          { return new Symbol(sym.Operador_relacional_DesplazamientoD, yychar, yyline, yytext());
          }
        case 119: break;
        case 85: 
          { return new Symbol(sym.Switch, yychar, yyline, yytext());
          }
        case 120: break;
        case 24: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 121: break;
        case 90: 
          { return new Symbol(sym.Continue, yychar, yyline, yytext());
          }
        case 122: break;
        case 10: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 123: break;
        case 35: 
          { return new Symbol(sym.Operador_decremento, yychar, yyline, yytext());
          }
        case 124: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 125: break;
        case 31: 
          { return new Symbol(sym.Operador_relacional_Igual, yychar, yyline, yytext());
          }
        case 126: break;
        case 17: 
          { return new Symbol(sym.Operador_relacional_Menor, yychar, yyline, yytext());
          }
        case 127: break;
        case 56: 
          { return new Symbol(sym.Cout, yychar, yyline, yytext());
          }
        case 128: break;
        case 94: 
          { return new Symbol(sym.Namespace, yychar, yyline, yytext());
          }
        case 129: break;
        case 75: 
          { return new Symbol(sym.Extern, yychar, yyline, yytext());
          }
        case 130: break;
        case 34: 
          { return new Symbol(sym.Operador_atribucion_menosIgual, yychar, yyline, yytext());
          }
        case 131: break;
        case 57: 
          { return new Symbol(sym.Auto, yychar, yyline, yytext());
          }
        case 132: break;
        case 11: 
          { return new Symbol(sym.Modulo, yychar, yyline, yytext());
          }
        case 133: break;
        case 63: 
          { return new Symbol(sym.Throw, yychar, yyline, yytext());
          }
        case 134: break;
        case 52: 
          { return new Symbol(sym.Enum, yychar, yyline, yytext());
          }
        case 135: break;
        case 7: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 136: break;
        case 55: 
          { return new Symbol(sym.Case, yychar, yyline, yytext());
          }
        case 137: break;
        case 12: 
          { return new Symbol(sym.Numeral, yychar, yyline, yytext());
          }
        case 138: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 139: break;
        case 23: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 140: break;
        case 53: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 141: break;
        case 45: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 142: break;
        case 72: 
          { return new Symbol(sym.Scanf, yychar, yyline, yytext());
          }
        case 143: break;
        case 92: 
          { return new Symbol(sym.Unsigned, yychar, yyline, yytext());
          }
        case 144: break;
        case 16: 
          { return new Symbol(sym.Operador_relacional_Mayor, yychar, yyline, yytext());
          }
        case 145: break;
        case 71: 
          { return new Symbol(sym.Using, yychar, yyline, yytext());
          }
        case 146: break;
        case 32: 
          { return new Symbol(sym.Operador_atribucion_masIgual, yychar, yyline, yytext());
          }
        case 147: break;
        case 8: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 148: break;
        case 29: 
          { return new Symbol(sym.Cont_Cadena, yychar, yyline, yytext());
          }
        case 149: break;
        case 44: 
          { return new Symbol(sym.Operador_relacional_DesplazamientoI, yychar, yyline, yytext());
          }
        case 150: break;
        case 73: 
          { return new Symbol(sym.Short, yychar, yyline, yytext());
          }
        case 151: break;
        case 41: 
          { return new Symbol(sym.Operador_relacional_mayoroIgual, yychar, yyline, yytext());
          }
        case 152: break;
        case 83: 
          { return new Symbol(sym.Struct, yychar, yyline, yytext());
          }
        case 153: break;
        case 80: 
          { return new Symbol(sym.Signed, yychar, yyline, yytext());
          }
        case 154: break;
        case 33: 
          { return new Symbol(sym.Operador_incremento, yychar, yyline, yytext());
          }
        case 155: break;
        case 87: 
          { return new Symbol(sym.Include, yychar, yyline, yytext());
          }
        case 156: break;
        case 27: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 157: break;
        case 21: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 158: break;
        case 25: 
          { return new Symbol(sym.Punto, yychar, yyline, yytext());
          }
        case 159: break;
        case 70: 
          { return new Symbol(sym.Union, yychar, yyline, yytext());
          }
        case 160: break;
        case 62: 
          { return new Symbol(sym.Void, yychar, yyline, yytext());
          }
        case 161: break;
        case 18: 
          { return new Symbol(sym.Parent_a, yychar, yyline, yytext());
          }
        case 162: break;
        case 13: 
          { return new Symbol(sym.Operador_bit_a_bit_And, yychar, yyline, yytext());
          }
        case 163: break;
        case 84: 
          { return new Symbol(sym.Sistema, yychar, yyline, yytext());
          }
        case 164: break;
        case 43: 
          { return new Symbol(sym.Operador_relacional_menoroIgual, yychar, yyline, yytext());
          }
        case 165: break;
        case 81: 
          { return new Symbol(sym.Sizeof, yychar, yyline, yytext());
          }
        case 166: break;
        case 78: 
          { return new Symbol(sym.Double, yychar, yyline, yytext());
          }
        case 167: break;
        case 30: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 168: break;
        case 5: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 169: break;
        case 60: 
          { return new Symbol(sym.Goto, yychar, yyline, yytext());
          }
        case 170: break;
        case 9: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 171: break;
        case 82: 
          { return new Symbol(sym.Static, yychar, yyline, yytext());
          }
        case 172: break;
        case 28: 
          { return new Symbol(sym.Operador_atribucion_divisionIgual, yychar, yyline, yytext());
          }
        case 173: break;
        case 49: 
          { return new Symbol(sym.Std, yychar, yyline, yytext());
          }
        case 174: break;
        case 59: 
          { return new Symbol(sym.Gets, yychar, yyline, yytext());
          }
        case 175: break;
        case 67: 
          { return new Symbol(sym.Operador_booleano_False, yychar, yyline, yytext());
          }
        case 176: break;
        case 66: 
          { return new Symbol(sym.Const, yychar, yyline, yytext());
          }
        case 177: break;
        case 76: 
          { return new Symbol(sym.Return, yychar, yyline, yytext());
          }
        case 178: break;
        case 74: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 179: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 180: break;
        case 86: 
          { return new Symbol(sym.Printf, yychar, yyline, yytext());
          }
        case 181: break;
        case 54: 
          { return new Symbol(sym.Char, yychar, yyline, yytext());
          }
        case 182: break;
        case 88: 
          { return new Symbol(sym.Typedef, yychar, yyline, yytext());
          }
        case 183: break;
        case 50: 
          { return new Symbol(sym.Operador_booleano_True, yychar, yyline, yytext());
          }
        case 184: break;
        case 46: 
          { return new Symbol(sym.Try, yychar, yyline, yytext());
          }
        case 185: break;
        case 58: 
          { return new Symbol(sym.Long, yychar, yyline, yytext());
          }
        case 186: break;
        case 22: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 187: break;
        case 37: 
          { return new Symbol(sym.Operador_atribucion_porcentajeIgual, yychar, yyline, yytext());
          }
        case 188: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}