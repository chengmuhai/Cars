package admin;

import java.util.Random;
import java.util.Scanner;


public class Admin {
	// �����
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

	 // ��֤��
	 public void yzm1(){
		 	Admin yz=new Admin();
		 	Scanner input =new Scanner(System.in);
		 	while(true){
		 		
	    //��ʱ����temp��¼�����
	    String temp= yz.suijishu();
	    System.out.println("��֤��:"+temp);
	    System.out.print("��������֤�룺");
	    String yzm=input.next();
	    //��֤����ȷ
	    if(yzm.equalsIgnoreCase(temp)){
	        
	            System.out.println("ע��ɹ���");
	            break;
	        }else{
	        System.out.println("��֤�����");
	        }
		 	}
	 }
	 public void yzm2(){
		 	Admin ts=new Admin();
		 	Scanner input =new Scanner(System.in);
		 	while(true){
		 		
	    //��ʱ����temp��¼�����
	    String temp= ts.suijishu();
	    System.out.println("��֤��:"+temp);
	    System.out.print("��������֤�룺");
	    String yzm=input.next();
	    //��֤����ȷ
	    if(yzm.equalsIgnoreCase(temp)){
	        
	            System.out.println("��¼�ɹ���");
	            break;
	        }else{
	        System.out.println("��֤�����");
	        }
		 	}
	 }
}
