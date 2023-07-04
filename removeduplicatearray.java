package javav;
import java.util.Scanner;
public class removeduplicatearray {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER THE NUMBER OF ELEMENTS");
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 //int b[]=new int[n];
	 int i,j;
	 System.out.println("ENTER THE ELEMENTS OF ARRAY");
	 for(i=0;i<n;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 for(i=0;i<n;i++)
	 {
		 for(j=i+1;j<n;j++)
		 {
			 if(a[i]==a[j])
			 {
				 a[j]=a[n-1];
				 n--;
				 j--;
			 }
		 }
	 }
	 System.out.println("AFTER REMOVE DUPLICATION");
	 for(i=0;i<n;i++)
	 {
		 System.out.println(a[i]);
	 }
 }
}
