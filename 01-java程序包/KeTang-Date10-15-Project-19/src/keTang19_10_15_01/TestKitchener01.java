package keTang19_10_15_01;
/**
 * @author 寜
 */
import java.util.Scanner;

//测试类
public class TestKitchener01 {
	//主方法
	public static void main(String[] args) {
		//新建对象
		Kitchener01 kit = new Kitchener01();
		Scanner ning = new Scanner(System.in);
		
		//1.
		kit.DengJi(2);
		
		//2.
		kit.ChuLing(14);
		
		//3.
		System.out.println("厨师制作了一些"+kit.ZengSong()+"赠送给观众");
		
		//4.
		System.out.println("恭喜你："+kit.ChouJiang());
		
		//5.
		System.out.print("输入蔬菜名：");
		kit.ShuCai(ning.next());
		
		//6.
		System.out.print("输入荤菜名：");
		kit.HunCai(ning.next());
		
		//7.
		System.out.println("输入厨龄：");
			int	A = ning.nextInt();
		System.out.println("等级为："+kit.NianLing(A)+"级");
		
		//8.	
		System.out.println("输入荤菜,素菜：");
		kit.HunSu(ning.next(), ning.next());
		
		//9.
		System.out.println("输入几元青菜,几元猪肉,几元牛肉,几元螃蟹");
		kit.MaiCai(ning.nextInt(), ning.nextInt(), ning.nextInt(), ning.nextInt());

	}

}
