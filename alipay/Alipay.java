package alipay;

import java.util.Random;
import java.util.Scanner;



public class Alipay  {

		 public static double Alipay(){
			 	//支付宝支付
			 	int price;
			 	price = (int) (Math.random()*10+300);
			 	
			 	System.out.println("随机红包:"+price);
		       
		        return price;
		    }

			//微信支付
		 	public static double Alipay2(){
			 	
			 	int price;
			 	price = (int) (Math.random()*10+400);
			 	
			 	System.out.println("随机红包:"+price);
		       
		        return price;
		    }
	
		 
		}


