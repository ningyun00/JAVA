/**
 * 
 */
package keHou08_09_14;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*3. 首先询问对方是男人吗,如果是则继续问你有房子吗,
		 * 如果说有就循环说 100 遍我喜欢你, 
		 * 如果不是男人则说拜拜,
		 * 如果没有房子就说等有了房子再联系
		 */
		
			System.out.println("你是男孩子吗？");
				String A =sc.next();
		if(A.equals("是")) {
			System.out.println("你有房子吗？");
				String B = sc.next();
		if(B.equals("有")){
			int C = 1;
			while (C<=100) {
			C++;
				System.out.println("我喜欢你");	
			}
				}else {
					System.out.println("等有了房子再联系");
				}
			}else {
				System.out.println("拜拜");
		}
	}	
}			
			
		
		
		
		
	


