/**
 * 
 */
package keTang05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*8. ����һ�����,�жϸ�����Ƿ�Ϊ����,
		 * 	����������"�����Ϊ����",
		 * 	�������"�����Ϊƽ��" 
		 * 	����Ĺ���: 
		 * 	�ܱ� 4 �������ǲ��ܱ� 100 �������ܱ� 400 ��
		 */
			System.out.print("����һ�����");
	int A = ning.nextInt();
	    if(A%4==0&&A%100!=0||A%400==0) {
	    	System.out.println("�����Ϊ����");		
	    }else {
	    	System.out.print("�����Ϊƽ��");
	    }
	
		
		
		
		
		
		
		
		
		
	}

}
