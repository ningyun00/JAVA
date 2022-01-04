package keHou10_09_16;

public class KeHou11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
11、
	     A  
	    BBB
	   CCCCC
	  DDDDDDD
	 EEEEEEEEE
	FFFFFFFFFFF
	*/
		int A = 65;
		for (int i = 1; i <= 6; i++) {
			System.out.println();
			for (int k = 6; k >i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print((char)A);
			}
			A++;
			}
		System.out.println("");
		}
		
		
	
		
		
		
	}


