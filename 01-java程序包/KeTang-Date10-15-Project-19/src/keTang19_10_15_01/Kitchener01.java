package keTang19_10_15_01;

import java.util.Random;

import java.util.Scanner;
/**
 * @author ��
 */
public class Kitchener01 {
	/*1. ����һ����ʦ��Kitchener
	��ʦ�������: ����, �Ա�, ���յȼ�(1/2/3), ����
	��ʦ��ķ���: 
   		 */
	/**
	 * @apiNote name ����
	 * @apiNote sex �Ա�
	 * @apiNote dengJi �ȼ�
	 * @apiNote chuLing ����
	 */
	String name;
	String sex;
	int dengJi;
	int chuLing;
	
	/**
	 * ����
//	 ��*/
	Random yun = new Random();
	Scanner ning = new Scanner(System.in);
	
//	1. �޸ĳ��յȼ��ķ���(�в��޷�)
	public void DengJi(int dengJi) {
		System.out.println("���յȼ�Ϊ��"+dengJi);
	}
	
//	2. �޸ĳ���ķ���(�в��޷�)
	public void ChuLing(int chuLing) {
		System.out.println("����Ϊ��"+chuLing);
	}
	
//	3. ��ʦ�μӳ��մ�ʦ��, ���͹��ڵ���(�޲��з�)
	public String ZengSong() {
		return "�����"; 
	}
	
//	4. ��ʦ�齱����, ���1-10������һ�����͸�����(�޲��з�)
//	   1. ����������2. �۲˳�ţ��3. ��ζз4. ������Ѽ5. ˮ����Ƭ6. ��Ȼţ��
//	   7,8,9,10 ũ��С����
	public String ChouJiang() {
		int couJiang =  yun.nextInt(10)+1;
		String cai = null;
		switch (couJiang) {
		case 1:
			cai = "����������";
			break;
		case 2:
			cai = "�۲˳�ţ��";
			break;
		case 3:
			cai = "��ζз";
			break;
		case 4:
			cai = "������Ѽ";
			break;
		case 5:
			cai = "ˮ����Ƭ";
			break;
		case 6:
			cai = "��Ȼţ��";
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			cai = "ũ��С����";
			break;
		}
		return cai;
	}
	
//	5. ����ʦһ���߲�, Ϊ������һ��"XX��Ұɽ��ţ��"(�в��з�)
	public String ShuCai(String shuCai) {
		System.out.println(shuCai+"��Ұɽ��ţ��");
		return shuCai;
	}
	
//	6. ����ʦһ�����, Ϊ������һ��"��ɽ��XX"(�в��з�)
	public String HunCai(String hunCai) {
		System.out.println("��ɽ��"+hunCai);
		return hunCai;
	}
	
//	7. ���߳�ʦ��ĳ���, ��ʦ������������ƶ���ĳ��յȼ�(�в��з�)
//	   1-8��ȼ�3  9-15��ȼ�2  15�����ϵȼ�1
	public int NianLing(int dengJi) {
		if (dengJi >= 1 && dengJi <= 8) {
			dengJi = 3;			
		}else if (dengJi >= 9 && dengJi <= 15) {
			dengJi = 2;
		} else if(dengJi > 15){
			dengJi = 1;
		} else {
			dengJi = 3;
		}
		return dengJi;
	}	
	
//	8. ����ʦ1��1��, Ϊ������"XXѩ������XX"(�в��з�)
	public String HunSu(String hun,String su) {
		System.out.println(hun+"ѩ������"+su);
		return "";
	} 
	
//	9.9. ��ʦ��˷���,1-5Ԫ���,6-10Ԫ����,11-15ţ��,16-20�з(�в��з�)
	public int MaiCai(int qin,int zhu,int nui,int pang) {
		System.out.println("���ˣ�"+qin+"Ԫ��ˣ�"
						 + "���ˣ�"+zhu+"Ԫ���⣻"
						 + "���ˣ�"+nui+"Ԫţ�⣻"
						 + "���ˣ�"+pang+"Ԫ�з");
		return 1;
	}
	
}
