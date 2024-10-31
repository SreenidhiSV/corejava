package package1;
import java.util.Scanner;
public class HDFC implements RBI{
	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.recurringDeposite();

	}
	@Override
	public void recurringDeposite() {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the deposit amount: ");
		int depositAmount = sc.nextInt();
		System.out.println("Enter Duration of deposite in years: ");
		int duration = sc.nextInt();
		System.out.println("Interest rate: "+interestrate+"%");
		double returnAmount=(0.03*duration*depositAmount)+depositAmount;
		System.out.println("Maturity amount after"+duration+"years:"+returnAmount);
		}
}