/* AnalizadorTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. AnalizadorTokenManager.java */
import java.io.*;

/** Token Manager. */
@SuppressWarnings("unused")public class AnalizadorTokenManager implements AnalizadorConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1fffffc000000L) != 0L)
         {
            jjmatchedKind = 50;
            return 1;
         }
         if ((active0 & 0x2000000L) != 0L)
            return 3;
         return -1;
      case 1:
         if ((active0 & 0x1fffafc000000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 50;
               jjmatchedPos = 1;
            }
            return 1;
         }
         if ((active0 & 0x500000000L) != 0L)
            return 1;
         return -1;
      case 2:
         if ((active0 & 0x1e7fefc000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 2;
            return 1;
         }
         if ((active0 & 0x180000000000L) != 0L)
            return 1;
         return -1;
      case 3:
         if ((active0 & 0x1e7f8fc000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 3;
            return 1;
         }
         if ((active0 & 0x600000000L) != 0L)
            return 1;
         return -1;
      case 4:
         if ((active0 & 0x1e5b8dc000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x24020000000L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0xc598dc000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x1202000000000L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0x8010d0000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 6;
            return 1;
         }
         if ((active0 & 0x45880c000000L) != 0L)
            return 1;
         return -1;
      case 7:
         if ((active0 & 0x800090000000L) != 0L)
            return 1;
         if ((active0 & 0x1040000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 7;
            return 1;
         }
         return -1;
      case 8:
         if ((active0 & 0x1040000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 8;
            return 1;
         }
         return -1;
      case 9:
         if ((active0 & 0x40000000L) != 0L)
         {
            if (jjmatchedPos < 8)
            {
               jjmatchedKind = 50;
               jjmatchedPos = 8;
            }
            return -1;
         }
         if ((active0 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 9;
            return 1;
         }
         return -1;
      case 10:
         if ((active0 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 10;
            return 1;
         }
         if ((active0 & 0x40000000L) != 0L)
         {
            if (jjmatchedPos < 8)
            {
               jjmatchedKind = 50;
               jjmatchedPos = 8;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 56;
         return jjMoveStringLiteralDfa1_0(0x400000000000000L);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 34:
         return jjStartNfaWithStates_0(0, 25, 3);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 40:
         return jjStopAtPos(0, 16);
      case 41:
         return jjStopAtPos(0, 17);
      case 42:
         return jjStopAtPos(0, 4);
      case 43:
         jjmatchedKind = 2;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 44:
         return jjStopAtPos(0, 23);
      case 45:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 46:
         return jjStopAtPos(0, 24);
      case 47:
         return jjStopAtPos(0, 5);
      case 58:
         return jjStopAtPos(0, 54);
      case 59:
         return jjStopAtPos(0, 22);
      case 60:
         jjmatchedKind = 10;
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 61:
         jjmatchedKind = 1;
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 62:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 91:
         return jjStopAtPos(0, 20);
      case 93:
         return jjStopAtPos(0, 21);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x1820000000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x408000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x2200000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0xcc000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x10800000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x4500000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 123:
         return jjStopAtPos(0, 18);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 125:
         return jjStopAtPos(0, 19);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         break;
      case 38:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         break;
      case 43:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 45:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 61:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         else if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         else if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         break;
      case 95:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1804020000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x498800000000L);
      case 105:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x120400000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0xc8000000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x200004000000L);
      case 124:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 43, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x422020000000L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x48000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000000L);
      case 110:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 44, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x40800000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x1010000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x800010000000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x1209800000000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 105:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x406020000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x30004000000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      case 111:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 1);
         break;
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x808040000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x50004000000L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000000L);
      case 111:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 1);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 41, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000L);
      case 114:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 38, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x201080000000L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x810000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 48, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x400080000000L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x10004000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x850000000L);
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000L);
      case 110:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 37, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000L);
      case 111:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 45, 1);
         break;
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x808000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 42, 1);
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000L);
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000L);
      case 101:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 40, 1);
         return jjMoveStringLiteralDfa7_0(active0, 0x800000000000L);
      case 108:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 46, 1);
         break;
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000L);
      case 111:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(6, 26, 1);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(6, 27, 1);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 39, 1);
         break;
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000000L);
      case 114:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(6, 35, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(7, 31, 1);
         return jjMoveStringLiteralDfa8_0(active0, 0x40000000L);
      case 111:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(7, 28, 1);
         break;
      case 114:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 47, 1);
         break;
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000000L);
      case 108:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 40:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000000L);
      case 118:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 41:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(10, 30);
         break;
      case 97:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 115:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(11, 36, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 14;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 49)
                        kind = 49;
                     { jjCheckNAddStates(0, 2); }
                  }
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0x3ff000100000000L & l) != 0L)
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 4:
                  if ((0xfff400100000000L & l) != 0L)
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 5:
                  if (curChar == 34 && kind > 52)
                     kind = 52;
                  break;
               case 6:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if (curChar == 39 && kind > 53)
                     kind = 53;
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  { jjCheckNAdd(10); }
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(11, 12); }
                  break;
               case 12:
                  if (curChar == 46)
                     { jjCheckNAdd(13); }
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  { jjCheckNAdd(13); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  { jjCheckNAdd(1); }
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  { jjCheckNAdd(1); }
                  break;
               case 3:
               case 4:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 14 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   10, 11, 12, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\75", "\53", "\55", "\52", "\57", "\53\53", "\55\55", "\75\75", "\74\75", 
"\74", "\76\75", "\76", "\41\75", "\174\174", "\46\46", "\50", "\51", "\173", "\175", 
"\133", "\135", "\73", "\54", "\56", "\42", "\160\165\142\154\151\143\157", 
"\160\162\151\166\141\144\157", "\145\163\164\141\164\151\143\157", "\166\141\143\151\157", 
"\160\162\151\156\143\151\160\141\154\50\51", "\160\162\157\147\162\141\155\141", "\163\151", "\157\137\163\151", 
"\163\151\156\157", "\162\145\160\145\164\151\162", 
"\141\154\164\145\162\156\141\164\151\166\141\163", "\157\160\143\151\157\156", "\163\141\154\151\162", 
"\144\145\146\145\143\164\157", "\162\145\141\154\151\143\145", "\143\151\143\154\157", 
"\151\155\160\162\151\155\141", "\154\145\141", "\146\151\156", "\156\165\155\145\162\157", 
"\144\145\143\151\155\141\154", "\143\141\162\141\143\164\145\162", "\143\141\144\145\156\141", null, null, 
null, null, null, "\72", null, null, null, null, null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public AnalizadorTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public AnalizadorTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 14; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7fffffffffffffL, 
};
static final long[] jjtoSkip = {
   0xf80000000000000L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[14];
    static private final int[] jjstateSet = new int[2 * 14];

    
    static protected char curChar;
}