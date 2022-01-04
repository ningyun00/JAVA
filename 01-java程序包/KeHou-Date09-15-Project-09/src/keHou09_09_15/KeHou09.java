/**
 * 
 */
package keHou09_09_15;
import java.util.Random;
/**
 * @author EDZ
 *
 */
public class KeHou09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*9、让计算机随机产生10个0到2之间的数，
		 * 如果产生的是0就输出“生成了一只白猪，我好怕怕”，
		 * 如果产生的是1就输出“生成了一只黑猪，我喜欢”
		 * 如果产生的是2就输出“生成了一只红猪，有下酒菜了”。
		 * */
		 Random ning = new Random();
		 	
		 	for (int B = 0;B <= 10;B++) {
		 		int A = ning.nextInt(3)+0;
		 		if(A==0) {
		 			System.out.println("生成了一只白猪，我好怕怕");
		 		}else if (A==1) {	
		 			System.out.println("生成了一只黑猪，我喜欢");
		 		}else if (A==2){
		 			System.out.println("生成了一只红猪，有下酒菜了");
		 		}
		 		
		 	}
		
		
		
		
		
		
		
		
	}

}
