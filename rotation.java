package javav;
import java.util.Scanner;
public class rotation {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("PRESS 0 OR 1");
	 int a=sc.nextInt();
	 System.out.println("ENTER THE NUMBER OF ELEMENTS");
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 int i,j,temp;
	 System.out.println("ENTER THE ELEMENTS OF ARRAY");
	 for(i=0;i<n;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 if(a==0)
	 {
		System.out.println("LEFT ROTATION");
		System.out.println("ENTER THE NUMBER OF POSITION TO BE MOVED");
		int pos=sc.nextInt();
		for(i=0;i<pos;i++)
		{
			temp=arr[0];
			for(j=0;j<n-1;j++)
			{
				arr[j]=arr[j+1];
			}
		    arr[n-1]=temp;
		}
	 }
	 if(a==1)
	 {
		 System.out.println("RIGHT ROTATION");
		 System.out.println("ENTER THE NUMBER OF POSITION TO BE MOVED");
		 int pos=sc.nextInt();
		 for(i=0;i<pos;i++)
		 {
			 temp=arr[n-1];
			 for(j=n-2;j>=0;j--)
			 {
				 arr[j+1]=arr[j];
			 }
			 arr[0]=temp;
		 }
	 }
	 System.out.println("AFTER ROTATION");
	 for(i=0;i<n;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }
	 
 }
}
