package keHou14_10_09;

public class KeHou03 {

	public static void main(String[] args) {
		/*
		3. ����һ������Ϊ 10 ������ arr, ����Ԫ��Ϊ{1,2,3,4,5,6,7,8,9,10}, �����ٷֱ���
		��������, һ��ר�Ŵ洢 arr ������, һ��ר�Ŵ洢 arr ��ż��*/
			int arr [] = new int [] {1,2,3,4,5,6,7,8,9,10};//�������鳤��
			int ji [] = new int [arr.length];//δ֪���鳤��
			int or [] = new int [arr.length];//δ֪���鳤��
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {//�ж������е����ܷ�2����
				or[i] = arr[i];//�� �����������������
				System.out.println(or[i]+" ");	
			}
			
		}
		for (int i = 0; i < or.length; i++) {
			if (arr[i]%2!=0) {//�ж������е����ܷ�2����
				ji[i] = arr[i];//���� �����������������
				System.out.println(ji[i]);
			}
			
		}
		
	}

}
