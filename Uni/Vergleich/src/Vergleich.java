import java.util.*;

public class Vergleich {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		int x, y, z, max;
		max = 0;
		
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		x = scan.nextInt();
		
		System.out.println("Bitte geben Sie eine weitere Zahl ein: ");
		y = scan.nextInt();
		
		System.out.println("Bitte geben Sie eine letzte Zahl ein: ");
		z = scan.nextInt();
		
		if (x >= y && x >= z)
			max = x;
		else if (y >= x && y >= z)
			max = y;
		else if (z >= x && z >= y)
			max = z;
			
		System.out.println("Die größte der eingegebenen Zahlen ist: : " + max);
		
	}

}
