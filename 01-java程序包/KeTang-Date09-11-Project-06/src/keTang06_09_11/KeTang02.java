/**
 * 
 */
package keTang06_09_11;
import java.util.Scanner;//����
/**
 * @author EDZ
 *
 */
public class KeTang02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//ϵͳ¼��
		// TODO �Զ����ɵķ������
		/*����˵���� 
		 * ���������� 50���� 2 Ԫ���������¿������� 1 ƿ
		 * ���������� 100���� 3 Ԫ������ 500ml ���� 1 ƿ
		 * ���������� 100���� 10 Ԫ������ 5 �������
		 * ���������� 200���� 10 Ԫ�������ղ������˹� 1 ������
		 * ������ 200���� 20 Ԫ������ŷ����ˬ��ˮ 1 ƿ
		 */
			System.out.println("������������ѽ��");
	int B = ning.nextInt();//���
			System.out.println("�Ƿ�μӱ��λ");
			System.out.println("1.���������� 50���� 2 Ԫ���������¿������� 1 ƿ\n2.���������� 100���� 3 Ԫ������ 500ml ���� 1 ƿ\n3.���������� 100���� 10 Ԫ������ 5 �������\n4.���������� 200���� 10 Ԫ�������ղ������˹� 1 ��\n5.���� ������ 200���� 20 Ԫ������ŷ����ˬ��ˮ 1 ƿ\n0.������");			
			System.out.println("�������֣�");
	int A = ning.nextInt();
	switch (A) {
		case 1:
			System.out.print("�� 2 Ԫ���������¿������� 1 ƿ");
			System.out.println(B=B+2);
				break;
		case 2:
			System.out.print("�� 3 Ԫ������ 500ml ���� 1 ƿ");
			System.out.println(B=B+3);
				break;
		case 3:
			System.out.print("�� 10 Ԫ������ 5 �������");
			System.out.println(B=B+10);
				break;
		case 4:	
				System.out.println("�� 10 Ԫ�������ղ������˹� 1 ��");
				System.out.println(B=B+10);
				break;
		case 5:	
			System.out.println("�� 20 Ԫ������ŷ����ˬ��ˮ 1 ƿ");
			System.out.println(B=B+20);	
				break;
		case 0:
			System.out.println("������");
		default:
			System.out.println("��������ȷ�����֣�1/2/3/4/5/0");
	
			}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
