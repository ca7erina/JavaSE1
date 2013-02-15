package day01.onClass;

public class StringManipulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		String name = "  \t \b\n Tom \r";
		String email = "liucangsong@gmail.com";
		email.replace('o', 't');
		System.out.println(email.replace('o', 't'));
		String fileName="[国'国'国']china.rmvb";

	    char[] chs1= email.toCharArray();
	
	    String str = new String(chs1); // "北京"
	    char ch = chs1[11];//@
	}
	public static String deleteSpace(String name){
		String newName=(name.trim()).toLowerCase();
		
		return newName;
	}
	
	public String getFilename(String fileName){
		String name =fileName.substring(0,fileName.indexOf('.'));
		boolean isMovie = fileName.endsWith(".rmvb");
//	    index = email.lastIndexOf("o");//19
//	    index = email.indexOf('o',  16);//19
		return name;
		
	}
	
	public boolean ifMovie(String fileName){
		boolean isMovie = fileName.endsWith(".rmvb");
		return isMovie;
	}
	

}
