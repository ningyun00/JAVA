/**
 * 
 */
package keTang04_09_09;
/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeTang06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*6. ��������������Ȼ��������ߵ����ֵ��
		 */ 
	    int max;
			System.out.print("��������������,");
			System.out.println("�������һ����:");
		int zhengShu1 = sc.nextInt();
		    System.out.println("������ڶ�����:");
		int zhengShu2 = sc.nextInt();
		if (zhengShu1>zhengShu2) {
		    max = zhengShu1;
		
		}else
			max = zhengShu2;
		    System.out.println("����������������ֵΪ��"+max);
	}

}
