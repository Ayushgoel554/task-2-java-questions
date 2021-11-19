/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
import java.util.List;
public class Main
{
	public static void main(String[] args) 
	{
		 List<Integer> l = new ArrayList<>();
		l.add(10);
        l.add(8);
        l.add(5);
        l.add(15);
        l.add(25);
        System.out.println("The given array list is :");
        System.out.println(l);
        l.remove(2);
        l.remove(3);
        System.out.println("Array list after removing elements :");
        System.out.println(l);
	}
}

