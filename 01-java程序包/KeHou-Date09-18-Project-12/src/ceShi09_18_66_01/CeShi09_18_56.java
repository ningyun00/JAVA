package ceShi09_18_66_01;

public class CeShi09_18_56 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		56. 输出一个平行四边形
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 8; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
	}

}
