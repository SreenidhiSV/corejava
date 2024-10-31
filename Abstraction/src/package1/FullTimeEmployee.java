package package1;

public class FullTimeEmployee extends Employee {
	public static void main(String[] args) {
		Employee e2 = new FullTimeEmployee();
		e2.calculateSalary();
		Employee e1 = new Contractor();
		e1.calculateSalary();
	}
	@Override
	void calculateSalary() {
		System.out.println("Salary per hour for fulltime employee is 500");
		int salary = 500*8;
		System.out.println("The salary of fulltime employee is "+ salary);
	}
}

