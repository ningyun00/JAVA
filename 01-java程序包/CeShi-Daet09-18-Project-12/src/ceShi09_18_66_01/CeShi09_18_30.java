package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_30 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*30. 某人准备去海南旅游，现在要订购机票。机票价格受
季节旺季、淡季的影响，头等舱和经济舱价位也不同。假
设机票原价为 5000 元，4~10 月份为旺季，旺季头等舱
打九折，经济舱打八折，淡季头等舱打五折，经机舱打四
折。如下图*/
		Scanner ning = new Scanner(System.in);
		System.out.println("请输入出行月份：");
			int A = ning.nextInt();
		System.out.println("请选择舱位：(1（头等舱）/2（经济舱）)");
			int B = ning.nextInt();
		switch(A) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			if (B == 1) {		//头等舱
				System.out.println(5000*0.9);
			} else {			//经济舱
				System.out.println(5000*0.8);
			}
			break;
		case 1:
		case 2:
		case 3:
			if (B == 1) {		//头等舱
				System.out.println(5000*0.5);
			} else {			//经济舱
				System.out.println(5000*0.4);
			}
			break;
		}
		
	}

}