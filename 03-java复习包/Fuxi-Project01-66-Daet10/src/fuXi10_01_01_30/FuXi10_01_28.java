package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_28 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//28.
		Scanner ning = new Scanner(System.in);
			System.out.println("请输入一个数：");
				int A = ning.nextInt();
		if (A%3 == 0 || A%5 == 0) {
			System.out.println("该数是3或5的倍数");
		} else {
			System.out.println("该数是不是3或5的倍数");
		}
		
	}

}
