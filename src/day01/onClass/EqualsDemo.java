 package day01.onClass;

import java.util.Arrays;

/**
 * ����������� 
 * 1 ���ñ���ֵ�Ƕ���ĵ�ֵַ, ���ñ�ͨ���ַ�����˶���
 * 2 == �����ǱȽϱ���ֵ, ==�Ƚ����ñ����ǱȽ����õ�ֵַ
 * 3 == �����߼��ϱȽ϶����Ƿ����. ��: p1 �� p3
 * 4 �������: ��ͬ�����ַ�Ķ�������߼������, Java�ṩ��
 *   equals ���� ��������߼���ȱȽ�.    
 *   ��: p1.equals(p3);
 * 5 equals() Ĭ�Ϸ���, �ǱȽϵ�����ֵ, ���������дʵ��
 *   �߼��ϵĶ���ȽϹ��: p1.equals(p3) Ĭ��: p1==p3
 * 6 Java�ܶ��API, ����equals() �����Ƚ϶����Ƿ����  
 *   Arrays.equals(ary1, ary2)
 *   
 * ����: ���������дequalsʵ�� �߼��ϵıȽ϶������
 *   java ��API ����ʵ����equals()��������д
 *   ��: String  Integer  Double ��
 */
public class EqualsDemo {
  public static void main(String[] args) {
    Point p1 = new Point(8,4);
    Point p2 = p1;
    Point p3 = new Point(8,4);
    System.out.println(p1==p2);//true
    System.out.println(p1==p3);//false
    System.out.println(p1.equals(p3));//true 
    
    Point[] points = {new Point(3,4), new Point(0,0)};
    Point[] others = {new Point(3,4), new Point(0,0)};
    System.out.println(Arrays.equals(points, others));//true
  
    Object x = null;
    System.out.println(p1.equals(x));//false
    x = p1;//�Է���
    System.out.println(p1.equals(x));//true 
    x = p3;//�Գ���
    System.out.println(x.equals(p1));//true;
    System.out.println(p1.equals(x));//true;
    x = "(8,4)";
    System.out.println(p1.equals(x));//false
  
  }
}
class Point /* extends Object */{
  int x; int y;
  public Point(int x, int y) {
    this.x=x; this.y=y;
  }
  public boolean equals(Object obj){
    if(obj==null){
      return false;
    }
    if(this==obj){
      return true;
    }
    if(obj instanceof Point){
      Point other = (Point)obj;
      return this.x==other.x && this.y==other.y;
    }
    return false;
  }
  public int hashCode(){
    return x*10000+y;// 80004  x = 0  y=80004
  }
  public String toString() {
    return "("+x+","+y+")";
  }
}



