/**
 * 
 */
package keHou08_09_14;
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
		Scanner sc = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*6. ����һ���� n, ���� 20
		 * ��� n ��  100 ֮���ܱ� 3 ������
		 * �����ܱ� 2 ����������*/
		System.out.println("������һ������");
		int A = sc.nextInt();
		while (A<=100) {
			if (A%3==0&&A%2==0) {
			System.out.println(A);
					}
			A++;
		}
		
	}

}
