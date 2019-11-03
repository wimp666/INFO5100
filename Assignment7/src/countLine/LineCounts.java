package countLine;

import java.io.*;

public class LineCounts {
	private static void countLines(String fileName) {        
		BufferedReader in;
	    int lineCount;
	    try {
	        in = new BufferedReader(new FileReader(fileName));
	    }
	    catch (Exception e) {
	        System.out.println("Error! Can't open file!");
	        return;
	    }	      
	    lineCount = 0;	      
	    try {
	       String line = in.readLine();
	       while (line != null) {
	           lineCount++; 
	           line = in.readLine(); 
	       }
	    }
	    catch (Exception e) {
	       System.out.println("Error!  Reading Exception");
	       return;
		}	      
		System.out.println(lineCount + " lines");	   
	}
	
	public static void main(String[] args) {    
		if (args.length == 0) {
			System.out.println("Error!");
			return;
		}    
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + ":  ");
			countLines(args[i]);
		}    
	}
}
