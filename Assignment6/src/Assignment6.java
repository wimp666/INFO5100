import java.util.HashMap;
import java.util.Map;


/*
 * II. Write two differences between ArrayList and LinkedList. (Score 1)
 * 1.ArrayList can return object with index in O(1) time, while LinkedList have to go through the list so the time is O(n)
 * 2.LinkedList can be used as a queue while ArrayList can't. 
 */

public class Assignment6 {
	//III. Given two strings s and t , write a function to determine if t is an anagram of s.
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		Map<Character, Integer> sMap = new HashMap<>();
		char[] sArray = s.toCharArray();
		for(char c : sArray) {
			sMap.put(c, sMap.getOrDefault(c, 0) + 1);
		}
		for(char c : t.toCharArray()) {
			if(sMap.containsKey(c)) {
				if(sMap.get(c) == 1) {
					sMap.remove(c);
				}else {
					sMap.put(c, sMap.get(c) - 1);
				}
			}else {
				return false;
			}
		}
		if(sMap.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	//IV. Given an array of integers arr, write a function that returns true if and
	//only if the number of occurrences of each value in the array is unique.
	public boolean uniqueOccurrences(int[] arr) {
		
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
		System.out.println(isAnagram("rat", "car"));
		System.out.println(isAnagram("anagrama", "nagaram"));

	}
}
