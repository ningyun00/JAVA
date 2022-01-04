package keHou14_10_09;

public class KeHou03 {

	public static void main(String[] args) {
		/*
		3. 定义一个长度为 10 的数组 arr, 数组元素为{1,2,3,4,5,6,7,8,9,10}, 接着再分别定义
		两个数组, 一个专门存储 arr 的奇数, 一个专门存储 arr 的偶数*/
			int arr [] = new int [] {1,2,3,4,5,6,7,8,9,10};//定义数组长度
			int ji [] = new int [arr.length];//未知数组长度
			int or [] = new int [arr.length];//未知数组长度
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {//判断数组中的数能否被2整除
				or[i] = arr[i];//能 被整除的数赋给左边
				System.out.println(or[i]+" ");	
			}
			
		}
		for (int i = 0; i < or.length; i++) {
			if (arr[i]%2!=0) {//判断数组中的数能否被2整除
				ji[i] = arr[i];//不能 被整除的数赋给左边
				System.out.println(ji[i]);
			}
			
		}
		
	}

}
