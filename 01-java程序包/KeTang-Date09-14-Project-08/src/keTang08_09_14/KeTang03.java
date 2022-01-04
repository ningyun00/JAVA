/**
 * 
 */
package keTang08_09_14;

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
		/*3. 求出 1/1 + 1/2 + 1/3 + ... + 1/100 = ? 
		 * (参考上课例子: 1 + 2 + 3 + ... + 100 = ?)
		 * */
		double A=1;
		double B = 0;
		do {
			B+=1/A;
			A++;
		} while (A<100);
		System.out.println(B);
	
	

	}

}
