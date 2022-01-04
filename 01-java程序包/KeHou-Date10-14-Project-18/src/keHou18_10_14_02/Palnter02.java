package keHou18_10_14_02;

public class Palnter02 {
	/**2. 定义一个画家类 Painter
	画家类的属性: 画家姓名, 画家国籍, 画家性别
	画家类的方法:
	1. 无参无返介绍方法: 输出画家的信息
	2. 无参无返打印正方形方法: 输出一个正方形
	3. 无参无返打印直角三角形方法: 输出一个直角三角形
	4. 无参无返打印三角形方法: 输出一个直角三角形
	
	1. 无参有返获取画家姓名: 返回画家的姓名
	2. 无参有返获取画家国籍: 返回画家的国籍
	3. 无参有返获取画家性别: 返回画家的性别
	4. 无参有返画家请客方法: 返回 500 块
	5. 无参有返画家孝敬方法: 返回礼品"一盒花旗参*/
	
	//属性
	String name = "寜";
	String nationality = "中国";
	String sex = "男";
	
	//1.方法
	public void jeiShao() {
		System.out.println("画家姓名："+name
						  +"画家国籍："+nationality
						  +"画家性别："+sex);
	}
	
	//2.
	public void daYin() {
		for (int i = 1; i < 5; i++) {//列
			if (i>=2&&i<=3) {
				for (int j = 1; j <= 5; j++) {//行
					if (j==1||j==4) {
						System.out.print("*");
					} else if (j>=1||j<=4){
						System.out.print("    ");
					}
					
				}
				
			}else if(i==1||i==4){
				for (int j = 1; j < 5; j++) {
					System.out.print("*  ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	//3.
	public void zhiJiao() {
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//4.
	public void sanJiaoXing() {
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	
	//1.
	public String Name() {
		return name;
	}
	
	//2.
	public String Nationality() {
		return nationality;
	}
	
	//3.
	public String Sex () {
		return sex;
	}
	
	//4.
	public int money() {
		return 500;
	}
	
	//5.
	public String xiaoJing() {
		return "一盒花旗参";
	}
	
}
