package ceShi09_18_66_01;

public class CeShi09_18_08 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*8. ���� 2000 ��� 1 �� 1 �� 2008 ��� 1 �� 1 ��֮�������
�����졣����ʾ��ƽ���� 365 �죬������ 366 �죬ѭ��
�� 2000 �굽 2008 �������*/
			int A = 0;
			int B = 0;
		for (int i = 2000; i < 2008; i++) {
			if (i%4 == 0 && i%100 != 0 || i%400 == 0) {
				A += 366;
			} else {
				B += 365;
			}
			
		}
		System.out.println(A+B);
	}

}
