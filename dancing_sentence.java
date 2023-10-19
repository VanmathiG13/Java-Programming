package mathi;
import java.util.*;
public class dancing_sentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String str=sc.nextLine();
		String temp="";
		int pos=0;
		for(int i=0;i<str.length();i++)
		{
			if(!(str.charAt(i)==' '))
			{
			if(pos%2==0)
			{
				temp+=Character.toUpperCase(str.charAt(i));
				pos++;
			}
			else
			{
				temp+=Character.toLowerCase(str.charAt(i));
				pos++;
			}
			}
			else
			{
				temp+=' ';
			}
		}
		System.out.println("DANCING SENTENCE IS \n"+temp);

	}

}
