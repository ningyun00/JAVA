package keHou17_10_13_01;

public class DateTime01 {
		/*1. дһ�������� DateTime:
		���е�����: ��, ��, ��, ʱ, ��, ��
		���еķ���:
		1. ��ʾ��������ʱ��: ����ĸ�ʽΪ 2014-10-23 13:21:14
		дһ�������� TestDateTime:
		����һ��DateTime����d, 
		�ö������Ϊ2014, ��Ϊ10, ��Ϊ23, ʱΪ13, ��21, ��
		Ϊ 1*/
	//����
	int years;//��
	int month;//��
	int day;//��
	int when;//ʱ
	int points;//��
	int seconds;//��
	//����
		public void showDateTime01() {
			//������
			System.out.println(years+"-"
							   +month+"-"
							   +day+" "
							   +when+":"
							   +points+":"
							   +seconds);
	}

}
