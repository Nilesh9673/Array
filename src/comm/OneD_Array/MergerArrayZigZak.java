package comm.OneD_Array;
/*
 Create array c of length add length of [a + b]
 Merging zigzag array.
 i.e 1st from a array - 2nd from array
 inilizaing c array before inserting checking index of a&b 
 */
public class MergerArrayZigZak {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,77,99,66};
		int b[]= {50,60,70,80,90};
		
		int []c=new int [a.length+b.length];
		
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[j]=a[i];
				j++;
			}
			if(i<b.length)
			{
				c[j]=b[i];
				j++;
			}
		}
		Array.displayArray(c);
	}
/*
	Merging one then two
*/
	public static int [] MergerArray() {
		int a[]= {10,20,30,40,77,99,66};
		int b[]= {50,60,70,80,90};
		
		int []c=new int [a.length+b.length];
		
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
				j++;
			}else
			if(i<a.length+b.length)
			{
				c[i]=b[i-a.length];
				j++;
			}
		}
		return c;
	}
}
