package animalHospital;

public class Dog extends Pet implements Boardable {
	String size;
	int startDay, startMonth, startYear;
	int endDay, endMonth, endYear;
	
	public Dog (String name, String ownerName, String color, String size) {
		super(name,  ownerName, color);
		this.size = size;
	}
	
	public String getSize() {
		return this.size;
	}
	public String toString() {
		return "DOG:" + "\n" + this.getPetName() + " owned by " + this.getOwnerName() + "\n" + "Color : " + this.getColor() + "\n" + "Sex : " + this.getSex() + "\n" + "Size : " + this.getSize();
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		this.startDay = day;
		this.startMonth = month;
		this.startYear = year;

	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		this.endDay = day;
		this.endMonth = month;
		this.endYear = year;

	}

	@Override
	public boolean boarding(int month, int day, int year) {
		int startSum = this.startYear * 10000 + this.startMonth * 100 + this.startDay;
		int endSum = this.endYear * 10000 + this.endMonth * 100 + this.endDay;
		int curSum = year * 10000 + month * 100 + day;
		if(curSum > endSum || curSum < startSum)
			return false;
		return true;
	}

}
