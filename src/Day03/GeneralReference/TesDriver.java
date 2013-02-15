package Day03.GeneralReference;

public class TesDriver {

	public static void main(String[] args) {
		Shop<Pet> petShop=new Shop<Pet>(new Pet());
		Shop<String> StringShop=new Shop<String>(new String());
	}

}
class Shop<P>{
	private P product;
	public Shop(P p){
		this.product=p;
	}
	public P buy(){
		return product;
	}
}

class Food{
	
}
class Pet {
	
}