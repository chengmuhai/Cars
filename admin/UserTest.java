package admin;
import java.util.Scanner;
import car.Carshow;
import admin.UserLoginImpl;
import admin.User;
	 
	public class UserTest {
		public void Uesrshow() {
			
		/**
		 * 登录测试
		 * 	注册测试
		 */
			boolean falg = false;

			while (true) {
				System.out.println("********欢迎使用腾飞汽车租赁系统********");
				System.out.print("  1：注册\t");
				System.out.print("  2： 登录\t");
				System.out.println(" 3: 退出");
				System.out.println("请选择：");
				Scanner input = new Scanner(System.in);
				int  choose = input.nextInt();
			switch (choose) {
				case 1:
					System.out.println("***************注册***************");
					// 键盘录入用户信息
					System.out.print("请输入用户名：");
					String newUsername = input.next();
					// 此处可以加入判断，判断用户名是否已经存在、邮箱、电话都可以执行此操作。
					System.out.print("请输入密码：");
					String newPassword = input.next();
					System.out.print("请输入邮箱：");
					String newEmail = input.next();
					System.out.print("请输入电话：");
					String newPhone = input.next();
					Admin ad1 = new Admin();
					ad1.yzm1();
	 
					// 把数据用对象进行封装
					User user = new User();
					user.setUsername(newUsername);
					user.setPassword(newPassword);
					user.setEmail(newEmail);
					user.setPhone(newPhone);
	 
					// 创建用户操作类对象
					UserLoginImpl Udi = new UserLoginImpl();
					// 调用注册方法
					Udi.regist(user);
					System.out.println("注册成功，您的账号是："+newUsername+"\t密码是:"+newPassword);
					System.out.println("******************************************");
					falg = true;
					break;
					
				case 2:
					if(!falg ){
						System.out.println("请您先注册！");
						break;
					}
					while(true){
					System.out.println("***************登录系统***************");
					// 键盘录入信息
					System.out.print("请输入用户名：");
					String username = input.next();
					System.out.print("请输入密码：");
					String password = input.next();
					
					
					/*
					 * 多态用法 UserLogin us = new UserLoginImpl(); 具体类用法
					 */
					UserLoginImpl us = new UserLoginImpl();
					boolean flag = us.Login(username, password);
					if (flag) {
						Admin ad = new Admin();
						ad.yzm2();
						System.out.println("欢迎使用腾飞租车系统！");
						System.out.println("请上传证件：（y表示已经上传）");
			            String put =input.next();
			            if(put.equals("y")){
			            	System.out.println("上传成功");
			            	
			        	}
			        		
			            System.out.println("请缴纳租车押金2000元：(输入2000)"); //没想好怎么弄
			            double cash = input.nextDouble();
			           
						Carshow car = new Carshow();
						car.carshow();
						System.exit(0);
						break;
					} else {
						System.out.println("账号/密码错误！请重新输入！！！");
					}
					}
					
					case 3:
					System.out.println("谢谢你的使用");
					System.exit(0);
					break;
				default:
					System.out.println("输入有误，返回主界面！！！");
					break;
				}
					
	 
			}
		}
	}
	 
	



