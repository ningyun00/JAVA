/**
 * 
 */
package keHou09_09_15;
import java.util.Random;
/**
 * @author EDZ
 *
 */
public class KeHou09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*9���ü�����������10��0��2֮�������
		 * �����������0�������������һֻ�����Һ����¡���
		 * �����������1�������������һֻ������ϲ����
		 * �����������2�������������һֻ�������¾Ʋ��ˡ���
		 * */
		 Random ning = new Random();
		 	
		 	for (int B = 0;B <= 10;B++) {
		 		int A = ning.nextInt(3)+0;
		 		if(A==0) {
		 			System.out.println("������һֻ�����Һ�����");
		 		}else if (A==1) {	
		 			System.out.println("������һֻ������ϲ��");
		 		}else if (A==2){
		 			System.out.println("������һֻ�������¾Ʋ���");
		 		}
		 		
		 	}
		
		
		
		
		
		
		
		
	}

}
