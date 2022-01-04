package keHou17_10_13_03;

public class Car03 {
	/*3. 写一个汽车类 Car:
	类中的属性: 品牌, 颜色, 价格, 车型, 最高时速
	类中的方法:
	1. 展示汽车各种资料的方法: 车子的属性全部显示
	写一个测试类 TestCar:
	生成一台汽车对象 c, 品牌兰博基尼, 颜色黄色, 价格 300 万元, 车型超跑, 最高时速
	337 公里, 最后显示其参*/
	
	//属性
	String brand;//品牌
	String color;//颜色
	int money;//价钱
	String models;//车型
	double MaxPerHour;//最高时速
	//方法
	public void showCar03() {
		//方法体
		System.out.println("品牌："+brand
						  +"\n颜色："+color
						  +"\n价格："+money
						  +"\n车型："+models
						  +"\n最高时速："+MaxPerHour);
	} 
	
}
