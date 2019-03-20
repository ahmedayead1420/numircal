
public class Eq {
		public static int a=0,b=0,e=0;
		ENode front;
		ENode rear;
		public void creat (){
			front =null;
			rear =null;
		}
		public void destory(){
			while(front !=null){
				front=front.next;
				rear=null;						
			}}
			public boolean empty(){
				return(front==null);		
			}
			public void enEque(int ah){
				ENode ay=new ENode();
				a++;
				ay.value=ah;
				ay.next=null;
				if(empty()==true)
					front=ay;
				else
					rear.next=ay;
				rear=ay;			
			}
			public void deEq(){
	Stack s=new Stack();
	while(empty()==false){
			int c=front.value;
			s.push(c);
			front=front.next;		
	}
	s.pub();

			}
			public void display(){
			
				ENode ay=front;
				while(ay!=null){
					System.out.print(" "+ay.value+"");
					
					ay=ay.next;
				}
				System.out.println("");
			}public void peek(){
				int low ,high=0;
				int c=front.value;
				if(c%2==0){
				while(empty()==false){
				 c=c+front.value;			
				front=front.next;}
				System.out.println("the sum"+c);
				}else
					while(empty()==false){
					low=c=front.value;
				if(low>high)
					high=low;
				front=front.next;
				}
				System.out.println("thr high="+high);
				
					
				
				
			}
			public void prneev(){
				Eq e1=new Eq();
				Eq e2=new Eq();
				Eq e3=new Eq();
				while(empty()==false){
					int c=front.value;
					if(c%2==0)
						e2.enEque(c);
					else
						e3.enEque(c);
					front=front.next;
				}
				if(e2.empty()==false){
					System.out.println("the even eque :");
					e2.display();
				}else
					System.out.println("the even eque is empty");
				if(e3.empty()==false){
	System.out.println("the singulr");
	e3.display();
				}else
					
				System.out.println("the sigulr eque is empty");
				
			}		
			public void MaxEq(int key){
				Eq e2=new Eq();
				Eq e3=new Eq();

				while(empty()==false){
				int c=front.value;
				if(c>key){
					b++;
			e2.enEque(c);}
				else
					if(c<key){
						e3.enEque(c);
						e++;
					}
				front=front.next;
				
				}
				System.out.println("b"+b+"e"+e);
				//e=a-b;
				if(e<b){
					e2.display();
					e3.destory();
				}
			else
				if(e>b){
					e3.display();
					e2.destory();

				}
				else
					if(e==b)
	System.out.println("EQ2==EQ3");			
			}}

