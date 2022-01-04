package keHou19_10_15_01;
/** 
 * @author EDZ
 */
import java.util.Scanner;
/**
 * 导包
 * 欢迎类
 */
public class Welcome01 {
	/**
	 * 方法
	 */
	public void SayHello() {	
		Scanner input = new Scanner(System.in);
		System.out.print("你叫什么？");
			String name = input.next();
		System.out.println(name + ", 你好！");
		System.out.println("-----------------------------------");
		System.out.println("********欢迎进入游戏********");
		System.out.println("\t开始游戏");
		System.out.println("***************************");
	}
	
}
