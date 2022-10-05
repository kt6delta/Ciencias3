/* The following code was generated by JFlex 1.4.3 on 2/03/21 16:17 */

package Analizador; 
import static Analizador.Tokens.*; /*clase que incluira todos los Tokens del analizador Lexico*/

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/03/21 16:17 from the specification file
 * <tt>../Compilador/src/Analizador/Lexico.flex</tt>
 */
class Lexico {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\10\2\0\1\3\22\0\1\3\1\51\1\11\1\46"+
    "\1\0\1\45\1\47\1\12\1\54\1\55\1\44\1\42\1\3\1\43"+
    "\1\63\1\7\12\2\1\64\1\62\1\53\1\41\1\52\2\0\32\1"+
    "\1\60\1\13\1\61\1\0\1\1\1\0\1\21\1\14\1\17\1\27"+
    "\1\16\1\26\1\25\1\20\1\4\1\1\1\34\1\23\1\35\1\5"+
    "\1\24\1\40\1\1\1\22\1\31\1\6\1\30\1\32\1\33\1\36"+
    "\1\15\1\37\1\56\1\50\1\57\103\0\1\1\7\0\1\1\3\0"+
    "\1\1\3\0\1\1\1\0\1\1\6\0\1\1\6\0\1\1\7\0"+
    "\1\1\3\0\1\1\3\0\1\1\1\0\1\1\6\0\1\1\uff05\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\3\2\1\5\1\6"+
    "\1\7\1\10\1\11\17\2\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\2\1\36\5\2\1\4\1\37\1\0\1\40\23\2"+
    "\1\41\14\2\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\0\1\60\5\2\1\61\6\2\1\62\15\2\1\63"+
    "\12\2\1\64\11\2\1\0\2\2\1\65\2\2\1\66"+
    "\1\67\1\2\1\70\1\71\1\2\1\72\1\2\1\73"+
    "\2\2\1\74\1\75\2\2\1\76\1\77\1\100\22\2"+
    "\1\101\2\2\1\102\1\2\1\3\3\2\1\103\1\104"+
    "\1\2\1\105\1\2\1\106\2\2\1\107\1\110\1\111"+
    "\3\2\1\112\1\2\1\113\6\2\1\114\1\115\2\2"+
    "\1\116\4\2\1\117\1\2\1\120\1\2\1\121\1\2"+
    "\1\122\1\2\1\123\1\124\1\125\1\126\1\127\1\130"+
    "\1\131\1\2\1\132\1\133\1\2\1\134\2\2\1\135"+
    "\3\2\1\136\1\137\1\140\1\141\1\142";

