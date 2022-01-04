package ceShi09_18_66_01;

import java.util.Scanner;

import java.util.Random;

public class CeShi09_18_33 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*33. 幸运猜猜猜：游戏随机给出一个 0~99（包括 0 和
		99） 的数字，然后你猜是什么数字，游戏给出提示太大
		了还是太小了，直到猜中。猜中后会根据猜测的次数给出
		相应的评价，如下：*/
		
		Scanner ning = new Scanner(System.in);
		  Random yun = new Random();
			int A = yun.nextInt(100);
			int B = 0,C = 0,D = 0,E = 0;
		do {
			System.out.print("请猜数字：");
				B = ning.nextInt();
			if (B > A) {
				System.out.println("太大了");
					C++;
			} else if (B < A) {
				System.out.println("太小了");
					D++;
			}
		} while (A != B);
				E = C + D + 1;
			System.out.println("你一共猜了"+E+"次");
		if (E <= 3) {
			System.out.println("厉害了我的哥");
		} else if (E >= 4 && E <= 6) {
			System.out.println("哎呦，不错哦");
		} else if (E >= 7){
			System.out.println("的加油啊");
		}
	
	}

}
