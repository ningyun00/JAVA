package keHou15_10_10;

import java.util.Scanner;//导包

public class KeHou01 {

	public static void main(String[] args) {
		/*1. 定义一个二维数组，循环输入 3 个学生的 java,c#,sql,html 四门功课的成绩，
		 * 二维数组的一行记录一个人的成绩，
		 * 要求每个同学的每科成绩输出格式如下：
		 * 学生 java c# sql html 总分 平均分
		 * 第 1 位 89 79 98 90 356 89
		 * 第 2 位 99 80 100 98 377 94
		 * 第 3 位 79 99 87 87 352 88*/
		Scanner ning = new Scanner(System.in);//新建扫描仪
		int arr [][] = new int [3][4];//定义二维数组范围
		//int brr [][] = {{89,79,98,90},{},{}};
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				System.out.print("输入第"+(i+1)+"个同学的"+(j+1)+"门成绩：");
				//输出提示语句
				arr [i][j] = ning.nextInt();//录入数据
			}
			
		}
		int sum = 0;//总分
		double avg = 0.0;//平均分
		System.out.println("学生\tjava\tc#\tsql\thtml\t总分\t平均分");
		//输出表格形式
		for (int i = 0; i < arr.length; i++) {//输出行
			System.out.print("\n"+"第"+(i+1)+"为");//输出第几人
			for (int j = 0; j < arr[i].length; j++) {//循环列
				System.out.print("\t"+ arr [i][j]);//输出录入数据
					sum += arr [i][j];//总分统计
			}
			System.out.print("\t"+sum);//输出总分
				avg = sum / arr[i].length;//统计平均分
			System.out.print("\t"+avg);//输出平均分
				sum = 0;//输出完后清零
			System.out.println();//每次输出完一行后换行
		}
		
	}

}
