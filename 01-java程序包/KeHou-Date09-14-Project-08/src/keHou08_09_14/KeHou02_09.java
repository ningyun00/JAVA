/**
 * 
 */
package keHou08_09_14;

/**
 * @author EDZ
 *
 */
public class KeHou02_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*2. 输出 100-999 之间的水仙花数
		 *  153，370，371，407
		 *  水仙花数: 1*1*1+5*5*5+3*3*3 = 15*/
		//1.初始化变量值
				int  n=100;
				//2.循环的判断条件
				while(n<999) {
					int A=n%10;
					int B=n/10%10;
					int C=n/10/10%10;
					/*条件个十百的立方和相加==n*/
					if((A*A*A)+(B*B*B)+(C*C*C)==n) {
						//3.输出循环体语句
						System.out.println(n);
					}
					//4.控制循环语句
					n++;
				}
			
		
	}

}
