package keHou14_10_09;

public class KeHou04 {

	public static void main(String[] args) {
		/*4. ����һ������ arr ֵΪ{"��ʹ","��Ů","��ħ","����","ħ��"}������һ������ brr ֵ
		Ϊ{"����ʹ","����","���"}�ϲ���һ�µ����� crr.*/
			String arr [] = new String [] {"��ʹ","��Ů","��ħ","����","ħ��"};
				//����5������
			String brr [] = new String [] {"����ʹ","����","���"};
				//����3������
			String crr [] = new String [arr.length+brr.length]; 
				//����8������
		for (int i = 0; i < arr.length; i++) {//ѭ��5�θ�ֵ��arr[i];
			crr[i] = arr[i]; 
		}
		for (int i = 0; i < brr.length; i++) {//ѭ��3�θ�ֵ����5,6,7�±괦
			crr[arr.length+i]=brr[i];
		}
		for (int i = 0; i < crr.length; i++) {//ѭ�����
			System.out.print(crr[i]+" ");
		}
		
	}

}
