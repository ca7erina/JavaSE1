package day04;
import java.util.*;
public class PartInternalClass {

	/**
	 * @internal class:
	 * 2 内部类- 定义在类的内部 的类， 根据位置分为4类
  	1) in Class & with static 静态内部类 ：使用static修饰，声明在类体中.
  静态内部类中可以访问外部类的静态成员。
 
  2) in Class成员内部类: 声明在类体中，不使用static，具有类的成员特征
   也就是，必须有类的实例才能创建内部类实例。内部类实例
   可以访问共享外部类的成员变量。很常用。
   如：链表的节点就可以定义为内部类
  3) in main 局部内部类：把类声明在方法中，就是局部内部类，作用域
   类似局部变量。很少见。
  4) 匿名内部类，匿名类：非常常见，可以写在任何地方,就像一般的语句。
    语法更象是创建对象：
    	Date d = new Date(){};
    匿名类是对原类的一个继承，同时创建了实例，{} 就是继承
    以后的类体。类体中可使用所有类的语法。
    匿名类不能写构造器。
    匿名类可以从抽象类或者接口继承，必须提供抽象方法的实现。
  5) 任何内部类都编译成独立的class文件
  6) 最大的作用：封装！封装内部概念:
    情侣间的土豆和菜市场的土豆是不一样的
	 */
	public static void main(String[] args) {
		final int a=1;
		int b=8;
		
		class Foo{
			public void test(){
				System.out.println(a);
//				System.out.println(b);
			}
		}
		Foo foo=new Foo();
		foo.test();
		
		class Bylength implements Comparator<String>{
			public int compare(String o1,String o2){
				
				
				return o1.length()-o2.length();
			}
		}
		
		
		String[] names={"jerry","Tom","li","cat"};
		Arrays.sort(names,new Comparator<String>(){    // simplified 
			public int compare(String o1,String o2){
				return 0;
			}
		});
		
		System.out.println(Arrays.toString(names));
		
// anonymous class
		Foo fooAnonymous= new Foo(){};
// That instance is a class extends
//the class Foo	,{} is the body of it.
//There is no name of the class.
		
		
		Foo testAnonymous=new Foo(){
			public String toString(){
				return "!";
			}
		};
		
		System.out.println("This is the second Anoumynous class's body"+testAnonymous);
		
	}
	


}
