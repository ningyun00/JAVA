/**
 * 
 */
package keTang05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner NING = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*4. ���� 3 �����֣�
		 * Ȼ��Ӵ�С�������������
		 * ����: 
		 * �ֱ����� 4, 6, 3,
		 * ���6 4 3. 
		 */
		System.out.print("������������");
		System.out.println("��һ����Ϊ");
	int A = NING.nextInt();
		System.out.println("�ڶ�������Ϊ");
	int B = NING.nextInt();
		System.out.println("��������Ϊ");
	int C = NING.nextInt();
	if(A > B && A > C) {
		if(B > C) {
			System.out.println(A+""+B+""+C);
	}else {
		    System.out.println(A+""+C+""+B);
			}
	}
	if(B > C && B > A) {
		if(C > A) {
			System.out.println(B+""+C+""+A);
	}else if(A > C) {
		    System.out.println(B+""+A+""+C);
			}		
	}	
	if(C > A && C > B) {
		if(A > B) {
			System.out.println(C+""+A+""+B);
	}else if(B > A) {
			System.out.println(C+""+B+""+A);
			}
	}	
		
		
		
		
		
		
		
		
	}

}
