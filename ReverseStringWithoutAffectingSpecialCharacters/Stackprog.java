package charatcerstring;

import java.util.Scanner;

public class Stackprog {
	
	public static void main(String args[])
	{
		Scanner br=new Scanner(System.in);
		String str=br.nextLine();
		char a []=str.toCharArray();
		int top=-1;
		
		char st[]=new char [str.length()];
		for(int i=0;i<str.length();i++)
		{
			st[i]=str.charAt(i);
			top++;
		}
		System.out.println(String.valueOf(st));
		int j=0;
		while(top!=-1)
		{
			if(Character.isLetter(st[top]) )
			{
				
				if(Character.isLetter(a[j]))
				{
				a[j]=st[top];
				j++;
				top--;
				}
				else
				{
					j++;
				}
				
			}
			else
			{
				top--;
			}
		}
		
		System.out.println(String.valueOf(a));
	}

}
