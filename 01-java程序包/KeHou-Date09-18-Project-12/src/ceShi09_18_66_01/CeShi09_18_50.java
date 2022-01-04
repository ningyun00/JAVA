package ceShi09_18_66_01;

public class CeShi09_18_50 {

	public static void main(String[] args) {
//		 TODO 自动生成的方法存根
//		50. 循环输出 200 到 1000 之间，既能被 5 整除，又能被 8
//		整除的数
		int A = 200;
		while (A <= 1000) {
			A++;
			if (A%5 == 0 && A%8 == 0) {
				System.out.println(A);
			}
		
		}
			
	}

}
