package keTang18_10_14_03;
//测试类
public class TestXueSheng03 {
	//主方法
	public static void main(String[] args) {
		//创建对象
		XueSheng03 xus = new XueSheng03();
		//1.无返回的
		xus.in();
		//2.返回的
		System.out.println("学生姓名："+xus.NAME());
		//3.
		System.out.println("Java成绩为："+xus.ChengJi());
		//4.
		System.out.println("所有功课总成绩为："+xus.sum());
		//5.
		System.out.println("平均分为："+xus.avg());
	}

}
