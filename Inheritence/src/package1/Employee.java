package package1;
import java.util.Scanner;
public class Employee {			
	double basicpay,deduction,bonus;//declare
	public void getEmployeeDetails() {	//method	
		Scanner sc = new Scanner(System.in);//enter details to get console using scanner class
		System.out.println("Enter your basic pay:");
		basicpay = sc.nextDouble();
		System.out.println("Enter your deduction:");
		deduction = sc.nextDouble();
		System.out.println("Enter your bonus:");
		bonus = sc.nextDouble();
	}
}
