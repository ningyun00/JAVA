package keTang14_10_09;

public class KeTang02 {

	public static void main(String[] args) {
		/*2. 创建一个 int 类型数组, 数组元素为{1,3,5,7,9},
		 *  要求输出的结果为: 9 7 5 3 1
		 *  提示: 
		 *  循环输出顺序 arr[4] arr[3] arr[2] arr[1] arr[0] */
			int A [] = new int [] {1,3,5,7,9};//定义数组长度
		for (int i = A.length-1; i >= 0; i--) {//从后向前循环
			System.out.print(A[i]+" ");//输出
		}
		
	}

}
