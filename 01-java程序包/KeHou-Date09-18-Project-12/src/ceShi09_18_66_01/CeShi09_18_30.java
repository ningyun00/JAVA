package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_30 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*30. ĳ��׼��ȥ�������Σ�����Ҫ������Ʊ����Ʊ�۸���
����������������Ӱ�죬ͷ�Ȳպ;��òռ�λҲ��ͬ����
���Ʊԭ��Ϊ 5000 Ԫ��4~10 �·�Ϊ����������ͷ�Ȳ�
����ۣ����òմ���ۣ�����ͷ�Ȳմ����ۣ������մ���
�ۡ�����ͼ*/
		Scanner ning = new Scanner(System.in);
		System.out.println("����������·ݣ�");
			int A = ning.nextInt();
		System.out.println("��ѡ���λ��(1��ͷ�Ȳգ�/2�����òգ�)");
			int B = ning.nextInt();
		switch(A) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			if (B == 1) {		//ͷ�Ȳ�
				System.out.println(5000*0.9);
			} else {			//���ò�
				System.out.println(5000*0.8);
			}
			break;
		case 1:
		case 2:
		case 3:
			if (B == 1) {		//ͷ�Ȳ�
				System.out.println(5000*0.5);
			} else {			//���ò�
				System.out.println(5000*0.4);
			}
			break;
		}
		
	}

}