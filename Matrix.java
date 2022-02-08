package JavaBasics;

public class Matrix {

	public static void main(String[] args) {


		int a[][] = new int[3][4];// initialization of a 2d matrix
		
		//1st row :-
		a[0][0]=45;
		a[0][1]=74;
		a[0][2]=52;
		a[0][3]=41;
		
		//2nd row:-

		a[1][0]=41;
		a[1][1]=10;
		a[1][2]=85;
		a[1][3]=10;
		
		//3rd row:-
		
		a[2][0]=23;
		a[2][1]=20;
		a[2][2]=63;
		a[2][3]=30;
		
		System.out.println(a[2][3]);
		
		//To traverse whole matrix
		
		for(int i=0; i<a.length; i++) {
			for(int j = 0; j<a[0].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}

}
