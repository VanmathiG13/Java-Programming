package javatpoint;
import java.util.Scanner;
public class fascinating {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER ANY NUMBER");
	 int n=sc.nextInt();
	 String s=Integer.toString(n);
	 //number should be 3 or greater than 3
	 if(s.length()>=3)
	 {
		int n2=n*2;
		int n3=n*3;
		//concatenation
		String s1=s+Integer.toString(n2)+Integer.toString(n3);
		//convert string to character array
		char ch[]=s1.toCharArray();
		int i,j,count=0,a=1;
		char c='0';
		for(i=0;i<ch.length;i++)
		{
			for(j=0;j<ch.length;j++)
			{
				c=(char)(a+'0');
				if(ch[j]==c)
				{
					count++;
					break;
				}
			}
			a=c-'0';
			a++;
		}
		if(count==9)
		{
			System.out.println("IT IS FASCINATING NUMBER");
		}
		else
		{
			System.out.println("IT IS NOT A FASCINATING NUMBER");
		}
	 }
	 else
	 {
		 System.out.println("IT IS NOT FASCINATING NUMBER");
	 }
 }
}
