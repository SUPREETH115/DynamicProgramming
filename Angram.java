
import java.util.Scanner;

public class Angram {
	static long min=Long.MAX_VALUE;
	static int flag=1;
	static void swap(char a[],int l,int i)
	{
		char temp=a[l];
		a[l]=a[i];
		a[i]=temp;
	}
	
	
	static void permu(char a[],int l,int r,String t)
	{
		
		if(l==r)
		{
        String str=String.valueOf(a);
        if(str.equals(t))
        {
        	flag=0;
        }
		}
		else
		{
		for(int i=l;i<=r;i++)//l is level and position
			                 //i is the ith char
			                 
		{
			swap(a,l,i);  //at first level i.e l=1 the ith char(where i varies from l to r) is fixed at l position
			permu(a,l+1,r,t);//to go to next level or position
			swap(a,l,i);//to return the configuration wen call is back to prev level
		}
		}
			
		
	}
	
	public static void main(String args[])
	{
	  Scanner br= new Scanner(System.in);
		int n=br.nextInt();
    
		while(n!=0)
		{
	    String t=br.next();
		  String s=br.next();
		if(t.length()!=s.length())
			System.out.println("NO");
		else
		{
		char a[]=s.toCharArray();
		permu(a,0,s.length()-1,t);
		
		if(flag==0)
			System.out.println("yes");
		else
			System.out.println("no");
		}
		n--;
		flag=1;
		}
	}

}
