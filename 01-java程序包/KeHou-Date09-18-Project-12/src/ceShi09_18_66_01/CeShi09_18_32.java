package ceShi09_18_66_01;

public class CeShi09_18_32 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*32. ����һ������Ϊ��FlipFlop������ϷӦ�ó������� 1
			������ 100������ 3 �ı�����������ʡ�Flip��
			������ 5
			�ı�����������ʡ�Flop��
			����Ϊ 3 �ı���ҲΪ 5 �ı�
			���������FlipFlop��
			��������������ǰ���֡�*/
		for (int i = 1; i <= 100; i++) {
			if (i%3 == 0 && i%5 == 0) {
				System.out.println("FlipFlop");
			} else if (i%3 == 0) {
				System.out.println("Flip");
			} else if (i%5 == 0) {
				System.out.println("Flop"); 
			} else {
				System.out.println(i);
			}
		
		}

	}

}
