package luanceshi;

import java.util.Scanner;

public class CeShi11 {
	
//	public int max(int a,int b) {
//		if (a > b) {
//			return a;
//		}
//			return b;
//	}
	public boolean A(int num) {
		int n = (int)Math.sqrt(num);
		int i = 0;
		for (i = 3; i < n;i += 2) {
			if (num % i == 0) {
				break;	
			}
			
		}
		if (i > n) {
			return true;
		}
		return false;
	}
	public static void main(String []args) {
//		CeShi11 H = new CeShi11 ();
//		int max = H.max(12, 10);
//		System.out.println("最大值是："+max);
		Scanner ning = new Scanner(System.in );
		CeShi11 d = new CeShi11();
		int num;
		System.out.print("请输入一个数：");
		num = ning.nextInt();
		if (d.A(num)) {
			System.out.println(num+"是素数！");
		}
		else {
			System.out.println(num+"不是素数！");
		}
		
	}
	
}
