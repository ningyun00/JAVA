package keTang18_10_14_01;
//类
public class Pig01 {
	/**1、写一个猪类，类中的属性：品种，颜色，攻击力。类中
	有方法：
	
	无返回值的方法：
	（一）猪走路的方法，没有返回值，要求输出格式为“某某品种的某某颜色的猪走来走去”。
	（二）猪打人的方法，没有返回值，要求输出格式为“某某品种的某某颜色的猪打人了，攻
	击力为多少”。
	(三）猪吃饭的方法，没有返回值，要求输出格式为“某某品种的某某颜色的猪吃得真多”。
	
	有返回值的方法：
	（一）得到此猪品种的方法，返回此猪的品种。
	（二）得到此猪颜色的方法，返回此猪的颜色。
	*/
	
	//无返回的
	String varitise;//品种
	String color;//颜色
	int attack;//攻击力
	//1.
	public void Getpig() {
		System.out.println(varitise+"品牌的"+color+"颜色的猪走来走去");
	}//2.
	public void Dapig() {
		System.out.println(varitise+"品牌的"+color+"颜色的猪打了人，攻击力为："+attack);
	}//3.
	public void GanfanPig() {
		System.out.println(varitise+"品牌的"+color+"颜色的猪吃的真多");
	}
	
	//有返回的
	//1.
	public String PingZhong() {
		//方法一
		String	varitise = "农村";
			return varitise;//返回
	}
	//2.	
	public String Color() {
		//方法二
		return "黑色";
	}
	
}
