package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_63 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
/*		63. ������ 2��ʵ��ѭ��ִ�й��ܣ��û�ѡ��һ��˵���
		����˵���Ϣ��ϵͳѯ���Ƿ��������������������
		ѡ��˵����������ϵͳ��
*/
		Scanner ning = new Scanner(System.in);
			String B = null ;
		do {
			System.out.println("**************************************");
			System.out.println("\t    ��ӭ���뽱�͸���ϵͳ");
			System.out.println("\t\t1.ע��");
			System.out.println("\t\t2.��¼");
			System.out.println("\t\t3.�齱");
			System.out.println("**************************************");
			System.out.print("��ѡ��˵���");
				int A = ning.nextInt();
			if (A <= 0 || A > 3) {
				System.out.println("�������");
			} else {
				switch (A) {
				case 1: 
					System.out.println("���͸���ϵͳ>ע��");
				break;
				case 2: 
					System.out.println("���͸���ϵͳ>��¼");
				break;
				case 3: 
					System.out.println("���͸���ϵͳ>�齱");
				break;
				}
				
			}System.out.print("�Ƿ������");
			B = ning.next();
		} while (!B.equals("��"));
		System.out.println("ϵͳ�˳���ллʹ�á�");
	}

}
