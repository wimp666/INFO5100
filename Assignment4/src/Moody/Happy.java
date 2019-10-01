package Moody;

public class Happy extends Moody {
	protected String getMood() {		
		return "happy";
	}

	protected void expressFeelings() {
		System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
	}
	
	public String toString() {
		return "Subject laughs a lot";
	}

}
