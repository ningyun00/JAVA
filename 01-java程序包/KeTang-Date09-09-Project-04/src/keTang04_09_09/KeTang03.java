/**
 * 
 */
package keTang04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeTang03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		/*3. ��������С�����������ǵĺͣ�����ʹ���100����������������������ֵĺͣ�
		 * 	 �����С�ڵ���100���������������С�����ֵĺ�
		 *	(��ʾ: 
   		 *		�õ��������֣� �磺int a=(int)10.5;      -- ���ֵΪ10
   		 *		�õ�С�����֣� �磺double b=10.5%1       -- ���ֵΪ0.5
   		 */
		 	System.out.println("����������С��");
		double A =sc.nextDouble();
		double B =sc.nextDouble();		
		double H ;
		int G ;
		if ((int) (A+B)>=100 ) {
			G = (int)(A+B);
		    System.out.println("�õ��������֣�" +G);		 	
		    }else {
		double C = A%1,E = B%1;
			H = C+ E;
			System.out.println("�õ�С�����֣�" +H);
		}

	}

}
