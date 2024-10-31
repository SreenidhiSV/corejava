package package1;

public class TotalSalary extends CalculateHraAndPf{   //create class 3 total salary get salary slip-bp,deduction,hra,pf,bonus,total salary
	public void SalarySlip() {//
		//calcuation();
		double total = basicpay+(hra-pf-deduction)+bonus;
		System.out.println("Salaryslip");
		System.out.println("Basicpay:" + basicpay);
		System.out.println("Deduction"+ deduction);
		System.out.println("HRA"+ hra);
		System.out.println("PF"+ pf);
		System.out.println("Bonus"+ bonus);
		System.out.println("Total Salary By Hand " + total);
	}
	public static void main(String args[]) { //run final class-create main 
		TotalSalary employeeSalary = new TotalSalary();//method to call using create child class object
														//class 3 name is -TotalSalary
		employeeSalary.getEmployeeDetails();//object.getdetails
		employeeSalary.calculaion();
		employeeSalary.SalarySlip();
	}
}
