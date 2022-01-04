package keTang19_10_15_03;
//导包
import java.util.Scanner;
/**
 * 测试类
 * @author 寜
 */
public class TestMather03 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		Mather03 mat = new Mather03();
		
		
	//1.
		System.out.println("最大值是："+mat.Max(0));
		
	//2.
		System.out.println("最小值为："+mat.Min(0));
	
	 
	//3.
		/**
		 * 下面两句写在测试类的原因：
		 * mat.n1在类里无法调用；要是写在类里面n1值为0;
		 * 写在测试类两边都可以调用
		 */
		System.out.print("输入一个整数：");
			mat.n1 = ning.nextInt();	
		System.out.println("从1加至"+mat.n1+"的值为："+mat.N(0));
	 
		
	//4.
		System.out.print("输入一个数：");
			int zhiShu = ning.nextInt();
		mat.IntN(zhiShu);
	
		
	//5.
		mat.yers(0);
		
		
	//6.
		System.out.print("输入分钟：");
			int min = ning.nextInt();
		mat.Time(min);
	
		
	//7.
		System.out.println("输入一个数字：");
		mat.NumN(ning.nextInt());
	
		
	//8.
		System.out.println("输入每次挑水多少：");
		mat.Whiter(ning.nextInt());
		
		
	}

}
