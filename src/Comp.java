import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Comp {
	static int sum=0;
	static int sum1=0;
	
public static int sum(int n){
	for(int i=1; i<=n; i++){
		sum+=i;
	}
		int avg=sum/n;
	return avg;
}
public static int sum1(int n){
	
	sum1=((n+1)*n)/2;
	int x=sum1/ n;
	return x;	
}




	public static void main(String[] args) {
		Scanner ah=new Scanner(System.in);
		System.out.println();
	System.out.println("sum="+sum(5));
		System.out.println("sum1="+sum1(5));

		// TODO Auto-generated method stub

	}

}
