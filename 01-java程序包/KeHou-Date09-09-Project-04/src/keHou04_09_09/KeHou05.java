/**
 * 
 */
package keHou04_09_09;
/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		/*5. �����������ֱַ�����������, 
		 *   Ҫ����ԱȽϴ���������
		 */
			double max;
		System.out.println("��������������");
   		System.out.println("��һ����Ϊ");				
   			double G = sc.nextDouble();
   		System.out.println("�ڶ�����Ϊ");
		   double H = sc.nextDouble();
		if(G<H) {
		    max = H;
	    System.out.println("�ϴ����"+H);
		}else {
		    max = G;
		System.out.println("�ϴ����"+G);	
		}
		
	}

}
