package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*11. ����һ�������������� n ��Сʱ������ n ��Сʱ����
����������ٸ�Сʱ*/
		Scanner sc = new Scanner(System.in);
		System.out.println("������Сʱ");
			double A = sc.nextDouble();//25
			double C;
			C = A/24;
		System.out.print(((int)(C))+"��");
		//С����֮���Ѿ���������//С����-������
		System.out.println((int)(((A/24)-((int)(C)))*24)+"Сʱ");
		//С��֮��*24������Сʱ	
	}

}
