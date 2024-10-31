package Package1;

import java.util.Scanner;

public class Offseason {
	public void discount() {
		double purchaseAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your purchase Amount");
		purchaseAmount=sc.nextDouble();
		double discountAmount=0.15*purchaseAmount;
		System.out.println("Offseason 15% discount."+"\n"+"Congratulations! You get "+discountAmount+" rupees Discount");
	}
}
