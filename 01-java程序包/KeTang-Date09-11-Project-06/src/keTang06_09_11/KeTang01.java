/**
 * 
 */
package keTang06_09_11;
import java.util.Scanner;//����
/**
 * @author EDZ
 *
 */
public class KeTang01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//ϵͳ����
		// TODO �Զ����ɵķ������
		/*ʹ�� switch ѡ��ṹʵ�ִӵ�¼�˵��л������˵����ܣ�
		 * �������� 
		 * 1���������˵��������� 
		 * 2���˳�����ʾ��лл����ʹ�á�
		 * �����������֣���ʾ���������
		 */
			System.out.println("��ӭʹ�ñ�ϵͳ");
			System.out.println("��1����¼ϵͳ");
			System.out.println("��2���˳���¼");
			System.out.println("�����룺");
	int A = ning.nextInt();
		switch (A) {
		case 1:
			//��ʾ���棬���˵���
			System.out.println("\t\t��ӭ��¼��ϵͳ");
			System.out.println("****************************************");
			System.out.println("\t\t�ͻ�������Ϣ����");
			System.out.println("\t\t1.�������");
			System.out.println("\t\t2.��������");
			System.out.println("****************************************");
			System.out.println("����������");
		break;
		case 2:
			System.out.println("ллʹ�ã�");
		break;
		default:
			System.out.println("��������ȷ�����֣�1��2");
		break;	
			
			
			
			
			
			
			
		}
	 	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
