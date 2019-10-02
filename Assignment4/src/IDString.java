//import java.util.*;

public class IDString {
	public static int[] IdString(String str) {
		int[] res = new int[str.length() + 1];
		char[] c = str.toCharArray();
		res[0] = (int)(Math.random() * 10000);
		int count = 0;
		for(char tempC : c) {
			if(tempC == 'I') {
				int temp;
				while((temp = (int)(Math.random() * 10000)) <= res[count]) {
					
				}
				res[++count] = temp;
			}else if(tempC == 'D') {
				int temp;
				while((temp = (int)(Math.random() * 10000)) >= res[count]) {
					
				}
				res[++count] = temp;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		String str = "DDIDIDID";
		for(int i : IdString(str)) {
			System.out.print(i + " ");
		}

	}

}
