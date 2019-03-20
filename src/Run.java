import java.util.Scanner;
public class Run {
	public static void main(String[] args) {	
		Scanner ah=new Scanner(System.in);
	Eq e=new Eq();
	Stack s=new Stack();
	System.out.println(3+4+"foo"+(3+4));
int x,y;
while(true){
System.out.println("1-enEque");
System.out.println("2-print main eque");
System.out.println("3-print new eque");
System.out.println("4-hybird");
System.out.println("5-the even & singulr");
System.out.println("6-exite");
System.out.println("7-max");
System.out.println("enter the choice");
x=ah.nextInt();
switch(x)

{
case 1:
	
		System.out.println("enter the value");
		y=ah.nextInt();
		e.enEque(y);
		break;

case 2:
	if(e.empty()==true)
		System.out.println("the list is empty");
	else
		e.display();
	break;
case 3:
	if(e.empty()==true)
		System.out.println("the list is empty");
	else
		e.deEq();
	break;
case 4:
	e.peek();
	break;
case 5:
	e.prneev();
	break;
case 6:
System.out.println("thanks");
System.exit(0);
case 7:
	System.out.println("enter the key");
	y=ah.nextInt();
e.MaxEq(y);

break;
	}

}
}}


