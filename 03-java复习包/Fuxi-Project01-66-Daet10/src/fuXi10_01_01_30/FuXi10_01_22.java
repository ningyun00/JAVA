package fuXi10_01_01_30;

public class FuXi10_01_22 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//22.
		System.out.println("��ӡ����ˮ�����ǣ�");
			int A = 100;
		while(A<999) {
			int B = A%10;
			int C = A/10%10;
			int D = A/10/10%10;
			if ((B*B*B)+(C*C*C)+(D*D*D)==A) {
				System.out.println(A);
			}
			A++;
		}
	
	}

}
