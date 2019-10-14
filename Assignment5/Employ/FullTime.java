package Employ;

class FullTime extends Employee {

	public FullTime(String name, int paymentPerHour) {
		super(name, paymentPerHour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return this.getPaymentPerHour() * 8;
	}

}
