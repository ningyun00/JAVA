package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_34 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*34. ʹ�� FOR ѭ���ṹʵ�֣��Ӽ����Ͻ��մ���һ����
			��ÿ���ѧϰʱ��(СʱΪ��λ)��������ÿ��ƽ��ѧϰʱ
			��(СʱΪ��λ)��*/
		Scanner ning = new Scanner(System.in);
			int B = 0,A = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("��������"+i+"��ѧϰʱ�䣺");
			  A = ning.nextInt();
			  B += A;
		}
		System.out.println(B/5);
	}

}
