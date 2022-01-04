/**
 * 
 */
package keHou09_09_15;

/**
 * @author EDZ
 *
 */
public class KeHou03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//3. 计算1+3+5+7.......+99的和
	 int B = 0;
		for (int A = 1;A<=100;A++) {
			if (A%2!=0) {
				B+=A;
			}
		}
		System.out.println(B);
	}

}
