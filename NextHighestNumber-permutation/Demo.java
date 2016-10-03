package stringpermu;

import java.util.Scanner;

public class Demo {
	static long min=Long.MAX_VALUE;
	
	static void swap(char a[],int l,int i)
	{
		char temp=a[l];
		a[l]=a[i];
		a[i]=temp;
	}
	
	
	static void permu(char a[],int l,int r,long num)
	{
		
		if(l==r)
		{
        String str=String.valueOf(a);
       

        	 
        	if(Long.parseLong(str)>num && Long.parseLong(str)<min)
        		min=Long.parseLong(str);
        	
        		
       
		}
		else
		{
		for(int i=l;i<=r;i++)//l is level and position
			                 //i is the ith char
			                 
		{
			swap(a,l,i);  //at first level i.e l=1 the ith char(where i varies from l to r) is fixed at l position
			permu(a,l+1,r,num);//to go to next level or position
			swap(a,l,i);//to return the configuration wen call is back to prev level
		}
		}
			
		
	}
	
	public static void main(String args[])
	{
	   Scanner br= new Scanner(System.in);
		
		long num=br.nextLong();
		String s=num+"";
		char a[]=s.toCharArray();
		permu(a,0,s.length()-1,num);
		
		if(min==Long.MAX_VALUE)
		System.out.println(num);
		else
		System.out.println(min);
			
	}

}
