import java.util.Arrays;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(6));
		System.out.println(reverse("the sky is blue"));
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		for(int i : spiralOrder(matrix)) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println(convert("PAYPALISHIRING", 3));
	}
	
	//Q5
	public static String countAndSay(int n) {
		if(n == 1)
			return "1";
		if(n == 2)
			return "11";
	    String temp = countAndSay(n - 1);
	    String res = "";
	    Integer count = 1;
	    int len = temp.length();
	    for(int i = 1; i < len; i++) {
	        if(temp.charAt(i) == temp.charAt(i - 1)) {
	        	count++;
	        }else {
	        	res = res + count.toString() + temp.charAt(i - 1);
	        	count = 1;
	        }
	    }
	    res = res + count.toString() + temp.charAt(len - 1);
	    return res;
    }
		
	//Q6
	public static String reverse(String str) {
		String res = "";
		String[] temp = str.split(" ");
		int len = temp.length - 1;
		while(len >= 0) {
			if(len == 0) {
				res = res + temp[len];
				break;
			}
			res = res + temp[len--] + " ";
		}
		return res;
	}
	
	//Q7
	public static int[] spiralOrder(int[][] matrix) {
		int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
		int row = matrix.length, col = matrix[0].length;
		Boolean[][] flag = new Boolean[row][col];
		for(int temp = 0; temp < row; temp++) {
			Arrays.fill(flag[temp], false);
		}
		
		int i = 0, j = 0, k = 0;
		int[] res = new int[row * col];
		int count = 0;
		
		while(count < row * col) {
			while(0 <= i && i < row && 0 <=j && j < col && flag[i][j] == false) {
				res[count++] = matrix[i][j];
				flag[i][j] = true;
				i += dir[k][0];
				j += dir[k][1];
			}
			if(k != 3) {
				i -= dir[k][0];
				j -= dir[k][1];
				k++;
				i += dir[k][0];
				j += dir[k][1];
			}else {
				i -= dir[k][0];
				j -= dir[k][1];
				k = 0;
				i += dir[k][0];
				j += dir[k][1];
			}
		}
		return res;
	}
	
	//Q8
	public static String convert(String s, int numRows) {
		String res = "";
		int[] dir = {1, -1};
		int k = 0;
		int curRow = 0;
		String[] temp = new String[numRows];
		for(Character c : s.toCharArray()) {
			if(curRow == 0) 
				k = 0;
			if(curRow == numRows - 1)
				k = 1;
			if(temp[curRow] == null) {
				temp[curRow] = c.toString();
			}else {
			    temp[curRow] += c;
			}
			curRow += dir[k];
		}
		for(String str : temp) {
			res += str;
		}
		return res;
	}
	
    //Q9
	/* 
	 * Suppose there is a Class named Radio. If the Class is encapsulated, just like
	 * you have bought a assembled radio. You can use the radio through the bottoms outside
	 * to realize functions like switch channels, change volume. However, you have no idea
	 * how these functions are realized, because the Class radio is encapsulated.
	 */
	
	
	//Q10
	/*
	 * In my opinion, Abstraction is mainly used in cases like to set the frame of methods
	 * in superclass. Then we can extend these superclass to realize classes under the 
	 * frames. One example is the Map class and HashMap class. Encapsulation is used to 
	 * prevent invalid change of variables from other classes through the direct call
	 * like class.variable.
	 */
}
