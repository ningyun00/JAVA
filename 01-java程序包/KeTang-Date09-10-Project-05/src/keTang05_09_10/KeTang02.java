/**
 * 
 */
package keTang05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*2. ���� 3 ������, 
		 * 		��� 3 �����������ֵ���� 80 ��
		 * 		ͬʱ��Сֵ���� 60 ��, 
		 * 		�����"���ο��Է����ܺ�", 
		 * 		����"���ο��Է���������"
		 */
			System.out.println("��������������");
			System.out.print("�������һ������");
		double A = sc.nextDouble();
			System.out.print("������ڶ�������");
		double B = sc.nextDouble();
			System.out.print("�����������С��");
		double C = sc.nextDouble();
		if(A>80 && B>60 && C>60||A>60 && B>80 
			    && C>60||A>60 && B>60 && C>80 ) {
			System.out.print("���ο��Է����ܺ�");
		}else {
			System.out.print("���ο��Է���������");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
