package keTang18_10_14_04;

public class Car04 {
	/**4、写一个汽车的类，类中有属性：品牌，价格，颜色。类
	中有方法：
	（一）显示当前汽车对象的所有属性的方法 toString。
	（二）汽车启动的方法，要求输出“XX 品牌的汽车启动了”。
	（三）汽车加速的方法，要求输出“XX 品牌的汽车加速中”。
	（四）汽车被卖的方法，要求输出“XX 品牌的汽车被以 XX 元的价格卖了*/
	//属性
	String brand = "法拉";
	int money = 123456789;
	String color = "渐变黄至渐变红";
	
	//一。
	public void showstring() {
		System.out.println("品牌为："+brand
						  +"\n价格为："+money
						  +"\n颜色为："+color);
	}
	
	//二。
	public void qidong(){
		System.out.println(brand+"品牌的汽车启动了");	
	}
	
	//三。
	public void jiaSu(){
		System.out.println(brand+"品牌的汽车加速中");	
	}
	
	//四。
	public void chuShou(){
		System.out.println(brand+"品牌的汽车以"+money+"的价格出售了。");	
	}
			
}
