/* The following code was generated by JFlex 1.4.3 on 22/09/20 11:29 AM */

package analisis.java;
import java_cup.runtime.*;
import java.util.ArrayList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 22/09/20 11:29 AM from the specification file
 * <tt>LexicoJAVA.jflex</tt>
 */
public class AnalizadorLexicoJAVA implements java_cup.runtime.Scanner {

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
     0,  0,  0,  0,  0,  0,  0,  0,  0,  5,  8,  0,  0,  5,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     6, 33, 57,  0,  0,  9, 31, 56, 48, 63, 36, 34, 62, 35, 45, 37, 
     4,  4,  4,  4,  4,  4,  4,  4,  4,  4, 54, 53, 38, 40, 39,  0, 
     0, 13, 11,  1,  1,  1,  1, 18,  1,  1, 12,  1,  1, 19,  1, 17, 
    14,  1, 16, 41,  1,  1, 10,  1,  1, 15,  1, 58,  0, 59,  0,  7, 
     0, 22, 51, 20, 50, 43, 27,  1, 29, 24,  1, 52, 21, 44, 25, 28, 
    47,  1, 30, 23, 26, 46, 55, 49,  1, 42,  1, 60, 32, 61,  0,  0, 
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
    "\1\0\1\1\1\2\1\1\1\3\2\4\1\1\6\2"+
    "\2\1\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\1\2\2\1\14\3\2\1\15\1\16\1\2\2\1"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\4\0\6\2"+
    "\1\25\3\2\1\26\1\27\1\30\1\31\1\32\2\0"+
    "\1\33\1\34\1\35\3\2\1\36\3\2\1\0\1\37"+
    "\1\0\1\37\1\40\1\4\2\0\5\2\1\41\1\2"+
    "\1\42\1\2\1\0\1\43\6\2\3\0\2\2\1\44"+
    "\1\45\4\2\1\46\1\2\1\47\3\2\1\50\2\0"+
    "\1\2\1\51\3\2\1\52\2\2\1\53\2\2\2\0"+
    "\1\54\1\2\1\55\2\2\1\56\2\2\1\57\2\0"+
    "\3\2\1\0\1\2\2\0\1\2\1\60\1\2\1\0"+
    "\1\61\2\0\1\62\1\2\3\0\1\63\4\0\1\64"+
    "\6\0\1\65\1\0\3\65\1\0\1\65\1\0\1\65"+
    "\1\0\1\65\1\66\5\65";

