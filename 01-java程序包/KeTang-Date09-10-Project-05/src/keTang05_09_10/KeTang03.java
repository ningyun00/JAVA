/**
 * 
 */
package keTang05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*3.����������Ա�
		 * ���������ڵ��� 7 
		 * ����������ڵ���5 
		 * �����Ա����У�
		 * ������ܰᶯ���ӣ�
		 * ����������ܰᶯ���ӡ�
		 */
			System.out.println("�������������");
		int A = sc.nextInt();
			System.out.print("����������Ա�");
		String B = sc.next();
		if(A>=7||A>=5 & B.equals("��")) {
			System.out.print("�ܰᶯ����");
		}else {
			System.out.print("���ܰᶯ����");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
