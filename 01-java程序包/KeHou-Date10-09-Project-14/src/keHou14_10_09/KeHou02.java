package keHou14_10_09;

public class KeHou02 {

	public static void main(String[] args) {
		/*2. ����һ������Ϊ 10 ������ arr, ����Ԫ��Ϊ{1,2,3,4,5,6,7,8,9,10}, 
		 * ���������е�ż�����Ƶ���һ������ brr */
			int arr [] = new int [] {1,2,3,4,5,6,7,8,9,10};//�������鳤��
			int brr [] = new int [arr.length];//����δ֪���鳤��
		for (int i = 0;i < arr.length; i++) {
			if (arr[i]%2 == 0) {//�ж������е����ܷ�2����
				brr[i] = arr[i];//�ܱ����������������
			System.out.println(brr[i]);}
		}	
		
	}

}
