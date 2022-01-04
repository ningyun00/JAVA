/**
 * 
 */
package keHou05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*7.张三为他的手机设定了自动拨号
		 *	按 1：拨爸爸的号 137-1234-4321
		 *	按 2：拨妈妈的号 151-1111-2222
		 *	按 3：拨爷爷的号 189-0731-1370
		 *	按 4：拨奶奶的号 188-6666-5555
		 */
			System.out.println("请输入快捷拨号数：\n爸爸(1)、妈妈(2)、爷爷(3)、奶奶(4)\n");
				int A = ning.nextInt();
		if(A==1) {
			System.out.print("正在为您呼叫"+"爸爸"+"拨号中.....");
			System.out.print("137-1234-4321");
		}
		if(A==2) {
			System.out.print("正在为您呼叫"+"妈妈"+"拨号中.....");
			System.out.print("151-1111-2222");
		}
		if(A==3) {
			System.out.print("正在为您呼叫"+"爷爷"+"拨号中.....");
			System.out.print("189-0731-1370");
		}
		if(A==4) {
			System.out.print("正在为您呼叫"+"奶奶"+"拨号中.....");
			System.out.print("188-6666-5555");
		}

	}

}
