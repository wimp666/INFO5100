package reverse;

import java.io.*;
import java.util.Stack;

public class ReverseSentence {
	
	private static String readFromStream(FileInputStream fis) throws IOException {
		StringBuilder sb = new StringBuilder();
		while (true) {
			int x = fis.read();
			if (x == -1)
				break;
			char c = (char) x;
			sb.append(c);
			
		}
		System.out.println(sb);
		fis.close();
		return sb.toString();
	}
	
	static String reverse(File file) throws Exception{
		FileInputStream fis = new FileInputStream(file);
		String str = readFromStream(fis);
		str = str.substring(0, str.length() - 1);
		String[] temp= str.split(" ");
		Stack<String> stack = new Stack<>();
		for(int i = 0; i < temp.length; i++) {
			stack.push(temp[i]);
		}
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append(".");
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		File file = new File("/ѧϰ/INFO5100/Assignment7/src/reverse/text.txt");
		String str = reverse(file);
		System.out.println(str);
		File outputFile = new File("/ѧϰ/INFO5100/Assignment7/src/reverse/output.txt");
		FileOutputStream fos = new FileOutputStream(outputFile, true);
		PrintStream ps = new PrintStream(fos);
		ps.println(str);
		ps.close();
		fos.close();
	}

}
