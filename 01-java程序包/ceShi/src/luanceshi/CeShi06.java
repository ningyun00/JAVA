package luanceshi;
import  java.util.Scanner;
public class CeShi06{

	public static void main(String[] args) {
		// 有一组学员的成绩{99，85，82，63， 60}，将它们按升序排列。
		//要增加一个学员的成绩，将它插入成绩序列，并保持升序
		int[] scores = new int[6];
			scores[0]=99;
			scores[1]=85;
			scores[2]=82;
			scores[3]=63;
			scores[4]=60;
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入新增成绩：");
		int num  = sc.nextInt();//新增成绩
		int index =scores.length;//插入的位置
		
		//找到新元素的插入位置
		for (int i = 0; i < scores.length; i++) {
			if(num> scores[i]){
				index = i;
				break;
			}
		}
		
		//元素后移
		for (int i = scores.length-1; i >index ; i--) {
			scores[i] = scores[i-1];//下标开始的元素后移一个位置
		}
		
		scores[index] = num;//插入数据
		
		System.out.println("插入成绩的下标是："+index);
		System.out.println("插入后的成绩信息是：");
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		
		
	}

}
