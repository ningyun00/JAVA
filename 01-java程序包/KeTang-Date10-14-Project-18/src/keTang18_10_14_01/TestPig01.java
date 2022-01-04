package keTang18_10_14_01;
//测试类
public class TestPig01 {
	//主方法
	public static void main(String[] args) {
		//创建一个对象
		Pig01 pig =  new Pig01();
		//无返回的
		pig.varitise = "农村";
		pig.color = "黑色";
		//输出
		pig.Getpig();
		
		pig.attack = 100;
		//输出
		pig.Dapig();
		pig.GanfanPig();
		
		//有返回的
		//1.
		System.out.println("此猪为："+pig.PingZhong()+"猪");
		//2.
		System.out.println("该猪为："+pig.Color()+"颜色");
	}
	
}
