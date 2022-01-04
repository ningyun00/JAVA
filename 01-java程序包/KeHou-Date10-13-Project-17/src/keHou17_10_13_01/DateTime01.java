package keHou17_10_13_01;

public class DateTime01 {
		/*1. 写一个日期类 DateTime:
		类中的属性: 年, 月, 日, 时, 分, 秒
		类中的方法:
		1. 显示当下日期时间: 输出的格式为 2014-10-23 13:21:14
		写一个测试类 TestDateTime:
		生成一个DateTime对象d, 
		该对象的年为2014, 月为10, 日为23, 时为13, 分21, 秒
		为 1*/
	//属性
	int years;//年
	int month;//月
	int day;//日
	int when;//时
	int points;//分
	int seconds;//秒
	//方法
		public void showDateTime01() {
			//方法体
			System.out.println(years+"-"
							   +month+"-"
							   +day+" "
							   +when+":"
							   +points+":"
							   +seconds);
	}

}
