package keTang10_09_16;



public class KeTang03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*3、输出如下图形:
			*******
			 ******
			  *****
			   ****
			    ***
			     **
			      *
			
			    *
			   ***
			  *****
			 *******
			**********/

		for (int i = 0; i <= 7; i++) {//外循环
			System.out.println();//换行
				for (int k = 0; k < i;k++) {//内循环
				System.out.print(" ");//输出左边的空格
			}
				for (int j = 7; j >=i; j--) {//输出*号
					System.out.print("*");
			}
				
		}
		System.out.println();
		for (int A = 1;A<=5;A++) {//输出列外循环
			System.out.println();
			for (int B = 5; B >A; B--) {//输出倒三家空格
				System.out.print(" ");
			}
			for(int C=1;C<=A*2-1;C++) {
				System.out.print("*");//输出*号
			}
		}
		System.out.println();
	}

}
