package ceShi09_18_66_01;

public class CeShi09_18_05 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//5. 计算 1+3+5+7.......+99 的
			int A =0;
		for (int i = 1; i <= 99; i++) {
			if (i%2 != 0) {
				A += i;
			}
			
		}
		System.out.println(A);
	}

}
