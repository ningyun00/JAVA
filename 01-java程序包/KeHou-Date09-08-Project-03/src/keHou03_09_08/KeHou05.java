/**
 * 
 */
package keHou03_09_08;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·��۸�");
			int A =sc.nextInt();
		System.out.println("�����˼���:");
			int B =sc.nextInt();
		System.out.println("������ñ�Ӹ���");
			int C =sc.nextInt();
		System.out.println("�����˼���");
			int D =sc.nextInt();
		System.out.println("֧��Ǯ����Ǯ");
			int E =sc.nextInt();
		System.out.println(E-(D*C)+(B*A));	
	}

}
