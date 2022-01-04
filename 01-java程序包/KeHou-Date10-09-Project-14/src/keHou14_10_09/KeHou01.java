package keHou14_10_09;

public class KeHou01 {

	public static void main(String[] args) {
		/*1. 定义一个长度为 5 的数组 arr 为{'a','b','c','d','e'}的数据值，
		 * 复制到另外一个数组brr。*/
			char arr [] = new char [] {'a','b','c','d','e'};//定义数组长度
			char brr[] = new char[arr.length];//定义未知数组长度
		for (int i = 0; i < arr.length; i++) {	
			brr[i] = arr[i];//将arr[i]赋格给brr[i];
			System.out.print(brr[i]+" ");
		}
		
	}

}
