package car;

import java.util.Random;
import java.util.Scanner;
import admin.UserTest;
import alipay.Alipay;

public class Carshow {
	// ����final����һ����ʱ����������಻�ܱ��̳С�Ҳ����˵�����һ��������Զ�����������̳У��Ϳ�����final��������
	 private static final String Car = null;
	 private static final Car PassengerCar = null;

	public void carshow() {
		
		    System.out.println("��ӭʹ���ڷ��������������̵꣡");
		    System.out.println("��ѡ���Ƿ��⳵:0����  1����");
		    Scanner input = new Scanner(System.in);
		    Car[] cars = new Car[7];
		    int choose = input.nextInt();
		    if(choose == 0){
		        System.out.println("����˾�����޳������£�");
		        System.out.println("��  ��\t" + "��  �� Ʒ ��\t\t" + "��\t��\t" + "  ����(����/�ػ�)");
		        cars[0] = new PassengerCar(1,"�µ�A4",500.0,5);
		        cars[1] = new PassengerCar(2,"���Դ�6",400.0,5);
		        cars[2] = new Loader(3,"����Ƥ��",450.0,4,2.0);
		        cars[3] = new PassengerCar(4,"�����ͳ�",800.0,20);
		        cars[4] = new Goods(5, "�ɻ���",400.0,15.0);
		        cars[5] = new Goods(6,"��ά��",1000.0,20.0);
		      
		        for(int i = 0;i < cars.length-1;i++){
		            System.out.println("���:" + cars[i].getNumber()+"\t"+ "Ʒ��:" + cars[i].getBrand()+"\t"+"���:" + cars[i].getFee()
		                    + "/�� "+"\t"+ "�ؿ���:" + cars[i].getPersonCapacity() + "��  �ػ���" + ((Car) cars[i]).getGoodCapacity()
		                    + "��");
		        }
		     }else{
		        System.out.println("����ȡ���⳵���˳�ϵͳ!    ");
		        return;
		    }
		    System.out.println("��������Ҫ�⼸�ֳ�:");
		    int [] choiceCars = new int[6];
		    //������Ҫ�⼸�ֳ���ֵ
		    int carNum = input.nextInt();
		    for(int i = 1;i <= carNum;i++){
		        System.out.println("��������ѡ��ĵ� " + i + " �ֳ��͵ı�ţ�" );
		        //�����û�ѡ���͵ı��
		        int num = input.nextInt(); //ȥ��-1Ҳû�б���
		        System.out.println(cars[num].getBrand() + " �ܹ���Ҫ��������");
		        //ÿһ�����͵ĳ���Ҫ������
		        int num2 = input.nextInt();
		        //choiceCars�����ʾ�û�ѡ��ĳ��ͱ���Լ���Ӧ��Ҫ�������
		        choiceCars[num] = num2;
		    }
		    System.out.println("�������⳵������");
		    int daysNum = input.nextInt();
		    System.out.println("�����˵���--------------------------");
		    double total = 0;
		    for(int i = 0;i < cars.length-1;i++){
		        if(choiceCars[i] != 0){
		            System.out.println(choiceCars[i] + "��" + cars[i].getBrand() + "   �ܹ��ؿ���:" +
		                    choiceCars[i] * cars[i].getPersonCapacity() + "��" +
		                    "   �ܹ��ػ���:" + choiceCars[i] * cars[i].getGoodCapacity() + "��" +
		                    "   " + daysNum + "�쵥�����:" + choiceCars[i] * cars[i].getFee() * daysNum + "Ԫ");
		            total = choiceCars[i] * cars[i].getFee() * daysNum;
		        }
		    }
		    System.out.println("�⳵�ܷ���:" + total + "Ԫ");
		    System.out.println("����ѡ��֧����ʽ 1.֧����֧�� 2.΢��֧�� 3.ˢ��֧�� 4.�ֽ�֧��");
		    int  choice= input.nextInt();
		    switch (choice) {
			case 1:
				System.out.println("֧����֧��");
				Alipay pay = new Alipay();
				if (total>1500) {
					int price = (int) (total-(pay.Alipay())); 
					System.out.println("�Żݺ�����Ҫ֧���ķ����ǣ�"+price);
					break;
				}else{
					System.out.println("֧���ķ����ǣ�"+total);
				}
			
				
				break;
			case 2:
				System.out.println("΢��֧��");
				Alipay pay1 = new Alipay();
				if (total>1500) {
					int price = (int) (total-(pay1.Alipay2())); 
					System.out.println("�Żݺ�����Ҫ֧���ķ����ǣ�"+price);
					break;
				}else{
					System.out.println("֧���ķ����ǣ�"+total);
				}
				
			case 3:
				System.out.println("ˢ��֧��");
				int price2 = (int) (total*0.8);
				System.out.println("�Żݺ�����Ҫ֧���ķ����ǣ�"+price2);
			case 4:
				System.out.println("�ֽ�֧��");
				System.out.println("��������Ҫ֧���ķ���:");
				int money = input.nextInt();
				if(money==total){
					System.out.println("��֧������Ϊ:"+money);
					break;
				}else if(money > total){
					price2 = (int) (money -total);
					System.out.println("����"+price2);
					break;
				}else{
					System.out.println("");
				}

			default:
				System.out.println("������������������");
				break;
			}
		    
		    System.out.println("��ӭ�´ι���------------------------");
		}


	}

