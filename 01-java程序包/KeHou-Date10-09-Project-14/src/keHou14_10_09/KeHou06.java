
package keHou14_10_09;

public class KeHou06 {

	public static void main(String[] args) {
		/*6. 挑战题(选做): 声明一个长度为 20 的数组, 
		 * 该数组中存储的都是质数 (第 20 个质数为71)*/ 
		System.out.println("100以内的全部素数：");
		for (int i = 1; i <= 100; i++) {//循环100以内的素数
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
		System.out.println("\n"+"100以内的质数：");
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
