package javatpoint;
import java.util.Scanner;
public class datedifference {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER THE DATE 1");
	 int date1=sc.nextInt();
	 System.out.println("ENTER THE DATE 2");
	 int date2=sc.nextInt();
	 System.out.println("ENTER THE MONTH 1");
	 int month1=sc.nextInt();
	 System.out.println("ENTER THE MONTH 2");
	 int month2=sc.nextInt();
	 System.out.println("ENTER THE YEAR 1");
	 int year1=sc.nextInt();
	 System.out.println("ENTER THE YEAR 2");
	 int datediff,monthdiff,yeardiff;
	 int year2=sc.nextInt();
	 if((date1>date2)&&(month1>month2)&&(year1>year2))
	 {
		 datediff=date1-date2;
		 monthdiff=month1-month2;
		 yeardiff=year1-year2;
		 System.out.println("DIFFERENCE OF TWO DATES "+datediff+" "+monthdiff+" "+yeardiff);
	 }
	 else if((date1<date2)&&(month1>month2)&&(year1>year2))
	 {
		 datediff=(date1+30)-date2;
		 monthdiff=(month1-1)-month2;
		 yeardiff=year1-year2;
		 System.out.println("DIFFERENCE OF TWO DATES "+datediff+" "+monthdiff+" "+yeardiff);
	 }
	 else
	 {
		 datediff=(date1+30)-date2;
		 monthdiff=((month1-1)+12)-month2;
		 yeardiff=(year1-1)-year2;
		 System.out.println("DIFFERENCE OF TWO DATES "+datediff+" "+monthdiff+" "+yeardiff);
	 }
 }
}
