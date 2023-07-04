package javav;
import java.util.Scanner;
public class equilibriumindex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS");
		int n=sc.nextInt();
	    System.out.println("ENTER THE ELEMENTS OF ARRAY");
	    int a[]=new int[n];
	    int i,midvalue=n/2;
	    for(i=0;i<n;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    while(midvalue>0||midvalue<n-2)
	    {
	    int leftsum=0,rightsum=0;
	    for(i=0;i<=midvalue-1;i++)
	    {
	       leftsum+=a[i];
	    }
	    for(i=midvalue+1;i<n;i++)
	    {
	    	rightsum+=a[i];
	    }
	    if(leftsum==rightsum)
	    {
	    	System.out.println("EQUILIBRIUM INDEX "+midvalue);
	    	break;
	    }
	    else
	    {
	    	if(leftsum>rightsum)
	    	{
	    		midvalue--;
	    	}
	    	else
	    	{
	    		midvalue++;
	    	}
	    }
	    }
	}

}
