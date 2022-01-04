package keTang19_10_15_01;

import java.util.Random;

import java.util.Scanner;
/**
 * @author 寜
 */
public class Kitchener01 {
	/*1. 定义一个厨师类Kitchener
	厨师类的属性: 姓名, 性别, 厨艺等级(1/2/3), 厨龄
	厨师类的方法: 
   		 */
	/**
	 * @apiNote name 姓名
	 * @apiNote sex 性别
	 * @apiNote dengJi 等级
	 * @apiNote chuLing 厨龄
	 */
	String name;
	String sex;
	int dengJi;
	int chuLing;
	
	/**
	 * 方法
//	 、*/
	Random yun = new Random();
	Scanner ning = new Scanner(System.in);
	
//	1. 修改厨艺等级的方法(有参无返)
	public void DengJi(int dengJi) {
		System.out.println("厨艺等级为："+dengJi);
	}
	
//	2. 修改厨龄的方法(有参无返)
	public void ChuLing(int chuLing) {
		System.out.println("厨龄为："+chuLing);
	}
	
//	3. 厨师参加厨艺大师赛, 赠送观众点心(无参有返)
	public String ZengSong() {
		return "曲奇饼"; 
	}
	
//	4. 厨师抽奖方法, 随机1-10数字做一道菜送给观众(无参有返)
//	   1. 铁板鱿鱼须2. 芹菜炒牛肉3. 口味蟹4. 北京烤鸭5. 水煮鱼片6. 孜然牛肉
//	   7,8,9,10 农家小炒肉
	public String ChouJiang() {
		int couJiang =  yun.nextInt(10)+1;
		String cai = null;
		switch (couJiang) {
		case 1:
			cai = "铁板鱿鱼须";
			break;
		case 2:
			cai = "芹菜炒牛肉";
			break;
		case 3:
			cai = "口味蟹";
			break;
		case 4:
			cai = "北京烤鸭";
			break;
		case 5:
			cai = "水煮鱼片";
			break;
		case 6:
			cai = "孜然牛肉";
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			cai = "农家小炒肉";
			break;
		}
		return cai;
	}
	
//	5. 给厨师一个蔬菜, 为你做出一份"XX炒野山椒牛肉"(有参有返)
	public String ShuCai(String shuCai) {
		System.out.println(shuCai+"炒野山椒牛肉");
		return shuCai;
	}
	
//	6. 给厨师一个荤菜, 为你做出一份"淮山炖XX"(有参有返)
	public String HunCai(String hunCai) {
		System.out.println("淮山炖"+hunCai);
		return hunCai;
	}
	
//	7. 告诉厨师你的厨龄, 厨师根据你的年龄推断你的厨艺等级(有参有返)
//	   1-8年等级3  9-15年等级2  15年以上等级1
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
	
//	8. 给厨师1荤1素, 为你做出"XX雪莲清蒸XX"(有参有返)
	public String HunSu(String hun,String su) {
		System.out.println(hun+"雪莲清蒸"+su);
		return "";
	} 
	
//	9.9. 厨师买菜方法,1-5元青菜,6-10元猪肉,11-15牛肉,16-20螃蟹(有参有返)
	public int MaiCai(int qin,int zhu,int nui,int pang) {
		System.out.println("买了："+qin+"元青菜；"
						 + "买了："+zhu+"元猪肉；"
						 + "买了："+nui+"元牛肉；"
						 + "买了："+pang+"元螃蟹");
		return 1;
	}
	
}
