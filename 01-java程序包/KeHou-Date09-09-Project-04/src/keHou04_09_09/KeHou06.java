/**
 * 
 */
package keHou04_09_09;
/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*6. 输入两个整数，放入到I与J变量中去，
		 *   如果I>=J就将I与J中的值进行交换，
		 *   否则就不交换。
	     */		    
		System.out.println("请输入两个整数");
		System.out.println("第一个数");
			int I = sc.nextInt();
	  	System.out.println("第二个数");
		    int J = sc.nextInt();
		    int K;		    
	    if(I>=J) {
	    	K = I;
		    I = J;
		    J = K;	
    	System.out.println("I="+I+"J="+J);		    	
	    }else {
    	System.out.println(I+"--"+J);	
	    }
	    
	}

}
