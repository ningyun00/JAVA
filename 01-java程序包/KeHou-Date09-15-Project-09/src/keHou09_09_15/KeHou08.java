/**
 * 
 */
package keHou09_09_15;

/**
 * @author EDZ
 *
 */
public class KeHou08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*8、计算2008年的1月1日，
		 * 到2008年的9月1日相隔有多少天。
		 * （提示：
		 * 如果是润年的2月就有29天，
		 * 平年的2月有28天
		 * 。1、3、5、7、8、10、12月都有31天，
		 * 4、6、9、11月都有30天
		 * ）*/
		int B = 0, C = 0;
		for (int A = 1;A<=9;A++) {
		if(A%2!=0||(A==8&&A!=9)) {			
		B++;
		}else if (A%2==0&&A!=2||A==9) {
		C++;
		}
		}
		int D = B*31,E = C*30;
		System.out.println((D+E+29-31));
		
	}

}
