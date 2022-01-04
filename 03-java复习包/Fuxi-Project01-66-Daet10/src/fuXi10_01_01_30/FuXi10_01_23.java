package fuXi10_01_01_30;

public class FuXi10_01_23 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//23.
		double A = 100,B = 100,C = 0;
		int i;
		for (i = 1; i <= 7; i++) {
			if (i != 1) {
				C = (A/2);	
				A = C;
				B += A*2;
			}
			System.out.println("第"+i+"次"+"反弹，反弹共经过了"+B+"米");
		}
		System.out.println("第"+(i-1)+"次"+"反弹，反弹了"+C+"米");
	}

}
