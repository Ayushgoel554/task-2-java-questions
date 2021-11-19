/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no on which you want to applied operations :");
		float a=sc.nextInt();
	    float b=sc.nextInt();
	    System.out.println("Enter 1 for addition , 2 for substraction , 3 for multipication and 4 for divide:");
	    int c=sc.nextInt();
	    if(c==1)
	    {
	        System.out.println(a+b);
	    }
	    else if(c==2)
	    {
	        System.out.println(a-b);
	    }
	    else if(c==3)
	    {
	        System.out.println(a*b);
	    }
	    else if(c==4)
	    {
	        System.out.println(a/b);
	    }
	    else
	    {
	        System.out.println("not a valid option !");
	    }
	}
}

