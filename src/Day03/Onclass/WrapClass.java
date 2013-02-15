package Day03.Onclass;

public class WrapClass {

	/**
	 * @Wrap Demo
	 * 1 wraping and unwraping;
	 * 2 Autowraping and AutoUnwraping;
	 * 3 After creat a Wraping type ,the object can't be changed anymore ,
	 *   just like --->String
	 * 4 the wraping type offers IO method for basic types.
	 * 
	 */
	public static void main(String[] args) {
		//wraping
		Integer i= new Integer(5);
		Double d=new Double(5.5);
		
		//unwraping:
		int n=i.intValue();
		Double x=d.doubleValue();
		
		//Auto wraping;
		Integer a= 5;//new Integer(5);
		Object o=5.5;
		
		
		//Auto Unwraping:
		int y=a+1;
		
		//double dx=(double)o;
		double dx=(Double)o;
		
		//nextInt() invokes Interger.parseInt();
		int k = Integer.parseInt("65");
		k=0xffffffff;
		String str=Integer.toString(k,10);
		
		System.out.println(str);//"-1"
		System.out.println(k);//-1
		
	}

}
