package car;

import java.util.Random;
import java.util.Scanner;
import admin.UserTest;
import alipay.Alipay;

public class Carshow {
	// 当用final修饰一个类时，表明这个类不能被继承。也就是说，如果一个类你永远不会让他被继承，就可以用final进行修饰
	 private static final String Car = null;
	 private static final Car PassengerCar = null;

	public void carshow() {
		
		    System.out.println("欢迎使用腾飞汽车租赁网上商店！");
		    System.out.println("请选择是否租车:0、是  1、否");
		    Scanner input = new Scanner(System.in);
		    Car[] cars = new Car[7];
		    int choose = input.nextInt();
		    if(choose == 0){
		        System.out.println("本公司可租赁车辆如下：");
		        System.out.println("编  号\t" + "汽  车 品 牌\t\t" + "租\t金\t" + "  容量(载人/载货)");
		        cars[0] = new PassengerCar(1,"奥迪A4",500.0,5);
		        cars[1] = new PassengerCar(2,"马自达6",400.0,5);
		        cars[2] = new Loader(3,"江铃皮卡",450.0,4,2.0);
		        cars[3] = new PassengerCar(4,"金龙客车",800.0,20);
		        cars[4] = new Goods(5, "松花江",400.0,15.0);
		        cars[5] = new Goods(6,"依维柯",1000.0,20.0);
		      
		        for(int i = 0;i < cars.length-1;i++){
		            System.out.println("编号:" + cars[i].getNumber()+"\t"+ "品牌:" + cars[i].getBrand()+"\t"+"租金:" + cars[i].getFee()
		                    + "/天 "+"\t"+ "载客量:" + cars[i].getPersonCapacity() + "人  载货量" + ((Car) cars[i]).getGoodCapacity()
		                    + "吨");
		        }
		     }else{
		        System.out.println("您已取消租车，退出系统!    ");
		        return;
		    }
		    System.out.println("请输入您要租几种车:");
		    int [] choiceCars = new int[6];
		    //接收需要租几种车的值
		    int carNum = input.nextInt();
		    for(int i = 1;i <= carNum;i++){
		        System.out.println("请输入您选择的第 " + i + " 种车型的编号：" );
		        //接收用户选择车型的编号
		        int num = input.nextInt(); //去掉-1也没有报错
		        System.out.println(cars[num].getBrand() + " 总共需要多少辆：");
		        //每一种类型的车需要的数量
		        int num2 = input.nextInt();
		        //choiceCars数组表示用户选择的车型编号以及对应需要租的数量
		        choiceCars[num] = num2;
		    }
		    System.out.println("请输入租车天数：");
		    int daysNum = input.nextInt();
		    System.out.println("您的账单：--------------------------");
		    double total = 0;
		    for(int i = 0;i < cars.length-1;i++){
		        if(choiceCars[i] != 0){
		            System.out.println(choiceCars[i] + "辆" + cars[i].getBrand() + "   总共载客量:" +
		                    choiceCars[i] * cars[i].getPersonCapacity() + "人" +
		                    "   总共载货量:" + choiceCars[i] * cars[i].getGoodCapacity() + "吨" +
		                    "   " + daysNum + "天单项费用:" + choiceCars[i] * cars[i].getFee() * daysNum + "元");
		            total = choiceCars[i] * cars[i].getFee() * daysNum;
		        }
		    }
		    System.out.println("租车总费用:" + total + "元");
		    System.out.println("请您选择支付方式 1.支付宝支付 2.微信支付 3.刷卡支付 4.现金支付");
		    int  choice= input.nextInt();
		    switch (choice) {
			case 1:
				System.out.println("支付宝支付");
				Alipay pay = new Alipay();
				if (total>1500) {
					int price = (int) (total-(pay.Alipay())); 
					System.out.println("优惠后您需要支付的费用是："+price);
					break;
				}else{
					System.out.println("支付的费用是："+total);
				}
			
				
				break;
			case 2:
				System.out.println("微信支付");
				Alipay pay1 = new Alipay();
				if (total>1500) {
					int price = (int) (total-(pay1.Alipay2())); 
					System.out.println("优惠后您需要支付的费用是："+price);
					break;
				}else{
					System.out.println("支付的费用是："+total);
				}
				
			case 3:
				System.out.println("刷卡支付");
				int price2 = (int) (total*0.8);
				System.out.println("优惠后您需要支付的费用是："+price2);
			case 4:
				System.out.println("现金支付");
				System.out.println("请输入您要支付的费用:");
				int money = input.nextInt();
				if(money==total){
					System.out.println("您支付费用为:"+money);
					break;
				}else if(money > total){
					price2 = (int) (money -total);
					System.out.println("找零"+price2);
					break;
				}else{
					System.out.println("");
				}

			default:
				System.out.println("输入有误！请重新输入");
				break;
			}
		    
		    System.out.println("欢迎下次光临------------------------");
		}


	}

