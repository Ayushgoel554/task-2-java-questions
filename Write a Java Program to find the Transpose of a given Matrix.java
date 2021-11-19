/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of matrix : ");
		int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int arr2[][]=new int[n][n];
        System.out.println("Enter elements of matrix : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
            System.out.println("Transpose of given matrix is : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i][j]=arr[j][i];
            }
        }
      for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
	}
}


