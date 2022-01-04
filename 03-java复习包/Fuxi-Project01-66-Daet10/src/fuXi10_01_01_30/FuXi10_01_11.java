package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//11.
		Scanner ning = new Scanner(System.in);
			System.out.print("请输入小时：");
				double A = ning.nextInt();
				double B= A/24;
			System.out.print((int)B+"天");
			System.out.print("零"+(int)(((A/24)-((int)(B)))*24)+"小时");
	}

}
