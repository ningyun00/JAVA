/**
 * 
 */
package keHou05_09_10;
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
		Scanner ning = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*4. 美女问你 3 个问题:
		 * 1. 你是男人吗? 回答"是/不是" 
		 * 2. 你有房子吗? 回答"有/没有" 
		 * 3. 你有多少万元存款? 回答数字,
		 * 例如输入: 500 (则是 500 万)
		 * 如果你是男的并且有房子
		 * 或者你的存款有 500 万以上
		 * 不管是男是女, 
		 * 该美女都说嫁给你, 
		 * 不然都说请走开
		 */
		System.out.print("你是男人吗?回答是/不是");
			String A = ning.next();
		System.out.println("你有房子吗?回答有/没有");
			String B = ning.next();
		System.out.println("你有多少万元存款?回答数字");
			int C = ning.nextInt();
		if (!(A.equals("男") && A.equals("有"))) {
			System.out.println("嫁给你");
		} else if (C > 50) {
			System.out.println("我要嫁给你");
		} else {
			System.out.println("死远点");
		}
		
	}

}
