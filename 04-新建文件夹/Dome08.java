import java.util.Scanner;

import java.util.Random;

public class Dome08 {

	public static void main(String[] args) {

		Scanner ning = new Scanner(System.in);
			String B = null ;//Ϊʲô���Ҫд���档null����ſ�ֵ��Ҳ����д��String B = "";
            //���ͣ�д������޷���while(!B.equals("��"))��ȡ��
        Random yun = new Random();
            int E = yun.nextInt(9999)+1000;
                String C = null,F = null,G = nul,H = null;
		do {
            System.out.println("**************************************");
		    System.out.println("\t    ��ӭ���뽱�͸���ϵͳ");
		    System.out.println("\t\t1.ע��");
		    System.out.println("\t\t2.��¼");
		    System.out.println("\t\t3.�齱");
		    System.out.println("**************************************");
			System.out.print("��ѡ��˵���");
				int A = ning.nextInt();    //�˵�ѡ��
			if (A <= 0 || A > 3) {         //ѡ��������ж�
				System.out.println("�������");
			} else {
				switch (A) {               //switch�ڽ���ѡ��
				case 1: 
					System.out.println("���͸���ϵͳ>ע��");
                    System.out.println("�û���\t�û�����\t��Ա����");
			        System.out.println(C+"\t"+D+"\t"+E);
			        System.out.print("�Ƿ������");//�����������ѡ��
				        B = ning.next();        //������������while�⣬�����������ѭ�� 
		            if (!B.equals("��")) {        //�ж��Ƿ����
					    System.out.println("**************************************");
					    System.out.println("\t    ��ӭ���뽱�͸���ϵͳ");
					    System.out.println("\t\t1.ע��");
					    System.out.println("\t\t2.��¼");
					    System.out.println("\t\t3.�齱");
					    System.out.println("**************************************");
					    System.out.print("��ѡ��˵���");
						    A = ning.nextInt();
					    if (A == 2) {        //ѡ��2.��¼
					          System.out.println("���͸���ϵͳ>��¼");
						        	int P = 0;
						    do {//����Ҫ���бȽ������������ʹ��������������		
						        System.out.println("�����û�����");
						        	F = ning.next();
						        System.out.println("�����û����룺");
					        		G = ning.next();
						        	P++;//�ۼӣ�ֱ���ӵ�������
                               if (!(C.equals(F) && D.equals(G))) {
						        System.out.println("�������");
						       }
						       } while (!(C.equals(F) && D.equals(G)) && !(P == 3));
					//�ж�ѭ���Ƿ��������C������F �� D������G ���� P������3����ѭ��  
                                 if (P == 3) {//�жϵ�P==3����
							     break;    //һֱѭ���Ƿ������֪��ѡ���ǽ���
							    } else {//�����¼�ɹ�
								System.out.println("��ӭ����"+C+"��¼�ɹ�");
							break;
							}
						
					    } else {//�������,�����������
						    System.out.println("ϵͳ�˳���ллʹ�á�");
				    	break;
					    }
						
			    	}
                    break;		
				case 3:     //�齱
					System.out.println("���͸���ϵͳ>�齱");
                for (int i = 1; i <= 5; i++) {
					 H = yun.nextInt(9999)+1000;
					System.out.print(H+"\t");
			    }
					System.out.println();
				if (E == H) {
					System.out.println("��ϲ�������˻�Ա");
				} else {
					System.out.println("���ź��㲻�����˻�Ա");
				}
				break;
		        }System.out.print("�Ƿ������");
					B = ning.next();      
			}
            
		} while (!B.equals("��"));    
		System.out.println("ϵͳ�˳���ллʹ�á�");
	}

}

 