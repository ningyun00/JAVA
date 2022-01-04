package ceShi09_18_66_01;

public class CeShi09_18_59 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		59. 循环 1--100，找出能被 8 整除的数，然后给它们相加，
//		最后计算和。
		int A = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%8 == 0) {
				A += i;
			}
			
		}
		System.out.println(A);
	}

}
