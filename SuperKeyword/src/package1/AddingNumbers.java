package package1;
import java.util.*;//scanner kidakunne package
public class AddingNumbers {
	int a,b,sum;//declare first two numbers
	public void AddingTwoNumers() {//create method addingtwonumers
		Scanner sc = new Scanner(System.in);//get numbers to user
		System.out.println("enter first number");
		a = sc.nextInt();
		System.out.println("enter second number");
		b = sc.nextInt();
		sum = a+b;
		}
}
