import java.util.Scanner;

public class Lcs {
	static int max(int i,int j)
	{
		return (i>j?i:j);
	}
	public static void main(String args[])
	{
		Scanner br= new Scanner(System.in);
		String str1=br.nextLine();
		String str2=br.nextLine();
		str1=" "+str1;
		str2=" "+str2;
		int n=str1.length();
	    int m=str2.length();
		int a[][]=new int[n][m];
		for(int i=0;i<m;i++)
		{
			a[0][i]=0;
		}
		for(int i=0;i<n;i++)
			a[i][0]=0;
		 
		int i=1;
		int j=1;
		
		for(i=1;i<n;i++)
		{
			for(j=1;j<m;j++)
			{
			if(str1.charAt(i)==str2.charAt(j))
			{
				a[i][j]=a[i-1][j-1]+1;
				
			}
			else
			{
				a[i][j]=max(a[i-1][j],a[i][j-1]);
			}
			
			
			}
		}
		
	System.out.println("the lcs is "+a[n-1][m-1]);
	
String temp="";
int k=n-1;
int l=m-1;
while(k>0 && l>0)
{
			if(str1.charAt(k)==str2.charAt(l))
			{
				
				temp+=str1.charAt(k);
				k--;
				l--;
				
			}
			else
			{
				if(a[k][l-1]>a[k-1][l])
				{
					l=l-1;
				}
				else
				{
					k=k-1;
				}
			}
		
	}
for(int g=a[n-1][m-1]-1;g>=0;g--)
	System.out.print(temp.charAt(g));
		
	}

}
