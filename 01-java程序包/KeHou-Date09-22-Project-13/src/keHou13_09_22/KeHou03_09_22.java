package keHou13_09_22;

import java.util.Scanner;

public class KeHou03_09_22 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//3. һ�� int ���͵�����, ѭ������ 5 ������, 
		//�ֱ���� 5 �����ֵ����ֵ����Сֵ.
		Scanner ning = new Scanner(System.in);
			int A[] = new int [5];
		for (int i = 0; i < A.length; i++) {
			System.out.print("�������"+(i+1)+"������");
				A[i] = ning.nextInt();
		}//���ֵ
			int max = A[0];
			int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (max < A[i]) {
				max = A[i];
			}
			if (min > A[i]) {
				min = A[i];
			}
		}
		System.out.println("���ֵ��"+max);
		System.out.println("��Сֵ��"+min);
	}

}
