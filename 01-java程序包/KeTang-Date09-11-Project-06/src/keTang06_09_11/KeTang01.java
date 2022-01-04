/**
 * 
 */
package keTang06_09_11;
import java.util.Scanner;//导包
/**
 * @author EDZ
 *
 */
public class KeTang01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//系统输入
		// TODO 自动生成的方法存根
		/*使用 switch 选择结构实现从登录菜单切换到主菜单功能：
		 * 输入数字 
		 * 1：进入主菜单输入数字 
		 * 2：退出并显示“谢谢您的使用”
		 * 输入其它数字，显示“输入错误
		 */
			System.out.println("欢迎使用本系统");
			System.out.println("按1：登录系统");
			System.out.println("按2：退出登录");
			System.out.println("请输入：");
	int A = ning.nextInt();
		switch (A) {
		case 1:
			//显示界面，主菜单。
			System.out.println("\t\t欢迎登录本系统");
			System.out.println("****************************************");
			System.out.println("\t\t客户个人信息管理");
			System.out.println("\t\t1.购物情况");
			System.out.println("\t\t2.回馈福利");
			System.out.println("****************************************");
			System.out.println("请输入数字");
		break;
		case 2:
			System.out.println("谢谢使用！");
		break;
		default:
			System.out.println("请输入正确的数字：1、2");
		break;	
			
			
			
			
			
			
			
		}
	 	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
