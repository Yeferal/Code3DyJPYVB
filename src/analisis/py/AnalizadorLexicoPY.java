/* The following code was generated by JFlex 1.4.3 on 15/10/20 07:04 AM */

package analisis.py;
import java_cup.runtime.*;
import java.util.ArrayList;
import errores.ErrorG;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 15/10/20 07:04 AM from the specification file
 * <tt>LexicoPY.jflex</tt>
 */
public class AnalizadorLexicoPY implements java_cup.runtime.Scanner {

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
     0,  0,  0,  0,  0,  0,  0,  0,  0, 51, 10,  0,  0,  6,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    52,  0,  5, 32,  0,  7,  0, 50, 42, 59, 27, 25, 58, 26, 49, 28, 
     4,  4,  4,  4,  4,  4,  4,  4,  4,  4, 53, 48, 29, 31, 30,  0, 
     0, 12,  9,  1,  1,  1,  1, 17,  1,  1, 11,  1,  1, 18,  1, 16, 
    13,  1, 15,  1,  1,  1,  8,  1,  1, 14,  1, 54,  0, 55,  0, 43, 
     0, 19, 46, 38, 21, 41, 36, 40, 39, 34,  1, 47, 37,  1, 20, 22, 
    33,  1, 23, 45, 24, 35,  1, 44,  1,  1,  1, 56,  0, 57,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  3,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  2,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\1\1\4\1\1"+
    "\1\5\5\2\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\1\5\2\1\15\1\16\2\2\1\1\1\17"+
    "\1\4\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\3\0\1\27\1\0\3\2\1\30\2\2\1\31\1\0"+
    "\1\32\1\33\1\34\1\35\1\36\1\0\1\37\1\2"+
    "\1\40\1\41\6\2\2\0\1\42\1\27\3\0\1\43"+
    "\1\44\1\45\2\2\1\0\2\2\1\46\6\2\1\47"+
    "\4\0\2\2\1\50\4\2\1\51\1\52\2\2\3\0"+
    "\2\2\1\53\3\2\1\54\1\2\1\50\2\0\1\55"+
    "\1\56\3\2\1\57\2\0\3\2\2\0\1\60\2\2"+
    "\2\0\1\2\1\61\1\0\1\62\1\63\3\0\2\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[150];
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
    "\0\0\0\74\0\170\0\264\0\360\0\u012c\0\74\0\u0168"+
    "\0\74\0\u01a4\0\u01e0\0\u021c\0\u0258\0\u0294\0\74\0\74"+
    "\0\u02d0\0\u030c\0\u0348\0\u0384\0\u03c0\0\u03fc\0\u0438\0\u0474"+
    "\0\u04b0\0\u04ec\0\u0528\0\74\0\74\0\u0564\0\u05a0\0\u05dc"+
    "\0\74\0\u0618\0\74\0\74\0\74\0\74\0\74\0\74"+
    "\0\74\0\264\0\u0654\0\u0690\0\u06cc\0\u0708\0\u0744\0\u0780"+
    "\0\u07bc\0\170\0\u07f8\0\u0834\0\74\0\u0870\0\u03fc\0\74"+
    "\0\74\0\74\0\74\0\u03fc\0\74\0\u08ac\0\u08e8\0\170"+
    "\0\u0924\0\u0960\0\u099c\0\u09d8\0\u0a14\0\u0a50\0\u0a8c\0\u0ac8"+
    "\0\u0654\0\74\0\u0b04\0\u0b40\0\u0b7c\0\170\0\170\0\170"+
    "\0\u0bb8\0\u0bf4\0\u0c30\0\u0c6c\0\u0ca8\0\170\0\u0ce4\0\u0d20"+
    "\0\u0d5c\0\u0d98\0\u0dd4\0\u0e10\0\74\0\u0e4c\0\u0e88\0\u0ec4"+
    "\0\u0f00\0\u0f3c\0\u0f78\0\u0870\0\u0fb4\0\u0ff0\0\u102c\0\u1068"+
    "\0\170\0\170\0\u10a4\0\u10e0\0\u111c\0\u1158\0\u1194\0\u11d0"+
    "\0\u120c\0\170\0\u1248\0\u1284\0\u12c0\0\170\0\u12fc\0\u111c"+
    "\0\u1338\0\u1374\0\74\0\170\0\u13b0\0\u13ec\0\u1428\0\74"+
    "\0\u1464\0\u14a0\0\u14dc\0\u1518\0\u1554\0\u1590\0\u15cc\0\170"+
    "\0\u1608\0\u1644\0\u1680\0\u16bc\0\u16f8\0\170\0\u1734\0\u1770"+
    "\0\170\0\u17ac\0\u17e8\0\u1824\0\u1860\0\u1734";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[150];
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
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\2\3\1\11\10\3\1\12\1\13\1\14\1\15\1\16"+
    "\1\3\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\3\1\31\1\3\1\32\2\3"+
    "\1\33\1\34\1\35\1\36\1\3\1\37\1\3\2\2"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\75\0\1\3\1\52\1\0\1\3\3\0"+
    "\2\3\1\0\16\3\10\0\11\3\1\0\5\3\17\0"+
    "\1\3\74\0\1\5\54\0\1\53\12\0\5\54\1\55"+
    "\66\54\7\0\1\56\65\0\1\3\1\52\1\0\1\3"+
    "\3\0\2\3\1\0\11\3\1\57\4\3\10\0\11\3"+
    "\1\0\5\3\15\0\1\3\1\52\1\0\1\3\3\0"+
    "\2\3\1\0\13\3\1\60\2\3\10\0\11\3\1\0"+
    "\5\3\15\0\1\3\1\52\1\0\1\3\3\0\2\3"+
    "\1\0\16\3\10\0\10\3\1\61\1\0\5\3\15\0"+
    "\1\3\1\52\1\0\1\3\3\0\2\3\1\0\14\3"+
    "\1\62\1\3\10\0\11\3\1\0\5\3\15\0\1\3"+
    "\1\52\1\0\1\3\3\0\2\3\1\0\10\3\1\63"+
    "\5\3\10\0\10\3\1\64\1\0\5\3\47\0\1\65"+
    "\73\0\1\66\1\67\75\0\1\70\1\71\73\0\1\72"+
    "\73\0\1\73\34\0\12\74\1\75\61\74\1\0\1\3"+
    "\1\52\1\0\1\3\3\0\2\3\1\0\14\3\1\76"+
    "\1\3\10\0\11\3\1\0\5\3\15\0\1\3\1\52"+
    "\1\0\1\3\3\0\2\3\1\0\11\3\1\77\4\3"+
    "\10\0\3\3\1\100\5\3\1\0\5\3\15\0\1\3"+
    "\1\52\1\0\1\3\3\0\2\3\1\0\13\3\1\101"+
    "\2\3\10\0\4\3\1\102\4\3\1\0\5\3\15\0"+
    "\1\3\1\52\1\0\1\3\3\0\2\3\1\0\16\3"+
    "\10\0\6\3\1\103\2\3\1\0\5\3\15\0\1\3"+
    "\1\52\1\0\1\3\3\0\2\3\1\0\16\3\10\0"+
    "\4\3\1\104\4\3\1\0\5\3\15\0\1\3\1\52"+
    "\1\0\1\3\3\0\2\3\1\0\16\3\10\0\6\3"+
    "\1\105\2\3\1\0\5\3\15\0\1\3\1\52\1\0"+
    "\1\3\3\0\2\3\1\0\14\3\1\106\1\3\10\0"+
    "\11\3\1\0\5\3\14\0\5\107\1\0\66\107\64\0"+
    "\1\110\13\0\1\111\67\0\5\54\1\112\66\54\5\0"+
    "\1\113\76\0\1\114\4\0\1\115\57\0\1\3\1\52"+
    "\1\0\1\3\3\0\2\3\1\0\12\3\1\116\3\3"+
    "\10\0\11\3\1\0\5\3\15\0\1\3\1\52\1\0"+
    "\1\3\3\0\2\3\1\0\15\3\1\117\10\0\11\3"+
    "\1\0\5\3\15\0\1\3\1\52\1\0\1\3\3\0"+
    "\2\3\1\0\16\3\10\0\3\3\1\120\5\3\1\0"+
    "\5\3\15\0\1\3\1\52\1\0\1\3\3\0\2\3"+
    "\1\0\11\3\1\121\4\3\10\0\11\3\1\0\5\3"+
    "\15\0\1\3\1\52\1\0\1\3\3\0\2\3\1\0"+
    "\15\3\1\122\10\0\11\3\1\0\5\3\14\0\33\66"+
    "\1\123\40\66\1\0\1\3\1\52\1\0\1\3\3\0"+
    "\2\3\1\0\16\3\10\0\1\3\1\124\7\3\1\0"+
    "\5\3\15\0\1\3\1\52\1\0\1\3\3\0\2\3"+
    "\1\0\15\3\1\125\10\0\11\3\1\0\5\3\15\0"+
    "\1\3\1\52\1\0\1\3\3\0\2\3\1\0\14\3"+
    "\1\126\1\3\10\0\11\3\1\0\5\3\15\0\1\3"+
    "\1\52\1\0\1\3\3\0\2\3\1\0\13\3\1\127"+
    "\2\3\10\0\11\3\1\0\5\3\15\0\1\3\1\52"+
    "\1\0\1\3\3\0\2\3\1\0\10\3\1\130\5\3"+
    "\10\0\11\3\1\0\5\3\15\0\1\3\1\52\1\0"+
    "\1\3\3\0\2\3\1\0\16\3\10\0\1\3\1\131"+
    "\7\3\1\0\2\3\1\132\2\3\15\0\1\3\1\52"+
    "\1\0\1\3\3\0\2\3\1\0\16\3\10\0\1\3"+
    "\1\133\7\3\1\0\5\3\15\0\1\3\1\52\1\0"+
    "\1\3\3\0\2\3\1\0\16\3\10\0\10\3\1\134"+
    "\1\0\5\3\76\0\1\135\75\0\1\136\7\0\5\113"+
    "\1\137\66\113\11\0\1\140\101\0\1\141\55\0\1\3"+
    "\1\52\1\0\1\3\3\0\2\3\1\0\16\3\10\0"+
    "\7\3\1\142\1\3\1\0\5\3\15\0\1\3\1\52"+
    "\1\0\1\3\3\0\2\3\1\0\16\3\10\0\2\3"+
    "\1\143\6\3\1\0\5\3\14\0\33\66\1\123\1\144"+
    "\37\66\1\0\1\3\1\52\1\0\1\3\3\0\2\3"+
    "\1\0\11\3\1\145\4\3\10\0\11\3\1\0\5\3"+
    "\15\0\1\3\1\52\1\0\1\3\3\0\2\3\1\0"+
    "\16\3\10\0\1\3\1\146\7\3\1\0\5\3\15\0"+
    "\1\3\1\52\1\0\1\3\3\0\2\3\1\0\10\3"+
    "\1\147\5\3\10\0\11\3\1\0\5\3\15\0\1\3"+
    "\1\52\1\0\1\3\3\0\2\3\1\0\14\3\1\150"+
    "\1\3\10\0\11\3\1\0\5\3\15\0\1\3\1\52"+
    "\1\0\1\3\3\0\2\3\1\0\16\3\10\0\3\3"+
    "\1\151\5\3\1\0\5\3\15\0\1\3\1\52\1\0"+
    "\1\3\3\0\2\3\1\0\16\3\10\0\10\3\1\152"+
    "\1\0\5\3\15\0\1\3\1\52\1\0\1\3\3\0"+
    "\2\3\1\0\16\3\10\0\4\3\1\153\4\3\1\0"+
    "\5\3\15\0\1\3\1\52\1\0\1\3\3\0\2\3"+
    "\1\0\10\3\1\154\5\3\10\0\11\3\1\0\5\3"+
    "\100\0\1\41\7\0\5\113\1\155\66\113\7\140\1\156"+
    "\64\140\20\0\1\157\54\0\1\3\1\52\1\0\1\3"+
    "\3\0\2\3\1\0\16\3\10\0\10\3\1\160\1\0"+
    "\5\3\15\0\1\3\1\52\1\0\1\3\3\0\2\3"+
    "\1\0\14\3\1\161\1\3\10\0\11\3\1\0\5\3"+
    "\15\0\1\3\1\52\1\0\1\3\3\0\2\3\1\0"+
    "\15\3\1\162\10\0\11\3\1\0\5\3\15\0\1\3"+
    "\1\52\1\0\1\3\3\0\2\3\1\0\11\3\1\163"+
    "\4\3\10\0\11\3\1\0\5\3\15\0\1\3\1\52"+
    "\1\0\1\3\3\0\2\3\1\0\15\3\1\164\10\0"+
    "\11\3\1\0\5\3\15\0\1\3\1\52\1\0\1\3"+
    "\3\0\2\3\1\0\16\3\10\0\1\3\1\165\7\3"+
    "\1\0\5\3\15\0\1\3\1\52\1\0\1\3\3\0"+
    "\2\3\1\0\16\3\10\0\10\3\1\166\1\0\5\3"+
    "\15\0\1\3\1\52\1\0\1\3\3\0\2\3\1\0"+
    "\16\3\10\0\11\3\1\0\4\3\1\167\14\0\5\113"+
    "\1\170\66\113\7\140\1\171\64\140\21\0\1\172\53\0"+
    "\1\3\1\52\1\0\1\3\3\0\2\3\1\0\16\3"+
    "\10\0\11\3\1\173\5\3\15\0\1\3\1\52\1\0"+
    "\1\3\3\0\2\3\1\0\11\3\1\174\4\3\10\0"+
    "\11\3\1\0\5\3\15\0\1\3\1\52\1\0\1\3"+
    "\3\0\2\3\1\0\16\3\10\0\1\175\10\3\1\0"+
    "\5\3\15\0\1\3\1\52\1\0\1\3\3\0\2\3"+
    "\1\0\16\3\10\0\1\3\1\176\7\3\1\0\5\3"+
    "\15\0\1\3\1\52\1\0\1\3\3\0\2\3\1\0"+
    "\11\3\1\177\4\3\10\0\11\3\1\0\5\3\15\0"+
    "\1\3\1\52\1\0\1\3\3\0\2\3\1\0\16\3"+
    "\10\0\11\3\1\0\5\3\1\200\13\0\7\140\1\171"+
    "\3\140\1\201\60\140\17\0\1\202\55\0\1\3\1\52"+
    "\1\0\1\3\3\0\2\3\1\0\16\3\10\0\2\3"+
    "\1\203\6\3\1\0\5\3\15\0\1\3\1\52\1\0"+
    "\1\3\3\0\2\3\1\0\11\3\1\204\4\3\10\0"+
    "\11\3\1\0\5\3\15\0\1\3\1\52\1\0\1\3"+
    "\3\0\2\3\1\0\16\3\10\0\1\205\10\3\1\0"+
    "\5\3\14\0\7\140\1\156\4\140\1\206\57\140\14\0"+
    "\1\207\60\0\1\3\1\52\1\0\1\3\3\0\2\3"+
    "\1\0\15\3\1\210\10\0\11\3\1\0\5\3\15\0"+
    "\1\3\1\52\1\0\1\3\3\0\2\3\1\0\16\3"+
    "\10\0\1\211\10\3\1\0\5\3\15\0\1\3\1\52"+
    "\1\0\1\3\3\0\2\3\1\0\16\3\10\0\2\3"+
    "\1\212\6\3\1\0\5\3\14\0\7\140\1\156\1\213"+
    "\63\140\22\0\1\214\52\0\1\3\1\52\1\0\1\3"+
    "\3\0\2\3\1\0\16\3\10\0\2\3\1\215\6\3"+
    "\1\0\5\3\15\0\1\3\1\52\1\0\1\3\3\0"+
    "\2\3\1\0\15\3\1\216\10\0\11\3\1\0\5\3"+
    "\14\0\7\140\1\156\4\140\1\217\57\140\14\0\1\220"+
    "\60\0\1\3\1\52\1\0\1\3\3\0\2\3\1\0"+
    "\15\3\1\221\10\0\11\3\1\0\5\3\14\0\7\217"+
    "\1\222\64\217\74\220\7\217\1\223\73\217\1\223\5\217"+
    "\1\224\65\217\1\222\6\217\1\225\64\217\1\222\2\217"+
    "\1\226\61\217";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6300];
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
    "\1\0\1\11\4\1\1\11\1\1\1\11\5\1\2\11"+
    "\13\1\2\11\3\1\1\11\1\1\7\11\3\0\1\1"+
    "\1\0\6\1\1\11\1\0\1\1\4\11\1\0\1\11"+
    "\11\1\2\0\1\1\1\11\3\0\5\1\1\0\11\1"+
    "\1\11\4\0\13\1\3\0\11\1\2\0\1\11\4\1"+
    "\1\11\2\0\3\1\2\0\3\1\2\0\2\1\1\0"+
    "\2\1\3\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[150];
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
    //coidgo de usuario en sintaxis java
    public ArrayList<ErrorG> listaErrores = new  ArrayList<>();
    public void pintar(String s){
        System.out.println(s);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexicoPY(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public AnalizadorLexicoPY(java.io.InputStream in) {
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
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
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
        case 41: 
          { pintar(yytext()); return new Symbol(SimbolosPY.ELSE_IF , yycolumn, yyline, yytext());
          }
        case 53: break;
        case 24: 
          { pintar(yytext()); return new Symbol(SimbolosPY.OR , yycolumn, yyline, yytext());
          }
        case 54: break;
        case 12: 
          { pintar("IGUAL"); return new Symbol(SimbolosPY.IGUAL , yycolumn, yyline, yytext());
          }
        case 55: break;
        case 38: 
          { pintar("for"); return new Symbol(SimbolosPY.FOR , yycolumn, yyline, yytext());
          }
        case 56: break;
        case 5: 
          { pintar("SALTO"); return new Symbol(SimbolosPY.SALTO , yycolumn, yyline, yytext());
          }
        case 57: break;
        case 47: 
          { pintar(yytext()); return new Symbol(SimbolosPY.BREAK , yycolumn, yyline, yytext());
          }
        case 58: break;
        case 16: 
          { pintar("dos puntos"); return new Symbol(SimbolosPY.DOS_PUNTOS , yycolumn, yyline, yytext());
          }
        case 59: break;
        case 39: 
          { pintar(yytext()); return new Symbol(SimbolosPY.VALOR , yycolumn, yyline, yytext());
          }
        case 60: break;
        case 32: 
          { pintar("in"); return new Symbol(SimbolosPY.IN , yycolumn, yyline, yytext());
          }
        case 61: break;
        case 28: 
          { pintar("MENOR_IGUAL"); return new Symbol(SimbolosPY.MENOR_IGUAL , yycolumn, yyline, yytext());
          }
        case 62: break;
        case 21: 
          { pintar("COMA"); return new Symbol(SimbolosPY.COMA , yycolumn, yyline, yytext());
          }
        case 63: break;
        case 6: 
          { pintar("MAS"); return new Symbol(SimbolosPY.MAS , yycolumn, yyline, yytext());
          }
        case 64: break;
        case 8: 
          { pintar("*"); return new Symbol(SimbolosPY.POR , yycolumn, yyline, yytext());
          }
        case 65: break;
        case 20: 
          { pintar("LLAVES CIEERRE"); return new Symbol(SimbolosPY.LLAVES_C , yycolumn, yyline, yytext());
          }
        case 66: break;
        case 44: 
          { pintar("while"); return new Symbol(SimbolosPY.WHILE , yycolumn, yyline, yytext());
          }
        case 67: break;
        case 26: 
          { pintar("DIV_ENTERA"); return new Symbol(SimbolosPY.DIV_ENTERA , yycolumn, yyline, yytext());
          }
        case 68: break;
        case 35: 
          { pintar(yytext()); return new Symbol(SimbolosPY.AND , yycolumn, yyline, yytext());
          }
        case 69: break;
        case 14: 
          { pintar("_"); return new Symbol(SimbolosPY.GUION_BAJO , yycolumn, yyline, yytext());
          }
        case 70: break;
        case 52: 
          { pintar("%%PY"); return new Symbol(SimbolosPY.SEPARADOR_PY , yycolumn, yyline, yytext());
          }
        case 71: break;
        case 30: 
          { pintar("IGUAL_IGUAL"); return new Symbol(SimbolosPY.IGUAL_IGUAL , yycolumn, yyline, yytext());
          }
        case 72: break;
        case 51: 
          { pintar("floarinput"); return new Symbol(SimbolosPY.FLOATINPUT , yycolumn, yyline, yytext());
          }
        case 73: break;
        case 1: 
          { pintar("error Lexico: "+"Columna: "+yycolumn+1+" linea: "+ yyline+1 + "Token: "+yytext());
                                    ErrorG e = new ErrorG(yytext(),yyline+1, yycolumn+1,1,"Error Lexico token: " + yytext());
                                                listaErrores.add(e);
          }
        case 74: break;
        case 33: 
          { pintar(yytext()); return new Symbol(SimbolosPY.IF , yycolumn, yyline, yytext());
          }
        case 75: break;
        case 17: 
          { pintar("CHORCHETE ABRE"); return new Symbol(SimbolosPY.CORCHETE_A , yycolumn, yyline, yytext());
          }
        case 76: break;
        case 11: 
          { pintar("MAYOR_QUE"); return new Symbol(SimbolosPY.MAYOR_QUE , yycolumn, yyline, yytext());
          }
        case 77: break;
        case 40: 
          { pintar("Comentario: "+yytext()); return new Symbol(SimbolosPY.COMENTARIO_VARIOS , yycolumn, yyline, yytext());
          }
        case 78: break;
        case 34: 
          { pintar("NUMERO: "+yytext()); return new Symbol(SimbolosPY.DECIMAL , yycolumn, yyline, new Float(yytext()));
          }
        case 79: break;
        case 13: 
          { pintar("PARENTESIS_A"); return new Symbol(SimbolosPY.PARENTESIS_A , yycolumn, yyline, yytext());
          }
        case 80: break;
        case 50: 
          { /*pintar(yytext());*/ return new Symbol(SimbolosPY.SEPARADOR_PROGRAMA , yycolumn, yyline, yytext());
          }
        case 81: break;
        case 49: 
          { pintar("charinput"); return new Symbol(SimbolosPY.CHARINPUT , yycolumn, yyline, yytext());
          }
        case 82: break;
        case 43: 
          { pintar("Mensaje: "+yytext()); return new Symbol(SimbolosPY.PRINT , yycolumn, yyline, yytext());
          }
        case 83: break;
        case 23: 
          { pintar(yytext()); return new Symbol(SimbolosPY.TEXTO , yycolumn, yyline, yytext());
          }
        case 84: break;
        case 27: 
          { pintar("DIFERENTE"); return new Symbol(SimbolosPY.DIFERENTE , yycolumn, yyline, yytext());
          }
        case 85: break;
        case 31: 
          { pintar("Comentario: "+yytext()); return new Symbol(SimbolosPY.COMENTARIO_SIMPLE , yycolumn, yyline, yytext());
          }
        case 86: break;
        case 15: 
          { pintar("TAB"); return new Symbol(SimbolosPY.TAB , yycolumn, yyline, yytext());
          }
        case 87: break;
        case 37: 
          { pintar(yytext()); return new Symbol(SimbolosPY.DEF, yycolumn, yyline, yytext());
          }
        case 88: break;
        case 10: 
          { pintar("MENOR_QUE"); return new Symbol(SimbolosPY.MENOR_QUE , yycolumn, yyline, yytext());
          }
        case 89: break;
        case 36: 
          { pintar(yytext()); return new Symbol(SimbolosPY.NOT , yycolumn, yyline, yytext());
          }
        case 90: break;
        case 2: 
          { pintar("id: "+yytext()); return new Symbol(SimbolosPY.IDENTIFICADOR , yycolumn, yyline, yytext());
          }
        case 91: break;
        case 19: 
          { pintar("LLAVES ABRE"); return new Symbol(SimbolosPY.LLAVES_A , yycolumn, yyline, yytext());
          }
        case 92: break;
        case 18: 
          { pintar("CORCHE CIERRE"); return new Symbol(SimbolosPY.CORCHETE_C , yycolumn, yyline, yytext());
          }
        case 93: break;
        case 45: 
          { pintar("range("); return new Symbol(SimbolosPY.RANGE , yycolumn, yyline, yytext());
          }
        case 94: break;
        case 48: 
          { pintar("intinput"); return new Symbol(SimbolosPY.INTINPUT , yycolumn, yyline, yytext());
          }
        case 95: break;
        case 42: 
          { pintar(yytext()); return new Symbol(SimbolosPY.ELSE , yycolumn, yyline, yytext());
          }
        case 96: break;
        case 25: 
          { pintar("EXPONENTE"); return new Symbol(SimbolosPY.POT , yycolumn, yyline, yytext());
          }
        case 97: break;
        case 9: 
          { pintar("DIV"); return new Symbol(SimbolosPY.DIV , yycolumn, yyline, yytext());
          }
        case 98: break;
        case 4: 
          { /*Ignore*/
          }
        case 99: break;
        case 7: 
          { pintar("MENOS"); return new Symbol(SimbolosPY.MENOS , yycolumn, yyline, yytext());
          }
        case 100: break;
        case 29: 
          { pintar("MAYOR_IGUAL"); return new Symbol(SimbolosPY.MAYOR_IGUAL , yycolumn, yyline, yytext());
          }
        case 101: break;
        case 46: 
          { pintar(yytext()); return new Symbol(SimbolosPY.RETURN , yycolumn, yyline, yytext());
          }
        case 102: break;
        case 3: 
          { pintar("NUMERO: "+yytext()); return new Symbol(SimbolosPY.NUMERO , yycolumn, yyline, new Integer(yytext()));
          }
        case 103: break;
        case 22: 
          { pintar("PARENTESIS_C"); return new Symbol(SimbolosPY.PARENTESIS_C , yycolumn, yyline, yytext());
          }
        case 104: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(SimbolosPY.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
