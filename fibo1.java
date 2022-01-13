import java.util.*;
public class fibo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1=0;
		int n2=1;
		int i=1;
		int count = sc.nextInt();
		
		while(i<=count) {
			System.out.println(n1+ ",");
			
	   int 	thirdNumber = n1+n2;
	   n1=n2;
	   n2=thirdNumber;
	   
	   i++;
				
		}
		
	}

}