  private static int [] zzUnpackAction() {
    int [] result = new int[268];
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
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\u013e\0\u0173"+
    "\0\u01a8\0\65\0\u01dd\0\65\0\65\0\u0212\0\u0247\0\u027c"+
    "\0\u02b1\0\u02e6\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424"+
    "\0\u0459\0\u048e\0\u04c3\0\u04f8\0\u052d\0\u0562\0\u0597\0\u05cc"+
    "\0\u0601\0\65\0\u0636\0\u066b\0\u06a0\0\u06d5\0\u070a\0\u073f"+
    "\0\65\0\65\0\65\0\65\0\65\0\65\0\65\0\65"+
    "\0\u0774\0\152\0\u07a9\0\u07de\0\u0813\0\u0848\0\u087d\0\u08b2"+
    "\0\65\0\u01dd\0\u01dd\0\u08e7\0\u091c\0\u0951\0\u0986\0\u09bb"+
    "\0\u09f0\0\u0a25\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9\0\u0b2e\0\u0b63"+
    "\0\u0b98\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1\0\u0cd6\0\u0d0b"+
    "\0\u0d40\0\u0d75\0\u0daa\0\u0ddf\0\u0e14\0\u0e49\0\u0e7e\0\u0eb3"+
    "\0\u0ee8\0\u0f1d\0\u0f52\0\65\0\65\0\65\0\65\0\65"+
    "\0\65\0\65\0\65\0\65\0\65\0\65\0\65\0\65"+
    "\0\65\0\u0f87\0\152\0\u0fbc\0\u0ff1\0\u1026\0\u105b\0\u1090"+
    "\0\152\0\u10c5\0\u10fa\0\u112f\0\u1164\0\u1199\0\u11ce\0\152"+
    "\0\u1203\0\u1238\0\u126d\0\u12a2\0\u12d7\0\u130c\0\u1341\0\u1376"+
    "\0\u13ab\0\u13e0\0\u1415\0\u144a\0\u147f\0\152\0\u14b4\0\u14e9"+
    "\0\u151e\0\u1553\0\u1588\0\u15bd\0\u15f2\0\u1627\0\u165c\0\u1691"+
    "\0\152\0\u16c6\0\u16fb\0\u1730\0\u1765\0\u179a\0\u17cf\0\u1804"+
    "\0\u1839\0\u186e\0\u18a3\0\u18d8\0\u190d\0\152\0\u1942\0\u1977"+
    "\0\152\0\152\0\u19ac\0\152\0\152\0\u19e1\0\152\0\u1a16"+
    "\0\152\0\u1a4b\0\u1a80\0\152\0\152\0\u1ab5\0\u1aea\0\152"+
    "\0\152\0\152\0\u1b1f\0\u1b54\0\u1b89\0\u1bbe\0\u1bf3\0\u1c28"+
    "\0\u1c5d\0\u1c92\0\u1cc7\0\u1cfc\0\u1d31\0\u1d66\0\u1d9b\0\u1dd0"+
    "\0\u1e05\0\u1e3a\0\u1e6f\0\u1ea4\0\152\0\u1ed9\0\u1f0e\0\152"+
    "\0\u1f43\0\65\0\u1f78\0\u1fad\0\u1fe2\0\152\0\152\0\u2017"+
    "\0\152\0\u204c\0\152\0\u2081\0\u20b6\0\152\0\152\0\152"+
    "\0\u20eb\0\u2120\0\u2155\0\152\0\u218a\0\152\0\u21bf\0\u21f4"+
    "\0\u2229\0\u225e\0\u2293\0\u22c8\0\152\0\152\0\u22fd\0\u2332"+
    "\0\152\0\u2367\0\u239c\0\u23d1\0\u2406\0\152\0\u243b\0\152"+
    "\0\u2470\0\152\0\u24a5\0\152\0\u24da\0\152\0\152\0\152"+
    "\0\152\0\152\0\152\0\152\0\u250f\0\152\0\152\0\u2544"+
    "\0\152\0\u2579\0\u25ae\0\152\0\u25e3\0\u2618\0\u264d\0\152"+
    "\0\152\0\152\0\152\0\152";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[268];
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
    "\1\12\1\13\1\14\1\15\1\16\1\3\1\17\1\20"+
    "\1\3\1\21\1\22\1\23\1\3\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\3\1\33\2\3\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\66\0\2\3\1\0\3\3"+
    "\5\0\25\3\26\0\1\4\65\0\1\5\62\0\2\3"+
    "\1\0\1\3\1\61\1\3\5\0\12\3\1\62\12\3"+
    "\25\0\2\3\1\0\3\3\5\0\5\3\1\63\6\3"+
    "\1\64\10\3\25\0\2\3\1\0\3\3\5\0\1\3"+
    "\1\65\2\3\1\66\1\3\1\67\16\3\33\0\1\70"+
    "\31\0\1\71\23\0\10\72\1\0\1\73\53\72\1\0"+
    "\2\3\1\0\3\3\5\0\1\3\1\74\4\3\1\75"+
    "\16\3\25\0\2\3\1\0\1\3\1\76\1\3\5\0"+
    "\7\3\1\77\12\3\1\100\2\3\25\0\2\3\1\0"+
    "\1\101\2\3\5\0\4\3\1\102\1\103\2\3\1\104"+
    "\14\3\25\0\2\3\1\0\3\3\5\0\14\3\1\105"+
    "\10\3\25\0\2\3\1\0\3\3\5\0\2\3\1\106"+
    "\22\3\25\0\2\3\1\0\3\3\5\0\10\3\1\107"+
    "\14\3\25\0\2\3\1\0\3\3\5\0\2\3\1\110"+
    "\5\3\1\111\14\3\25\0\2\3\1\0\3\3\5\0"+
    "\5\3\1\112\1\3\1\113\1\114\1\115\13\3\25\0"+
    "\2\3\1\0\3\3\5\0\2\3\1\116\5\3\1\117"+
    "\14\3\25\0\2\3\1\0\1\3\1\120\1\3\5\0"+
    "\15\3\1\121\7\3\25\0\2\3\1\0\1\122\1\3"+
    "\1\123\5\0\1\3\1\124\1\3\1\125\1\126\12\3"+
    "\1\127\5\3\25\0\2\3\1\0\3\3\5\0\10\3"+
    "\1\130\14\3\25\0\2\3\1\0\3\3\5\0\4\3"+
    "\1\131\20\3\25\0\2\3\1\0\3\3\5\0\5\3"+
    "\1\132\17\3\25\0\2\3\1\0\3\3\5\0\6\3"+
    "\1\133\16\3\65\0\1\134\64\0\1\135\1\136\63\0"+
    "\1\137\1\0\1\140\62\0\1\141\64\0\1\142\72\0"+
    "\1\143\65\0\1\144\55\0\1\145\64\0\1\146\10\0"+
    "\1\147\53\0\1\150\11\0\1\151\54\0\1\152\22\0"+
    "\2\3\1\0\2\3\1\153\5\0\3\3\1\154\21\3"+
    "\25\0\2\3\1\0\3\3\5\0\21\3\1\155\3\3"+
    "\25\0\2\3\1\0\3\3\5\0\7\3\1\156\15\3"+
    "\25\0\2\3\1\0\3\3\5\0\24\3\1\157\25\0"+
    "\2\3\1\0\3\3\5\0\6\3\1\160\16\3\25\0"+
    "\2\3\1\0\3\3\5\0\1\3\1\161\12\3\1\162"+
    "\10\3\24\0\10\70\1\0\54\70\1\0\2\3\1\0"+
    "\2\3\1\163\5\0\25\3\25\0\2\3\1\0\3\3"+
    "\5\0\2\3\1\164\22\3\25\0\2\3\1\0\3\3"+
    "\5\0\14\3\1\165\10\3\25\0\2\3\1\0\3\3"+
    "\5\0\15\3\1\166\7\3\25\0\2\3\1\0\2\3"+
    "\1\167\5\0\25\3\25\0\2\3\1\0\1\3\1\170"+
    "\1\3\5\0\25\3\25\0\2\3\1\0\3\3\5\0"+
    "\5\3\1\171\17\3\25\0\2\3\1\0\2\3\1\172"+
    "\5\0\15\3\1\173\7\3\25\0\2\3\1\0\1\3"+
    "\1\174\1\3\5\0\14\3\1\175\10\3\25\0\2\3"+
    "\1\0\2\3\1\176\5\0\25\3\25\0\2\3\1\0"+
    "\2\3\1\177\5\0\11\3\1\200\13\3\25\0\2\3"+
    "\1\0\1\3\1\201\1\3\5\0\25\3\25\0\2\3"+
    "\1\0\2\3\1\202\5\0\25\3\25\0\2\3\1\0"+
    "\2\3\1\203\5\0\25\3\25\0\2\3\1\0\3\3"+
    "\5\0\7\3\1\204\15\3\25\0\2\3\1\0\3\3"+
    "\5\0\10\3\1\205\14\3\25\0\2\3\1\0\3\3"+
    "\5\0\6\3\1\206\16\3\25\0\2\3\1\0\3\3"+
    "\5\0\2\3\1\207\22\3\25\0\2\3\1\0\3\3"+
    "\5\0\12\3\1\210\12\3\25\0\2\3\1\0\3\3"+
    "\5\0\14\3\1\211\10\3\25\0\2\3\1\0\1\212"+
    "\2\3\5\0\15\3\1\213\7\3\25\0\2\3\1\0"+
    "\1\214\2\3\5\0\25\3\25\0\2\3\1\0\3\3"+
    "\5\0\11\3\1\215\11\3\1\216\1\3\25\0\2\3"+
    "\1\0\3\3\5\0\5\3\1\217\1\220\4\3\1\221"+
    "\11\3\25\0\2\3\1\0\3\3\5\0\15\3\1\222"+
    "\7\3\25\0\2\3\1\0\3\3\5\0\5\3\1\223"+
    "\17\3\25\0\2\3\1\0\3\3\5\0\10\3\1\224"+
    "\14\3\25\0\2\3\1\0\1\225\2\3\5\0\25\3"+
    "\25\0\2\3\1\0\1\226\2\3\5\0\7\3\1\227"+
    "\15\3\25\0\2\3\1\0\1\230\2\3\5\0\25\3"+
    "\25\0\2\3\1\0\1\231\2\3\5\0\25\3\25\0"+
    "\2\3\1\0\1\232\2\3\5\0\25\3\26\0\1\233"+
    "\63\0\2\3\1\0\3\3\5\0\7\3\1\234\15\3"+
    "\25\0\2\3\1\0\3\3\5\0\2\3\1\235\22\3"+
    "\25\0\2\3\1\0\3\3\5\0\7\3\1\236\15\3"+
    "\25\0\2\3\1\0\3\3\5\0\2\3\1\237\22\3"+
    "\25\0\2\3\1\0\3\3\5\0\10\3\1\240\14\3"+
    "\25\0\2\3\1\0\3\3\5\0\2\3\1\241\22\3"+
    "\25\0\2\3\1\0\3\3\5\0\2\3\1\242\22\3"+
    "\25\0\2\3\1\0\3\3\5\0\5\3\1\243\17\3"+
    "\25\0\2\3\1\0\3\3\5\0\21\3\1\244\3\3"+
    "\25\0\2\3\1\0\3\3\5\0\2\3\1\245\22\3"+
    "\25\0\2\3\1\0\3\3\5\0\2\3\1\246\22\3"+
    "\25\0\2\3\1\0\3\3\5\0\6\3\1\247\16\3"+
    "\25\0\2\3\1\0\3\3\5\0\3\3\1\250\21\3"+
    "\25\0\2\3\1\0\3\3\5\0\2\3\1\251\22\3"+
    "\25\0\2\3\1\0\2\3\1\252\5\0\15\3\1\253"+
    "\7\3\25\0\2\3\1\0\2\3\1\254\5\0\25\3"+
    "\25\0\2\3\1\0\3\3\5\0\10\3\1\255\14\3"+
    "\25\0\2\3\1\0\3\3\5\0\14\3\1\256\10\3"+
    "\25\0\2\3\1\0\1\257\2\3\5\0\25\3\25\0"+
    "\2\3\1\0\3\3\5\0\11\3\1\260\13\3\25\0"+
    "\2\3\1\0\3\3\5\0\15\3\1\261\7\3\25\0"+
    "\2\3\1\0\3\3\5\0\10\3\1\262\14\3\25\0"+
    "\2\3\1\0\3\3\5\0\15\3\1\263\7\3\25\0"+
    "\2\3\1\0\3\3\5\0\5\3\1\264\17\3\25\0"+
    "\2\3\1\0\2\3\1\265\5\0\25\3\25\0\2\3"+
    "\1\0\1\266\2\3\5\0\5\3\1\267\17\3\25\0"+
    "\2\3\1\0\3\3\5\0\1\270\24\3\25\0\2\3"+
    "\1\0\3\3\5\0\10\3\1\271\14\3\25\0\2\3"+
    "\1\0\1\272\2\3\5\0\25\3\25\0\2\3\1\0"+
    "\1\3\1\273\1\3\5\0\25\3\25\0\2\3\1\0"+
    "\1\3\1\274\1\3\5\0\25\3\25\0\2\3\1\0"+
    "\3\3\5\0\2\3\1\275\22\3\25\0\2\3\1\0"+
    "\2\3\1\276\5\0\25\3\25\0\2\3\1\0\1\277"+
    "\2\3\5\0\14\3\1\300\10\3\25\0\2\3\1\0"+
    "\2\3\1\301\5\0\25\3\25\0\2\3\1\0\1\3"+
    "\1\302\1\3\5\0\25\3\25\0\2\3\1\0\3\3"+
    "\5\0\6\3\1\303\16\3\25\0\2\3\1\0\2\3"+
    "\1\304\5\0\25\3\25\0\2\3\1\0\3\3\5\0"+
    "\13\3\1\305\11\3\25\0\2\3\1\0\3\3\5\0"+
    "\5\3\1\306\17\3\25\0\2\3\1\0\3\3\5\0"+
    "\7\3\1\307\15\3\25\0\2\3\1\0\1\3\1\310"+
    "\1\3\5\0\25\3\25\0\2\3\1\0\1\3\1\311"+
    "\1\3\5\0\25\3\26\0\1\233\52\0\1\312\10\0"+
    "\2\3\1\0\3\3\5\0\14\3\1\313\10\3\25\0"+
    "\2\3\1\0\3\3\5\0\15\3\1\314\7\3\25\0"+
    "\2\3\1\0\3\3\5\0\13\3\1\315\11\3\25\0"+
    "\2\3\1\0\3\3\5\0\17\3\1\316\5\3\25\0"+
    "\2\3\1\0\3\3\5\0\20\3\1\317\4\3\25\0"+
    "\2\3\1\0\3\3\5\0\6\3\1\320\16\3\25\0"+
    "\2\3\1\0\3\3\5\0\4\3\1\321\20\3\25\0"+
    "\2\3\1\0\1\322\2\3\5\0\25\3\25\0\2\3"+
    "\1\0\2\3\1\323\5\0\25\3\25\0\2\3\1\0"+
    "\3\3\5\0\6\3\1\324\16\3\25\0\2\3\1\0"+
    "\3\3\5\0\15\3\1\325\7\3\25\0\2\3\1\0"+
    "\3\3\5\0\2\3\1\326\22\3\25\0\2\3\1\0"+
    "\2\3\1\327\5\0\25\3\25\0\2\3\1\0\3\3"+
    "\5\0\15\3\1\330\7\3\25\0\2\3\1\0\1\3"+
    "\1\331\1\3\5\0\25\3\25\0\2\3\1\0\3\3"+
    "\5\0\14\3\1\332\10\3\25\0\2\3\1\0\3\3"+
    "\5\0\7\3\1\333\15\3\25\0\2\3\1\0\1\3"+
    "\1\334\1\3\5\0\25\3\25\0\2\3\1\0\3\3"+
    "\5\0\11\3\1\335\13\3\25\0\2\3\1\0\3\3"+
    "\5\0\11\3\1\336\13\3\25\0\2\3\1\0\3\3"+
    "\5\0\2\3\1\337\22\3\25\0\2\3\1\0\3\3"+
    "\5\0\10\3\1\340\14\3\25\0\2\3\1\0\1\341"+
    "\2\3\5\0\25\3\25\0\2\3\1\0\1\3\1\342"+
    "\1\3\5\0\25\3\25\0\2\3\1\0\3\3\5\0"+
    "\3\3\1\343\21\3\25\0\2\3\1\0\3\3\5\0"+
    "\2\3\1\344\22\3\25\0\2\3\1\0\3\3\5\0"+
    "\12\3\1\345\12\3\25\0\2\3\1\0\2\3\1\346"+
    "\5\0\25\3\25\0\2\3\1\0\3\3\5\0\3\3"+
    "\1\347\21\3\25\0\2\3\1\0\2\3\1\350\5\0"+
    "\25\3\25\0\2\3\1\0\3\3\5\0\2\3\1\351"+
    "\22\3\25\0\2\3\1\0\2\3\1\352\5\0\25\3"+
    "\25\0\2\3\1\0\3\3\5\0\13\3\1\353\11\3"+
    "\25\0\2\3\1\0\3\3\5\0\24\3\1\354\25\0"+
    "\2\3\1\0\3\3\5\0\2\3\1\355\22\3\25\0"+
    "\2\3\1\0\1\3\1\356\1\3\5\0\25\3\25\0"+
    "\2\3\1\0\1\3\1\357\1\3\5\0\25\3\25\0"+
    "\2\3\1\0\1\3\1\360\1\3\5\0\25\3\25\0"+
    "\2\3\1\0\2\3\1\361\5\0\25\3\25\0\2\3"+
    "\1\0\3\3\5\0\2\3\1\362\22\3\25\0\2\3"+
    "\1\0\3\3\5\0\7\3\1\363\15\3\25\0\2\3"+
    "\1\0\3\3\5\0\2\3\1\364\22\3\25\0\2\3"+
    "\1\0\1\3\1\365\1\3\5\0\25\3\25\0\2\3"+
    "\1\0\3\3\5\0\13\3\1\366\11\3\25\0\2\3"+
    "\1\0\3\3\5\0\12\3\1\367\12\3\25\0\2\3"+
    "\1\0\3\3\5\0\3\3\1\370\21\3\25\0\2\3"+
    "\1\0\3\3\5\0\11\3\1\371\13\3\25\0\2\3"+
    "\1\0\2\3\1\372\5\0\25\3\25\0\2\3\1\0"+
    "\3\3\5\0\21\3\1\373\3\3\25\0\2\3\1\0"+
    "\3\3\5\0\4\3\1\374\20\3\25\0\2\3\1\0"+
    "\1\375\2\3\5\0\25\3\25\0\2\3\1\0\3\3"+
    "\5\0\12\3\1\376\12\3\25\0\2\3\1\0\3\3"+
    "\5\0\2\3\1\377\22\3\25\0\2\3\1\0\3\3"+
    "\5\0\5\3\1\u0100\17\3\25\0\2\3\1\0\3\3"+
    "\5\0\12\3\1\u0101\12\3\25\0\2\3\1\0\3\3"+
    "\5\0\14\3\1\u0102\10\3\25\0\2\3\1\0\3\3"+
    "\5\0\2\3\1\u0103\22\3\25\0\2\3\1\0\2\3"+
    "\1\u0104\5\0\25\3\25\0\2\3\1\0\3\3\5\0"+
    "\2\3\1\u0105\22\3\25\0\2\3\1\0\3\3\5\0"+
    "\7\3\1\u0106\15\3\25\0\2\3\1\0\3\3\5\0"+
    "\3\3\1\u0107\21\3\25\0\2\3\1\0\3\3\5\0"+
    "\2\3\1\u0108\22\3\25\0\2\3\1\0\3\3\5\0"+
    "\6\3\1\u0109\16\3\25\0\2\3\1\0\3\3\5\0"+
    "\13\3\1\u010a\11\3\25\0\2\3\1\0\3\3\5\0"+
    "\2\3\1\u010b\22\3\25\0\2\3\1\0\3\3\5\0"+
    "\2\3\1\u010c\22\3\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9858];
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
    "\1\0\1\11\7\1\1\11\1\1\2\11\24\1\1\11"+
    "\6\1\10\11\10\1\1\11\1\0\41\1\16\11\1\0"+
    "\60\1\1\0\56\1\1\11\102\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[268];
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
    public String lexemas;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 180) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 87: 
          { lexemas=yytext(); return Struct;
          }
        case 99: break;
        case 24: 
          { lexemas=yytext(); return Llave_c;
          }
        case 100: break;
        case 80: 
          { lexemas=yytext(); return Return;
          }
        case 101: break;
        case 17: 
          { lexemas=yytext(); return Operador_bit_a_bit_Or;
          }
        case 102: break;
        case 11: 
          { lexemas=yytext(); return Suma;
          }
        case 103: break;
        case 69: 
          { lexemas=yytext(); return Catch;
          }
        case 104: break;
        case 31: 
          { lexemas = yytext(); return Operador_atribucion_divisionIgual;
          }
        case 105: break;
        case 34: 
          { lexemas=yytext(); return Operador_relacional_Igual;
          }
        case 106: break;
        case 51: 
          { lexemas=yytext(); return For;
          }
        case 107: break;
        case 89: 
          { lexemas=yytext(); return Switch;
          }
        case 108: break;
        case 12: 
          { lexemas=yytext(); return Resta;
          }
        case 109: break;
        case 7: 
          { lexemas=yytext(); return Comillas;
          }
        case 110: break;
        case 71: 
          { lexemas = yytext(); return Operador_booleano_False;
          }
        case 111: break;
        case 41: 
          { lexemas=yytext(); return Operador_Logico_And;
          }
        case 112: break;
        case 65: 
          { lexemas=yytext(); return Vacio;
          }
        case 113: break;
        case 5: 
          { lexemas=yytext(); return Division;
          }
        case 114: break;
        case 15: 
          { lexemas=yytext(); return Numeral;
          }
        case 115: break;
        case 10: 
          { lexemas=yytext(); return Igual;
          }
        case 116: break;
        case 62: 
          { lexemas=yytext(); return Long;
          }
        case 117: break;
        case 13: 
          { lexemas=yytext(); return Multiplicacion;
          }
        case 118: break;
        case 54: 
          { lexemas = yytext(); return Operador_booleano_True;
          }
        case 119: break;
        case 36: 
          { lexemas = yytext(); return Operador_incremento;
          }
        case 120: break;
        case 49: 
          { lexemas=yytext(); return Try;
          }
        case 121: break;
        case 4: 
          { /*Ignore*/
          }
        case 122: break;
        case 32: 
          { lexemas=yytext(); return Cont_Cadena;
          }
        case 123: break;
        case 84: 
          { lexemas=yytext(); return Sizeof;
          }
        case 124: break;
        case 92: 
          { lexemas=yytext(); return Typedef;
          }
        case 125: break;
        case 30: 
          { lexemas=yytext(); return If;
          }
        case 126: break;
        case 26: 
          { lexemas = yytext(); return Corchete_c;
          }
        case 127: break;
        case 56: 
          { lexemas=yytext(); return Enum;
          }
        case 128: break;
        case 91: 
          { lexemas=yytext(); return Include;
          }
        case 129: break;
        case 72: 
          { lexemas=yytext(); return Float;
          }
        case 130: break;
        case 58: 
          { lexemas=yytext(); return Char;
          }
        case 131: break;
        case 23: 
          { lexemas=yytext(); return Llave_a;
          }
        case 132: break;
        case 81: 
          { lexemas=yytext(); return Define;
          }
        case 133: break;
        case 97: 
          { lexemas=yytext(); return Volatile;
          }
        case 134: break;
        case 1: 
          { return ERROR;
          }
        case 135: break;
        case 28: 
          { lexemas=yytext(); return Punto;
          }
        case 136: break;
        case 35: 
          { lexemas = yytext(); return Operador_atribucion_masIgual;
          }
        case 137: break;
        case 46: 
          { lexemas=yytext(); return Operador_relacional_menoroIgual;
          }
        case 138: break;
        case 96: 
          { lexemas=yytext(); return Unsigned;
          }
        case 139: break;
        case 67: 
          { lexemas=yytext(); return Throw;
          }
        case 140: break;
        case 29: 
          { lexemas=yytext(); return Dos_P;
          }
        case 141: break;
        case 90: 
          { lexemas=yytext(); return Printf;
          }
        case 142: break;
        case 16: 
          { lexemas=yytext(); return Operador_bit_a_bit_And;
          }
        case 143: break;
        case 95: 
          { lexemas=yytext(); return Register;
          }
        case 144: break;
        case 55: 
          { lexemas=yytext(); return Byte;
          }
        case 145: break;
        case 93: 
          { lexemas=yytext(); return Default;
          }
        case 146: break;
        case 38: 
          { lexemas = yytext(); return Operador_decremento;
          }
        case 147: break;
        case 20: 
          { lexemas=yytext(); return Operador_relacional_Menor;
          }
        case 148: break;
        case 14: 
          { lexemas=yytext(); return Modulo;
          }
        case 149: break;
        case 19: 
          { lexemas=yytext(); return Operador_relacional_Mayor;
          }
        case 150: break;
        case 52: 
          { lexemas=yytext(); return Std;
          }
        case 151: break;
        case 76: 
          { lexemas=yytext(); return Scanf;
          }
        case 152: break;
        case 60: 
          { lexemas=yytext(); return Cout;
          }
        case 153: break;
        case 39: 
          { lexemas = yytext(); return Operador_atribucion_porIgual;
          }
        case 154: break;
        case 73: 
          { lexemas=yytext(); return Fgets;
          }
        case 155: break;
        case 77: 
          { lexemas=yytext(); return Short;
          }
        case 156: break;
        case 57: 
          { lexemas=yytext(); return Else;
          }
        case 157: break;
        case 25: 
          { lexemas = yytext(); return Corchete_a;
          }
        case 158: break;
        case 37: 
          { lexemas = yytext(); return Operador_atribucion_menosIgual;
          }
        case 159: break;
        case 22: 
          { lexemas=yytext(); return Parent_c;
          }
        case 160: break;
        case 64: 
          { lexemas=yytext(); return Goto;
          }
        case 161: break;
        case 66: 
          { lexemas=yytext(); return Main;
          }
        case 162: break;
        case 2: 
          { lexemas=yytext(); return Identificador;
          }
        case 163: break;
        case 27: 
          { lexemas=yytext(); return P_coma;
          }
        case 164: break;
        case 44: 
          { lexemas=yytext(); return Operador_relacional_mayoroIgual;
          }
        case 165: break;
        case 78: 
          { lexemas=yytext(); return While;
          }
        case 166: break;
        case 74: 
          { lexemas=yytext(); return Union;
          }
        case 167: break;
        case 59: 
          { lexemas=yytext(); return Case;
          }
        case 168: break;
        case 83: 
          { lexemas=yytext(); return Signed;
          }
        case 169: break;
        case 63: 
          { lexemas=yytext(); return Gets;
          }
        case 170: break;
        case 53: 
          { lexemas=yytext(); return Nulo;
          }
        case 171: break;
        case 6: 
          { return Linea;
          }
        case 172: break;
        case 85: 
          { lexemas=yytext(); return Static;
          }
        case 173: break;
        case 42: 
          { lexemas=yytext(); return Operador_Logico_Or;
          }
        case 174: break;
        case 45: 
          { lexemas=yytext(); return Operador_relacional_DesplazamientoD;
          }
        case 175: break;
        case 8: 
          { lexemas=yytext(); return Comillas_S;
          }
        case 176: break;
        case 70: 
          { lexemas=yytext(); return Const;
          }
        case 177: break;
        case 98: 
          { lexemas=yytext(); return Namespace;
          }
        case 178: break;
        case 40: 
          { lexemas = yytext(); return Operador_atribucion_porcentajeIgual;
          }
        case 179: break;
        case 88: 
          { lexemas=yytext(); return Sistema;
          }
        case 180: break;
        case 50: 
          { lexemas=yytext(); return Cin;
          }
        case 181: break;
        case 18: 
          { lexemas=yytext(); return Operador_Logico_Not;
          }
        case 182: break;
        case 9: 
          { lexemas=yytext(); return B_Slash;
          }
        case 183: break;
        case 79: 
          { lexemas=yytext(); return Extern;
          }
        case 184: break;
        case 48: 
          { lexemas=yytext(); return Int;
          }
        case 185: break;
        case 68: 
          { lexemas=yytext(); return Break;
          }
        case 186: break;
        case 86: 
          { lexemas=yytext(); return Cadena;
          }
        case 187: break;
        case 75: 
          { lexemas=yytext(); return Using;
          }
        case 188: break;
        case 3: 
          { lexemas=yytext(); return Numero;
          }
        case 189: break;
        case 61: 
          { lexemas=yytext(); return Auto;
          }
        case 190: break;
        case 43: 
          { lexemas=yytext(); return Operador_relacional_Diferente;
          }
        case 191: break;
        case 21: 
          { lexemas=yytext(); return Parent_a;
          }
        case 192: break;
        case 82: 
          { lexemas=yytext(); return Double;
          }
        case 193: break;
        case 33: 
          { lexemas=yytext(); return Do;
          }
        case 194: break;
        case 47: 
          { lexemas=yytext(); return Operador_relacional_DesplazamientoI;
          }
        case 195: break;
        case 94: 
          { lexemas=yytext(); return Continue;
          }
        case 196: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}