package Moody;

public abstract class Moody {
	
	protected abstract String getMood();
	protected abstract void expressFeelings();
	public void queryMood() {
		System.out.println("I fell " + getMood() +" today!");
		System.out.println("");
	}

}
