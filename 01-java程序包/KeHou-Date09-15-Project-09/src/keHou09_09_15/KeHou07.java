/**
 * 
 */
package keHou09_09_15;

/**
 * @author EDZ
 *
 */
public class KeHou07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*7.����2000���1��1��
		 * 2008���1��1��֮������ж����졣
		 * ����ʾ��ƽ����365�죬������366�죬
		 * ѭ����2000�굽2008�������
		 * */
		int B = 366,C = 365;
		int D = 0,E = 0;
		for(int A = 1;A <9;A++) {
			if(A%4==0&&A%100!=0||A%400==0) {
						D++;					//����
			}else {
						E++;				//ƽ��
					}
			}
		System.out.println("�ܹ�"+((B*D)+(C*E)));
	}

}
