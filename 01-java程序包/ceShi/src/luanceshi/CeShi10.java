package luanceshi;

public class CeShi10 {
	
	public static void main(String[] args) {
		//方法
		/*total---总计
		 * max---最高的
		 * min---最小的
		 * bios---生长素
		 * function---功能
		 * prototype---原型
		 * swap---交换
		 * */
		//列题
		/**
		 * 程序功能：求某班一门成绩的最高分、最低分、平均分。
		 * */
		int i,avg,max,min,score[]= {
		85,86,57,78,49,67,66,85,86,57,
		78,49,67,66,37,46,58,64,79,84,
		54,65,84,54,65,64,86,98,36,65,};
		int total = 0;
		max = min = score[0];
		for (i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
			total += score[i];
		}
		avg = total/10;
		System.out.println("最高分"+max);
		System.out.println("最低分"+min);
		System.out.println("平均分"+avg);
		
		/*[修饰符] [返回值类型] 方法名(){
		 * //语句
		 * }
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//类
		/*attribute---属性
		 * state---状况
		 * behavior---行为
		 * talk---谈话
		 * walk---走
		 * class---等级
		 * new---新的
		 * lang---长的
		 * */
		
		/*形式
		 * [类修饰符] class 类名[extends 父类名称] [impleements接口列表]{
		 *<类主题部分>
		 *成员变量列表
		 *成员方法列表
		 *	}
		 **/
		
		/*public class Person extends Object{
		 *  ...//代码块  
		 *  }
		 * */
		
		/*public class Address{
		 *  //成员变量
		 *private String name;
		 *private String email;
		 *  //成员方法
		 *  public void showAddress(){
		 *	...//实现 	
		 *  	}
		 *  
		 *  }
		 * */
		
		/*class Book1{
		 * 	public String name;
		 *  public float price; 
		 * 	}
		 *class Book2{
		 *	public String name;
		 *	public folat price;
		 *	}
		 * */
		
		/*	//public 修饰符的类名必须与文件名相同
		 *public class Book{
		 * 	public static void main(Strint []args){
		 * 	BooK1 book = new Book1();
		 * 	Book2 book = new Book2();
		 *	...//其它代码
		 * 		}
		 *  
		 * 	}
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