  private static int [] zzUnpackAction() {
    int [] result = new int[189];
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
    "\0\0\0\100\0\200\0\300\0\u0100\0\u0140\0\u0180\0\u01c0"+
    "\0\u0200\0\u0240\0\u0280\0\u02c0\0\u0300\0\u0340\0\u0380\0\u03c0"+
    "\0\u0400\0\u0440\0\u0480\0\100\0\u04c0\0\u0500\0\u0540\0\u0580"+
    "\0\u05c0\0\u0600\0\100\0\u0640\0\u0680\0\u06c0\0\100\0\100"+
    "\0\u0700\0\u0740\0\u0780\0\100\0\100\0\100\0\100\0\100"+
    "\0\100\0\300\0\u07c0\0\u0800\0\u0840\0\u0880\0\u08c0\0\u0900"+
    "\0\u0940\0\u0980\0\u09c0\0\200\0\u0a00\0\u0a40\0\u0a80\0\100"+
    "\0\100\0\100\0\100\0\100\0\u0ac0\0\u0b00\0\100\0\100"+
    "\0\100\0\u0b40\0\u0b80\0\u0bc0\0\200\0\u0c00\0\u0c40\0\u0c80"+
    "\0\u0740\0\u0740\0\u0780\0\u0780\0\u07c0\0\u0cc0\0\u0d00\0\u0d40"+
    "\0\u0d80\0\u0dc0\0\u0e00\0\u0e40\0\u0e80\0\u0ec0\0\u0f00\0\200"+
    "\0\u0f40\0\u0f80\0\100\0\u0fc0\0\u1000\0\u1040\0\u1080\0\u10c0"+
    "\0\u1100\0\u1140\0\u1180\0\u11c0\0\u1200\0\u1240\0\200\0\u1280"+
    "\0\u12c0\0\u1300\0\u1340\0\u1380\0\u0ac0\0\u13c0\0\200\0\u1400"+
    "\0\u1440\0\u1480\0\200\0\u14c0\0\u1500\0\u1540\0\200\0\u1580"+
    "\0\u15c0\0\u1600\0\u1640\0\u1680\0\u16c0\0\200\0\u1700\0\u1740"+
    "\0\u1780\0\u17c0\0\200\0\u1800\0\200\0\u1840\0\u1880\0\200"+
    "\0\u18c0\0\u1900\0\100\0\u1940\0\u1980\0\u19c0\0\u1a00\0\u1a40"+
    "\0\u1a80\0\u1ac0\0\u1b00\0\u1b40\0\u1b80\0\200\0\u1bc0\0\u1c00"+
    "\0\100\0\u1c40\0\u1c80\0\200\0\u1cc0\0\u1d00\0\u1d40\0\u1d80"+
    "\0\200\0\u1dc0\0\u1e00\0\u1e40\0\u1e80\0\100\0\u1ec0\0\u1f00"+
    "\0\u1f40\0\u1f80\0\u1fc0\0\u2000\0\u2040\0\u2080\0\u20c0\0\u2100"+
    "\0\u2140\0\u2180\0\u21c0\0\u2200\0\u2240\0\u2280\0\u22c0\0\100"+
    "\0\u2300\0\u2340\0\u2380\0\u23c0\0\u2400";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[189];
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
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\2"+
    "\1\6\1\10\4\3\1\11\5\3\1\12\2\3\1\13"+
    "\1\14\2\3\1\15\2\3\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\3\1\32\1\3\1\2\2\3\1\33\1\34\1\35"+
    "\1\36\1\3\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\101\0\1\3\1\52"+
    "\1\0\1\3\2\0\1\3\2\0\25\3\12\0\4\3"+
    "\1\0\2\3\1\0\4\3\2\0\1\3\13\0\1\3"+
    "\100\0\1\5\50\0\1\53\27\0\2\6\1\0\1\6"+
    "\74\0\2\6\1\54\1\6\100\0\1\55\67\0\1\3"+
    "\1\52\1\0\1\3\2\0\1\3\2\0\25\3\12\0"+
    "\4\3\1\0\1\56\1\3\1\0\4\3\2\0\1\3"+
    "\11\0\1\3\1\52\1\0\1\3\2\0\1\3\2\0"+
    "\13\3\1\57\1\60\6\3\1\61\1\3\12\0\4\3"+
    "\1\0\2\3\1\0\4\3\2\0\1\3\11\0\1\3"+
    "\1\52\1\0\1\3\2\0\1\3\2\0\25\3\12\0"+
    "\4\3\1\0\2\3\1\0\1\62\3\3\2\0\1\3"+
    "\11\0\1\3\1\52\1\0\1\3\2\0\1\3\2\0"+
    "\17\3\1\63\1\3\1\64\3\3\12\0\4\3\1\0"+
    "\2\3\1\0\4\3\2\0\1\3\11\0\1\3\1\52"+
    "\1\0\1\3\2\0\1\3\2\0\13\3\1\65\6\3"+
    "\1\66\2\3\12\0\4\3\1\0\2\3\1\0\4\3"+
    "\2\0\1\3\11\0\1\3\1\52\1\0\1\3\2\0"+
    "\1\3\2\0\25\3\12\0\2\3\1\67\1\3\1\0"+
    "\2\3\1\0\4\3\2\0\1\3\47\0\1\70\100\0"+
    "\1\71\107\0\1\72\71\0\1\73\41\0\1\5\36\0"+
    "\1\74\100\0\1\75\1\76\102\0\1\77\77\0\1\100"+
    "\77\0\1\101\30\0\1\3\1\52\1\0\1\3\2\0"+
    "\1\3\2\0\25\3\12\0\1\3\1\102\2\3\1\0"+
    "\2\3\1\0\4\3\2\0\1\3\11\0\1\3\1\52"+
    "\1\0\1\3\2\0\1\3\2\0\13\3\1\103\11\3"+
    "\12\0\4\3\1\0\2\3\1\0\4\3\2\0\1\3"+
    "\11\0\1\3\1\52\1\0\1\3\2\0\1\3\2\0"+
    "\23\3\1\104\1\3\12\0\4\3\1\0\2\3\1\0"+
    "\4\3\2\0\1\3\11\0\1\3\1\52\1\0\1\3"+
    "\2\0\1\3\2\0\22\3\1\105\2\3\12\0\2\3"+
    "\1\106\1\3\1\0\2\3\1\0\4\3\2\0\1\3"+
    "\11\0\1\3\1\52\1\0\1\3\2\0\1\3\2\0"+
    "\24\3\1\107\12\0\4\3\1\0\2\3\1\0\4\3"+
    "\2\0\1\3\11\0\1\3\1\52\1\0\1\3\2\0"+
    "\1\3\2\0\22\3\1\110\2\3\12\0\4\3\1\0"+
    "\2\3\1\0\4\3\2\0\1\3\10\0\10\111\1\0"+
    "\57\111\1\112\7\111\10\113\1\0\60\113\1\114\6\113"+
    "\4\0\1\115\103\0\1\116\101\0\1\117\3\0\1\120"+
    "\62\0\1\3\1\52\1\0\1\3\2\0\1\3\2\0"+
    "\25\3\12\0\4\3\1\0\2\3\1\0\2\3\1\121"+
    "\1\3\2\0\1\3\11\0\1\3\1\52\1\0\1\3"+
    "\2\0\1\3\2\0\14\3\1\122\10\3\12\0\4\3"+
    "\1\0\2\3\1\0\4\3\2\0\1\3\11\0\1\3"+
    "\1\52\1\0\1\3\2\0\1\3\2\0\15\3\1\123"+
    "\7\3\12\0\4\3\1\0\2\3\1\0\4\3\2\0"+
    "\1\3\11\0\1\3\1\52\1\0\1\3\2\0\1\3"+
    "\2\0\14\3\1\124\10\3\12\0\4\3\1\0\2\3"+
    "\1\0\4\3\2\0\1\3\11\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\16\3\1\125\6\3\12\0"+
    "\4\3\1\0\2\3\1\0\4\3\2\0\1\3\11\0"+
    "\1\3\1\52\1\0\1\3\2\0\1\3\2\0\20\3"+
    "\1\126\4\3\12\0\4\3\1\0\2\3\1\0\4\3"+
    "\2\0\1\3\11\0\1\3\1\52\1\0\1\3\2\0"+
    "\1\3\2\0\22\3\1\127\2\3\12\0\4\3\1\0"+
    "\2\3\1\0\4\3\2\0\1\3\11\0\1\3\1\52"+
    "\1\0\1\3\2\0\1\3\2\0\24\3\1\130\12\0"+
    "\4\3\1\0\2\3\1\0\4\3\2\0\1\3\11\0"+
    "\1\3\1\52\1\0\1\3\2\0\1\3\2\0\20\3"+
    "\1\131\4\3\12\0\4\3\1\0\2\3\1\0\4\3"+
    "\2\0\1\3\10\0\44\75\1\132\33\75\10\76\1\133"+
    "\67\76\1\0\1\3\1\52\1\0\1\3\2\0\1\3"+
    "\2\0\15\3\1\134\7\3\12\0\4\3\1\0\2\3"+
    "\1\0\4\3\2\0\1\3\11\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\15\3\1\135\7\3\12\0"+
    "\4\3\1\0\2\3\1\0\4\3\2\0\1\3\11\0"+
    "\1\3\1\52\1\0\1\3\2\0\1\3\2\0\16\3"+
    "\1\136\6\3\12\0\4\3\1\0\2\3\1\0\4\3"+
    "\2\0\1\3\11\0\1\3\1\52\1\0\1\3\2\0"+
    "\1\3\2\0\21\3\1\137\3\3\12\0\4\3\1\0"+
    "\2\3\1\0\4\3\2\0\1\3\11\0\1\3\1\52"+
    "\1\0\1\3\2\0\1\3\2\0\25\3\12\0\2\3"+
    "\1\140\1\3\1\0\2\3\1\0\4\3\2\0\1\3"+
    "\11\0\1\3\1\52\1\0\1\3\2\0\1\3\2\0"+
    "\16\3\1\141\6\3\12\0\4\3\1\0\2\3\1\0"+
    "\4\3\2\0\1\3\16\0\1\142\104\0\1\143\103\0"+
    "\1\144\61\0\1\3\1\52\1\0\1\3\2\0\1\3"+
    "\2\0\13\3\1\145\11\3\12\0\4\3\1\0\2\3"+
    "\1\0\4\3\2\0\1\3\11\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\15\3\1\146\7\3\12\0"+
    "\4\3\1\0\2\3\1\0\4\3\2\0\1\3\11\0"+
    "\1\3\1\52\1\0\1\3\2\0\1\3\2\0\25\3"+
    "\12\0\2\3\1\147\1\3\1\0\2\3\1\0\4\3"+
    "\2\0\1\3\11\0\1\3\1\52\1\0\1\3\2\0"+
    "\1\3\2\0\24\3\1\150\12\0\4\3\1\0\2\3"+
    "\1\0\4\3\2\0\1\3\11\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\20\3\1\151\4\3\12\0"+
    "\4\3\1\0\2\3\1\0\4\3\2\0\1\3\11\0"+
    "\1\3\1\52\1\0\1\3\2\0\1\3\2\0\16\3"+
    "\1\152\6\3\12\0\4\3\1\0\2\3\1\0\4\3"+
    "\2\0\1\3\11\0\1\3\1\52\1\0\1\3\2\0"+
    "\1\3\2\0\14\3\1\153\10\3\12\0\4\3\1\0"+
    "\2\3\1\0\4\3\2\0\1\3\11\0\1\3\1\52"+
    "\1\0\1\3\2\0\1\3\2\0\25\3\12\0\4\3"+
    "\1\0\1\154\1\3\1\0\4\3\2\0\1\3\10\0"+
    "\44\75\1\132\1\155\32\75\1\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\20\3\1\156\4\3\12\0"+
    "\4\3\1\0\2\3\1\0\4\3\2\0\1\3\11\0"+
    "\1\3\1\52\1\0\1\3\2\0\1\3\2\0\25\3"+
    "\12\0\2\3\1\157\1\3\1\0\2\3\1\0\4\3"+
    "\2\0\1\3\11\0\1\3\1\52\1\0\1\3\2\0"+
    "\1\3\2\0\13\3\1\160\11\3\12\0\4\3\1\0"+
    "\2\3\1\0\4\3\2\0\1\3\11\0\1\3\1\52"+
    "\1\0\1\3\2\0\1\3\2\0\14\3\1\161\10\3"+
    "\12\0\4\3\1\0\2\3\1\0\4\3\2\0\1\3"+
    "\11\0\1\3\1\52\1\0\1\3\2\0\1\3\2\0"+
    "\14\3\1\162\10\3\12\0\4\3\1\0\2\3\1\0"+
    "\4\3\2\0\1\3\11\0\1\3\1\52\1\0\1\3"+
    "\2\0\1\3\2\0\25\3\12\0\4\3\1\0\2\3"+
    "\1\0\1\3\1\163\2\3\2\0\1\3\17\0\1\54"+
    "\100\0\1\164\77\0\1\165\70\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\16\3\1\166\6\3\12\0"+
    "\4\3\1\0\2\3\1\0\4\3\2\0\1\3\11\0"+
    "\1\3\1\52\1\0\1\3\2\0\1\3\2\0\15\3"+
    "\1\167\7\3\12\0\4\3\1\0\2\3\1\0\4\3"+
    "\2\0\1\3\11\0\1\3\1\52\1\0\1\3\2\0"+
    "\1\3\2\0\16\3\1\170\6\3\12\0\4\3\1\0"+
    "\2\3\1\0\4\3\2\0\1\3\11\0\1\3\1\52"+
    "\1\0\1\3\2\0\1\3\2\0\12\3\1\171\12\3"+
    "\12\0\4\3\1\0\2\3\1\0\4\3\2\0\1\3"+
    "\11\0\1\3\1\52\1\0\1\3\2\0\1\3\2\0"+
    "\17\3\1\172\5\3\12\0\4\3\1\0\2\3\1\0"+
    "\4\3\2\0\1\3\11\0\1\3\1\52\1\0\1\3"+
    "\2\0\1\3\2\0\20\3\1\173\4\3\12\0\4\3"+
    "\1\0\2\3\1\0\4\3\2\0\1\3\11\0\1\3"+
    "\1\52\1\0\1\3\2\0\1\3\2\0\24\3\1\174"+
    "\12\0\4\3\1\0\2\3\1\0\4\3\2\0\1\3"+
    "\11\0\1\3\1\52\1\0\1\3\2\0\1\3\2\0"+
    "\25\3\12\0\2\3\1\175\1\3\1\0\2\3\1\0"+
    "\4\3\2\0\1\3\11\0\1\3\1\52\1\0\1\3"+
    "\2\0\1\3\2\0\25\3\12\0\2\3\1\176\1\3"+
    "\1\0\2\3\1\0\4\3\2\0\1\3\11\0\1\3"+
    "\1\52\1\0\1\3\2\0\1\3\2\0\25\3\12\0"+
    "\4\3\1\0\1\177\1\3\1\0\4\3\2\0\1\3"+
    "\11\0\1\3\1\52\1\0\1\3\2\0\1\3\2\0"+
    "\25\3\12\0\4\3\1\0\2\3\1\0\3\3\1\200"+
    "\2\0\1\3\10\0\10\164\1\0\1\201\66\164\10\165"+
    "\1\0\1\202\66\165\1\0\1\3\1\52\1\0\1\3"+
    "\2\0\1\3\2\0\12\3\1\203\12\3\12\0\4\3"+
    "\1\0\2\3\1\0\4\3\2\0\1\3\11\0\1\3"+
    "\1\52\1\0\1\3\2\0\1\3\2\0\17\3\1\204"+
    "\5\3\12\0\4\3\1\0\2\3\1\0\4\3\2\0"+
    "\1\3\11\0\1\3\1\52\1\0\1\3\2\0\1\3"+
    "\2\0\23\3\1\205\1\3\12\0\4\3\1\0\2\3"+
    "\1\0\4\3\2\0\1\3\11\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\25\3\12\0\4\3\1\0"+
    "\1\3\1\206\1\0\4\3\2\0\1\3\11\0\1\3"+
    "\1\52\1\0\1\3\2\0\1\3\2\0\16\3\1\207"+
    "\6\3\12\0\4\3\1\0\2\3\1\0\4\3\2\0"+
    "\1\3\11\0\1\3\1\52\1\0\1\3\2\0\1\3"+
    "\2\0\17\3\1\210\5\3\12\0\4\3\1\0\2\3"+
    "\1\0\4\3\2\0\1\3\11\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\25\3\12\0\3\3\1\211"+
    "\1\0\2\3\1\0\4\3\2\0\1\3\11\0\1\3"+
    "\1\52\1\0\1\3\2\0\1\3\2\0\13\3\1\212"+
    "\11\3\12\0\4\3\1\0\2\3\1\0\4\3\2\0"+
    "\1\3\11\0\1\3\1\52\1\0\1\3\2\0\1\3"+
    "\2\0\25\3\12\0\4\3\1\0\2\3\1\0\4\3"+
    "\1\213\1\0\1\3\10\0\10\164\1\0\1\214\66\164"+
    "\10\165\1\0\1\215\66\165\1\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\25\3\12\0\4\3\1\0"+
    "\1\3\1\216\1\0\4\3\2\0\1\3\11\0\1\3"+
    "\1\52\1\0\1\3\2\0\1\3\2\0\25\3\12\0"+
    "\4\3\1\0\1\217\1\3\1\0\4\3\2\0\1\3"+
    "\11\0\1\3\1\52\1\0\1\3\2\0\1\3\2\0"+
    "\17\3\1\220\5\3\12\0\4\3\1\0\2\3\1\0"+
    "\4\3\2\0\1\3\11\0\1\3\1\52\1\0\1\3"+
    "\2\0\1\3\2\0\25\3\12\0\4\3\1\221\2\3"+
    "\1\0\4\3\2\0\1\3\11\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\20\3\1\222\4\3\12\0"+
    "\4\3\1\0\2\3\1\0\4\3\2\0\1\3\10\0"+
    "\10\164\1\0\1\214\2\164\1\223\63\164\10\165\1\0"+
    "\1\215\4\165\1\224\61\165\1\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\25\3\12\0\4\3\1\0"+
    "\1\225\1\3\1\0\4\3\2\0\1\3\11\0\1\3"+
    "\1\52\1\0\1\3\2\0\1\3\2\0\20\3\1\226"+
    "\4\3\12\0\4\3\1\0\2\3\1\0\4\3\2\0"+
    "\1\3\11\0\1\3\1\52\1\0\1\3\2\0\1\3"+
    "\2\0\25\3\12\0\4\3\1\0\1\3\1\227\1\0"+
    "\4\3\2\0\1\3\44\0\1\230\44\0\1\3\1\52"+
    "\1\0\1\3\2\0\1\3\2\0\25\3\12\0\4\3"+
    "\1\0\2\3\1\0\4\3\1\0\1\231\1\3\10\0"+
    "\10\164\1\0\1\201\3\164\1\232\62\164\10\165\1\0"+
    "\1\202\6\165\1\233\57\165\1\0\1\3\1\52\1\0"+
    "\1\3\2\0\1\3\2\0\20\3\1\234\4\3\12\0"+
    "\4\3\1\0\2\3\1\0\4\3\2\0\1\3\11\0"+
    "\1\3\1\52\1\0\1\3\2\0\1\3\2\0\25\3"+
    "\12\0\4\3\1\0\1\235\1\3\1\0\4\3\2\0"+
    "\1\3\66\0\1\236\21\0\10\164\1\0\1\201\1\237"+
    "\65\164\10\165\1\0\1\202\7\165\1\240\56\165\1\0"+
    "\1\3\1\52\1\0\1\3\2\0\1\3\2\0\20\3"+
    "\1\241\4\3\12\0\4\3\1\0\2\3\1\0\4\3"+
    "\2\0\1\3\42\0\1\242\45\0\10\164\1\0\1\201"+
    "\3\164\1\243\62\164\10\165\1\0\1\202\10\165\1\244"+
    "\55\165\55\0\1\245\22\0\10\164\1\246\1\201\66\164"+
    "\10\165\1\0\1\202\6\165\1\247\57\165\57\0\1\250"+
    "\20\0\10\165\1\0\1\202\3\165\1\251\62\165\36\0"+
    "\1\252\41\0\10\165\1\0\1\202\11\165\1\253\54\165"+
    "\30\0\1\254\47\0\10\165\1\0\1\202\3\165\1\255"+
    "\62\165\31\0\1\256\46\0\10\257\1\260\1\261\66\257"+
    "\32\0\1\262\45\0\10\257\1\0\1\261\66\257\10\260"+
    "\1\0\67\260\10\257\1\0\1\263\66\257\25\0\1\264"+
    "\52\0\10\257\1\0\1\263\4\257\1\265\61\257\31\0"+
    "\1\266\46\0\10\257\1\0\1\261\6\257\1\267\57\257"+
    "\60\0\1\270\17\0\10\257\1\0\1\261\7\257\1\271"+
    "\66\257\1\0\1\261\10\257\1\272\65\257\1\0\1\261"+
    "\6\257\1\273\67\257\1\0\1\261\3\257\1\274\72\257"+
    "\1\0\1\261\11\257\1\275\64\257\1\0\1\261\3\257"+
    "\1\255\62\257";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9280];
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
    "\1\0\1\11\21\1\1\11\6\1\1\11\3\1\2\11"+
    "\3\1\6\11\4\0\12\1\5\11\2\0\3\11\7\1"+
    "\1\0\1\1\1\0\3\1\2\0\11\1\1\0\1\11"+
    "\6\1\3\0\17\1\2\0\13\1\2\0\10\1\1\11"+
    "\2\0\3\1\1\0\1\1\2\0\3\1\1\0\1\11"+
    "\2\0\2\1\3\0\1\1\4\0\1\11\6\0\1\1"+
    "\1\0\3\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[189];
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
    //public ArrayList<ErrorG> listaErrores = new  ArrayList<>();



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexicoJAVA(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public AnalizadorLexicoJAVA(java.io.InputStream in) {
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
        case 1: 
          { System.out.println("error Lexico: "+"Columna: "+yycolumn+1+" linea: "+ yyline+1 + "Token: "+yytext());
                                    /*ErrorG e = new ErrorG(yyline+1, yycolumn+1,yytext(),"Lexico","Error Lexico token: " + yytext()+"   Linea: " + (yyline+1) + " ,    Columna: " + (yycolumn+1));
                                    listaErrores.add(e);*/
          }
        case 55: break;
        case 20: 
          { System.out.println("PARENTESIS_C"); return new Symbol(SimbolosJAVA.PARENTESIS_C , yycolumn, yyline, yytext());
          }
        case 56: break;
        case 5: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.NOT , yycolumn, yyline, yytext());
          }
        case 57: break;
        case 17: 
          { System.out.println("LLAVES ABRE"); return new Symbol(SimbolosJAVA.LLAVES_A , yycolumn, yyline, yytext());
          }
        case 58: break;
        case 19: 
          { System.out.println("COMA"); return new Symbol(SimbolosJAVA.COMA , yycolumn, yyline, yytext());
          }
        case 59: break;
        case 18: 
          { System.out.println("LLAVES CIEERRE"); return new Symbol(SimbolosJAVA.LLAVES_C , yycolumn, yyline, yytext());
          }
        case 60: break;
        case 44: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.PUBLIC , yycolumn, yyline, yytext());
          }
        case 61: break;
        case 47: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.BREAK , yycolumn, yyline, yytext());
          }
        case 62: break;
        case 13: 
          { System.out.println("PUNTO_COMA"); return new Symbol(SimbolosJAVA.PUNTO_COMA , yycolumn, yyline, yytext());
          }
        case 63: break;
        case 21: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.IF , yycolumn, yyline, yytext());
          }
        case 64: break;
        case 31: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.VALOR , yycolumn, yyline, yytext());
          }
        case 65: break;
        case 36: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.CASE , yycolumn, yyline, yytext());
          }
        case 66: break;
        case 51: 
          { System.out.println("floarinput"); return new Symbol(SimbolosJAVA.FLOATINPUT , yycolumn, yyline, yytext());
          }
        case 67: break;
        case 33: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.INTEGER , yycolumn, yyline, yytext());
          }
        case 68: break;
        case 52: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.SEPARADOR_JAVA , yycolumn, yyline, yytext());
          }
        case 69: break;
        case 46: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.RETURN , yycolumn, yyline, yytext());
          }
        case 70: break;
        case 42: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.FLOAT , yycolumn, yyline, yytext());
          }
        case 71: break;
        case 11: 
          { System.out.println("MAYOR_QUE"); return new Symbol(SimbolosJAVA.MAYOR_QUE , yycolumn, yyline, yytext());
          }
        case 72: break;
        case 7: 
          { System.out.println("MENOS"); return new Symbol(SimbolosJAVA.MENOS , yycolumn, yyline, yytext());
          }
        case 73: break;
        case 26: 
          { System.out.println("MENOS_MENOS"); return new Symbol(SimbolosJAVA.MENOS_MENOS , yycolumn, yyline, yytext());
          }
        case 74: break;
        case 9: 
          { System.out.println("DIV"); return new Symbol(SimbolosJAVA.DIV , yycolumn, yyline, yytext());
          }
        case 75: break;
        case 6: 
          { System.out.println("MAS"); return new Symbol(SimbolosJAVA.MAS , yycolumn, yyline, yytext());
          }
        case 76: break;
        case 3: 
          { System.out.println("NUMERO: "+yytext()); return new Symbol(SimbolosJAVA.NUMERO , yycolumn, yyline, yytext());
          }
        case 77: break;
        case 15: 
          { System.out.println("CHORCHETE ABRE"); return new Symbol(SimbolosJAVA.CORCHETE_A , yycolumn, yyline, yytext());
          }
        case 78: break;
        case 49: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.DEFAULT , yycolumn, yyline, yytext());
          }
        case 79: break;
        case 2: 
          { System.out.println("id: "+yytext()); return new Symbol(SimbolosJAVA.IDENTIFICADOR , yycolumn, yyline, yytext());
          }
        case 80: break;
        case 10: 
          { System.out.println("MENOR_QUE"); return new Symbol(SimbolosJAVA.MENOR_QUE , yycolumn, yyline, yytext());
          }
        case 81: break;
        case 8: 
          { System.out.println("ASTERISCO"); return new Symbol(SimbolosJAVA.POR , yycolumn, yyline, yytext());
          }
        case 82: break;
        case 43: 
          { System.out.println("while"); return new Symbol(SimbolosJAVA.WHILE , yycolumn, yyline, yytext());
          }
        case 83: break;
        case 23: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.OR , yycolumn, yyline, yytext());
          }
        case 84: break;
        case 29: 
          { System.out.println("IGUAL"); return new Symbol(SimbolosJAVA.IGUAL , yycolumn, yyline, yytext());
          }
        case 85: break;
        case 14: 
          { System.out.println("dos puntos"); return new Symbol(SimbolosJAVA.DOS_PUNTOS , yycolumn, yyline, yytext());
          }
        case 86: break;
        case 22: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.AND , yycolumn, yyline, yytext());
          }
        case 87: break;
        case 32: 
          { System.out.println("DECIMAL: "+yytext()); return new Symbol(SimbolosJAVA.DECIMAL , yycolumn, yyline, yytext());
          }
        case 88: break;
        case 50: 
          { System.out.println("charinput"); return new Symbol(SimbolosJAVA.CHARINPUT , yycolumn, yyline, yytext());
          }
        case 89: break;
        case 54: 
          { /*System.out.println("Mensaje msgbox: "+yytext()); return new Symbol(SimbolosJAVA.SOUT , yycolumn, yyline, yytext());*/
          }
        case 90: break;
        case 38: 
          { System.out.println("Comentario: "+yytext()); return new Symbol(SimbolosJAVA.COMENTARIO_VARIOS , yycolumn, yyline, yytext());
          }
        case 91: break;
        case 48: 
          { System.out.println("intinput"); return new Symbol(SimbolosJAVA.INTINPUT , yycolumn, yyline, yytext());
          }
        case 92: break;
        case 34: 
          { System.out.println("for"); return new Symbol(SimbolosJAVA.FOR , yycolumn, yyline, yytext());
          }
        case 93: break;
        case 25: 
          { System.out.println("MAS_MAS"); return new Symbol(SimbolosJAVA.MAS_MAS , yycolumn, yyline, yytext());
          }
        case 94: break;
        case 27: 
          { System.out.println("MENOR_IGUAL"); return new Symbol(SimbolosJAVA.MENOR_IGUAL , yycolumn, yyline, yytext());
          }
        case 95: break;
        case 53: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.SEPARADOR_PROGRAMA , yycolumn, yyline, yytext());
          }
        case 96: break;
        case 16: 
          { System.out.println("CORCHE CIERRE"); return new Symbol(SimbolosJAVA.CORCHETE_C , yycolumn, yyline, yytext());
          }
        case 97: break;
        case 35: 
          { System.out.println("Comentario: "+yytext()); return new Symbol(SimbolosJAVA.COMENTARIO_SIMPLE , yycolumn, yyline, yytext());
          }
        case 98: break;
        case 30: 
          { System.out.println("do"); return new Symbol(SimbolosJAVA.DO , yycolumn, yyline, yytext());
          }
        case 99: break;
        case 4: 
          { /*Ignore*/
          }
        case 100: break;
        case 28: 
          { System.out.println("MAYOR_IGUAL"); return new Symbol(SimbolosJAVA.MAYOR_IGUAL , yycolumn, yyline, yytext());
          }
        case 101: break;
        case 12: 
          { System.out.println("PARENTESIS_A"); return new Symbol(SimbolosJAVA.PARENTESIS_A , yycolumn, yyline, yytext());
          }
        case 102: break;
        case 41: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.CLASS , yycolumn, yyline, yytext());
          }
        case 103: break;
        case 40: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.VOID, yycolumn, yyline, yytext());
          }
        case 104: break;
        case 39: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.ELSE , yycolumn, yyline, yytext());
          }
        case 105: break;
        case 37: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.CHART , yycolumn, yyline, yytext());
          }
        case 106: break;
        case 24: 
          { System.out.println("DIFERENTE"); return new Symbol(SimbolosJAVA.DIFERENTE , yycolumn, yyline, yytext());
          }
        case 107: break;
        case 45: 
          { System.out.println(yytext()); return new Symbol(SimbolosJAVA.SWITCH , yycolumn, yyline, yytext());
          }
        case 108: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(SimbolosJAVA.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
