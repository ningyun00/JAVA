/**
 * 
 */
package keHou08_09_14;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*3. ����ѯ�ʶԷ���������,���������������з�����,
		 * ���˵�о�ѭ��˵ 100 ����ϲ����, 
		 * �������������˵�ݰ�,
		 * ���û�з��Ӿ�˵�����˷�������ϵ
		 */
		
			System.out.println("�����к�����");
				String A =sc.next();
		if(A.equals("��")) {
			System.out.println("���з�����");
				String B = sc.next();
		if(B.equals("��")){
			int C = 1;
			while (C<=100) {
			C++;
				System.out.println("��ϲ����");	
			}
				}else {
					System.out.println("�����˷�������ϵ");
				}
			}else {
				System.out.println("�ݰ�");
		}
	}	
}			
			
		
		
		
		
	


