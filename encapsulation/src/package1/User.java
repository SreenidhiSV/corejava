package package1;
import java.util.*;
public class User {

	public static void main(String[] args) {
		Bank b = new Bank();
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter your PIN number: ");
		int userPin = sc.nextInt();
		b.setPin(userPin);
		b.withdrawAmount();

	}	
}

