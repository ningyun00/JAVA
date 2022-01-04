package keHou13_09_22;

import java.util.Scanner;

public class KeHou04_09_22 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*4. 声明2个长度为5的数组, 一个循环输入姓名, 
		    一个循环输入年龄, 要求输出格式如下:
			姓名: 张三 李四 王五 赵六 田七
			年龄: 18    19 	20 	21	 22*/
		Scanner ning = new Scanner(System.in);
			String A[] = new String[5];
			  int [] B = new int[5];
		for (int i = 0; i < A.length; i++) {
			System.out.print("请输入姓名：");
				A[i] = ning.next();
			System.out.print("请输入年龄：");
				B[i] = ning.nextInt();
		}
			System.out.print("姓名：\t");
		for (int i = 0; i < A.length; i++) {
			System.out.print("\t"+A[i]);
		}	
			System.out.println("\n");
			System.out.print("年龄：\t");
		for (int i = 0; i < B.length; i++) {
			System.out.print("\t"+B[i]);
		}
	
	}

}
