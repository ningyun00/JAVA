package luanceshi;

public class CeShi10 {
	
	public static void main(String[] args) {
		//����
		/*total---�ܼ�
		 * max---��ߵ�
		 * min---��С��
		 * bios---������
		 * function---����
		 * prototype---ԭ��
		 * swap---����
		 * */
		//����
		/**
		 * �����ܣ���ĳ��һ�ųɼ�����߷֡���ͷ֡�ƽ���֡�
		 * */
		int i,avg,max,min,score[]= {
		85,86,57,78,49,67,66,85,86,57,
		78,49,67,66,37,46,58,64,79,84,
		54,65,84,54,65,64,86,98,36,65,};
		int total = 0;
		max = min = score[0];
		for (i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
			total += score[i];
		}
		avg = total/10;
		System.out.println("��߷�"+max);
		System.out.println("��ͷ�"+min);
		System.out.println("ƽ����"+avg);
		
		/*[���η�] [����ֵ����] ������(){
		 * //���
		 * }
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//��
		/*attribute---����
		 * state---״��
		 * behavior---��Ϊ
		 * talk---̸��
		 * walk---��
		 * class---�ȼ�
		 * new---�µ�
		 * lang---����
		 * */
		
		/*��ʽ
		 * [�����η�] class ����[extends ��������] [impleements�ӿ��б�]{
		 *<�����ⲿ��>
		 *��Ա�����б�
		 *��Ա�����б�
		 *	}
		 **/
		
		/*public class Person extends Object{
		 *  ...//�����  
		 *  }
		 * */
		
		/*public class Address{
		 *  //��Ա����
		 *private String name;
		 *private String email;
		 *  //��Ա����
		 *  public void showAddress(){
		 *	...//ʵ�� 	
		 *  	}
		 *  
		 *  }
		 * */
		
		/*class Book1{
		 * 	public String name;
		 *  public float price; 
		 * 	}
		 *class Book2{
		 *	public String name;
		 *	public folat price;
		 *	}
		 * */
		
		/*	//public ���η��������������ļ�����ͬ
		 *public class Book{
		 * 	public static void main(Strint []args){
		 * 	BooK1 book = new Book1();
		 * 	Book2 book = new Book2();
		 *	...//��������
		 * 		}
		 *  
		 * 	}
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
