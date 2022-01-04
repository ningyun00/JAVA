package keHou10_09_16;

public class KeHou08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*8.      *
			     ***
			    *****
			   *******
			   */
		for (int i = 1; i <= 4; i++) {
			for (int k = 4; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
