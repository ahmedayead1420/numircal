
public class Stack {	
	ENode top;
	Stack(){
		top=null;
	}public boolean emptySt(){
		return (top==null);
	}public void push (int value){
ENode ay=new ENode();
ay.value=value;
ay.next=top;
top=ay;
	}public void pub(){
		//Stack s=new Stack();
		Eq e=new Eq();
		while(emptySt()==false){
		int c=top.value;
		e.enEque(c);
		top=top.next;
	}
		System.out.println("the new eqeue");
	e.display();
		
	
	}
	public void print(){
		System.out.println("the Stack");
		ENode ay=top;
		while(ay!=null){
			System.out.println(" "+ay.value);
			ay=ay.next;
			
		}
	}
}
