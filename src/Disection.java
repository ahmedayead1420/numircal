import java.io.*;
import java .util.Scanner;
public class Disection {
	
	static float a,b,y,z,xr,yz,as,ah; //������ ������ ������� 
	 static int x;
	public static void senpar(){
		  y=(a*a)-2*(a)-15;//f(a)
	      z=(b*b)-2*(b)-15;//f(b)
		  ah=Math.round(a);  //������ ������ ���� ���� ���� 		  

		  secondop(); //������ ����� ���� ��� f(xr) xr
		  }
	public static void display(){
		x++;
		  System.out.println(x+"- "+      a+"   "+b+"   "+y+"   "+"  "+z+"   "+xr+"     "+yz);
		
	}
	public static void secondop(){
		
		xr=(a+b)/2; //xr
		
	yz=(xr*xr)-2*(xr)-15; //f(xr)
	double c=Math.floor(yz); //���� ����� ���� ���� ����
		if(c==0){ //������ ��� ���� ���� �� f(xr)=0 or no because break of application
			yz=0;
			display();// print 
			System.exit(0);    ///exite of app
			}
		else
		display(); //print
		multi();//������� ����� ������ ������ �����
	
		
	
	
	}
	public static void multi(){
		Disection A=new Disection();//������ ������� 
		as=(yz*y);///// multi f(xr)*f(a)
		if(as<0)//��� ���� ����� ������ � b
		A.b=xr;// ������� 
				else  // ����� ����
				
		A.a=xr;	
		}
			
public static void main(String[] args) {
	Disection c=new Disection();
		Scanner ay=new Scanner(System.in);
		try{
		System.out.println("enter value of  a ");
		a=ay.nextFloat();
		System.out.println("enter value of  b ");
          b=ay.nextFloat();
		}
		catch(Exception ee){
			System.err.println("please Adher to instructions");
			
		}
  System.out.println("c   a     b     f(a)      f(b)    xr     f(xr)");
	while(a<b){ //��� ��� �� A lower and b upper ������� ��������� ���� 
  c.senpar();// ������� ����� ����� f(a) and f(b)
	}
}
}
