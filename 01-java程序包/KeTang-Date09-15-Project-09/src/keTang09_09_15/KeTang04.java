/**
 * 
 */
package keTang09_09_15;
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
		Scanner ning = new Scanner(System.in);
		
		// TODO �Զ����ɵķ������
		/*4. (ʹ��do..whileд)
		 * �и��к���ÿ������ǵ�Ů�����ʡ���ϲ�����𣿡�
		 *  �����Ů����˵����ϲ�����ͼ����ʡ���ϲ�����𣿡�,
		 *  ֱ����Ů����˵��ϲ����Ϊֹ���к��ӾͲ����ˡ�
		 */
		System.out.println("��ϲ������");
		String A = ning.next();
		do {
			System.out.println("��ϲ������");
			A =ning.next();
			A.equals("ϲ��");
			break;
		} while (A.equals("��ϲ��"));
		
	}

}
