package keHou10_09_16;

public class KeHou09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*9:
		   ********
		   *      *
		   *      *
		   ********	
		 */
		for (int i = 1; i <= 4; i++) {
			if (i >= 2 && i <= 3) {
				for (int j = 1; j <= 8; j++) {
					if (j==1||j==8) {
						System.out.print("*");
					}else if (j>=1 || j<=8) {
						System.out.print(" ");
					}
				}
				
			}else if(i==1 || i==4) {
				for (int j = 1; j <= 8; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
