package leetcode338;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int num = 5;
		
		System.out.println("Input: " + num);
		
		CountBitsInArrayFunction solution = new CountBitsInArrayFunction();
		
		System.out.println("Solution: " + Arrays.toString(solution.countBits(num)));
	}
}
