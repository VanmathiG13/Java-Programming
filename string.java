package javav;
import java.util.Scanner;
public class string {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER THE STRING");
	 String s=sc.nextLine();
	 int words=1,vowels=0,consonants=0,spclchar=0,numbers=0,totalchar=0;
	 for(int i=0;i<s.length();i++)
	 {
		 if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')||(s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='O')||(s.charAt(i)=='I')||(s.charAt(i)=='U'))
		 {
			 vowels++;
		 }
		 else if(((s.charAt(i)>'a')&&(s.charAt(i)<='z'))||((s.charAt(i)>'A')&&(s.charAt(i)<='Z')))
		 {
				 consonants++;
		 }
		 else if((s.charAt(i)>='0')&&(s.charAt(i)<='9'))
		 {
			         numbers++;
			         System.out.println(s.charAt(i)+"number");
		 }
		 else if(s.charAt(i)==' ')
		 {
			 words++;
		 }	
		 else
		 {
			 System.out.println(s.charAt(i)+"spcl");
			 spclchar++;
		 }
		totalchar++; 
     }
	 
	 System.out.println("VOWELS "+vowels);
	 System.out.println("CONSONANTS "+consonants);
	 System.out.println("NUMBERS "+numbers);
	 System.out.println("WORDS "+words);
	 System.out.println("SPECIAL CHARACTERS "+spclchar);
	 System.out.println("TOTAL CHARACTERS "+totalchar);
 }
}
