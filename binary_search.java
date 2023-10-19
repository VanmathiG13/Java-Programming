package mathi;
import java.util.*;
public class binary_search {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER THE NUMBER OF ELEMENTS");
	 int n=sc.nextInt();
	 int i,a[]=new int[n];
	 System.out.println("ENTER THE ELEMENTS IN SORTED ORDER");
	 for(i=0;i<n;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
	 int key=sc.nextInt();
	 int pos=-1,low=0,high=n-1;
	 while(pos==-1)
	 {
		 
		 int mid=(low+high)/2;
		 if(key<a[mid])
		 {
			 high=mid-1;
		 }
		 else if(a[mid]<key)
		 {
			 low=mid+1;
		 }
		 else if(a[mid]==key)
		 {
			 pos=mid;
			 break;
		 }
	 }
	 System.out.println("THE SEARCH IS IN POSITION "+pos);
 }
}
