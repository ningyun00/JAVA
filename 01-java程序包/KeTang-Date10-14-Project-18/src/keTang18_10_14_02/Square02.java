package keTang18_10_14_02;

public class Square02 {
	/**2、写一个长方形的类，类中的属性：长方形的长，宽。类
	中有方法：
	（一）移动的方法，没有返回值，要求输出“长方形在移动”。
	（二）变化的方法，没有返回值，要求输出“长方形正在变化”。
	（三）显示此长方形 信息 的方法。
	（四）得到长方形的长的方法，返回长。
	（五）得到长方形宽的方法，返回宽。
	（六）得到长方形周长的方法。返回此长方形的周长。
	（七）得到长方形的面积的方法，返回此长方形面积。*/
	//属性
	int Long = 100;//长
	int Wide = 24;//宽
	//一。无返回
	public void move() {
		System.out.println("长方形正在移动");
	}
	
	//二。无返回的
	public void BiangXing() {
		System.out.println("长方形正在变化");
	}
	
	//三。方法
	public void FanFa() {
		System.out.println("长："+Long
						  +"\n宽："+Wide);
	}
	
	//四。有返回的
	public int Chang() {
		return Long; 
	}
	
	//五。有返回的
	public int Kuang() {
		return Wide;
	}
	
	//六。
	public int ZouChang() {
		return (Long+Wide)*2;
	}
	//七。
	public int MianJi() {
		return (Long*Wide);
	}
	
}
