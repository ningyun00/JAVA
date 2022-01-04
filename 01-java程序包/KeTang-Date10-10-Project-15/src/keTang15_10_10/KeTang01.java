package keTang15_10_10;

import java.util.Random;//随机数包

//import java.util.Scanner;//扫描仪

public class KeTang01 {

	public static void main(String[] args) {
		/*1. 定义一个二维数组 arr, int[4][3]，
		 * 要求循环输入 12 个整数，放入到数组中，
		 * 然后使用嵌套循环找到这个数组中的全部偶数，
		 * 并且求出所有偶数的和。*/
		Random ning = new Random();//新建随机数包
		//Scanner yun = new Scanner(System.in);//新建扫描仪
		int arr [][] = new int [4][3];//定义数组范围【4】*【3】；
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				 arr [i][j] = ning.nextInt(24)+1; //随机数输入，或自行输入。
				 //arr [i][j] = yun.nextint();
			}
			
		}
		int A = 0;//偶数和
		System.out.println("输出数为：");//输出提示
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				System.out.print(arr[i][j]+"\t");//输出全部数
				if (arr [i][j] %2 == 0) {//判断偶数
					A += arr[i][j];//累加和
					System.out.print("偶数为："+arr[i][j]);//循环输出数组
				}
				System.out.println();//每输出一行还一次
			}
			
		}
		System.out.println("所有偶数和为："+A);//统计结果输出
	}

}
