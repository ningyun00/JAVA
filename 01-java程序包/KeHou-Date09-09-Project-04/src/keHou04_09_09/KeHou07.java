/**
 * 
 */
package keHou04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*7. ����������������a��b�ڣ�
		 * 	 ���ж�a�Ƿ��ܱ�b������
		 *   �������������
		 *   ���������������		
		 */
			System.out.print("��������������");
			System.out.println("��һ����");
	    		int A1 = sc.nextInt();
	    	System.out.println("�ڶ�����");
	    		int B1 = sc.nextInt();
	    if(A1%B1==0) {
	    	System.out.println("������");
	    }else {
	    	System.out.println("��������");
	    }	
		
	}

}
