/**
 * 
 */
package keTang07_09_13;
import java.util.Random;
/**
 * @author EDZ
 *
 */
public class KeTang06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*6. �������һ�ֻ�ɫ���˿���, 
		1 �������, 2 �������,
	 	3,����÷��, 4 ������
		���������һ������ 
		A 2 3 .... 9 10 J Q K
		ע: A J Q K ��Ҫ������
		(1 11 12 13)����
		��������ɫ�͵��������,
		����: �������Ϊ����
		*/
		Random rd1 = new Random();
			int A = rd1.nextInt(4)+1;//��ɫ
		Random rd2 = new Random();
			int B = rd2.nextInt(13)+1;//A~K	
		System.out.println("1 �������, 2 �������, 3,����÷��, 4 ������");		
		System.out.println("A~K����1~13");
		System.out.println(A);
		System.out.println(B);
		switch (A) {
		case 1:
			System.out.print("�������Ϊ����");
			break;
		case 2:
			System.out.print("�������Ϊ����");
			break;
		case 3:
			System.out.print("�������Ϊ÷��");
			break;
		case 4:
			System.out.print("�������Ϊ����");
			break;
			
		}
		switch(B) {
		case 1:
			System.out.print("A");
			break;
		case 2:
			System.out.print("2");
			break;
		case 3:
			System.out.print("3");
			break;
		case 4:
			System.out.print("4");
			break;
		case 5:
			System.out.print("5");
			break;
		case 6:
			System.out.print("6");
			break;
		case 7:
			System.out.print("7");
			break;
		case 8:
			System.out.print("8");
			break;
		case 9:
			System.out.print("9");
			break;
		case 10:
			System.out.print("10");
			break;
		case 11:
			System.out.print("J");
			break;
		case 12:
			System.out.print("Q");
			break;
		case 13:
			System.out.print("K");
			break;
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
