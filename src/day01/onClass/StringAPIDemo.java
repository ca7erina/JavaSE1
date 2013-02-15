package day01.onClass;
/**
 * String API 演示
 *  1 String 对象是不变的! 就是说: String对象一旦创建, 内部
 *   char[] 数组的内容就可以修改了. 任何方法也不能修改其内容
 *  
 *  2 字符串API 方法 不会改变原字符串内容
 *    a 如果需要改变会返回新对象
 *    b 如果没有改变一般回返回原字符串对象
 */
public class StringAPIDemo {
  public static void main(String[] args) {
    String s1 = "a";
    String s2 = "bc";
    String s3 = s2;
    s2 = s1+s2;
    System.out.println(s2);//"abc" 
    System.out.println(s3);//"bc" 
    
    //String API 为了性能提供了"及其变态"的优化!
    String s4 = "ABCD中";
    String s5 = s4.toUpperCase();//转为大写
    String s6 = s4.toLowerCase();//转为小写
    System.out.println(s4 == s5);//true
    System.out.println(s4 == s6);//false
    
    //trim() 去掉字符串两端的空白(不仅仅是空格!)
    String name = "  \t \b\n Tom \r";
    name = name.trim().toLowerCase();
    System.out.println(name);//"tom" 
    //              012345678901234567890
    String email = "liucangsong@gmail.com";
    int index = email.indexOf("@");
    System.out.println(index); //11
    index = email.indexOf("!");// 返回负数
    System.out.println(index);//-1
    index = email.lastIndexOf("o");//19
    index = email.indexOf('o',  9);//19
    String file = "java.png";
    boolean isImage = file.endsWith(".png");//以...为结尾
    if(isImage){
      System.out.println("看看吗?"); 
    }
    if(file.endsWith(".png")){
      System.out.println("看看吗?"); 
    }
    email = "liucangsong@gmail.com";
    name = email.substring(0, email.indexOf('@'));//liucangsong
    String host = email.substring(email.indexOf('@')+1);
    //String 的内部是char[] 存储的字符
    System.out.println("字符数组和字符串的相互转换"); 
    char[] chs = {'北','京'};
    String str = new String(chs); // "北京"
    char[] chs1= email.toCharArray();
    char ch = chs1[11];//@
  }
}












