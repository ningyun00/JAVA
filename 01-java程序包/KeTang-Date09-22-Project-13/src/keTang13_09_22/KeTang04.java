package keTang13_09_22;

import java.util.Random;

public class KeTang04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//4. 声明一个 int 类型的数组, 
		//循环随机生成 6 个 1 到 13 之间随机数放入到此数组中去，再
		//循环输出
		Random ning = new Random();
			int A [] = new int [6];
		for (int i = 0; i < A.length; i++) {
			A[i] = ning.nextInt(13)+1;
			System.out.println(A[i]);
		}
		
	}

}
