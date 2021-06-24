import java.util.Scanner;
public class p2 {

	public static void main(String[] args) 
	{ int n,t,r=0;
	System.out.println("enter a numner");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	t=n;
	while(n>0)
	{
		r=r*10;
		r=r+n%10;
		n=n/10;
	}
		if(t==r)
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("its not a palindrome");
		}
	}

}
