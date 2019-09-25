
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(6));
		System.out.println(reverse("the sky is blue"));
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
		
	}

}
