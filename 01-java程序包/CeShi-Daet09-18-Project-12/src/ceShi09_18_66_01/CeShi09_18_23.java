package ceShi09_18_66_01;

public class CeShi09_18_23 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*23. һ��� 100 �׸߶��������£�ÿ����غ�����ԭ��
		�ȵ�һ�룻�����£������� �� 7 �����ʱ����������
		���ף��� 7 �η�����ߣ�*/
		double A = 100,B = 100,C = 0;
		int i ;
		for ( i = 1; i <= 7; i++) {
			if (i != 1) {
				C = ( A/2 );
				A = C;
				B += A*2;
			}
			System.out.println("��"+i+"��"+"����,�����������߶�Ϊ��"+B+"��");
		}	
		System.out.println("��"+(i-1)+"�η����ˣ�"+C+"��");
	}

}
