package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_43 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*43. ����һ�������������� n ��Сʱ������ n ��Сʱ����
		����������ٸ�Сʱ���������룺25����ô�����1 ����
		1 ��Сʱ��*/
		Scanner ning = new Scanner(System.in);
			System.out.println("������Сʱ��");
				double A = ning.nextInt();
				double B;	//��
				B = A/24;
			System.out.print((int)B+"����");
			System.out.println((int)(((A/24)-((int)(B)))*24)+"��Сʱ");
	}

}
