package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_39 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//39. ʹ�� switch ģ��ʵ��һ���˵�ѡ����
		Scanner ning = new Scanner(System.in);
			System.out.println("��Ŀ�б�");
			System.out.println("1.����\n2.��ѧ\n3.Ӣ��");
			System.out.print("��ѡ���Ŀ���֣�");
				int A = ning.nextInt();	
		switch(A) {
		case 1:
			System.out.println("��ѡ��������");
			break;
		case 2:
			System.out.println("��ѡ������ѧ");
			break;
		case 3:
			System.out.println("��ѡ����Ӣ��");
			break;
		}
	
	}

}
