package package1;
import java.util.*;
public class Contractor extends Employee{

	@Override
	void calculateSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total working hours : ");
		int hours = sc.nextInt();
		System.out.println("Payment per hour for contract employee is 300");
		int salary = 300 * hours;
		System.out.println("Salary of contract employee " + salary);
		
	}

}