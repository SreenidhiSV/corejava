package package1;

public class Address {
	String housename, city,state;
	int pin;
	Student student;
	Address(String housename,String city,String state,int pin,Student student) {
		this.housename=housename;
		this.city=city;
		this.state=state;
		this.pin=pin;
		this.student=student;
		
	}
	void display() {
		System.out.println("Student Name: "+student.name);
		System.out.println("Roll number: "+student.rollnumber);
		System.out.println("Address");
		System.out.println("Housename: "+housename);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("PinCode: "+pin);
		
	}

	public static void main(String[] args) {
		Student st = new Student("sreenidhi",8);
		Address ad = new Address("Sreenilayam","Alappuzha","Kerala",690529,st);
		ad.display();
	}

}
