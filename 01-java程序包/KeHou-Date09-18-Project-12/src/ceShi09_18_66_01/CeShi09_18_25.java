package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_25 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ��������
		// 25. �ó���������ͼ
		Scanner ning = new Scanner(System.in);
		System.out.print("���Ƿ�Ϊ��Ա������/��");
			String A = ning.next();
			   int B ;
		if (A.equals("��")) {
			System.out.print("���ι����");
				B = ning.nextInt();
			if (B > 200) {
				System.out.print("��200Ԫ��7.5�ۣ����ۺ�۸�Ϊ��");
				System.out.println(B*0.75);
			} else {
				System.out.println("δ��200Ԫ��8�ۣ����ۺ�۸�Ϊ��");
				System.out.println(B*0.8);
			}
			
		} else if(A.equals("��")){
			System.out.print("���ι����");
				B = ning.nextInt();
			if (B >= 100) {
				System.out.print("��100Ԫ��9�ۣ����ۺ�ļ۸�Ϊ��");
				System.out.println(B*0.9);
			}
			
		} else {
			System.out.println("������󣡣���");
		}

	}

}
