package comm.OneD_Array;

import java.util.Scanner;

public class Array {
	public static int [] readArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a []=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static void displayArray(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int [] a=readArray();
		displayArray(a);
	}
}
