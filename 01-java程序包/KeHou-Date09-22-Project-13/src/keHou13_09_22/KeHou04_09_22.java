package keHou13_09_22;

import java.util.Scanner;

public class KeHou04_09_22 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*4. ����2������Ϊ5������, һ��ѭ����������, 
		    һ��ѭ����������, Ҫ�������ʽ����:
			����: ���� ���� ���� ���� ����
			����: 18    19 	20 	21	 22*/
		Scanner ning = new Scanner(System.in);
			String A[] = new String[5];
			  int [] B = new int[5];
		for (int i = 0; i < A.length; i++) {
			System.out.print("������������");
				A[i] = ning.next();
			System.out.print("���������䣺");
				B[i] = ning.nextInt();
		}
			System.out.print("������\t");
		for (int i = 0; i < A.length; i++) {
			System.out.print("\t"+A[i]);
		}	
			System.out.println("\n");
			System.out.print("���䣺\t");
		for (int i = 0; i < B.length; i++) {
			System.out.print("\t"+B[i]);
		}
	
	}

}
