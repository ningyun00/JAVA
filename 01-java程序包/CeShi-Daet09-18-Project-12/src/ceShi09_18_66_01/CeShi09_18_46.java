package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_46 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*46. 小明买了一双鞋，价值 58 元，买了 3 件衣服，每件
		30 元，买了 5 个包，每个包 55.8 元。小明共交了 500
		元，问还要找回多少元。用程序表达。*/
		Scanner ning = new Scanner(System.in);
			System.out.println("请输入买了几件衣服：");
				int E = ning.nextInt();
			System.out.println("请输入买了几双鞋：");
				int F = ning.nextInt();
			System.out.println("请输入买了多少包：");
				int D = ning.nextInt();
			System.out.println("请输入支付了多少钱：");
				int A = ning.nextInt();
				int B = 58,G = 30;double C = 55.8;
				/*鞋*/ /*衣服*/
				int Z = E*G,Y = F*B;double X = D*C;
			System.out.println("应找回："+(A-(Z+Y+X)));
	
	}

}
