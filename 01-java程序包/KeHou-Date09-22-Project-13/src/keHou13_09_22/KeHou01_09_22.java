package keHou13_09_22;

import java.util.Scanner;

public class KeHou01_09_22 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*1. �ڸ質�����У�
		 * ���� 6 λ��ί���д�֣��ڼ�����ֵ÷�ʱ��
		 * ȥ��һ����߷֣�ȥ��һ����ͷ֣�
		 * Ȼ��ʣ��� 4 λ��ί�ķ�������ƽ����
		 * ���Ǹ�ѡ�ֵ����յ÷֡�
		 * �����֪ÿ����ί�����֣�
		 * ���ѡ�ֵĵ÷�.*/
		Scanner ning = new Scanner(System.in);
		  	int A [] = new int [6];
			int sum = 0;
		for (int i = 0; i < A.length; i++) {
			System.out.print("�������"+(i+1)+"λ��ί�ĳɼ�:");
				A[i] = ning.nextInt();
				sum+=A[i];
		}//��߷�
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i]>max) {
				max = A[i];
			}
			
		}//��ͷ�
			int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i]<min) {
				min = A[i];
			}
			
		}
		System.out.println("ƽ����Ϊ��"+(double)(sum-max-min)/(A.length-2));
	}

}
