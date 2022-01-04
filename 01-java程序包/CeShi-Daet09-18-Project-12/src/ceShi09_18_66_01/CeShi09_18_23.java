package ceShi09_18_66_01;

public class CeShi09_18_23 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*23. 一球从 100 米高度自由落下，每次落地后反跳回原高
		度的一半；再落下，求它在 第 7 次落地时，共经过多
		少米？第 7 次反弹多高？*/
		double A = 100,B = 100,C = 0;
		int i ;
		for ( i = 1; i <= 7; i++) {
			if (i != 1) {
				C = ( A/2 );
				A = C;
				B += A*2;
			}
			System.out.println("第"+i+"次"+"反弹,反弹共经过高度为："+B+"米");
		}	
		System.out.println("第"+(i-1)+"次反弹了："+C+"米");
	}

}
