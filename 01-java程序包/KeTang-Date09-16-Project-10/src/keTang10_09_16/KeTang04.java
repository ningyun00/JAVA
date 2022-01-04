/**
 * 
 */
package keTang10_09_16;

/**
 * @author EDZ
 *
 */
public class KeTang04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*4. 一个冰激凌需要2块钱, 一个鸡腿需要3块钱, 身上有100块钱要全部用完, 
怎样买可以刚好把100块钱用完, 输出购买的组合


*/
		int A =2/*冰淇淋单价*/,B = 3/*鸡腿单价*/,C =0/*冰淇淋个数*/,D = 0/*鸡腿个数*/;//定义
		for (int i =A+B;i<=100;i+=A+B) {//冰淇淋+鸡腿钱=100
			C++;D++;//累加
		}
		System.out.println("买"+C+"个冰淇淋和"+D+"个鸡腿花完100快");//输出
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
