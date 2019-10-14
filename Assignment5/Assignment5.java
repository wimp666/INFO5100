import java.util.Arrays;

import exceptions.MyIndexOutOfBoundException;

public class Assignment5{
	public static void main(String[] args) {
		int i = 520;
		int[] arr = new int [100];
		Arrays.fill(arr, 2);
		try {
			System.out.println("output arr[i]");
			if(i >= 100 || i < 0) {
				throw new MyIndexOutOfBoundException(0, 99, i);
			}else {
				System.out.println("arr[" + i + "] = " + arr[i]);
			}
		}catch (Exception ex) {
	        System.out.println(ex);
	    }
	}
	



/*
Explain the difference between final and finally in Java 8.

Final is a keyword used to apply restriction. When something is finaled, it can't be changed.
finally is used in try -> catch to make sure there is code to be executed.

*/

//Create a class called Number. Write a method called count() 
//which can calculate quotient of two integers and 
//use try...catch to deal with all possible exception.
    class Number{
    	int value;
    	Number(int i){
    		value = i;
    	}
    	public double count (Number a, Number b){
    		try {
    			double res = a.value / b.value;
        		return res;
    		}catch(ArithmeticException aex){
    			System.out.println("Numerator can't be 0!");
    			return 0.0;
    		}
    	}
    }



}