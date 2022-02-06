package JavaBasics;
import java.util.*;

public class IfElseConcepts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		
		int a=sc.nextInt();
		
		int b= sc.nextInt();
		
		
		
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		
		if(a==b) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal");
		}

	}

}
