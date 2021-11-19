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
		System.out.println("Enter the value of number n :");
		int n=sc.nextInt();
	    System.out.println("Fibonanacci series up to to n number is:");
	    int a=-1;
	    int b=1;
	    for(int i=1;i<=n;i++)
	    {
	        int c=a+b;
	        a=b;
	        b=c;
	        System.out.print(c+" ");
	    }
	}
}


