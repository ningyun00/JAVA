/**
 * 
 */
package keHou09_09_15;
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
		// TODO �Զ����ɵķ������
		/*4.ѭ������10��������ͳ����10���������ж��ٸ�ż����*/
		Scanner ning = new Scanner(System.in);
		int B = 0;
		for (int A =1;A<=10;A++) {
			System.out.println("�������"+A+"������");
			int  C = ning.nextInt();
			if (C%2==0) {
				B++;
			}else {
			System.out.println(C+"����ż��");
				continue;
			}
			
		}
			System.out.println("һ����"+B+"��ż��");
		
	}

}
