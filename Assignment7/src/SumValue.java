import java.util.Arrays;

public class SumValue {
    
    /*generate array of random numbers*/
    static void generateRandomArray(int[] arr){
    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = (int)(Math.random() * 1000000);
    	}
    }

    /*get sum of an array using 4 threads*/
    static long sum(int[] arr){    	
    	int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length / 4);
    	int[] arr2 = Arrays.copyOfRange(arr, arr.length / 4, arr.length / 2);
    	int[] arr3 = Arrays.copyOfRange(arr, arr.length / 2, arr.length / 4 * 3);
    	int[] arr4 = Arrays.copyOfRange(arr, arr.length / 4 * 3, arr.length);
    	Thread sum1 = new Thread(() -> arrSum(arr1));
    	Thread sum2 = new Thread(() -> arrSum(arr2));
    	Thread sum3 = new Thread(() -> arrSum(arr3));
    	Thread sum4 = new Thread(() -> arrSum(arr4));
    	sum1.run();
    	sum2.run();
    	sum3.run();
    	sum4.run();
        return ans;
    }
    static long ans = 0;
    static long arrSum(int[] arr) {
    	long res = 0;
    	for(int i : arr) {
    		res += i;
    	}
    	System.out.println(res);
    	ans += res;
    	return res;
    }

    public static void main(String[] args){
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }
}