/**
 * 
 */
package keHou08_09_14;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*4. ����һ���������뵽���� n �У�
		 * �������������� 0��
		 * ��ô���� 1+2+3+����+n �Ľ����
		 * ���������  0 ����������д���
		 */
		System.out.println("������һ������");
		int A = sc.nextInt();
		if(A>0) {
		int B = 1;
		int C = 0;
			while(B<=A) {
			C+=B;
			B++;	
			}
				System.out.println(C);	
		}else {
				System.out.println("��������");
		}
			
		
	}

}
