package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_04 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//4. ѭ������ 10 ��������ͳ���� 10 ���������ж��ٸ�ż����
		Scanner ning = new Scanner(System.in);
			int B = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println("�������"+i+"����");
				int A = ning.nextInt();
			if (A%2 == 0) {
				B++;
			}
			
		}	
		System.out.println("��"+B+"��ż��");
	}

}
