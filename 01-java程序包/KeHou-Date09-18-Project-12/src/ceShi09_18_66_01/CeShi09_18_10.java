package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//10. ��������ѧ���ĳɼ�������ƽ���֡�
		Scanner ning = new Scanner(System.in);
			int B =0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("�������"+i+"���˵ĳɼ�");
				int A = ning.nextInt();
				B+=A;
		}
		System.out.println(B/3);
	}

}
