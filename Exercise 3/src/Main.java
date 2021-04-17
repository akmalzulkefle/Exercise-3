
public class Main {

	public static void main(String[] args) {

		Shoes s = new Shoes();
		
		System.out.println();
		
		System.out.println("Brand : " + s.brand);
		System.out.println("Type : " + s.type);
		System.out.println("Colour : " + s.colour);
		System.out.println("Size : " + s.size);
		System.out.println("Weight : " + s.weight + "KG");
		System.out.println("Quantity : " + s.quantity);
		System.out.println("Price : RM " + s.price);

		System.out.println();
		
		Shoes AkmalShoes = new Shoes("PUMA", "RUNNING SHOES", "IGNITE PURPLE", 9.5, 983, 1, 889.42);
		
		System.out.println("Brand : " + AkmalShoes.brand);
		System.out.println("Type : " + AkmalShoes.type);
		System.out.println("Colour : " + AkmalShoes.colour);
		System.out.println("Size : " + AkmalShoes.size);
		System.out.println("Weight : " + AkmalShoes.weight + "G");
		System.out.println("Quantity : " + AkmalShoes.quantity);
		System.out.println("Price : RM " + AkmalShoes.price);
	}

}
