import java.util.Scanner;
public class Dome04 {


	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner ning = new Scanner(System.in);
		/*   ���������������������ǵĺͣ�
		 *	 ����ʹ���100��
		 *	 ��������������ĳ˻���
		 * 	 ���򣬾����������������
	     */
			System.out.println("����������������");
			System.out.println("��һ��������");
			        double B = ning.nextInt();
			System.out.println("�ڶ�������");
			        double C = ning.nextInt();
		            double A;
		            double D;
		if(( B + C ) > 100) {
			    A = B*C;
			System.out.println(A);	
		} else {
			    D =B/C;		
			System.out.println(D);	
		}

	}

}