package ceShi09_18_66_01;

import java.util.Scanner;

import java.util.Random;

public class CeShi09_18_33 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*33. ���˲²²£���Ϸ�������һ�� 0~99������ 0 ��
		99�� �����֣�Ȼ�������ʲô���֣���Ϸ������ʾ̫��
		�˻���̫С�ˣ�ֱ�����С����к����ݲ²�Ĵ�������
		��Ӧ�����ۣ����£�*/
		
		Scanner ning = new Scanner(System.in);
		  Random yun = new Random();
			int A = yun.nextInt(100);
			int B = 0,C = 0,D = 0,E = 0;
		do {
			System.out.print("������֣�");
				B = ning.nextInt();
			if (B > A) {
				System.out.println("̫����");
					C++;
			} else if (B < A) {
				System.out.println("̫С��");
					D++;
			}
		} while (A != B);
				E = C + D + 1;
			System.out.println("��һ������"+E+"��");
		if (E <= 3) {
			System.out.println("�������ҵĸ�");
		} else if (E >= 4 && E <= 6) {
			System.out.println("���ϣ�����Ŷ");
		} else if (E >= 7){
			System.out.println("�ļ��Ͱ�");
		}
	
	}

}
