package keHou20_10_18_01;

import java.util.Scanner;

/**
 * ����
 * @author ��
 *
 */
public class KeHou04 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		// 4.¼���Ա���գ���ʽ�����ǡ���/�ա��� �硱09/12�� �����û��ظ�¼�룬ֱ��������ȷΪֹ 
		Scanner ning = new Scanner(System.in);
		String st1;
		do {
			System.out.print("�����Ա����");
			 	st1 = new String(ning.next());
			if (st1.length()==5&&st1.substring(2, 3).equals("/")) {
				System.out.println("������ȷ");
				break;
			} else {
				System.out.println("�������");
				System.out.println("���ڸ�ʽΪ����/�ա�00/00��");
			}
			
		} while (true);
		
	}

}
