package javav;
import java.util.Scanner;
public class ipaddress {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE IP ADDRESS");
		String s=sc.nextLine();
		if(s.length()>=7&&s.length()<=15)
		{
		int count=0;
		String split[]=s.split("\\.");
		for(String a:split)
		{
			int b=Integer.valueOf(a);
			if(b>=0&&b<=255)
			{
				count++;
			}
		}
		if(count==split.length)
		{
			System.out.println("VALID");
		}
		else
		{
			System.out.println("NOT VALID");
		}
		}
		else
		{
			System.out.println("NOT VALID");
		}
	}

}
