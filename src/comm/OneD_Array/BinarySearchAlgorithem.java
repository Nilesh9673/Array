package comm.OneD_Array;

import java.util.Arrays;
//2 4 10 20 30 40 50 90 100 
//array must be sorted for binary search.
// 
import java.util.Scanner;

public class BinarySearchAlgorithem {
	
	
	public static int insertposition(int a[],int n) {
		
		int l = 0;
		int h = a.length - 1;
		int m = (l + h) / 2;

		for (int i = 0; i < a.length; i++) 
		{
			if(n<a[0]) {
				return 0;
			}
			if(a[m]==n) {
				return m;
			}else if(a[m]<n) {
				l=m+1;
			}else {
				h=m-1;
			}
			m = (l + h) / 2;
		}
		return ++m;
	}
	public static int  binarySearchAlgorithem(int a[],int ele)
	{
		int l = 0;
		int h = a.length - 1;
		int m = (l + h) / 2;

		for (int i = 0; i < a.length; i++) 
		{
			
			if(a[m]== ele) {
				System.out.println("element found");
				return m;
			}else if(a[m]< ele) {
				l=m+1;
			}else {
				h=m-1;
			}
			m = (l + h) / 2;
		}
		System.out.println("element not found");
		return -1;
	}
	


	public static void main(String[] args) {
		int a[] = { 2, 4, 10, 20, 30, 40, 50, 90, 100 };

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		int ele = sc.nextInt();
		
		System.out.println(binarySearchAlgorithem(a , ele));
		System.out.println();
		
	}

}
