package fuXi10_01_01_30;

public class FuXi10_01_16 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//16.
		for (int i = 1; i <= 9; i++) {//列
			for (int j = 1; j <= i; j++) {//行
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
		
	}

}
