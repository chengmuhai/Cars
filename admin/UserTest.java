package admin;
import java.util.Scanner;
import car.Carshow;
import admin.UserLoginImpl;
import admin.User;
	 
	public class UserTest {
		public void Uesrshow() {
			
		/**
		 * ��¼����
		 * 	ע�����
		 */
			boolean falg = false;

			while (true) {
				System.out.println("********��ӭʹ���ڷ���������ϵͳ********");
				System.out.print("  1��ע��\t");
				System.out.print("  2�� ��¼\t");
				System.out.println(" 3: �˳�");
				System.out.println("��ѡ��");
				Scanner input = new Scanner(System.in);
				int  choose = input.nextInt();
			switch (choose) {
				case 1:
					System.out.println("***************ע��***************");
					// ����¼���û���Ϣ
					System.out.print("�������û�����");
					String newUsername = input.next();
					// �˴����Լ����жϣ��ж��û����Ƿ��Ѿ����ڡ����䡢�绰������ִ�д˲�����
					System.out.print("���������룺");
					String newPassword = input.next();
					System.out.print("���������䣺");
					String newEmail = input.next();
					System.out.print("������绰��");
					String newPhone = input.next();
					Admin ad1 = new Admin();
					ad1.yzm1();
	 
					// �������ö�����з�װ
					User user = new User();
					user.setUsername(newUsername);
					user.setPassword(newPassword);
					user.setEmail(newEmail);
					user.setPhone(newPhone);
	 
					// �����û����������
					UserLoginImpl Udi = new UserLoginImpl();
					// ����ע�᷽��
					Udi.regist(user);
					System.out.println("ע��ɹ��������˺��ǣ�"+newUsername+"\t������:"+newPassword);
					System.out.println("******************************************");
					falg = true;
					break;
					
				case 2:
					if(!falg ){
						System.out.println("������ע�ᣡ");
						break;
					}
					while(true){
					System.out.println("***************��¼ϵͳ***************");
					// ����¼����Ϣ
					System.out.print("�������û�����");
					String username = input.next();
					System.out.print("���������룺");
					String password = input.next();
					
					
					/*
					 * ��̬�÷� UserLogin us = new UserLoginImpl(); �������÷�
					 */
					UserLoginImpl us = new UserLoginImpl();
					boolean flag = us.Login(username, password);
					if (flag) {
						Admin ad = new Admin();
						ad.yzm2();
						System.out.println("��ӭʹ���ڷ��⳵ϵͳ��");
						System.out.println("���ϴ�֤������y��ʾ�Ѿ��ϴ���");
			            String put =input.next();
			            if(put.equals("y")){
			            	System.out.println("�ϴ��ɹ�");
			            	
			        	}
			        		
			            System.out.println("������⳵Ѻ��2000Ԫ��(����2000)"); //û�����ôŪ
			            double cash = input.nextDouble();
			           
						Carshow car = new Carshow();
						car.carshow();
						System.exit(0);
						break;
					} else {
						System.out.println("�˺�/����������������룡����");
					}
					}
					
					case 3:
					System.out.println("лл���ʹ��");
					System.exit(0);
					break;
				default:
					System.out.println("�������󣬷��������棡����");
					break;
				}
					
	 
			}
		}
	}
	 
	



