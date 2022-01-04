package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_26 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//26.
		Scanner ning = new Scanner(System.in);
			System.out.print("请输入你的用户名：");
				String A = ning.next();
			System.out.print("请输入密码：");
				int B = ning.nextInt();
		if (A.equals("寜") && B == 1234) {
			System.out.print("欢迎寜");
		} else {
			System.out.println("抱歉你不是该用户");
		}
		
	}

}
