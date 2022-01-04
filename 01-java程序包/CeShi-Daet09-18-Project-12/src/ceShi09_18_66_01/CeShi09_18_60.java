package ceShi09_18_66_01;

public class CeShi09_18_60 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		60. 编写程序实现输出 1~100 中所有不能被 7 整除的
//		数，并求和。
			int A = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%7 != 0) {
				A += i;
			}
			
		}
		System.out.println(A);		
	}

}
