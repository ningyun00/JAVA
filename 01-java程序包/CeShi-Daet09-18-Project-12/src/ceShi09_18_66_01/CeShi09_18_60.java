package ceShi09_18_66_01;

public class CeShi09_18_60 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		60. ��д����ʵ����� 1~100 �����в��ܱ� 7 ������
//		��������͡�
			int A = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%7 != 0) {
				A += i;
			}
			
		}
		System.out.println(A);		
	}

}
