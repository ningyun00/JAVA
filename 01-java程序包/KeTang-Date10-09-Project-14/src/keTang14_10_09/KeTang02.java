package keTang14_10_09;

public class KeTang02 {

	public static void main(String[] args) {
		/*2. ����һ�� int ��������, ����Ԫ��Ϊ{1,3,5,7,9},
		 *  Ҫ������Ľ��Ϊ: 9 7 5 3 1
		 *  ��ʾ: 
		 *  ѭ�����˳�� arr[4] arr[3] arr[2] arr[1] arr[0] */
			int A [] = new int [] {1,3,5,7,9};//�������鳤��
		for (int i = A.length-1; i >= 0; i--) {//�Ӻ���ǰѭ��
			System.out.print(A[i]+" ");//���
		}
		
	}

}
