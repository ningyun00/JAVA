package keHou20_10_18_01;

import java.util.Scanner;
/**
 * 导包
 * @author 寜
 *
 */
public class KeHou07 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		//7.输入字符串和需要查找的字符或字符串，定位所有出现该字符或字符串的位置。
		//扫描仪
		Scanner ning = new Scanner(System.in);
		//输出提示
//		System.out.print("输入字符串：");
//			String st1 =new String(ning.next());
//		System.out.print("输入你要查找的字：");
//			String st2 =new String(ning.next());
//		for (int i = 0; i < st1.length(); i++) {
//			String st3 = st1.substring(i, i+1);
//			if (st2.equals(st3)) {
//				System.out.print(i+" ");
//			}
//			
//		}
//		
//	}
//		System.out.print("输入字符串：");
//			String st1 =new String(ning.next());
//		System.out.print("输入你要查找的字符串：");
//			String st2 =new String(ning.next());
//			String st3 = null;
//			String st4 = null;
//			int i;
//			int j;
//		for (i = 0; i < st1.length(); i++) {
//			 st3 = st1.substring(i, i+1);
//		
//			for (j = 0; j < st2.length(); j++) {
//				 st4 = st2.substring(j, j+1);
//				 if (st3.equals(st4)) {
//						System.out.print(i);
//				 }
//			 
//			}	
//		
//		}
			System.out.print("输入字符串：");
			String st1 =new String(ning.next());
		System.out.print("输入你要查找的字符串：");
			String st2 =new String(ning.next());
			String st3 = null;
			String st4 = null;
			int j;
			int j2;
			if (st2.length()>1) {
				for (j2 = 0; j2 < st1.length(); j2++) {
					st3 = st1.substring(j2,j2+1);
					for (j = 0; j < st2.length(); j++) {
						st4 = st2.substring(j,j+1);
						if (st3.equals(st4)) {
							System.out.print(j2);
						}
						
				}
					
			}
				
		}
		
	
	}
}
