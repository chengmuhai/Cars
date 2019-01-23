package admin;

import java.util.Random;
import java.util.Scanner;


public class Admin {
	// 随机数
	 public static String suijishu(){
	        Random rds=new Random();
	        char suijishu[]={'1','2','3','4','5','6','7','8','9','0'
	        		        ,'a','b','c','d','e','A','B','C','D','E'};
	        String code="";
	        for(int i=0;i<4;i++){
	            int tmp=rds.nextInt(suijishu.length);
	            code=code+suijishu[tmp];
	        }
	        return code;
	    }

	 // 验证码
	 public void yzm1(){
		 	Admin yz=new Admin();
		 	Scanner input =new Scanner(System.in);
		 	while(true){
		 		
	    //临时变量temp记录随机码
	    String temp= yz.suijishu();
	    System.out.println("验证码:"+temp);
	    System.out.print("请输入验证码：");
	    String yzm=input.next();
	    //验证码正确
	    if(yzm.equalsIgnoreCase(temp)){
	        
	            System.out.println("注册成功！");
	            break;
	        }else{
	        System.out.println("验证码错误！");
	        }
		 	}
	 }
	 public void yzm2(){
		 	Admin ts=new Admin();
		 	Scanner input =new Scanner(System.in);
		 	while(true){
		 		
	    //临时变量temp记录随机码
	    String temp= ts.suijishu();
	    System.out.println("验证码:"+temp);
	    System.out.print("请输入验证码：");
	    String yzm=input.next();
	    //验证码正确
	    if(yzm.equalsIgnoreCase(temp)){
	        
	            System.out.println("登录成功！");
	            break;
	        }else{
	        System.out.println("验证码错误！");
	        }
		 	}
	 }
}
