package day01;
import java.util.*;
public class EquialsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Point p1= new Point(8,9);
		Point p2=p1;
		Point p3= new Point(1,2);
		Point p4= new Point(8,9);
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.println(p1.equals(p4));
		Point[] p5={new Point(3,4),new Point(5,6)};
		Point[] p6={new Point(3,4),new Point(5,6)};
		System.out.println(Arrays.equals(p5,p6));
		

	}

}

class Point{
	int x;
	int y;
	Point(){};
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	 public int hashCode(){
		 return x*10000+y;
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
			return this.x==other.x&&this.y==other.y;
		}
		return false;
	}

	public String toString(){
		return"("+x+","+y+")";
	}
//	public boolean equals(Point other){
//		return this.y== other.y&&this.x== other.x;
//	}
}

