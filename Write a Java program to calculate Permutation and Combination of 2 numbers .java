/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers :");
	    int n=sc.nextInt();
	    int r=sc.nextInt();
	    int v=n-r;
	    int nf=1;
	    int rf=1;
	    int vf=1;
	    for(int i=1;i<=n;i++)
	    {
	        nf=nf*i;
	    }
	     for(int i=1;i<=r;i++)
	    {
	        rf=rf*i;
	    }
	     for(int i=1;i<=v;i++)
	    {
	        vf=vf*i;
	    }
	    System.out.println("Permutation of two given numbers is : " + nf/vf);
	    System.out.println("Combination of two given numbers is : " + nf/(rf*vf));
	}
}


