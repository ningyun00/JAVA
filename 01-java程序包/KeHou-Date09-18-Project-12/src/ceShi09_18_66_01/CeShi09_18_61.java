package ceShi09_18_66_01;

import java.util.Scanner;

import java.util.Random;

public class CeShi09_18_61 {

	public static void main(String[] args) {
//		 TODO �Զ����ɵķ������
//		61. ����¼��һ����(1-10),Ȼ���������һ�����������
//		�Դ����������ʤ������Ҵ���������ʤ����
		Scanner ning = new Scanner(System.in);
			Random yun = new Random();
			System.out.print("������һ������");
				int A = ning.nextInt();
			System.out.println("����������");
				int B = yun.nextInt(10)+1;
		if (A > B) {
			System.out.println("���ʤ��");
		} else {
			System.out.println("����ʤ��");
		}
		
	}

}
