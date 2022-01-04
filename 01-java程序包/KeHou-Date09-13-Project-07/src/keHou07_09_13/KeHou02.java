/**
 * 
 */
package keHou07_09_13;
import java.util.Random;
/**
 * @author EDZ
 *
 */
public class KeHou02 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*2. 随机产生 A - Z 之间
		 * 任意一个字母, 
		 * 利用 int 和 char 之间
		 * 数据类型转换来
		 */
		Random rd = new Random();
			int A = rd.nextInt(26)+65;
				char B =(char)A;
				System.out.println(B);
	
	}
	
	
}
	
	
	
	

