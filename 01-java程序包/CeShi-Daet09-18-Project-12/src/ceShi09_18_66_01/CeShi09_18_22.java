package ceShi09_18_66_01;

public class CeShi09_18_22 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*22. 打印出所有的"水仙花数"，所谓"水仙花数"是指一个
三位数，其各位数字立方和等于该数本身。
		 */
		int A = 100;
		while(A < 999){
			int B = A%10;
			int C = A/10%10;
			int D = A/10/10%10;
			if((B*B*B)+(C*C*C)+(D*D*D)==A) {
				//3.输出循环体语句
				System.out.println(A);
			}
			//4.控制循环语句
			A++;
		}
		
	}

}
