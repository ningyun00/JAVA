/**
 * 
 */
package keHou04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou01 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*1. ����äɮ����ɭ����ߣ�Ȼ��ȸ߰���
		 * ���äɮ������ɭ��
		 * ���������ɭ�Ǹ�����"�������"äɮ�Ǹ�����"
		 */
		System.out.println("������äɮ����ߣ�");
			double A0 = sc.nextDouble();
		System.out.println("��������ɭ�����ߣ�");
			double B0 = sc.nextDouble();
		if(A0>B0) {
			System.out.println("��ɭ�Ǹ�����");
		}else  
		   	System.out.println("äɮ�Ǹ�����");
	}
	
}