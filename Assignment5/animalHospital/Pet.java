package animalHospital;

class Pet {
	private String petName;
	private String ownerName;
	private String color;
	int sex;
	
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	public static final int SPAYED = 2;
	public static final int NEUTERED = 3;
	
	public Pet (String name, String ownerName, String color){
		this.petName = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName() {
		return this.petName;
	}
	public String getOwnerName() {
		return this.ownerName;
	}
	public String getColor() {
		return this.color;
	}
	
	public void setSex(int sexid) {
		this.sex = sexid;
	}
	
	public String getSex() {
		switch(this.sex) {
		case 0 :
		    return "MALE";
		case 1 :
			return "FEMALE";
		case 2 :
			return "SPAYED";
		case 3 :
			return "NEUTERED";
		default :
			return "unknown gender";
		}
	}
	
	public String toString() {
		return this.getPetName() + " owned by " + this.getOwnerName() + "\n" + "Color : " + this.color + "\n" + "Sex" + this.getSex();
	}
}
