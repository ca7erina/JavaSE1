package day01.onClass;
/**
 * 关于静态字符串的性能优化现象, Java尽量减少"字面量"对象个数
 *  1 字面量和常量的计算,在Java编译期间优化执行,
 *    优化为一个字面量  
 *  2 Java在运行期间采用静态池缓冲 字符串 "字面量"!
 *    尽可能使用同一个字符串对象作为字面量实例
 *  3 动态分配的字符串不参与字面量优化
 *    如: new String() 结果, 或者API的运算结果(新对象)
 */
public class StaticStringDemo {
  public static final int NUM = 123;
  public static final String S = "123abc";
  public static void main(String[] args) {
    String s1 = "123abc";
    String s2 = "123abc";
    String s3 = 123+"abc";//"123abc"
    String s4 = 1+2+3+"abc";//"6abc" 
    String s5 = "1"+"2"+"3"+"abc";//"123abc"
    String s6 = '1'+'2'+'3'+"abc";//"150abc"
    String s7 = NUM + "abc";//"123abc"
    String s8 = S;//"123abc"
    String s9 = "123";
    String s10 = s9+"abc";//运行期间运算
    String s11 = new String("123"+"abc");//new String("123abc"); //运行期间运算
    String s12 = "123"+"abc";
    
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
    System.out.println(s7);
    System.out.println(s8);
    System.out.println(s9);
    System.out.println(s10);
    System.out.println(s11);
    System.out.println(s12);
    
    
    System.out.println(" s1 = \"123abc\",s2 = \"123abc\" "+" s1==s2 "+s1==s2);
    System.out.println(" "+s1==s3);
    System.out.println(s1==s4);
    System.out.println(s1==s5);//...
    System.out.println(s1==s7);
    System.out.println(s1==s8);
    System.out.println(s1==s10);
    System.out.println(s1==s11);
    System.out.println(s10==s11);
    System.out.println(s1==s12);
  }
}













