package keHou13_09_22;

import java.util.Scanner;

public class KeHou03_09_22 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//3. 一个 int 类型的数组, 循环输入 5 个数字, 
		//分别输出 5 个数字的最大值和最小值.
		Scanner ning = new Scanner(System.in);
			int A[] = new int [5];
		for (int i = 0; i < A.length; i++) {
			System.out.print("请输入第"+(i+1)+"个数字");
				A[i] = ning.nextInt();
		}//最大值
			int max = A[0];
			int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (max < A[i]) {
				max = A[i];
			}
			if (min > A[i]) {
				min = A[i];
			}
		}
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
	}

}
