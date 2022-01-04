package keHou18_10_14_02;
//测试类
public class TestPalnter02 {
	//主方法
	public static void main(String[] args) {
		//新建对象
		Palnter02 pal = new Palnter02();
		//1.
		pal.jeiShao();
		//2.
		pal.daYin();
		//3.
		pal.zhiJiao();
		//4.
		pal.sanJiaoXing();
		//1.
		System.out.println("画家的姓名是："+pal.Name());
		//2.
		System.out.println("画家的国籍是："+pal.Nationality());
		//3.
		System.out.println("画家的性别是："+pal.Sex());
		//4.
		System.out.println("画家请客中："+pal.money());
		//5.
		System.out.println("画家孝敬老人："+pal.xiaoJing());
	}

}
