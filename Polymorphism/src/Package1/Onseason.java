package Package1;

import java.util.Scanner;

public class Onseason extends Offseason {
	public void discount() {
		super.discount();
		double purchaseAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your purchase Amount:");
		purchaseAmount=sc.nextDouble();
		double discountAmount=0.4*purchaseAmount;
		System.out.println("Onseason 40% discount."+"\n"+"Congratulations! You get "+discountAmount+" rupees Discount");
	}
	public static void main(String args[]) {
		Offseason of = new Onseason();
		of.discount();
		
		}
}
