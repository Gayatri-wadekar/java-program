import java.util.Scanner;

public class Calculationmain {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter first number");
		num1 = Sc.nextInt();
		
		System.out.println("enter second number");
		num2 = Sc.nextInt();
		
		int result= num1+num2;
		System.out.println("addition of" + num1 + "&" + num2 + "=" + result);
		Sc.nextLine();

		System.out.println("\n Enter any messege");
	    String msg = Sc.nextLine();
	    
	    System.out.println(msg);
	    
	}
}
