package luanceshi;

import java.util.Scanner;

public class CeShi09 {

	public static void main(String[] args) {
		/*3. 有栋3层楼的监狱, 每层楼有4个单间, 
		 * 每个单间里面住着1个吸毒的犯人 , 
		 * 你需要在这 12 个单间里找个叫"柯震东"的人 , 
		 * 如果有则把"柯震东"替换成"房祖名" , 
		 * 否则提示:查无此人. 请用代码实现以上的功能*/
		Scanner ning = new Scanner(System.in);//新建扫描仪
		String arr [][] = new String [3][4];//新建二维数组
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				System.out.print("请输第"+(i+1)+"监狱第"+(j+1)+"房间个入姓名：");//输出提示
				arr [i][j] = ning.next();//录入数据
			}
			
		}
		int C = 0;//i下标
		int D = 0;//j下标
		System.out.print("输入你需要查找的人：");//输出提示
		String A = ning.next();//录入数据
//		System.out.println("输入你要替换的名字：");
//		String E = ning.next();
		if (A.equals("柯震东")) {//判断输入的是否为"柯震东"
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				if (arr[i][j].equals("柯震东")) {//判读数组中是否为"柯震东"
					System.out.println("查找到该人");//输出提示
					C = i;//将找到后的i下标赋值给C
					D = j;//将找到后的j下标赋值给D
					arr[C][D] = "房祖名";//将arr[C][D]赋值为"房祖名"
					break;//找到后结束
					}
				
				}
			
			}
			
		} else {//输入的不是"柯震东"
			System.out.println("查无此人\n");//输出提示
		}
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				System.out.print(arr[i][j]+"\t");//输出数组
			}
			System.out.println();//每输出一行还一次
		}
	}

}
