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
//		System.out.println("���ֵ�ǣ�"+max);
		Scanner ning = new Scanner(System.in );
		CeShi11 d = new CeShi11();
		int num;
		System.out.print("������һ������");
		num = ning.nextInt();
		if (d.A(num)) {
			System.out.println(num+"��������");
		}
		else {
			System.out.println(num+"����������");
		}
		
	}
	
}
