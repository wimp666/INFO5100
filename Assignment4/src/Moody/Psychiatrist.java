package Moody;

public class Psychiatrist {
	public void examine(Moody moody) {
		System.out.println("How are you feeling today?");
		moody.queryMood();
	}
	public void observe(Moody moody) {
		moody.expressFeelings();
		System.out.println("Observation: " + moody.toString());
		System.out.println("");
	}

	public static void main(String[] args) {
		Moody sad = new Sad();
		Moody happy = new Happy();
		Psychiatrist test = new Psychiatrist();
		
		test.examine(happy);
		test.observe(happy);
		test.examine(sad);
		test.observe(sad);

	}

}
