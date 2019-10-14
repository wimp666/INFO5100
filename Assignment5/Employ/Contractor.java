package Employ;

public class Contractor extends Employee {
	int workingHours;
	Contractor(String name, int paymentPerHour, int workingHours){
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return this.getPaymentPerHour() * this.workingHours;
	}

}
