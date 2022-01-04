package keHou10_09_16;

public class KeHou06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
	   ********
    	********
    	 ********
		 */
		//方法1
		for (int i = 1; i <= 3; i++) {
			if(i==2) {
				System.out.print(" ");
			}
			if(i==3) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 8; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		//方法2
		for (int K = 1; K <= 3; K++) {
			for (int M = 1; M < K; M++) {
				System.out.print(" ");
			}
			for (int L = 1; L <=8; L++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
