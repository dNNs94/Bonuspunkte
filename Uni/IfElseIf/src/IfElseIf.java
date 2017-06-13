import java.util.*;

public class IfElseIf {

	public static void main(String[] args) {
		
		System.out.println("Bitte geben Sie eine Zahl ein:");
		double x = new java.util.Scanner(System.in).nextDouble();
		System.out.println("Bitte geben Sie einen Operator ein ( +, -, *, / ):");
		char operator = new java.util.Scanner(System.in).nextLine().charAt(0);
		System.out.println("Bitte geben Sie noch eine Zahl ein:");
		double y = new java.util.Scanner(System.in).nextDouble();
		
		if (operator == '+')
			System.out.println(x + y);
		else if ( operator == '-')
			System.out.println(x - y);
		else if ( operator == '*')
			System.out.println(x * y);
		else if ( operator == '/')
			System.out.println(x / y);

	}

}
