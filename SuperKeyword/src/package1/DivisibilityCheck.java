package package1;

public class DivisibilityCheck extends AddingNumbers {//child class extend parentclass
	public void isDivisible() {//check devisible or not to create a method
		if (super.sum % 10 ==0) {
			System.out.println("sum is"+super.sum+"\nis divisible by 10");
		}else{
			System.out.println("not divisible by 10");
		}
	}
	public static void main(String args[]) {
		DivisibilityCheck d = new DivisibilityCheck();
		d.AddingTwoNumers();
		d.isDivisible();
	}
}
