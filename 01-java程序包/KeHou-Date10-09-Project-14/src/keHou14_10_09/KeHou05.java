package keHou14_10_09;

public class KeHou05 {

	public static void main(String[] args) {
		/*5. ��һ������ arr ֵΪ{4,1,0,0,5,0,7,9,0,2,0,8,0,0,4,7,3}, 
		 * �� arr �в�Ϊ 0��ֵ�浽
		 * ��һ�������� brr ��,���{4,1,5,7,9,2,8,4,7,3*/ 
			int arr [] = new int []{4,1,0,0,5,0,7,9,0,2,0,8,0,0,4,7,3};
				//����һ�����ȵ�����
			int brr [] = new int [arr.length];
				//������arrһ������brr
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) {//�ж��Ƿ�Ϊ�㲻Ϊ�㸳ֵ
				brr[i] = arr[i];
				System.out.print(brr[i]+" ");
			}
			 
		}
		
	}

}
