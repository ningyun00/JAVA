/**
 * 
 */
package keHou09_09_15;

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
		/*5.一球从100米高度自由落下，
		 * 每次落地后反跳回原高度的一半；
		 * 再落下，求它在第10次落地时，
		 * 共经过多少米？第10次反弹多高？
		 * (用程序实现) 
		 */	
		double A = 100;
		double C = 0;
		double B = 100;
		
		for(int i = 1;i <= 10;i++) {
			if(i != 1) {
				C = (A/2);
				A = C;
				B += (A*2);
				
			}
			System.out.println("第"+i+"次"+"反弹高度为："+B+"米");
		}

	}

}
