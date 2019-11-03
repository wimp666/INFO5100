package decodeString;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;

public class Decode {
	public static String decodeString(String s) {
        StringBuilder builder = new StringBuilder();
        LinkedList<Integer> numStack = new LinkedList<>();
        LinkedList<String> stringStack = new LinkedList<>();
        int num = 0;	
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                numStack.addLast(num);
                stringStack.addLast(builder.toString());
                builder.delete(0, builder.length());
                num = 0;
            } else if (c == ']') {
                String item = builder.toString();
                Integer numItem = numStack.removeLast();
                for (int i = 1; i < numItem; i++) {
                    builder.append(item);
                }
                builder.insert(0, stringStack.removeLast());
            } else {
                builder.append(c);
            }
        }

        return builder.toString();
    }
	
	private static String readFromStream(File file) throws IOException {
		FileInputStream fis = new FileInputStream(file);
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
	
	public static void main(String[] args) throws Exception {
		File file = new File("/ѧϰ/INFO5100/Assignment7/src/decodeString/input.txt");
		String str = readFromStream(file);
		String res = decodeString(str);
		System.out.println(res);
		File outputFile = new File("/ѧϰ/INFO5100/Assignment7/src/decodeString/output.txt");
		FileOutputStream fos = new FileOutputStream(outputFile, true);
		PrintStream ps = new PrintStream(fos);
		ps.println(res);
		ps.close();
		fos.close();
	}
}
