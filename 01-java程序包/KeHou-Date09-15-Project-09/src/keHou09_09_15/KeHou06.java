/**
 * 
 */
package keHou09_09_15;

/**
 * @author EDZ
 *
 */
public class KeHou06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*6.输出10000-99999里面的所有回文数。
		 * 说明：
		 * 即12321是回文数，
		 * 个位与万位相同，
		 * 十位与千位相同。
		 */
		
		for(int A=10000;A<=99999;A++) {
			int B = A/10000;
			int C = A/1000%10;
			int D = A/10/10%10;
			int E = A/10%10;
			int F = A%10;
			if (B==F &&C==E) {
				System.out.println(A);
			}
			
			
			
			
			
			
			
			
			
		}
	}

}
