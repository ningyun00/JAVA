package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//14.
		Scanner ning = new Scanner(System.in);		
			System.out.print("请输入公里数：");
				int A = ning.nextInt();
		if (A < 100) {
				A = A*20;
				System.out.println("不打折费用为："+A);
		} else if (A < 500 && A > 100) {
			    A = A*20;
				System.out.println("费用为："+A*0.9);
		} else if (A>=500) {
				A = A*20;
			System.out.println("费用为："+A*0.8);	
		}
		
	}

}
