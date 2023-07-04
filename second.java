package javav;
import java.util.Scanner;
public class second {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS");
		int n=sc.nextInt();
		System.out.println("ENTER THE ELEMENTS OF ARRAY");
		int a[]=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("ENTER THE TARGET VALUE");
		int target=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if((a[i]+a[j])==target)
				{
					System.out.print("INDEX "+i+"="+a[i]+" ");
					System.out.print("INDEX "+j+"="+a[j]+" ");
				}
			}
			System.out.println();
		}

	}

}
