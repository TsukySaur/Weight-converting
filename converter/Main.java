package converter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// scanner for user input
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Choose what to convert if kg write k if lb write l : ");
		String unit = scan.nextLine();
		
		
		// defines the variables to performe mathematicaal operations
		
		float mult = 0; 
		float div = 0;
		float koef = 0.45f; //  coefficient 1lb = 0.45 kg
		
		// if statement
		
	if (unit.equals("k")) {
			
			System.out.println(" Input weight kg: ");
			int k = scan.nextInt();
			
			div = k/koef;
			System.out.println(" Converts " + k + " kg to lb: " +div+" lb");
			
		} else if (unit.equals("l")) {
			
			System.out.println(" Input weight lb: ");
			int l = scan.nextInt();
			
			mult = l*koef;
			System.out.println(" Converts" + l +" lb to kg: " +mult+" kg");
			
		} 
		
		scan.close();

	}

		
}
