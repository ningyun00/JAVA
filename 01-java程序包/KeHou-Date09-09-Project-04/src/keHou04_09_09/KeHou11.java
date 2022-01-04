package keHou04_09_09;

import java.util.Scanner;

public class KeHou11 {

	public static void main(String[] args) {
		/*提高题：
		11.商场的换购活动是当你的消费满了一定的金额, 
		可以参加换购活动, 加几元钱可以换购一件小商品:
		 首先输入用户的消费金额,再询问用户是否参加换购活动,选择对应的数字
		 输入数字1参加活动1: 满50元,  加2元换购600ml可乐一瓶
		 输入数字2参加活动2: 满100元, 加5元换购蓝月亮洗手液一瓶
		 输入数字3参加活动3: 满200元, 加10元换购步步高点读机一台
		 输入数字4参加活动4: 满200元, 加50元换购九阳豆浆机一台
		 最终输出本次消费的总金额*/
		Scanner ning = new Scanner(System.in);
		System.out.print("输入本次购物金额：");
			int money = ning.nextInt();
			int sum = 0;
		if (money >= 50) {
			System.out.println("是否参加活动：");
			 String B = ning.next();
			if (B.equals("是")) {
			System.out.println("活动1：满50元,  加2元换购600ml可乐一瓶");
			System.out.println("活动2：满100元, 加5元换购蓝月亮洗手液一瓶");
			System.out.println("活动3：满200元, 加10元换购步步高点读机一台");
			System.out.println("活动4：满200元, 加50元换购九阳豆浆机一台");
			System.out.print("输入数字参加活动：");
			 	int A = ning.nextInt();
				switch (A) {
				case 1:
					sum = money+2;
				System.out.print("本次共消费："+sum);
				break;
				case 2:
					sum = money+5;
				System.out.print("本次共消费："+sum);
				break;
				case 3:
					sum = money+10;
				System.out.print("本次共消费："+sum);
				break;
				case 4:
					sum = money+50;
				System.out.print("本次共消费："+sum);
				break;
				default :
					System.out.println("玩不起滚");
				}
				
			} else {
				System.out.println("本次消费："+money);
			}
			
		}
			
	}

}
