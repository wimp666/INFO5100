package animalHospital;

public class Dog extends Pet implements Boardable {
	String size;
	
	public Dog (String name, String ownerName, String color, String size) {
		super(name,  ownerName, color);
		this.size = size;
	}
	
	public String getSize() {
		return this.size;
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean boarding(int month, int day, int year) {
		// TODO Auto-generated method stub
		return false;
	}

}
