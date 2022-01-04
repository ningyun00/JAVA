package keTang14_10_09;

public class KeTang03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*3. 创建一个 int 类型数组, 
		 * 数组元素为{10,20,30,40,50,60,70}, 
		 * 利用循环实现倒序交换, 最后输出交换位置之后的数组. 
		 * 倒序交换: 10 和 70 互换 20 和 60 互换 30 和 50 互换 
		 * 70,60,50,40,30,20,10
		 * (★不能使用第二个数组)
		 * 提示: 循环交换次数为 3 次
		 * arr[0] 和 arr[6] 交换
		 * arr[1] 和 arr[5] 交换
		 * arr[2] 和 arr[4] 交*/
			int A [] = new int [] {10,20,30,40,50,60,70};//定义数组长度7
		for (int i = 0; i < A.length/2; i++) {//循环数组长度除2==循环3次：设A【i】==0；
			int B = A [i];//A[i]=A[0]数组中为=10;B=10;
			A[i] = A[A.length-1-i];//A[A.length-1-i]=A[6]数组中为=70;A[i]=A[0]=70;
			A[A.length-1-i] = B;//B=10赋值给A[6]=10
		}
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		
	}

}
