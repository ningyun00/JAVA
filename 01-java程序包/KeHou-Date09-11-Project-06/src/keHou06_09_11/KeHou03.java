/**
 * 
 */
package keHou06_09_11;
import java.util.Scanner;//����
/**
 * @author EDZ
 *
 */
public class KeHou03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//ϵͳ¼��
		// TODO �Զ����ɵķ������
		/*ʹ�� switch ģ��ʵ��һ���˵�ѡ����
		 */
			System.out.println("ѧ������б�");
			System.out.println("1.����");
			System.out.println("2.��ѧ");
			System.out.println("3.Ӣ��");
			System.out.println("��������Ҫѡ������֣�");
	int A = ning.nextInt();
		switch (A) {
		case 1:
			System.out.println("��ѡ��������");
			break;
		case 2:
			System.out.println("��ѡ������ѧ");
			break;
		case 3:
			System.out.println("��ѡ����Ӣ��");
			break;
		default:
			System.out.println("�����������������˶�");
			break;
		}
		
		

	}

}
