package keTang14_10_09;

import java.util.Scanner;//导包

public class KeTang01 {

	public static void main(String[] args) {
		/*1. 利用标记法实现查找功能:
		 * 有个 int 类型数组, 数组元素为{5,8,1,4,3,2,9,7,6}, 
		 * 输入需要查找的数字,如果找到输出该数组所在位置,
		 * 例如: arr[X], 如果没找到提示未找到*/
		Scanner ning = new Scanner(System.in);//新建对象，实例化对象。
			int A [] = new int [] {5,8,1,4,3,2,9,7,6};//定义数组类型，长度
				System.out.print("输入你要查找的数字：");//提示
					int B = ning.nextInt();//接收数据 
					int i;
		for (i = 0; i < A.length; i++) {//循环数组
			if (A [i] == B) {//判断与输入数是否相同
					break;//有就跳出循环结束
			}
			
		}
		if (i < A.length) {//下标小于数组长度意味找得到
			System.out.println("你所查找的数在"+i+"位置");	
		} else {//其它输出			
			System.out.println("未找到该数");
		
		}
		
	}

}
