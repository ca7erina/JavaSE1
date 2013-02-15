package day01.onClass;

import java.util.Arrays;

/**
 * 字符串的工作原理 
 *  字符串 = 一串字符(char[])
 * Java 可以将char[] 作为字符串处理
 * 
 * String 不是char[], String内部使用char[]数组存储char数据
 * 
 * String 本质上是一个 char[] 和 
 *    对char[]的操作(concat, toUpperCase()...)组成
 *    
 *  这些操作方法可以简化对char[] 数组的操作
 */
public class StringDemo {
  public static void main(String[] args) {
    char[] chs1={'北','京'};
    char[] chs2={'达','内','科','技'};
    System.out.println(chs1);// "北京"
    System.out.println(chs2);// "达内科技"
    char[] chs3 = Arrays.copyOf(chs1, 
        chs1.length+chs2.length);//{'北','京',0,0,0,0};
    System.arraycopy(chs2, 0, chs3, 
        chs1.length, chs2.length);// 北京达内科技
    System.out.println(chs3);//北京达内科技
    
    String s1 = "北京";
    String s2 = "达内科技";
    String s4 = s1+s2;
    String s3 = s1.concat(s2);
    System.out.println(s3);//北京达内科技
 
    char[] chs4 = {'a','b','c','d', '\u4e2d'};
    char[] chs5 = Arrays.copyOf(chs4, chs4.length);// ABCD
    for(int i=0; i<chs5.length; i++){
      // X - x = 'A' - 'a'  ->  X = 'A'-'a' + x
      if(chs5[i]>='a' && chs5[i]<='z'){
        chs5[i] = (char)('A'-'a'+chs5[i]);
      }
    }
    System.out.println(chs4);
    System.out.println(chs5);
    
    String s6 = "abcd\u4e2d";
    String s7 = s6.toUpperCase();//转换字符串为大写字母
    System.out.println(s6);
    System.out.println(s7); 
    
  }
}












