package ceShi09_18_66_01;

public class CeShi09_18_57 {

	public static void main(String[] args) {
//		 TODO 自动生成的方法存根
//		57. 输出一个等腰三角形
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <= i*2-1; j2++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
	}

}
