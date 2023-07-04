package javav;
import java.util.Scanner;
public class sumofnontepeateddigits {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER THE NUMBER");
	 int n=sc.nextInt();
	 int i,j,sum=0;
	 //convert integer to character array
	 char a[]=Integer.toString(n).toCharArray();
	
	 //separate non repeated and repeated digits
	 for(i=0;i<a.length;i++)
	 {
		 int count=0;
		 for(j=i+1;j<a.length;j++)
		 {
			 if((a[i]==a[j])&&(a[j]!='0'))
			 {
			    a[j]='0';
			    count++;
			 }
			 
		 }
		 if(count>0)
		 {
			 a[i]='0';
		 }
		 
	 }
	 
	 //calculate sum
	 for(i=0;i<a.length;i++)
	 {
		if(a[i]!='0')
		{
			int num=a[i]-'0';
			sum+=num;
		}
	 }
	 
	 System.out.println("SUM OF NON REPEATED DIGITS "+sum);
 }
}
