//Take a matrix as input from the user.Search for a given number x and print the indices at which it occurs.
package datastruct;
import java.util.*;


public class Prb1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int [][] numbers = new int [rows][cols];
		for (int i = 0; i<rows;i++) {
			for(int j = 0; j<cols;j++) {
				numbers[i][j] = sc.nextInt();
			}
		}	
		
		int x = sc.nextInt();
       for (int i = 0; i<rows; i++) {
    	  for (int j = 0;j<cols;j++) {
    		  
    		//LOGIC  
    		 if (numbers [i][j]==x) { //Linear Search in the given matrix.
    			 System.out.println("Number is found at " + i + j + "position");
    		 } 
    		  
    		  
    	  }
       }       
		

	}

}
