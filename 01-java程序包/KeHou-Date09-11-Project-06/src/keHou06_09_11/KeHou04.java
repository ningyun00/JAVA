/**
 * 
 */
package keHou06_09_11;
import java.util.Scanner;//����
/**
 * @author EDZ
 *
 */
public class KeHou04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//ϵͳ¼��
		// TODO �Զ����ɵķ������
		/*�ġ�������� 1 �� 1 �յ������������
		 */
		System.out.println("��������ݣ�(���㷶Χ��1~9��)");
			int C = ning.nextInt();		
		System.out.println("���������������µĵڼ��죺");
			int A;
			int B = ning.nextInt();
		if(B%4==0&&B%100!=0||B%400==0) {
			A=B+(5*31)+(2*30)+29;
			System.out.println("�����ǽ���(��"+C+"��1��1����)�����������"+A);
		}else{
			A=B+(5*31)+(2*30)+28;
		}
		System.out.println("�����ǽ���(��"+C+"��1��1����)�����������"+A);		
	}

}
