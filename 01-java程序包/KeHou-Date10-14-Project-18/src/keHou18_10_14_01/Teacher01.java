package keHou18_10_14_01;

public class Teacher01 {
	/**1. 定义一个老师类 Teacher
	老师类的属性: 姓名,年龄,性别,婚否(已婚/未婚)
	老师类的方法:
	1. 无参无返自我介绍方法: 输出老师对象的所有属性
	2. 无参无返上班方法: 输出"XXX 老师正在上班的途中,很辛苦" 
	3. 无参无返下班方法: 输出"XXX 老师正在下班的途中,顺道买个菜" 
	4. 无参无返睡觉方法: 输出"XXX 老师正在睡觉, 请勿打扰" 
	1. 无参有返讲课方法: 输出"老师正在唾沫横飞的讲课",并返回字符串"Java 知识" 
	2. 无参有返报时方法: 输出"老师看了看时间", 并返回一个时间整数.如: 9
	3. 无参有返老师下厨方法: 输出"老师正在炒菜", 并返回菜名"酸辣鱿鱼丝" 
	4. 无参有返老师买饮料方法: 返回饮料名"一瓶脉动" 
	5. 无参有返老师借用手机方法: 返回"一部手机"*/
	//属性
	String name = "yun";
	int age = 20;
	String sex = "女"; 
	String JeiHun = "未婚";
	//1.方法无返
	public void jeishao() {
		System.out.println("姓名："+name
						  +"年龄："+age
						  +"性别："+sex
						  +"婚否："+JeiHun);
	}
	
	//2.
	public void shangban() {
		System.out.println(name+"老师正在上班的途中,很辛苦");
	}
	
	//3.
	public void xiaban() {
		System.out.println(name+"老师正在下班的途中,顺道买个菜");
	}
	
	//4.
	public void shuijiao() {
		System.out.println(name+"老师正在睡觉, 请勿打扰");
	}
	
	//1.有返
	public String jiangke() {
		return "Java";
	}
	
	//2.
	public int time() {
		return 6;
	}
	
	//3.
	public String chaocai() {
		return "酸菜鱼";
	}
	
	//4.
	public String yinliao() {
		return "一瓶脉动";
	}
	
	//5.
	public String shouji() {
		return "一部手机";
	}
}
