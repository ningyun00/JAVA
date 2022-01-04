/**
 * 
 */
package keHou07_09_13;
import java.util.Random;
/**
 * @author EDZ
 *
 */
public class KeHou06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		int A = rd.nextInt(100)+0;
		// TODO 自动生成的方法存根
		/*6. 随机产生 0-80 的数字,
		 * 来描述其年龄阶段:
		 * 1. 10 岁以前 - 童年
		   2. 10-18 岁 - 少年
		   3. 19-29 岁 - 青年
		   4. 30-59 岁 - 中年
		   5. 60 岁以上 - 老年
		  */
		
		if (A>=0&&A<10) {
			System.out.println("童年");
		}
			else if(A>10&&A<=18) {
			System.out.println("少年");
		}
			else if(A>=19&&A<=29) {
			System.out.println("青年");
		}	
			else if(A>=30&&A<=59) {
			System.out.println("中年");
		}
		else if(A>=60) {
			System.out.println("老年");
			}
		
	}
}


