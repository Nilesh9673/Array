package comm.OneD_Array;
//2 4 10 20 30 40 50 90 100 
import java.util.Scanner;

public class BinarySearchAlgorithem {
	public static void main(String[] args) {
		int a[]= {2 ,4,10, 20, 30, 40, 50, 90, 100};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the element");
		int ele=sc.nextInt();
		int l=0;
		int h=a.length-1;
		int mid=(l+h)/2;
		
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[mid]<ele) 
			{
				l=mid+1;
			}else if(a[mid]>ele)
			{
				h=mid-1;
			}else {
				System.out.println("element found");
				break;
			}
			mid=l+h/2;
		}
//		System.out.println(mid);
		
	}

}
