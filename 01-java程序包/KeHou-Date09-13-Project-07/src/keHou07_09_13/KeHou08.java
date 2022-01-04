/**
 * 
 */
package keHou07_09_13;
import java.util.Random;
/**
 * @author EDZ
 *
 */
public class KeHou08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		int A =rd.nextInt(100); 
		// TODO 自动生成的方法存根
		/*8. 模拟游戏中的暴击率 
		 * (注: 暴击率使得攻击力翻倍)
		 * 假设人物原本攻击力为 88, 
		 * 在攻击目标人物时, 
		 * 有 30%的几率会产生暴击(88 * 2)
		 * 请用程序模拟出这个攻击场景
		 */		
		if (A<=30) {
			System.out.println("产生暴击"+88*2);
		}else {
			System.out.println("未产生暴击"+88);
		}
		
	}

}
