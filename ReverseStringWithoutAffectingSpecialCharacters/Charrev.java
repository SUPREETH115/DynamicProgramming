package charatcerstring;

import java.util.Scanner;

public class Charrev {
	
	public static void main(String args[])
	{
		Scanner br= new Scanner(System.in);
		
		String str=br.nextLine();
		 int i=0;
		 char temp;
		 int j=str.length()-1;
		 char a[]=str.toCharArray();
		 while(i<j)
		 {
			 if(a[i]+0>=65 && a[i]+0<=90 || a[i]+0>=97 && a[i]+0<=122  )
			 {
				 while(!((a[j]+0>=65 && a[j]+0<=90) || (a[j]+0>=97 && a[j]+0<=122 )))
				 {
					 j--;
				 }
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				 i++;
				 j--;
				 
			 }
			 else
			 {
				 i++;
			 }
				 
					 
		 }
		 System.out.println(String.valueOf(a));
		
		
	}

}
