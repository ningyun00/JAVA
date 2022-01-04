package keHou14_10_09;

public class KeHou05 {

	public static void main(String[] args) {
		/*5. 有一个数组 arr 值为{4,1,0,0,5,0,7,9,0,2,0,8,0,0,4,7,3}, 
		 * 将 arr 中不为 0的值存到
		 * 另一个数组中 brr 中,变成{4,1,5,7,9,2,8,4,7,3*/ 
			int arr [] = new int []{4,1,0,0,5,0,7,9,0,2,0,8,0,0,4,7,3};
				//定义一串长度的数字
			int brr [] = new int [arr.length];
				//定义与arr一样长的brr
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) {//判断是否不为零不为零赋值
				brr[i] = arr[i];
				System.out.print(brr[i]+" ");
			}
			 
		}
		
	}

}
