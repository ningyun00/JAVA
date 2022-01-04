package keTang11_09_17;

import java.util.Scanner;

import java.util.Random;

public class KeTang01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*完成出拳游戏：		
		1.输入y继续下一把，输入n结束游戏
		2.打印战绩
			电脑胜利：X次
			玩家胜利：X次
			平局：X次
		 */
			
		Scanner ning = new Scanner(System.in);
			Random yun = new Random();
			String A;
			   int B = 0,C = 0,D = 0;
			do {
				System.out.println("开始游戏");
				System.out.println("请出拳：(1，2，3)");
					int E = ning.nextInt();//人
				System.out.println("电脑出拳中");
					int F = yun.nextInt(3)+1;//电脑(3)+1:范围；1~3
				switch(E) {
					case 1:
						System.out.println("你出的是：石头");
					break;
					case 2:
						System.out.println("你出的是：剪刀");
					break;
					case 3:
						System.out.println("你出的是：布");
					break;
					default:
						System.out.println("输入错误:");
					break;
					}
				switch(F) {
					case 1:
						System.out.println("电脑出的是：石头");
					break;
					case 2:
						System.out.println("电脑出的是：剪刀");
					break;
					case 3:
						System.out.println("电脑出的是：布");
					break;
					default:
						System.out.println("输入错误:");
					break;
				}
				int G = E-F;//G胜负=人-电脑；
				switch(G) {
				case -1://人赢1-2=-1，2-3=-1，3-1=2；
					case 2:
						System.out.println("恭喜你你赢了");
					break;
					case -2://电脑嬴1-3=-2，2-1=1，3-2=1；
					case 1:
						System.out.println("不要灰心电脑嬴了");
					break;	
					case 0://平局
						System.out.println("平局");
					break;	
					}	
				System.out.println("是否结束游戏:(y/0)");
					A = ning.next();
				if (G == -1 || G == 2) {
					B++;
				} else if (G == -2 || G == 1) {
					C++;
				} else if (G == 0) {
					D++;
				}
			 
			} while (A.equals("y"));
			System.out.println("人胜利："+B);
		System.out.println("电脑嬴"+C);
	System.out.println("平局"+D);
	}

}
