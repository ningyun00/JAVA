/**
 * 
 */
package keHou04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		/*3. ���������������������ǵĺͣ�
		 *	 ����ʹ���100��
		 *	 ��������������ĳ˻���
		 * 	 ���򣬾����������������
	     */
		System.out.println("����������������");
		System.out.println("��һ��������");
			int B = sc.nextInt();
		System.out.println("�ڶ�������");
			int C = sc.nextInt();
		    int O;
		    int P;
		if(( B + C ) > 100) {
			O = B*C;
		System.out.println(O);	
		}else {
			P =B/C;		
		System.out.println(P);	
		}
		
	}

}
