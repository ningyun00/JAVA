package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_31 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//31. �Ӽ������� 3 ����ͬ�����֣����������С����
		Scanner ning = new Scanner(System.in);
		System.out.println("�������һ������");
			int A = ning.nextInt();
		System.out.println("������ڶ�������");
			int B = ning.nextInt();
		System.out.println("���������������");
	    	int C = ning.nextInt();
	    if(A > B && A > C) {
			if(B > C) {
				System.out.println(C);
			}else {
			    System.out.println(B);
			}
			
		}
		if(B > C && B > A) {
			if(C > A) {
				System.out.println(A);
			}else if(A > C) {
			    System.out.println(C);
			}
			
		}	
		if(C > A && C > B) {
			if(A > B) {
				System.out.println(B);
			}else if(B > A) {
				System.out.println(A);
			}
		
		}	
	
	}

}
