/**
 * 
 */
package keTang04_09_09;

/**
 * @author EDZ
 *
 */	
import java.util.Scanner;
public class KeTang01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������		
		Scanner sc = new Scanner(System.in);
		/* 1.����һ��������
		 * 	���������������ڵ���1000��
		 * 	��ô������������>=1000��,
		 * 	����Ļ���������������<1000����
         *	��ʹ��if-else��ɨ����Scanner�������ݣ�
		 */
			System.out.print("������һ������");
		int chengJi0 = sc.nextInt();
		if (chengJi0 >= 1000) {
		    System.out.println("�������>=1000");	
		    }
		else{
		    System.out.println("�������<1000");	
		    }
		/* 2. ��������һ��3λ����������ע�ⲻ��3�����֣���Ȼ�������.
		 * 	��������357����ô���753
		 */	
		 	System.out.println("��������һ��3λ��������");
		int zhengShu0 = sc.nextInt();
		if (zhengShu0 <1000) {
			System.out.println("��֮ǰ" +zhengShu0);
			  int A = zhengShu0/100;
		      int B = zhengShu0/10%10;
		      int C = zhengShu0%10;
		    System.out.println("��֮��"+C+B+A);		     			
		}
		/*3. ��������С�����������ǵĺͣ�����ʹ���100����������������������ֵĺͣ�
		 * 	 �����С�ڵ���100���������������С�����ֵĺ�
		 *	(��ʾ: 
   		 *		�õ��������֣� �磺int a=(int)10.5;      -- ���ֵΪ10
   		 *		�õ�С�����֣� �磺double b=10.5%1       -- ���ֵΪ0.5
   		 */
		 	System.out.println("����������С��");
		double xiaoShu0 =sc.nextDouble();
		double xiaoShu1 =sc.nextDouble();
		if (((int) (xiaoShu0+xiaoShu1))>=100 ) {
		       int A1 = (int) (xiaoShu0+xiaoShu1);		
		    System.out.println("�õ��������֣�" +A1);		 	
		}else {
	    double B1 = (xiaoShu0+xiaoShu1)%1; 
			System.out.println("�õ�С�����֣�" +B1);
		}
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
		/*5. ����һ��int�͵����ݣ�
		 * 		�ж�������Ƿ��ܱ�2������
		 * 		����ܱ�2������
		 *		��ô������������ż������
		 * 		������������������������	
		 */
	
		 	System.out.println("������һ������");
		int Q = sc.nextInt();		
	        
		boolean L;
	    if (Q%2==0) {
	    	System.out.println("�������ż��");
	      }else 
	      {
	    	System.out.println("�����������");}  
	      
		
		/*6. ��������������Ȼ��������ߵ����ֵ��
		 */ 
	    int max;
			System.out.println("��������������");
			System.out.println("�������һ����");
		int zhengShu1 = sc.nextInt();
		    System.out.println("������ڶ�����");
		int zhengShu2 = sc.nextInt();
		if (zhengShu1>zhengShu2) {
		    max = zhengShu1;
		
		}else
			max = zhengShu2;
		    System.out.println("����������������ֵΪ��"+max);
		/*7.����������Ա�
		 * 	���������ڵ���7
		 * 	����������ڵ���5�����Ա����У�
		 * 	������ܰᶯ���ӣ�����������ܰᶯ���ӡ�		 
		 */     
		    System.out.println("���������䣺");
		int nianLin = sc.nextInt();
			System.out.println("�������Ա�");
		String xingBie = sc.next();
		if ( nianLin >= 7 || nianLin>=5 & xingBie.equals("��")){
	    	System.out.println("�ܰᶯ����");
	    }else
	    	System.out.println("���ܰᶯ����");
		
		    
	  }

}
