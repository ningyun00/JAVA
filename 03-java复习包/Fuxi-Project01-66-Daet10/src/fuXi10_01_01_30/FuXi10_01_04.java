package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//04.
		Scanner ning = new Scanner(System.in);
			   	int B = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("请输入第"+i+"个整数：");
				int A = ning.nextInt();	
			if (A%2==0) {
				B++;
			}
			
		}
		System.out.println(B);
	}

}
