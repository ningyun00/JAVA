package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_42 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//42. ����ϵͳ�����������·��ļ۸����˼�����������
		//ñ�ӵļ۸񣬼�����������ܼ۸�Ȼ����տ���������
		//Ǯ������������
		Scanner ning = new Scanner(System.in);
		int yifu = 0,maozi = 0;
			System.out.print("�������·��۸�");
				int A = ning.nextInt();
			System.out.print("�����빺���˼����·���");
				int B = ning.nextInt();
			System.out.print("������ñ�ӵļ۸�");
				int C = ning.nextInt();
			System.out.print("�����빺���˼���ñ�ӣ�");
				int D = ning.nextInt();
			System.out.print("�������ܽ�");
				int E = ning.nextInt();yifu = A*B;maozi = C*D;
			System.out.println("Ӧ���㣺"+(E-yifu-maozi));
	}

}
