/**
 * 
 */
package keTang06_09_11;
import java.util.Scanner;//����
/**
 * @author EDZ
 *
 */
public class KeTang03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//ϵͳ¼��
		// TODO �Զ����ɵķ������
		/*��ϰ 3��
		 * ���ݳɼ�����Ʒ������С������ѧ�ɼ�
		 * 1. ���ɼ�=100,����һ̨ iPad
		 * 2. 90<=�ɼ�<100������һ˫��Ь
		 * 3. 80<=�ɼ�<90,����һ�����г�
		 */
			System.out.println("��������ĳɼ�");
		int A = ning.nextInt();
		if (A==100) {
			System.out.print("����һ̨ iPad");
		}else if(A>=90&&A<100) {
			System.out.print("����һ˫��Ь");
		}else if(A>=80&&A<90) {
			System.out.println("����һ�����г�");
		}else {
			System.out.println("��������Ч�ɼ�");
		}
		
		
		
		
		
		
		
	}

}
