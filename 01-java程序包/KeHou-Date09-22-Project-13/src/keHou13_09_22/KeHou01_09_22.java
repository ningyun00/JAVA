package keHou13_09_22;

import java.util.Scanner;

public class KeHou01_09_22 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*1. 在歌唱比赛中，
		 * 共有 6 位评委进行打分，在计算歌手得分时，
		 * 去掉一个最高分，去掉一个最低分，
		 * 然后剩余的 4 位评委的分数进行平均，
		 * 就是该选手的最终得分。
		 * 如果已知每个评委的评分，
		 * 求该选手的得分.*/
		Scanner ning = new Scanner(System.in);
		  	int A [] = new int [6];
			int sum = 0;
		for (int i = 0; i < A.length; i++) {
			System.out.print("请输入第"+(i+1)+"位评委的成绩:");
				A[i] = ning.nextInt();
				sum+=A[i];
		}//最高分
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i]>max) {
				max = A[i];
			}
			
		}//最低分
			int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i]<min) {
				min = A[i];
			}
			
		}
		System.out.println("平均分为："+(double)(sum-max-min)/(A.length-2));
	}

}
