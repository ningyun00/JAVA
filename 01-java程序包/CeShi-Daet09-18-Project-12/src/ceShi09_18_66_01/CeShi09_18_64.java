package ceShi09_18_66_01;

import java.util.Scanner;

import java.util.Random;

public class CeShi09_18_64 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*64. ������ 3��ʵ��ע�Ṧ�ܣ��û�ѡ��ע��˵�������
		ע����档ϵͳ��ʾ�û������û��������룬ϵͳ���� 4
		λ�������Ϊ���š�ע��ɹ�����ʾע����Ϣ��
		*/
		Scanner ning = new Scanner(System.in);
		Random yun = new Random();
		int E = yun.nextInt(9999)+1000;
		System.out.println("**************************************");
		System.out.println("\t    ��ӭ���뽱�͸���ϵͳ");
		System.out.println("\t\t1.ע��");
		System.out.println("\t\t2.��¼");
		System.out.println("\t\t3.�齱");
		System.out.println("**************************************");
		String B = "",C = "",D = "";
		do {
			System.out.print("��ѡ��˵���");
				int A = ning.nextInt();
			if (A <= 0 || A > 3) {
				System.out.println("�������");
			}else {
				switch (A) {
				case 1: 
					System.out.println("���͸���ϵͳ>ע��");
					System.out.println("����д����ע����Ϣ��");
					System.out.print("�û�����");
						C = ning.next();
					System.out.print("�û����룺");
						D = ning.next();
					System.out.println("��Ա���ţ�"+E);
				break;
				case 2: 
					System.out.println("���͸���ϵͳ>��¼");
				break;
				case 3: 
					System.out.println("���͸���ϵͳ>�齱");
				break;
				}
			}
			System.out.println("�û���\t�û�����\t��Ա����");
			System.out.println(C+"\t"+D+"\t"+E);
			System.out.print("�Ƿ������");
				B = ning.next();
		} while (!B.equals("��"));
		System.out.println("ϵͳ�˳���ллʹ�á�");
	}

}
