package ceShi09_18_66_01;

import java.util.Random;

import java.util.Scanner;

public class CeShi09_18_66 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*66. ������ 5��ʵ�����˳齱���ܣ���¼�ɹ����û���
		ѡ�����˳齱�˵��������Ա���ţ�ϵͳ���� 5 �� 4 λ
		�������Ϊ�������֡������Ա����������֮һ�����Ϊ
		�������˻�Ա��*/
		
		Scanner ning = new Scanner(System.in);
		Random yun = new Random();
			int E = yun.nextInt(9999)+1000;
			int H = 0;
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
				if (B.equals("��")) {
					System.out.println("**************************************");
					System.out.println("\t    ��ӭ���뽱�͸���ϵͳ");
					System.out.println("\t\t1.ע��");
					System.out.println("\t\t2.��¼");
					System.out.println("\t\t3.�齱");
					System.out.println("**************************************");
					System.out.print("��ѡ��˵���");
						int I = ning.nextInt();
					if (I == 2) {
						int P = 0;
						do {										
						System.out.println("�����û�����");
							F = ning.next();
						System.out.println("�����û����룺");
							G = ning.next();
							P++;
						} while (!(C.equals(F) && D.equals(G)) && !(P == 3));
							if (P == 3) {
								
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
				for (int i = 1; i <= 5; i++) {
					 H = yun.nextInt(9999)+1000;
					System.out.print(H+"\t");
				}
					System.out.println();
				if (E == H) {
					System.out.println("��ϲ�������˻�Ա");
				} else {
					System.out.println("���ź��㲻�����˻�Ա");
				}
				break;
			}System.out.print("�Ƿ������");
				B = ning.next();			
		} while (!B.equals("��"));
		System.out.println("ϵͳ�˳���ллʹ�á�");
	}

}
