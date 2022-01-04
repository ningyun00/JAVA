package keTang15_10_10;

import java.util.Scanner;//扫描仪

public class KeTang03 {

	public static void main(String[] args) {
		/*3. 有栋3层楼的监狱, 每层楼有4个单间, 
		 * 每个单间里面住着1个吸毒的犯人 , 
		 * 你需要在这 12 个单间里找个叫"柯震东"的人 , 
		 * 如果有则把"柯震东"替换成"房祖名" , 
		 * 否则提示:查无此人. 请用代码实现以上的功能*/
		Scanner ning = new Scanner(System.in);//新建扫描仪
		String arr [][] = new String [3][4];//定义二维数组长度
		boolean B = true;//布尔值，判断
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				System.out.print("请输第"+(i+1)+"监狱第"+(j+1)+"房间个入姓名：");//输出提示
				arr [i][j] = ning.next(); //录入储存
			}
		}
		System.out.print("输入需要查找的人：");//输出提示
			String name1 = ning.next(); //录入储存
		System.out.print("输入你要替换成的名字：");//输出提示
			String name = ning.next();//录入储存
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				if (name1.equals(arr [i][j])) {//判断输入的与原来的是否相同
					arr[i][j] = name;//替换赋值
					B = false;//不是true则返回false;
				}
			}
		}
		if (B) {//false返回处则输出
			System.out.println("查无此人");
		}
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				System.out.print(arr[i][j]+"\t");//输出表格形式
			}
			System.out.println();//每输出一行换一行
		}		
		
	}

}
