package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_52 {

	public static void main(String[] args) {
//		 TODO �Զ����ɵķ������
//		52. �ֽ�һ�����ⳤ�ȵ�����,�������λ��ӵ��ܺ�
		Scanner ning = new Scanner(System.in);
			System.out.print("������������");
				int A = ning.nextInt();//����AΪ123;
				int B = 0;
		while (A != 0) {//A��Ϊ��;
			B = B + A%10;//Bÿ�μ�A%10;ȥ���һλ
			A = A/10;	//ÿ�μ������һλ
		}
		System.out.println(B);		
	}

}
