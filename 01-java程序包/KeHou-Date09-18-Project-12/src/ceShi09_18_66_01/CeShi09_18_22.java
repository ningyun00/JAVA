package ceShi09_18_66_01;

public class CeShi09_18_22 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*22. ��ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ��
��λ�������λ���������͵��ڸ�������
		 */
		int A = 100;
		while(A < 999){
			int B = A%10;
			int C = A/10%10;
			int D = A/10/10%10;
			if((B*B*B)+(C*C*C)+(D*D*D)==A) {
				//3.���ѭ�������
				System.out.println(A);
			}
			//4.����ѭ�����
			A++;
		}
		
	}

}
