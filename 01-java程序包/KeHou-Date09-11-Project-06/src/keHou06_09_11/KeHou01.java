/**
 * 
 */
package keHou06_09_11;
import java.util.Scanner;//����
/**
 * @author EDZ
 *
 */
public class KeHou01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {//ϵͳ����
		Scanner ning = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*һ��ʹ�� switch �ṹʵ�֣�
		 * ΪС���ƶ�ѧϰ�ƻ���
		 * ��һ������������ѧϰ��̣� 
		 * �ܶ������ġ�����ѧϰӢ�
		 * ������Ϣ��
		 * �������ڼ������ѧϰ����
		 */
		
		System.out.println("���������ڣ�"); 
	int A = ning.nextInt();
		switch (A) {
		case 1,3,5:
			System.out.println("ѧϰ���");
				break;
		case 2,4,6:
			System.out.println("ѧϰӢ��");
				break;
		case 7:	
			System.out.println("��Ϣ");
				break;
		default:
			System.out.println("��������Ч���ڣ����밢��������");
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
