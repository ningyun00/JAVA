/**
 * 
 */
package keTang09_09_15;

/**
 * @author EDZ
 *
 */
public class KeTang03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*3. 使用for循环，输出1到100之间的既能被3整除又能被4整除的数。
		 * (用两种方式写条件 使用continue 和 不使用continue)
		 */
		/*for(int A = 1;A <= 100;A++) {
			if(A%3 == 0 && A%4 == 0) {
				System.out.println(A);//不用
			}
			
		}*/
		
		for(int B = 1;B <= 100;B++) {
			if(B%3 != 0 || B%4 != 0) {
				continue;
			}
			System.out.println(B);//用
		}
		
		
		
		
		
	}

}
