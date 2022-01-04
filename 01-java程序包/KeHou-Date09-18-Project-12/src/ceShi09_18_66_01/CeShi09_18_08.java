package ceShi09_18_66_01;

public class CeShi09_18_08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*8. 计算 2000 年的 1 月 1 到 2008 年的 1 月 1 日之间相隔有
多少天。（提示：平年有 365 天，润年有 366 天，循环
从 2000 年到 2008 年结束）*/
			int A = 0;
			int B = 0;
		for (int i = 2000; i < 2008; i++) {
			if (i%4 == 0 && i%100 != 0 || i%400 == 0) {
				A += 366;
			} else {
				B += 365;
			}
			
		}
		System.out.println(A+B);
	}

}
