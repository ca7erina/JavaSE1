package Day03.CollectionsDemo;

public class TestDriveComparation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="ABC";
		String s2="BCD";
		String s3="ABC";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s3));
	}

}
