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
		System.out.println("Enter the String :");
		String a=sc.next();
		String b="";
		for(int i= a.length()-1;i>=0;i--)
		{
		    b= b+a.charAt(i);
		}
		if(b.equals(a))
		{
		    System.out.println("given String is Palindrome");
		}
		else
		{
		    System.out.println("given String is not Palindrome");
		}
	}
}


