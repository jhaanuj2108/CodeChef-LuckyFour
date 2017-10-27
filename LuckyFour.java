import java.util.Scanner;
class luckFour 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n,count;
		for(int i=0;i<T;i++){
			 count =0;
			 n = sc.nextInt();
			 while(n!=0){
             if(n%10==4){
				 count =count +1;
			 }
			  n = n/10;
			 }
			 System.out.println(count);
		}
	}
}
