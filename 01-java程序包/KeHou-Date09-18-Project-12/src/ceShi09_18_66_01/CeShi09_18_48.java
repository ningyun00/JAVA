package ceShi09_18_66_01;

public class CeShi09_18_48 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//	48. 抗洪战士连续作战 32 小时，计算共多少天零多少小
		//	时？
			double A = 32;
			double B;	//天
			B = A/24;
		System.out.print((int)B+"天零");
		System.out.println((int)(((A/24)-((int)(B)))*24)+"个小时");
	}

}
