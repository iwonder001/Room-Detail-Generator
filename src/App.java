import java.util.Scanner;
public class App {


	public static void main(String[] args) {
		
		float width;
		float length; 
		float area;
		float perimeter;
		String cont;
		cont = "y";
		
		while (cont.equals("y")) {

		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		
		System.out.print("Enter Length for the Snug: ");
		length = input.nextFloat();
		
		System.out.print("Enter Width for the Snug: ");
		width = input.nextFloat();
		
		area = length*width; 
		System.out.println("Area: " + area);
		
		perimeter = length*2 + width*2;
		System.out.println("Perimeter: " + perimeter);
		

		System.out.print("Continue? (y/n)");
		input.nextLine();
		cont = input.nextLine();
	
		}	
		
	}

}
