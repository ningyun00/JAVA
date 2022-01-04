package keTang15_10_10;

import java.util.Random;//随机数

public class KeTang02 {

	public static void main(String[] args) {
		/*2. 定义一个二维数组 arr, int[3][4]，
		 * 要求循环输入 12 个整数，放入到数组中，
		 * 然后使用嵌套循环找到这个数组中的最大值和最小值, 
		 * 并显示 : Max*/
		Random yun = new Random();//新建一个对象
		int arr [][] = new int [3][4];//定义二维数组长度【3】*【4】;
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				arr [i][j] = yun.nextInt(100);//随机数的储存
			}
			
		}
		int max = arr [0][0];//假设最大值
		int min = arr [0][0];//假设最小值
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				System.out.print(arr[i][j]+"\t");//输出录入的数
				if (max < arr [i][j]) {	//判断最大值
					max = arr [i][j];//最大值赋值
				}
				if (min > arr [i][j]) {//判断最小值
					min = arr [i][j];//最小值赋值
				}
				
			}
			System.out.println();//输出换行
		}
		System.out.println("最大值为："+max+"\n最小值为："+min);
	}//输出结果

}
