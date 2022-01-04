/**
 * 
 */
package keHou09_09_15;

/**
 * @author EDZ
 *
 */
public class KeHou07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*7.计算2000年的1月1到
		 * 2008年的1月1日之间相隔有多少天。
		 * （提示：平年有365天，润年有366天，
		 * 循环从2000年到2008年结束）
		 * */
		int B = 366,C = 365;
		int D = 0,E = 0;
		for(int A = 1;A <9;A++) {
			if(A%4==0&&A%100!=0||A%400==0) {
						D++;					//闰年
			}else {
						E++;				//平年
					}
			}
		System.out.println("总共"+((B*D)+(C*E)));
	}

}
