package luanceshi;

import java.util.Scanner;

public class CeShi12 {
	int A(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * A(n-1);
	}
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		CeShi12 d = new CeShi12();
		int num;
		System.out.println("输入整数：");
		num = ning.nextInt();
		System.out.println(num+"的阶乘为"+d.A(num));
	
	}

}
