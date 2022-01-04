/**
 * 
 */
package keHou05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		/*1. 中奖查询系统,输入你中奖的数字,
		 * 例如: 一等奖输入 1,
		 *	二等奖输入 2!
		 * 	奖品如下: 
		 *	一等奖: 奥迪 TT 跑车
		 *	二等奖: LV 鳄鱼皮包
		 *	三等奖: 苹果一体机
		 *	四等奖: iPhone6
		 *	其他 : 没有中奖
		 */
		System.out.println("请输入你的中奖号码:");
	       int A = sc.nextInt();
	    if(A == 1){
	    	System.out.println("恭喜你中了一等奖:奥迪 TT 跑车");
	    } else if(A == 2) {
	    	System.out.println("恭喜你中了二等奖:LV 鳄鱼皮包");
	    } else if(A == 3) {
	    	System.out.println("恭喜你中了三等奖:苹果一体机");
	    } else if(A == 4) {
	    	System.out.println("恭喜你中了四等奖: iPhone6");
	    } else {
	    	System.out.println("恭喜你中没有中奖");
	    }
		
	}

}
