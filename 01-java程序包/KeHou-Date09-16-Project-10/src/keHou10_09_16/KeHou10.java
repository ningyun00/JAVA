package keHou10_09_16;

public class KeHou10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
			10.
			 i  j
			
			1
			1 2
			1 2 3
			1 2 3 4
			1 2 3 4 5
			1 2 3 4 5 6
			1 2 3 4 5 6 7
			1 2 3 4 5 6 7 8
			1 2 3 4 5 6 7 8 9		
		 */	
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
