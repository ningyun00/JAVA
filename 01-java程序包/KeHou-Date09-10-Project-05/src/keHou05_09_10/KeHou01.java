/**
 * 
 */
package keHou05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		/*1. �н���ѯϵͳ,�������н�������,
		 * ����: һ�Ƚ����� 1,
		 *	���Ƚ����� 2!
		 * 	��Ʒ����: 
		 *	һ�Ƚ�: �µ� TT �ܳ�
		 *	���Ƚ�: LV ����Ƥ��
		 *	���Ƚ�: ƻ��һ���
		 *	�ĵȽ�: iPhone6
		 *	���� : û���н�
		 */
		System.out.println("����������н�����:");
	       int A = sc.nextInt();
	    if(A == 1){
	    	System.out.println("��ϲ������һ�Ƚ�:�µ� TT �ܳ�");
	    } else if(A == 2) {
	    	System.out.println("��ϲ�����˶��Ƚ�:LV ����Ƥ��");
	    } else if(A == 3) {
	    	System.out.println("��ϲ���������Ƚ�:ƻ��һ���");
	    } else if(A == 4) {
	    	System.out.println("��ϲ�������ĵȽ�: iPhone6");
	    } else {
	    	System.out.println("��ϲ����û���н�");
	    }
		
	}

}
