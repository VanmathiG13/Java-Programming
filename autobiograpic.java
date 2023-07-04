package javav;
import java.util.Scanner;
public class autobiograpic {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER THE NUMBER");
	 int n=sc.nextInt();
	 char ch[]=Integer.toString(n).toCharArray();
	 char fre[]=new char[ch.length];
	 int i,count,j,a=0;
	 for(i=0;i<ch.length;i++)
	 {
		count=0;
		//convert  a of type integer to character
		char b=(char)(a+'0');
		for(j=0;j<ch.length;j++)
		{
        if(b==ch[j])
        {
        	count++;
        }
		}
        fre[i]=(char)(count+'0');
        a++;
        
	 }
	 int count1=0;
	 for(i=0;i<ch.length;i++)
	 {
		 if(ch[i]==fre[i])
		 {
			 count1++;
		 }
	 }
	 if(count1==ch.length)
	 {
		 System.out.println("AUTOBIOGRAPIC NUMBER");
	 }
	 else
	 {
		 System.out.println("NOT AN AUTOBIOGRAPIC NUMBER");
	 }

	 }
 }

