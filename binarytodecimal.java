package javav;
import java.util.Scanner;
public class binarytodecimal {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER THE BINARY NUMBER");
	 String s=sc.nextLine();
	 int i,a=1,dec=0;
	 for(i=s.length()-1;i>=0;i--)
	 {
		 int num=s.charAt(i)-'0';
		 dec+=num*a;
		 a*=2;
	 }
	 System.out.println("DECIMAL NUMBER "+dec);
 }
}
