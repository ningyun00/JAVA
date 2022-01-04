package keTang13_09_22;

import java.util.Scanner;

public class KeTang01 {
	
	
	public static void main(String[] args) {
		
		Scanner ning = new Scanner(System.in);

		/*1. 声明一个 String 类型的数组，空间为 5 个。
		 * 利用扫描器存储五个学生的姓名。再使用循
		环遍历这五个学生的姓名*/	
		
		String [] A = new String[5];//定义字符串类型的数据库长度为5
		for (int i = 0; i < A.length; i++) {
			System.out.print("请输入第"+(i+1)+"个学生的姓名:");
				A[i] = ning.next();
		}
			System.out.print("序号：\t\t姓名：");
		for (int i = 0; i < A.length; i++) {
			System.out.print("\n"+(i+1)+"\t\t"+A[i]);
		}	
		
	}

}