package luanceshi;
import  java.util.Scanner;
public class CeShi06{

	public static void main(String[] args) {
		// ��һ��ѧԱ�ĳɼ�{99��85��82��63�� 60}�������ǰ��������С�
		//Ҫ����һ��ѧԱ�ĳɼ�����������ɼ����У�����������
		int[] scores = new int[6];
			scores[0]=99;
			scores[1]=85;
			scores[2]=82;
			scores[3]=63;
			scores[4]=60;
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("�����������ɼ���");
		int num  = sc.nextInt();//�����ɼ�
		int index =scores.length;//�����λ��
		
		//�ҵ���Ԫ�صĲ���λ��
		for (int i = 0; i < scores.length; i++) {
			if(num> scores[i]){
				index = i;
				break;
			}
		}
		
		//Ԫ�غ���
		for (int i = scores.length-1; i >index ; i--) {
			scores[i] = scores[i-1];//�±꿪ʼ��Ԫ�غ���һ��λ��
		}
		
		scores[index] = num;//��������
		
		System.out.println("����ɼ����±��ǣ�"+index);
		System.out.println("�����ĳɼ���Ϣ�ǣ�");
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		
		
	}

}
