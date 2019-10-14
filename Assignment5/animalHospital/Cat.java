package animalHospital;

public class Cat extends Pet implements Boardable {
	private String hairLength;
	
	public Cat (String name, String ownerName, String color, String hairLength){
		super(name,  ownerName, color);
		this.hairLength = hairLength;
	}
	
	public String getHairLength() {
		return this.hairLength;
	}
	
	public String toString() {
		return "CAT:" + "\n" + this.getPetName() + " owned by " + this.getOwnerName() + "\n" + "Color : " + this.getColor() + "\n" + "Sex : " + this.getSex() + "\n" + "Hair : " + this.getHairLength();
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
