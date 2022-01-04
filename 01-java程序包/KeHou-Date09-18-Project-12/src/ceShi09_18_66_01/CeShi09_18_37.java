package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_37 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*37. 从键盘上输入一个数，当输入 1~7 时，显示下面对应
			的信息；输入 1~7 之外的值时，提示错误重新输入，直
			到输入 0 退出循环。
			1：MON 2：TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN*/	
		Scanner ning =  new Scanner(System.in);	
		System.out.println("请输入数字");
			int B = 0;
			String A = "";
			B = ning.nextInt();		
		while (B != 0) {
			if (B >= 1 && B <= 7) {
				switch (B) {
				case 1:
					A = "MON";
					break;
				case 2:
					A = "TUE";
					break;
				case 3:
					A = "WED";
					break;
				case 4:
					A = "THU";
					break;
				case 5:
					A = "FRI";
					break;
				case 6:
					A = "SAT";
					break;
				case 7:
					A = "SUN";
					break;
				}
				System.out.println(B+":"+A);
					B = ning.nextInt();
			} else {
				System.out.println("输入错误请重新输入");
					B = ning.nextInt();	
			}
			
		}
		System.out.println("结束");
	}

}
