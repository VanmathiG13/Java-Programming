package javatpoint;
import java.util.Scanner;
public class insert {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER THE NUMBER OF ELEMENTS");
	 int n=sc.nextInt();
	 System.out.println("ENTER THE ELEMENTS OF ARRAY");
	 int i,j,temp;
	 int a[]=new int[n+1];
	 for(i=0;i<n;i++)
	 {
		a[i]=sc.nextInt(); 
	 }
	 System.out.println("OPERATION : I/D");
	 char ch=sc.next().charAt(0);
	 //INSERTION
	 if(ch=='I')
	 {
	 System.out.println("ENTER THE ELEMENT TO BE INSERTED");
	 int data=sc.nextInt();
	 System.out.println("ENTER THE POSITION");
	 int pos=sc.nextInt();
	 for(i=0;i<n;i++)
	 {
		 //System.out.println("as");
		 if(i==pos)
		 {
			 
			 //System.out.println("HSGDH");
			 for(j=i;j<n+1;j++)
			 {
				 temp=a[j];
				 a[j]=data;
				 data=temp;
				 
			 }
		 }
	 }
	 System.out.println("AFTER INSERTION");
	 for(i=0;i<n+1;i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	 }
	 if(ch=='D')
	 {
		 System.out.println("ENTER THE POSITION");
		 int pos=sc.nextInt();
		 for(i=0;i<n;i++)
		 {
			 if(pos==i)
			 {
				 for(j=i;j<n;j++)
				 {
					 a[j]=a[j+1];
				 }
			 }
		 }
		 System.out.println("AFTER DELETION");
		 for(i=0;i<n-1;i++)
		 {
			 System.out.println(a[i]);
		 }
	 }
	 


}
}