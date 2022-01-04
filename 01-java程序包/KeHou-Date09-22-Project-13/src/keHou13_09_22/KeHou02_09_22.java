package keHou13_09_22;

import java.util.Scanner;

public class KeHou02_09_22 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*2. 循环输入 6 个整数放入到一个 int 类型的数组中，
		 * 然后再统计输出刚才有多少个数字大于 0。
		 */
		Scanner ning = new Scanner(System.in);
			int A[] = new int [6];
			int B = 0,sum = 0;
		for (int i = 0; i < A.length; i++) {
			System.out.print("请输入第"+(i+1)+"个整数:");
				A[i] = ning.nextInt();
			if (A[i]>B) {
					sum++;
			}

		}
		System.out.println(sum);	
	}

}
