package ceShi09_18_66_01;

public class CeShi09_18_03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for (int i = 1; i <= 4; i++) {	
			for (int j = 1; j <= 8; j++) {
				if (i == 1 || i == 4 || j == 3 || j == 5 || j == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
