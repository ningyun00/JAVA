package keTang11_09_17;

import java.util.Scanner;

import java.util.Random;

public class KeTang01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*��ɳ�ȭ��Ϸ��		
		1.����y������һ�ѣ�����n������Ϸ
		2.��ӡս��
			����ʤ����X��
			���ʤ����X��
			ƽ�֣�X��
		 */
			
		Scanner ning = new Scanner(System.in);
			Random yun = new Random();
			String A;
			   int B = 0,C = 0,D = 0;
			do {
				System.out.println("��ʼ��Ϸ");
				System.out.println("���ȭ��(1��2��3)");
					int E = ning.nextInt();//��
				System.out.println("���Գ�ȭ��");
					int F = yun.nextInt(3)+1;//����(3)+1:��Χ��1~3
				switch(E) {
					case 1:
						System.out.println("������ǣ�ʯͷ");
					break;
					case 2:
						System.out.println("������ǣ�����");
					break;
					case 3:
						System.out.println("������ǣ���");
					break;
					default:
						System.out.println("�������:");
					break;
					}
				switch(F) {
					case 1:
						System.out.println("���Գ����ǣ�ʯͷ");
					break;
					case 2:
						System.out.println("���Գ����ǣ�����");
					break;
					case 3:
						System.out.println("���Գ����ǣ���");
					break;
					default:
						System.out.println("�������:");
					break;
				}
				int G = E-F;//Gʤ��=��-���ԣ�
				switch(G) {
				case -1://��Ӯ1-2=-1��2-3=-1��3-1=2��
					case 2:
						System.out.println("��ϲ����Ӯ��");
					break;
					case -2://������1-3=-2��2-1=1��3-2=1��
					case 1:
						System.out.println("��Ҫ���ĵ�������");
					break;	
					case 0://ƽ��
						System.out.println("ƽ��");
					break;	
					}	
				System.out.println("�Ƿ������Ϸ:(y/0)");
					A = ning.next();
				if (G == -1 || G == 2) {
					B++;
				} else if (G == -2 || G == 1) {
					C++;
				} else if (G == 0) {
					D++;
				}
			 
			} while (A.equals("y"));
			System.out.println("��ʤ����"+B);
		System.out.println("������"+C);
	System.out.println("ƽ��"+D);
	}

}
