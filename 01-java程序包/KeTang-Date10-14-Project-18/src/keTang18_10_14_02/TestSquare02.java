package keTang18_10_14_02;
//测试类
public class TestSquare02 {
	//主方法
	public static void main(String[] args) {
		//创建对象
		Square02 squ = new Square02();
		//1.
		squ.move();
		//2.
		squ.BiangXing();
		//3.
		squ.FanFa();
		
		//4.
		System.out.println("长为："+squ.Chang());
		//5.
		System.out.println("宽为："+squ.Kuang());
		//6.
		System.out.println("周长为："+squ.ZouChang());
		//7.
		System.out.println("面积为："+squ.MianJi());
	}

}
