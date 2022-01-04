/**
 * 
 */
package keTang08_09_14;

/**
 * @author EDZ
 *
 */
public class KeTang05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*5. 2010 年培养员工 8 万人，
		 * 每年增长 25%，请问按此增长度，
		 * 到哪一年培训的员工人数将达到 20 万人
		 * */
		double A = 8*1.25;//
		int B = 1;//年
		int C = 0;
		 while (A<=20) {
			 A=A*1.25;
			 B++;
			 C=2010+B;
		 }System.out.println("在"+C+"将达到20万人");
		 
		
		
		
		
		
		
	}

}
