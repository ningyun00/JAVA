package keHou15_10_10;

public class KeHou03 {

	public static void main(String[] args) {
		/*3. 有个二维数组如下图:
			1 2 3 4
			5 6 7 8
			9 10 11 12
			实现找到 6 并删除, 使数组变成
			1 2 3 4
			5 7 8 0
			9 10 11 12*/
		int arr [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};//定义数组长度
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				System.out.print(arr[i][j]+" ");//输出表格形式
			}
			System.out.println();//每输完一行换一行
		}
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				if (arr [i][j] == 7) {//判断当arr[i][j]值等于7
					for (int k = j; k < arr[i].length-1; k++) {//循环赋值
						arr [i][k] = arr[i][k+1];//将j的值往后推一位
					}
					arr [i][arr[i].length-1] = 0;//将j的最后一位赋值为零
				}
				
			}
			
		}
		System.out.println();//空一行
		for (int i = 0; i < arr.length; i++) {//循环行
			for (int j = 0; j < arr[i].length; j++) {//循环列
				System.out.print(arr[i][j]+" ");//输出表格形式
			}
			System.out.println();//每输出一行换一行
		}
		
	}

}
