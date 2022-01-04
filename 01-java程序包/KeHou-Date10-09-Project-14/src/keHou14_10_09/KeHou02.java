package keHou14_10_09;

public class KeHou02 {

	public static void main(String[] args) {
		/*2. 定义一个长度为 10 的数组 arr, 数组元素为{1,2,3,4,5,6,7,8,9,10}, 
		 * 将该数组中的偶数复制到另一个数组 brr */
			int arr [] = new int [] {1,2,3,4,5,6,7,8,9,10};//定义数组长度
			int brr [] = new int [arr.length];//定义未知数组长度
		for (int i = 0;i < arr.length; i++) {
			if (arr[i]%2 == 0) {//判断数组中的数能否被2整除
				brr[i] = arr[i];//能被整除的数赋给左边
			System.out.println(brr[i]);}
		}	
		
	}

}
