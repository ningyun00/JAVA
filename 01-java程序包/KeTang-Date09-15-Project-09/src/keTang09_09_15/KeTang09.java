/**
 * 
 */
package keTang09_09_15;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*9. ����forѭ��¼��ĳѧ��5�ſεĳɼ�������ƽ���֣�
		 * ���ĳ����¼��ʱΪ��������ֹͣ¼�벢��ʾ¼�����
		 * */	
		Scanner ning = new Scanner(System.in);
				double C =0, E = 0;
				System.out.println("�����"+1+"�ųɼ�");
			 int A = ning.nextInt();
			 int D = A;
		for (int B = 2;B<=5;B++) {
			if (A>=0&&A<100) {
				System.out.println("��"+B+"��");
				 A = ning.nextInt();	
			C=C+A;
			}else {
				System.out.println("�������");
				break;
			}
		}			
		E=C+D;
		System.out.println(E/5);
		
		
		
		
		
		
		
		
		
	}

}
