package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_37 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*37. �Ӽ���������һ������������ 1~7 ʱ����ʾ�����Ӧ
			����Ϣ������ 1~7 ֮���ֵʱ����ʾ�����������룬ֱ
			������ 0 �˳�ѭ����
			1��MON 2��TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN*/	
		Scanner ning =  new Scanner(System.in);	
		System.out.println("����������");
			int B = 0;
			String A = "";
			B = ning.nextInt();		
		while (B != 0) {
			if (B >= 1 && B <= 7) {
				switch (B) {
				case 1:
					A = "MON";
					break;
				case 2:
					A = "TUE";
					break;
				case 3:
					A = "WED";
					break;
				case 4:
					A = "THU";
					break;
				case 5:
					A = "FRI";
					break;
				case 6:
					A = "SAT";
					break;
				case 7:
					A = "SUN";
					break;
				}
				System.out.println(B+":"+A);
					B = ning.nextInt();
			} else {
				System.out.println("�����������������");
					B = ning.nextInt();	
			}
			
		}
		System.out.println("����");
	}

}
