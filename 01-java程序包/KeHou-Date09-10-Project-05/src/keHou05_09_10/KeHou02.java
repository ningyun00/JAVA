/**
 * 
 */
package keHou05_09_10;

import java.util.Random;//�����

import java.util.Scanner;//ɨ����
/**
 * @author EDZ
 *
 */
public class KeHou02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Random rd = new Random();//���������
			int dn = rd.nextInt(3)+1;//1~3  
		Scanner sc = new Scanner(System.in);//��������
		System.out.print("���ȭ��1����ʯͷ��2���������3������");
			int ren  = sc.nextInt();
		if(ren>0 && ren<4){//1~3
			if((ren==1 && dn==2) ||(ren==2 && dn==3) ||(ren==3 && dn==1)){//renӮ
				System.out.println("���Գ��ģ�"+dn);
				System.out.println("��Ӯ");	
			} else if((ren==1 && dn==3) ||(ren==2 && dn==1) ||(ren==3 && dn==2)){//dnӮ
				System.out.println("���Գ��ģ�"+dn);
				System.out.println("����Ӯ");	
			}else{
				System.out.println("���Գ��ģ�"+dn);
				System.out.println("ƽ��");	
			}
			}else{
				System.out.println("�����������");	
		}
		
	}		
	
}


