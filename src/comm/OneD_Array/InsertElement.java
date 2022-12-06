package comm.OneD_Array;

import java.util.Scanner;

public class InsertElement {
	public static void insertElement(int [] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index");
		int index=sc.nextInt();
		if(index<0 || index>a.length)
		{
			System.out.println("index should be positive or equal to array length");
			return ;
		}
		int b[]=new int[a.length +1];
		System.out.println("Enter the value");
		b[index]=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}else {
				b[i+1]=a[i];
			}
		}
		Array.displayArray(b);
	}
	
	
	public static void main(String[] args) 
	{
		int a[]=Array.readArray();
		Array.displayArray(a);
		insertElement(a);
	}
}
