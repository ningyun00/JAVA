package luanceshi;

public class CeShi07 {
	
	public static void main(String[] args) {
			int arr [] = {2,15,112,34,156,98};
		for (int i = 0; i < arr.length-1; i++) {
			//ѭ�����ֵ��һ��
			for (int j = 0; j < arr.length-1-i; j++) {
				//ѭ�������ֵ��һ��i��
				if (arr[j]>arr[j+1]) {
					//�жϵ�һ��ֵ���һ��ֵ
					int A = arr[j];
					arr [j] = arr[j+1];
					arr[j+1] = A;
					//������ֵ
				}
				
			}
			
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
	}

}
