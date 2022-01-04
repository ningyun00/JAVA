package keTang19_10_15_02;
/**
 * 导包
 */
import java.util.Scanner;
/**
 * 类
 * @author 寜
 *
 */
public class DateTeam02 {
	/** 
	2. 定义一个日期类DateTime
	日期类的属性: 年 月 日  时 分 秒
	日期类的方法:
	
	*/
	/**
	 * 属性
	 * @author 寜
	 * @apiNote yers 年
	 * @apiNote yue 月
	 * @apiNote date 日
	 * @apiNote when 时
	 * @apiNote points 分
	 * @apiNote seconds 秒
	 */
	int yers=2021;
	int yue = 10;
	int date= 16;
	int when = 12;
	int points= 30;
	int seconds= 40;
	/**
	 * 方法
	 */
	Scanner ning = new Scanner(System.in);
//	1. 显示时间类: 输出"XX年XX月XX日 时:分:秒"(无参无返)
	public void XianShi() {
		System.out.println(yers+"年"
						  +yue+"月"
						  +date+"日 "
						  +when+"时："
						  +points+"分："
						  +seconds+"秒");
	}
	
//	2. 传入一个起始年份,一个结束年份, 返回两个年份之间有多少个闰年(有参有返)
	public int QiShi;//起始年份
	public int JeiShu;//结束年份
	public int RunNian(int runNian) {
		for (int i = QiShi; i <= JeiShu; i++) {
			if (i%4 == 0 && i%100 != 0 || i%400 == 0) {
				runNian++;
			}
			
		}
		System.out.println("闰年有："+runNian+"年");
		return runNian;//闰年有多少年 
	}
	
//	3. 传入一个年份,判断是否闰年返回boolean类型值
	public void ShuRu() {
		boolean falg = true;//开关，打开
		System.out.print("输入日期：");
			int riqi = ning.nextInt();//录入日期
		if (riqi%4==0&&riqi%100!=0||riqi%400==0) {//判断闰年
			System.out.println(falg);
				falg = false;//不是返回false;
		}
		if (falg) {//返回值
			System.out.println("false");
		}
		
	}
	
//	4. 传入"小月",显示一年所有小月, 传入"大月",显示一年所有大月, 传入"平月",显示一年中的平月(有参无返)
	public void YueFen(String maxYue,String minYue,String pingYue) {
		System.out.print("输入大小月和平月：");
			String yue = ning.next();
		if (yue.equals(minYue)) {
			System.out.println("4\t6\t9\t11\t");
		} else if (yue.equals(maxYue)) {
			System.out.println("1\t3\t5\t7\t8\t10\t12\t");
		} else if (yue.equals(pingYue)) {
			System.out.println("2");
		} else {
			System.out.println("输入正确值");
		}
		
	}
	
//	5. 传入一个月份, 根据月份返回("大月","小月"或者"平月")(有参有返)
	public int YueFen(int yuefen) {
		if (yuefen==4||yuefen==6||yuefen==9||yuefen==11) {
			System.out.println("小月");
		} else if (yuefen==1||yuefen==3||yuefen==5||yuefen==7||yuefen==8||yuefen==10||yuefen==12) {
			System.out.println("大月");
		} else if (yuefen==2) {
			System.out.println("平月");
		} else {
			System.out.println("输入正确值");
		}
		return yuefen;
	}
	
//	6. 传入一个出生年份year, 返回该成年的年份是多少(有参有返)
	public int ChengNian(int chuSheng) {
		int chengNian = chuSheng+18;
		System.out.println("你将于"+chengNian+"成年。");
		return chengNian;
	}
	
//	7. 传入一个月份, 返回该月份的总天数(有参有返)
	public int TianShu(int A) {
		switch(A) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28");
			break;
		}
		return A;
	}
	
//	8. 传入一个年份, 返回该年份的总天数(有参有返)
	public int NianFen(int sumDay) {
		if (sumDay%4 == 0 && sumDay%100 != 0 || sumDay%400 == 0) {
			System.out.println("366");
		} else {
			System.out.println("365");
		}
		return sumDay;
	}
	
}
