
package keHou14_10_09;

public class KeHou06 {

	public static void main(String[] args) {
		/*6. ��ս��(ѡ��): ����һ������Ϊ 20 ������, 
		 * �������д洢�Ķ������� (�� 20 ������Ϊ71)*/ 
		System.out.println("100���ڵ�ȫ��������");
		for (int i = 1; i <= 100; i++) {//ѭ��100���ڵ�����
			boolean flag = true;	//
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
				}
				
			}
			if (flag) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println("\n"+"100���ڵ�������");
		int arr [] = new int [20];
		int K = 0;
		for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
				}
				
			}
			if (flag) {
				if (K < 20) {
					arr[K++] = i;
				}
				
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(+arr[i]+" ");
		}
		
	}
	
}
