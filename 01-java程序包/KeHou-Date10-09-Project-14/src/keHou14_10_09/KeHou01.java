package keHou14_10_09;

public class KeHou01 {

	public static void main(String[] args) {
		/*1. ����һ������Ϊ 5 ������ arr Ϊ{'a','b','c','d','e'}������ֵ��
		 * ���Ƶ�����һ������brr��*/
			char arr [] = new char [] {'a','b','c','d','e'};//�������鳤��
			char brr[] = new char[arr.length];//����δ֪���鳤��
		for (int i = 0; i < arr.length; i++) {	
			brr[i] = arr[i];//��arr[i]�����brr[i];
			System.out.print(brr[i]+" ");
		}
		
	}

}
