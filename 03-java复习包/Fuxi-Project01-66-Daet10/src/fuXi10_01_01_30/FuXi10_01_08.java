package fuXi10_01_01_30;

public class FuXi10_01_08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//08.
		int A = 0, B = 0;
		for (int i = 2000; i < 2008; i++) {
			if (i%4==0&&i%100!=0||i%400==0) {
				A+=366;
			} else {
				B+=365;
			}
			
		}
		System.out.println(A+B);
	}

}
