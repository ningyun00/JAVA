package keHou15_10_10;

public class KeHou03 {

	public static void main(String[] args) {
		/*3. �и���ά��������ͼ:
			1 2 3 4
			5 6 7 8
			9 10 11 12
			ʵ���ҵ� 6 ��ɾ��, ʹ������
			1 2 3 4
			5 7 8 0
			9 10 11 12*/
		int arr [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};//�������鳤��
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				System.out.print(arr[i][j]+" ");//��������ʽ
			}
			System.out.println();//ÿ����һ�л�һ��
		}
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				if (arr [i][j] == 7) {//�жϵ�arr[i][j]ֵ����7
					for (int k = j; k < arr[i].length-1; k++) {//ѭ����ֵ
						arr [i][k] = arr[i][k+1];//��j��ֵ������һλ
					}
					arr [i][arr[i].length-1] = 0;//��j�����һλ��ֵΪ��
				}
				
			}
			
		}
		System.out.println();//��һ��
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				System.out.print(arr[i][j]+" ");//��������ʽ
			}
			System.out.println();//ÿ���һ�л�һ��
		}
		
	}

}
