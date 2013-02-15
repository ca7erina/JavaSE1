package day02.stringBuilder;

public class TestDrive {

	/**
	 * Study the working flow of StringBuilder.
	 * 1
	 */
	public static void main(String[] args) {
		StringBuilder buf=new StringBuilder();//buf is a char[16]
		buf.append("Professor Tom ").append("always say ").append("his ex-wife is extremely pretty .").insert(0,"The master ").delete(11, 21).replace(22, 25, "mentions");
		String str=buf.toString();
		System.out.println(str);
		System.out.println(buf.capacity());
		System.out.println(buf.length());
		
	}

}
