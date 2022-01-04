package keTang10_09_16;
import java.util.Scanner;//导包
public class KeTang02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*2.  手动输入一个行数, 程序自动打印该行数的星星, 每行星星个数为8个
			********
			********
			********
			********
			********
			********
			********
			*/
			Scanner ning = new Scanner(System.in);//接收数据
			System.out.println("请输入行数：");//提示
			int A = ning.nextInt();//录入数据
			for(int i = 1;i<=A;i++) {//外层循环
				 	for (int j = 1;j <= 8;j++) {//内层循环
				 		System.out.print("*");//输出内容
				 	}
				 	System.out.println();//换行
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
