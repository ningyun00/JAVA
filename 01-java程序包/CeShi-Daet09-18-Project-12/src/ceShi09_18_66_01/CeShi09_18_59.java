package ceShi09_18_66_01;

public class CeShi09_18_59 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		59. ѭ�� 1--100���ҳ��ܱ� 8 ����������Ȼ���������ӣ�
//		������͡�
		int A = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%8 == 0) {
				A += i;
			}
			
		}
		System.out.println(A);
	}

}
