package keTang13_09_22;

import java.util.Scanner;

public class KeTang02 {

	public static void main(String[] args) {
		//2. ����һ�� int ���͵�����, 
		//�洢 5 ������, �ҳ� 5 �������е���߷�
		
		Scanner ning = new Scanner(System.in);
		System.out.print("���������������");
		int A [] = new int[5];
		for (int i = 0; i < A.length; i++) {
			A [i] = ning.nextInt();
		}
			int max = A [0];
		for (int i = 0; i < A.length; i++) {
			if(A [i] > max) {
				max = A[i];
			}
			
		}
		System.out.println("���ֵ��"+max);
	}

}
