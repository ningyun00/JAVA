/**
 * 
 */
package keTang04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeTang04 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*4. �龰ģ��: һ��Ů��������, ��Java�ɼ���ô��, 
		 * 		��������ش�ķ�����80����,
		 * 	  Ů����˵"��̽��Ұ�!"
		 * 		����ش�ķ�����80������, Ů����˵"��ú���ϰ!"
		 */
		    System.out.println(" ��Java�ɼ���ô�������˶��ٷ֣�");
		int chengJi1 = sc.nextInt();
		if (chengJi1>80) {
			System.out.println("��̽��Ұ�!");	 
		}else {
			System.out.println("��ú���ϰ!");
		}
	}

}
