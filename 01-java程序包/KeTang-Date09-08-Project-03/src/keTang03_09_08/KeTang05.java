/**
 * 
 */
package keTang03_09_08;

/**
 * @author EDZ
 *
 */
public class KeTang05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double A = 6361,B = 365;				
			int C =(int) (A/B);		
		double D = A/B;		
		double E = D-C;		
			int F =(int)(E*365);		
				System.out.println(C+"����"+F+"\n");
	}

}
