package keHou04_09_09;

import java.util.Scanner;

public class KeHou11 {

	public static void main(String[] args) {
		/*����⣺
		11.�̳��Ļ�����ǵ������������һ���Ľ��, 
		���Բμӻ����, �Ӽ�ԪǮ���Ի���һ��С��Ʒ:
		 ���������û������ѽ��,��ѯ���û��Ƿ�μӻ����,ѡ���Ӧ������
		 ��������1�μӻ1: ��50Ԫ,  ��2Ԫ����600ml����һƿ
		 ��������2�μӻ2: ��100Ԫ, ��5Ԫ����������ϴ��Һһƿ
		 ��������3�μӻ3: ��200Ԫ, ��10Ԫ���������ߵ����һ̨
		 ��������4�μӻ4: ��200Ԫ, ��50Ԫ��������������һ̨
		 ��������������ѵ��ܽ��*/
		Scanner ning = new Scanner(System.in);
		System.out.print("���뱾�ι����");
			int money = ning.nextInt();
			int sum = 0;
		if (money >= 50) {
			System.out.println("�Ƿ�μӻ��");
			 String B = ning.next();
			if (B.equals("��")) {
			System.out.println("�1����50Ԫ,  ��2Ԫ����600ml����һƿ");
			System.out.println("�2����100Ԫ, ��5Ԫ����������ϴ��Һһƿ");
			System.out.println("�3����200Ԫ, ��10Ԫ���������ߵ����һ̨");
			System.out.println("�4����200Ԫ, ��50Ԫ��������������һ̨");
			System.out.print("�������ֲμӻ��");
			 	int A = ning.nextInt();
				switch (A) {
				case 1:
					sum = money+2;
				System.out.print("���ι����ѣ�"+sum);
				break;
				case 2:
					sum = money+5;
				System.out.print("���ι����ѣ�"+sum);
				break;
				case 3:
					sum = money+10;
				System.out.print("���ι����ѣ�"+sum);
				break;
				case 4:
					sum = money+50;
				System.out.print("���ι����ѣ�"+sum);
				break;
				default :
					System.out.println("�治���");
				}
				
			} else {
				System.out.println("�������ѣ�"+money);
			}
			
		}
			
	}

}
