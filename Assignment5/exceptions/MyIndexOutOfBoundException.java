package exceptions;

public class MyIndexOutOfBoundException extends Exception {
	int lowerBound;
	int upperBound;
	int index;
	
	public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index){
		this.index = index;
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	public String toString() {
		return "Error Message: Index: " + this.index + ", but Lower bound: " + this.lowerBound + ", Upper bound: " + this.upperBound;
	}

}
