package qita03;
/**
 * �˻���
 * @author ��
 *
 */
public class Account01 {
	public double blance;//���
	/**
	 * ��ȡ���
	 */
	public void getBlance() {
		System.out.println("****��ǰ����ǣ�"+blance+"Ԫ*****");
		
	}
	/**
	 * ��Ǯ�ķ���
	 * @param money Ҫ�����Ǯ
	 */
	public void saveMoney(double money) {
		blance = blance+money;//��Ǯ
		System.out.println("���ɹ���");
		System.out.println();
		getBlance();//���������ʾ;
	}
	/**
	 * ȡǮ�ķ���
	 * @param money Ҫȡ��Ǯ
	 */
	public void takeMoney(double money) {
		//�ж�ȡ���Ľ���Ƿ�С�ڵ��������������ʾ
		if (money>blance) {
			System.out.println("���㣡");
			
		}else {
			blance = blance - money;
			System.out.println("ȡ��ɹ�");
			getBlance();
		}
		
	}
	
}
