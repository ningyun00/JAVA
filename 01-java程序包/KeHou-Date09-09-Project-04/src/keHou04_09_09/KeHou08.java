/**
 * 
 */
package keHou04_09_09;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou08 {

	/**
	 * @param args
	 */	

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*8. ������Ĳ������, ��������20000��������ʾ"����ʧ��! 
		 * 	 ÿ�ղ������ó���20000Ԫ", 
		 * 	 ������ʾ"�����ɹ�! ���Ժ�..."
		 */	
		Scanner sc = new Scanner(System.in);
			System.out.print("��������Ľ�");
				int A = sc.nextInt();
		if(A>20000) {
			System.out.println("����ʧ��!ÿ�ղ������ó���20000Ԫ");
		}else {
			System.out.println("�����ɹ�! ���Ժ�...");
		}
		
	}

}
