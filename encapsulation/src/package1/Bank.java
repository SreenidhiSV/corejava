package package1;
public class Bank {	
	private int pin;
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public boolean validatePin() {
		int validPin[] = {1001, 1234, 1212};
		for (int valid : validPin) {
			if (this.pin == valid) {
				return true;
			}
		}
		return false;
	}
	
	public void withdrawAmount() {
		if (validatePin()) {
			System.out.println("Valid PIN");
		} else {
			System.out.println("Invalid PIN");
		}
	}

}
