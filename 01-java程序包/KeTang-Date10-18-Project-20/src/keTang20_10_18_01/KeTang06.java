package keTang20_10_18_01;
/**
 * 
 * @author ��
 *
 */
public class KeTang06 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		// 6.�ַ���"    Hello,     baby~!    "; �����ַ�����������ո�
		//�����ַ��������
		String st = new String("    Hello,     baby~!    ");
		//���ַ�������ĳ�������ʽ�������ո�ȥ��;
		String [] st1 = st.split(" ");
		//forѭ������
		for (int i = 0; i < st1.length; i++) {
			//�������
			System.out.print(st1[i]);
		}
		
	}

}
