package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_25 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//25.
		Scanner ning = new Scanner(System.in);
		System.out.println("���Ƿ�Ϊ��Ա������/��");
			String 	A = ning.next();
			int B;
		if (A.equals("��")) {
			System.out.println("���뱾�ι����");
			 	B = ning.nextInt();
			if (B > 200) {
				System.out.println("�����ٴ�7.5�ۣ����ۺ�۸�Ϊ��\n"+(B*0.75));
			} else {
				System.out.println("�������ٴ�8�ۣ����ۺ�۸�Ϊ��\n"+(B*0.8));
			}
		} else if (A.equals("��")) {
			System.out.println("���뱾�ι����");
		 		B = ning.nextInt();
			if (B > 100) {
				System.out.println("��һ�ٴ���ۣ����ۺ�۸�Ϊ��\n"+(B*0.9));
			}
		
		} else {
			System.out.println("������󣡣���");
		}
		
	}

}
