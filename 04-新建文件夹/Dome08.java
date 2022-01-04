import java.util.Scanner;

import java.util.Random;

public class Dome08 {

	public static void main(String[] args) {

		Scanner ning = new Scanner(System.in);
			String B = null ;//为什么这个要写外面。null“存放空值”也可以写成String B = "";
            //解释：写里面就无法让while(!B.equals("是"))读取。
        Random yun = new Random();
            int E = yun.nextInt(9999)+1000;
                String C = null,F = null,G = nul,H = null;
		do {
            System.out.println("**************************************");
		    System.out.println("\t    欢迎进入奖客富翁系统");
		    System.out.println("\t\t1.注册");
		    System.out.println("\t\t2.登录");
		    System.out.println("\t\t3.抽奖");
		    System.out.println("**************************************");
			System.out.print("请选择菜单：");
				int A = ning.nextInt();    //菜单选择
			if (A <= 0 || A > 3) {         //选择的数字判断
				System.out.println("输入错误");
			} else {
				switch (A) {               //switch内进行选择
				case 1: 
					System.out.println("奖客富翁系统>注册");
                    System.out.println("用户名\t用户密码\t会员卡号");
			        System.out.println(C+"\t"+D+"\t"+E);
			        System.out.print("是否结束：");//给出结束语句选择
				        B = ning.next();        //当给出是跳到while外，当给出否继续循环 
		            if (!B.equals("是")) {        //判断是否继续
					    System.out.println("**************************************");
					    System.out.println("\t    欢迎进入奖客富翁系统");
					    System.out.println("\t\t1.注册");
					    System.out.println("\t\t2.登录");
					    System.out.println("\t\t3.抽奖");
					    System.out.println("**************************************");
					    System.out.print("请选择菜单：");
						    A = ning.nextInt();
					    if (A == 2) {        //选择2.登录
					          System.out.println("奖客富翁系统>登录");
						        	int P = 0;
						    do {//由于要进行比较所以数据类型储存放在了最上面		
						        System.out.println("输入用户名：");
						        	F = ning.next();
						        System.out.println("输入用户密码：");
					        		G = ning.next();
						        	P++;//累加，直到加到第三次
                               if (!(C.equals(F) && D.equals(G))) {
						        System.out.println("输入错误");
						       }
						       } while (!(C.equals(F) && D.equals(G)) && !(P == 3));
					//判断循环是否结束：当C不等于F 且 D不等于G 并且 P不等于3继续循环  
                                 if (P == 3) {//判断当P==3结束
							     break;    //一直循环是否结束，知道选择是结束
							    } else {//否则登录成功
								System.out.println("欢迎您："+C+"登录成功");
							break;
							}
						
					    } else {//其它情况,这种情况较少
						    System.out.println("系统退出，谢谢使用。");
				    	break;
					    }
						
			    	}
                    break;		
				case 3:     //抽奖
					System.out.println("奖客富翁系统>抽奖");
                for (int i = 1; i <= 5; i++) {
					 H = yun.nextInt(9999)+1000;
					System.out.print(H+"\t");
			    }
					System.out.println();
				if (E == H) {
					System.out.println("恭喜你是幸运会员");
				} else {
					System.out.println("很遗憾你不是幸运会员");
				}
				break;
		        }System.out.print("是否结束：");
					B = ning.next();      
			}
            
		} while (!B.equals("是"));    
		System.out.println("系统退出，谢谢使用。");
	}

}

 