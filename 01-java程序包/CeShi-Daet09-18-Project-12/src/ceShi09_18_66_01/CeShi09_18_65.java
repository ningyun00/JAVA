package ceShi09_18_66_01;

import java.util.Random;

import java.util.Scanner;

public class CeShi09_18_65 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*65. ������ 4��ʵ�ֵ�¼���ܣ�ע��ɹ����û�ѡ�񡰵�
		¼���˵��������¼���档����ע��ʱ���û��������룬
		��¼�ɹ���ϵͳ��ʾ��ӭ��Ϣ������û������������� ��
		����ʾ�û��������룬����� 3 ��������ᡣ
		*/
		Scanner ning = new Scanner(System.in);
		Random yun = new Random();
			int E = yun.nextInt(9999)+1000;
				String B = "",C = "",F = "",D = "",G = "";
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
					System.out.println("����д����ע����Ϣ��");
					System.out.print("�û�����");
						C = ning.next();
					System.out.print("�û����룺");
						D = ning.next();
					System.out.println("��Ա���ţ�"+E);
					System.out.println("�û���\t�û�����\t��Ա����");
					System.out.println(C+"\t"+D+"\t"+E);
					System.out.print("�Ƿ������");
						B = ning.next();
				if (!B.equals("��")) {
					System.out.println("**************************************");
					System.out.println("\t    ��ӭ���뽱�͸���ϵͳ");
					System.out.println("\t\t1.ע��");
					System.out.println("\t\t2.��¼");
					System.out.println("\t\t3.�齱");
					System.out.println("**************************************");
					System.out.print("��ѡ��˵���");
						A = ning.nextInt();
					if (A == 2) {
						System.out.println("���͸���ϵͳ>��¼");
							int P = 0;
						do {										
						System.out.println("�����û�����");
							F = ning.next();
						System.out.println("�����û����룺");
							G = ning.next();
							P++;
						if (!(C.equals(F) && D.equals(G))) {
						System.out.println("�������");
						} else {
							System.out.println("��ӭ����"+C+"��¼�ɹ�");
						}
						} while (!(C.equals(F) && D.equals(G)) && !(P == 3));
							if (P == 3) {
							break;
							} else {
								System.out.println("��ӭ����"+C+"��¼�ɹ�");
							break;
							}
						
					} else {
						System.out.println("ϵͳ�˳���ллʹ�á�");
					break;
					}
							
				}
				break;
				case 3: 
					System.out.println("���͸���ϵͳ>�齱");
				break;
			}
				System.out.print("�Ƿ������");
					B = ning.next();	
			}
			
		} while (!B.equals("��"));
		System.out.println("ϵͳ�˳���ллʹ�á�");
	}

}
