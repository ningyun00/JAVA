import java.util.Scanner;
public class Dome04 {


	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner ning = new Scanner(System.in);
		/*   输入两个整数，计算他们的和，
		 *	 如果和大于100，
		 *	 就输出这两个数的乘积，
		 * 	 否则，就输出这两个数的商
	     */
			System.out.println("请输入两个整数：");
			System.out.println("第一个整数：");
			        double B = ning.nextInt();
			System.out.println("第二个整数");
			        double C = ning.nextInt();
		            double A;
		            double D;
		if(( B + C ) > 100) {
			    A = B*C;
			System.out.println(A);	
		} else {
			    D =B/C;		
			System.out.println(D);	
		}

	}

}