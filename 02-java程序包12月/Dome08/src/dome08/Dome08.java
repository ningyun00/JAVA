package dome08;

public class Dome08 {

	public static void main(String[] args) {
		/*1. ѭ����� 1900-2017 �����������Щ?
		 * (��ʾ: ��ѭ�����ǿ����� if �����жϵ�)*/
		int ning= 1900;//��ʼ������
		do {
			if (ning%4 == 0 && ning%100 != 0 || ning%400 == 0) {//����������Ķ�������
				System.out.println("����Ϊ��\t"+ning);
			} else {//���������꣬��ƽ��
				System.out.println("ƽ��Ϊ��\t"+ning);
			}
			ning++;//ѭ��ֵ�øı�
		} while (ning <= 2017);//ѭ������
		
	}

}
