/**
 * 
 */
package keHou04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		/*2. �Ӽ����������java�ɼ�,Ȼ���жϣ�
		 *	 ���java�ɼ�����90�֣�
		 *	 ��ô�����������һ��Mp3��
		 *	 ��������������ܲ��� 
   		 */
		System.out.println("���������java�ɼ�:");
			double A = sc.nextDouble();
		if(A>90) {
				System.out.println("������һ��Mp3");
		}else {
				System.out.println("�����ܲ�");	
		}
		
	}

}
