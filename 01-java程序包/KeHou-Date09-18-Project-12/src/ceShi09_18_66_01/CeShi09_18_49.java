package ceShi09_18_66_01;

public class CeShi09_18_49 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		49. 2016 ������ѧԱ 8 ���ˣ�ÿ������ 25%(0.25)�����ʰ���
//		�����ٶȣ�����һ����ѵѧԱ���������� 20 ���ˣ���ʹ
//		�ó�����������������
		double A = 8*1.25;
		   int B = 1;//��
		   int C = 0;
		while (A <= 20) {
			A = A*1.25;
			B++;
			C = 2016+B;
		}
		System.out.println("����"+C+"�굽��20����");
	}

}
