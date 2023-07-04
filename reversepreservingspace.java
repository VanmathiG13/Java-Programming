package javav;
import java.util.Scanner;
public class reversepreservingspace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=sc.nextLine();
		char str[]=s.toCharArray();
		int i,j=0,k=0;
		char rstr[]=new char[str.length];
		int rstrspace[]=new int[s.split(" ").length-1];
		int strspace[]=new int[s.split(" ").length-1];
		for(i=str.length-1;i>=0;i--)
		{
			rstr[j]=str[i];
			if(rstr[j]==' ')
			{
				rstrspace[k]=j;
				k++;
			}
			j++;
		}
		k=0;
		for(i=0;i<str.length;i++)
		{
			if(str[i]==' ')
			{
				strspace[k]=i;
				k++;
			}
		}
		for(i=0;i< rstrspace.length;i++)
		{
			int d=strspace[i]-rstrspace[i];
			if(d>0)
			{
				char temp=rstr[rstrspace[i]];
				rstr[rstrspace[i]]=rstr[rstrspace[i]+1];
				rstr[rstrspace[i]+1]=temp;
			}
			if(d<0)
			{
				char temp=rstr[rstrspace[i]];
				rstr[rstrspace[i]]=rstr[rstrspace[i]-2];
				rstr[rstrspace[i]-2]=temp;
			}
		}
		for(i=0;i<rstr.length;i++)
		{
			System.out.print(rstr[i]);
		}

	}

}
