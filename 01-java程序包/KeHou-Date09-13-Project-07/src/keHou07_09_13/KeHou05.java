/**
 * 
 */
package keHou07_09_13;

/**
 * @author EDZ
 *
 */
public class KeHou05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*5. 和尚挑水喝，缸子可以装 50 升水 
		 * 现在已经有 15 升水，
		 * 和尚挑水每次挑 5 升，
		 * 问：几次可以把水缸装满,
		 * 不能用(50-15)/5
		 */
		int A = 20;
		int B = 0;
		while(A<=50) {
			A+=5;
			B++;
			System.out.println(B);
		}	
	
	}

}
