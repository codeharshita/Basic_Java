
public class towerOfHanoi {
	public static void BrahmasTower(int n , String src, String helper, String dest ) {
		if(n ==1) {
			System.out.println("Transfer Disk "+ n +" " + "from" + " "+ src +" "+ "to"+" "+ dest);
			return;
		} 
		
		BrahmasTower(n-1,src,dest,helper);//Step 1
		System.out.println("Transfer Disk "+ n +" " + "from" + " "+ src +" "+ "to"+" "+ dest);
		BrahmasTower(n-1,helper,dest,src);
		
	}
	public static void main(String[] args) {
		 int n =3;
		 System.out.println("Tower Of Hanoi for"+" "+ n +" "+"number of discs.");
		 System.out.println();
		 BrahmasTower(n,"S","H","D");

	}

}
