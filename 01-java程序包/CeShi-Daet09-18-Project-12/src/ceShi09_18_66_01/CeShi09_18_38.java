package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_38 {

	public static void main(String[] args) {
		
		// TODO �Զ����ɵķ������
		/*38. ΪС���ƶ�ѧϰ�ƻ�����һ������������ѧϰ��̣�
		�ܶ������ġ�����ѧϰӢ�������Ϣ���������ڼ�����
		��ѧϰ����*/
		Scanner ning = new Scanner(System.in);
			int B = 0;
		System.out.println("����������");
			String A = ning.next();
		if (A.equals("һ") || A.equals("��") || A.equals("��")) {
			B = 1;	
		} else if (A.equals("��") || A.equals("��") || A.equals("��")) {
			B = 2;
		} else if (A.equals("��")) {
			B = 3;
		} else {
			System.out.println("�������������");
		}
		switch(B) {
		case 1:
			System.out.println("ѧϰ���");
			break;
		case 2:
			System.out.println("ѧϰӢ��");
			break;
		case 3:
			System.out.println("��Ϣ");
			break;
		}
	
	}

}
