package keHou13_09_22;

import java.util.Scanner;

public class KeHou02_09_22 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*2. ѭ������ 6 ���������뵽һ�� int ���͵������У�
		 * Ȼ����ͳ������ղ��ж��ٸ����ִ��� 0��
		 */
		Scanner ning = new Scanner(System.in);
			int A[] = new int [6];
			int B = 0,sum = 0;
		for (int i = 0; i < A.length; i++) {
			System.out.print("�������"+(i+1)+"������:");
				A[i] = ning.nextInt();
			if (A[i]>B) {
					sum++;
			}

		}
		System.out.println(sum);	
	}

}
