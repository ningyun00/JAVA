/**
 * 
 */
package keTang06_09_11;
import java.util.Scanner;//����
/**
 * @author EDZ
 *
 */
public class KeTang04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*��ϰ 4��
		 * ����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿
		 * ʵ��˼·�� 
		 * �� 3 �� 5 ��Ϊ����
		 * �Ȱ� 1��2 �µ������ۼ�������
		 * �ټ��� 5 ��ȱ���ĵڼ��졣
		 * 2 �»���Ҫ�ж��Ƿ�����
		 */
	int D = 0;	
			System.out.print("��������ݣ�");
	int A = ning.nextInt();	//����Ϊ��2015��
			System.out.print("�������·ݣ�");
	int B = ning.nextInt();	//����Ϊ��2��
			System.out.print("������������");
	int C = ning.nextInt();	//����Ϊ��1
		if (A%4==0&&A%100!=0||A%400==0) {
		switch (B) {
		case 1:
			D=C;
			System.out.print(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;	
		case 3:
			D=C+31+29;
			System.out.print(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 5:
			D=C+31+29+31+30;
			System.out.print(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 7:
			D=C+31+29+31+30+31+30;
			System.out.print(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 8:
			D=C+31+29+31+30+31+30+31;
			System.out.print(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 10:
			D=C+31+29+31+30+31+30+31+30;
			System.out.print(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 12:
			D=C+31+29+31+30+31+30+31+31+30+31+30;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 4:
			D=C+31+29+31;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 6:
			D=C+31+29+31+30+31;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 9:
			D=C+31+29+31+30+31+30+31+30;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 11:
			D=C+31+29+31+30+31+30+31+30+30+31;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 2:
			D=C+31;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
			}
		}else {
			switch(B){
		case 1:
			D=C;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 3:
			D=C+31+28;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 5:
			D=C+31+28+31+30;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 7:
			D=C+31+28+31+30+31+30;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 8:
			D=C+31+28+31+30+31+30+31;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 10:
			D=C+31+28+31+30+31+30+31+31+30;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 12:
			D=C+31+28+31+30+31+30+31+31+30+31+30;
			System.out.print(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 4:
			D=C+31+28+31;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 6:
			D=C+31+28+31+30+31;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 9:
			D=C+31+28+31+30+31+30+31+30;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 11:
			D=C+31+28+31+30+31+30+31+30+30+31;
			System.out.println(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
		case 2:
			D=C+31;
			System.out.print(A+"��"+B+"��"+C+"���ǵ�"+D+"�죡");
			break;
			}
			
		}
		
	}
	
}
