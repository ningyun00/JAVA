package luanceshi;

import java.util.Scanner;

import java.util.Arrays;
public class CeShi05 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner ning = new Scanner(System.in);
		int A [] = new int [6];
		A [0] = 90;
		A [1] = 85;
		A [2] = 70;
		A [3] = 65;
		A [4] = 60;

		Arrays.sort(A);
		for (int i = 0; i <= 5; i++) {
			System.out.println(A[i]);
		}
		
	}

}
