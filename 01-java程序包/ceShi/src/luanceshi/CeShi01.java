/**
 * 
 */
package luanceshi;
import java.util.Random;//�����
import java.util.Scanner;//ɨ����
/**
 * @author EDZ
 *
 */
public class CeShi01 {

	/**
	 * @param args
	 */
	int C;
	public static void main(String[] args) {
		Random yun = new Random();//���������
		Scanner ning = new Scanner(System.in);//ϵͳ¼��
		// TODO �Զ����ɵķ������
		int A =yun.nextInt(3)+1;
			System.out.print("���ȭ��1����ʯͷ��2���������3������");
		int B =ning.nextInt();
			switch (B) {
			case 1:
				System.out.println("�������ʯͷ");
				break;
			case 2:
				System.out.println("������Ǽ���");
				break;
			case 3:
				System.out.println("������ǲ�");
				break;	
			default:
				System.out.println("�������");
			}	
			System.out.println("���Գ�ȭ");
			switch (A) {
			case 1:
				System.out.println("���Գ�����ʯͷ");
				break;
			case 2:
				System.out.println("���Ե��Ǽ���");
				break;
			case 3:
				System.out.println("���Գ����ǲ�");
				break;		
			}int C =A-B;
			switch (C) {
			case -1:
			case 2:
				System.out.println("��Ӯ��");
				break;
			case 0:
				System.out.println("ƽ��");
				break;
			case 1:
			case -2:
				System.out.println("������");
				break;
			
			}
	}

}
