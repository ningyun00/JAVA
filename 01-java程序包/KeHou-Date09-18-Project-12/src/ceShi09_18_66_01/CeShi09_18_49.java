package ceShi09_18_66_01;

public class CeShi09_18_49 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		49. 2016 年培养学员 8 万人，每年增长 25%(0.25)，请问按此
//		增长速度，到哪一年培训学员人数将超过 20 万人？请使
//		用程序计算出来并输出结果
		double A = 8*1.25;
		   int B = 1;//年
		   int C = 0;
		while (A <= 20) {
			A = A*1.25;
			B++;
			C = 2016+B;
		}
		System.out.println("将于"+C+"年到达20万人");
	}

}
