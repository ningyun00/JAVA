/**
 * 
 */
package luanceshi;

import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class CeShi03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in); 
			System.out.println("��ӭʹ��������");	 
			System.out.println("���������");	   
				int year = sc.nextInt();//��
			System.out.println("�������·�");
				int month = sc.nextInt();	//��
				int sum = 0;	//������
		for (int i = 1900;i < year; i++) {//1900+��year	
			if(i%4 == 0 && i%100 != 0 || i%400 == 0){//�ж��Ƿ�Ϊ����
				sum += 366;	//����	
			} else {		
				sum += 365;	//ƽ��
			}
	
		}	 
	    for(int j = 1;j < month; j++){//�Լӵ������·�
	    	switch(j){//�·��ж�	
	    		case 2:		//����	 
  			if(year%4 == 0 && year%100 != 0 || year%400 == 0){
		  		sum += 29;//�������	
  			} else {				  
	 	        sum += 28;//ƽ�����
  			}		
  				break;	
				case 4:	
				case 6:	
			    case 9:	
				case 11:	
				    sum += 30;//С��30��	
				    break;	
				default://�������С����ִ�д���	
					sum += 31;//����31��		
					break;	
				}	
		    
	    	}
	    	int t = 0;	  
		 	switch(month){	//�ж��Լ�������·��ǵڼ����� 
		 		case 2:	
		 	if (year%4 == 0 && year%100 != 0 || year%400 == 0) {//�����ж�
				t += 29;	//�������
		  	} else {		
	  			t += 28;	//ƽ�����
			}	    
			  break;	
			  case 4:	 
			  case 6:	
			  case 9:	
			  case 11:		
				  t += 30;//����С��		
				  break;	
			  default://���������ִ�����£�		
				  t += 31;//���ܴ���
				  break;	 
			 }	 	   
		 	int kg = (sum%7)%7;//�ո������kg��������%һ������7����%7��
			System.out.println("һ\t��\t��\t��\t��\t��\t��");//��ͷ										 
		for (int i = 1;i <= kg; i++) {//�ո�
			System.out.print("\t");	 //��ӡ�Ʊ��������ʽ�������� 
			}	   
		for (int j = 1;j <= t; j++) {//�������
			System.out.print(j+"\t");//��ӡÿ�����ڲ�ʹ���Ʊ��		 
			if ((kg+j)%7 == 0) {//����ո�����������ģ7�����0�ͻ���			 
			System.out.println();//����		  
			}	   
		
		}	      

	}

}
