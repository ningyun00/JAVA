/**
 * 
 */
package keHou09_09_15;

/**
 * @author EDZ
 *
 */
public class KeHou05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*5.һ���100�׸߶��������£�
		 * ÿ����غ�����ԭ�߶ȵ�һ�룻
		 * �����£������ڵ�10�����ʱ��
		 * �����������ף���10�η�����ߣ�
		 * (�ó���ʵ��) 
		 */	
		double A = 100;
		double C = 0;
		double B = 100;
		
		for(int i = 1;i <= 10;i++) {
			if(i != 1) {
				C = (A/2);
				A = C;
				B += (A*2);
				
			}
			System.out.println("��"+i+"��"+"�����߶�Ϊ��"+B+"��");
		}

	}

}
