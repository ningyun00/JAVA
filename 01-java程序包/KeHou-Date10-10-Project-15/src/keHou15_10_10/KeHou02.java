package keHou15_10_10;

import java.util.Scanner;//导包

public class KeHou02 {

	public static void main(String[] args) {
		/*2. 定义一个如图所示的二维数组:
		 * 11 12 13
		 * 22 23 24
		 * 33 34 35
		 * 将 23 删除复位成用户输入的数字,例如: 88 , 再遍历输出整个数组
		 * 11 12 13
		 * 22 88 24
		 * 33 34 35*/
		Scanner ning = new Scanner(System.in);//新建扫描仪
		int arr [][] = {{11,12,13},{22,23,24},{33,34,35}};//定义二维数组长度
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				System.out.print(arr[i][j]+"\t");//输出数组
			}
			System.out.println();//每次输出完换一行
		}
		System.out.println("输入更该数：");//输出提示
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				if (i == 1 && j == 1) {//判断下标
					arr[i][j] = ning.nextInt();//录入到数组中
					break;//结束
				}
				
			}
			
		}
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr.length; j++) {//循环列
				System.out.print(arr[i][j]+" ");//输出二维数表
			}
			System.out.println();//每次输出完换一行
		}
		
	}

}
