import java.util.Scanner;

public class Shoes {

	String brand,  type, colour;
	int quantity;
	double size, weight, price;
	
	Scanner s = new Scanner(System.in);
	
	Shoes(){
		
		System.out.println("Enter Brand : ");
		this.brand = s.nextLine();
		System.out.println("Enter Type : ");
		this.type = s.nextLine();
		System.out.println("Enter Colour : ");
		this.colour = s.nextLine();
		System.out.println("Enter Size : ");
		this.size = s.nextDouble();
		System.out.println("Enter Weight : ");
		this.weight = s.nextDouble();
		System.out.println("Enter Quantity : ");
		this.quantity = s.nextInt();
		System.out.println("Enter Price : ");
		this.price = s.nextDouble();
		
	}
	
	Shoes(String b, String t, String c, double s, double w, int q, double p){
		
		this.brand = b;
		this.type = t;
		this.colour = c;
		this.size = s;
		this.weight = w;
		this.quantity = q;
		this.price = p;
		
	}
	
}
