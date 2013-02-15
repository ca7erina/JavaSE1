package day02.stringBuilder;

public class CompareWithString {

	public static void main(String[] args) {
		int n=50000;
		long a=testString(n);
		long b=testStringBuilder(n);
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(a/b);
		
		
	}
	public static long testString(int n){
		long start=System.currentTimeMillis();
		String s=" ";
		for(int i=0;i<n;i++){
			s+="A";//String connect 
		}
		long end=System.currentTimeMillis();
		return end-start;
	}
	
	public static long testStringBuilder(int n){
		long start=System.currentTimeMillis();
		StringBuilder buf=new StringBuilder();
		for(int i=0;i<n;i++){
			buf.append("A");//String connect 
		}
		String s=buf.toString();
		long end=System.currentTimeMillis();
		return end-start;
	}
}
