package keTang10_09_16;



public class KeTang03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*3���������ͼ��:
			*******
			 ******
			  *****
			   ****
			    ***
			     **
			      *
			
			    *
			   ***
			  *****
			 *******
			**********/

		for (int i = 0; i <= 7; i++) {//��ѭ��
			System.out.println();//����
				for (int k = 0; k < i;k++) {//��ѭ��
				System.out.print(" ");//�����ߵĿո�
			}
				for (int j = 7; j >=i; j--) {//���*��
					System.out.print("*");
			}
				
		}
		System.out.println();
		for (int A = 1;A<=5;A++) {//�������ѭ��
			System.out.println();
			for (int B = 5; B >A; B--) {//��������ҿո�
				System.out.print(" ");
			}
			for(int C=1;C<=A*2-1;C++) {
				System.out.print("*");//���*��
			}
		}
		System.out.println();
	}

}
