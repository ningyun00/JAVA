package ceShi09_18_66_01;

public class CeShi09_18_18 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//18. 计算 1000 以内所有不能被 7 整除的整数之和
			int A = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i%7 != 0) {
				A += i;
				
			}
		
		}
		System.out.println(A);
	}

}
