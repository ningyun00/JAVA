/**
 * 
 */
package keHou09_09_15;

/**
 * @author EDZ
 *
 */
public class KeHou10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*10、山上有一口缸可以装50升水,
		 * 现在有15升水.老和尚叫小和尚下山挑水,
		 * 每次可以挑5升.
		 * 问:小和尚要挑几次水才可以把水港挑满?
		 */
		int A = 20;int C = 0;
		for(int i = 0;A<=50;i++) {
			A += 5;
			C = i;
		}
		System.out.println(C);
	}

}
