import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("The given array is : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[arr[i]]=i;
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
		    if(a[i]==arr[i])
		    {
		        count++;
		    }
		}
		if(count==n)
		{
		    System.out.println("Given array is Mirror Inverse");
		}
		else
		{
		    System.out.println("Given array is not Mirror Inverse");
		}
		
	}
}



