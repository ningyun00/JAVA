/**
 * 
 */
package keHou05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*7.����Ϊ�����ֻ��趨���Զ�����
		 *	�� 1�����ְֵĺ� 137-1234-4321
		 *	�� 2��������ĺ� 151-1111-2222
		 *	�� 3����үү�ĺ� 189-0731-1370
		 *	�� 4�������̵ĺ� 188-6666-5555
		 */
			System.out.println("�������ݲ�������\n�ְ�(1)������(2)��үү(3)������(4)\n");
				int A = ning.nextInt();
		if(A==1) {
			System.out.print("����Ϊ������"+"�ְ�"+"������.....");
			System.out.print("137-1234-4321");
		}
		if(A==2) {
			System.out.print("����Ϊ������"+"����"+"������.....");
			System.out.print("151-1111-2222");
		}
		if(A==3) {
			System.out.print("����Ϊ������"+"үү"+"������.....");
			System.out.print("189-0731-1370");
		}
		if(A==4) {
			System.out.print("����Ϊ������"+"����"+"������.....");
			System.out.print("188-6666-5555");
		}

	}

}
