package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//10.
		Scanner ning = new Scanner(System.in);
			int B = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("输入第一个人的成绩：");
				int A = ning.nextInt();
				B += A;
		}
		System.out.println(B/3);
	}

}
