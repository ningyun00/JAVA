/**
 * 
 */
package keHou05_09_10;

import java.util.Random;//随机数

import java.util.Scanner;//扫描仪
/**
 * @author EDZ
 *
 */
public class KeHou02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random rd = new Random();//随机数对象
			int dn = rd.nextInt(3)+1;//1~3  
		Scanner sc = new Scanner(System.in);//创建对象
		System.out.print("请出拳（1代表石头，2代表剪刀，3代表布）");
			int ren  = sc.nextInt();
		if(ren>0 && ren<4){//1~3
			if((ren==1 && dn==2) ||(ren==2 && dn==3) ||(ren==3 && dn==1)){//ren赢
				System.out.println("电脑出的："+dn);
				System.out.println("人赢");	
			} else if((ren==1 && dn==3) ||(ren==2 && dn==1) ||(ren==3 && dn==2)){//dn赢
				System.out.println("电脑出的："+dn);
				System.out.println("电脑赢");	
			}else{
				System.out.println("电脑出的："+dn);
				System.out.println("平局");	
			}
			}else{
				System.out.println("你的输入有误！");	
		}
		
	}		
	
}


