package package1;

public class CalculateHraAndPf extends Employee {// class2 extend to employee)
	double hra,pf; //declare datatype
	public void calculaion() { //method
		hra = 0.05 * basicpay;
		pf = 0.2 * basicpay;
	}

}
