package fuXi10_01_01_30;

public class FuXi10_01_23 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//23.
		double A = 100,B = 100,C = 0;
		int i;
		for (i = 1; i <= 7; i++) {
			if (i != 1) {
				C = (A/2);	
				A = C;
				B += A*2;
			}
			System.out.println("��"+i+"��"+"������������������"+B+"��");
		}
		System.out.println("��"+(i-1)+"��"+"������������"+C+"��");
	}

}
