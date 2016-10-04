import java.util.Scanner;

public class SumSubset {
	public static void main(String args[])
	{
		Scanner br=new Scanner(System.in);
		int n=br.nextInt();
		int b[]=new int [n+1];
		for(int i=1;i<=n;i++)
			b[i]=br.nextInt();
		
		    b[0]=0;
		int sum=br.nextInt();
		boolean arr[][]=new boolean[n+1][sum+1];
		for(int i=0;i<=sum;i++)
		{
			arr[0][i]=false;
		}
		for(int i=0;i<=n;i++)
		{
			arr[i][0]=true;
		}
		    
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(b[i]<=j)
				{
					arr[i][j]=arr[i-1][j] | arr[i-1][j-b[i]];
				}
				else
				{
					arr[i][j]=arr[i-1][j];
				}
			}
		}
		
		if(arr[n][sum])
		{
			int m=n;
			int l=sum;
			String temp="";
			while(l!=0)
			{
				if(b[m]>l)
					m--;
				else if(arr[m-1][l-b[m]])
			{
				temp+=b[m]+" ";
				l=l-b[m];
				m=m-1;
				
			}
			else
			{
				m=m-1;
			}
			
			}
			System.out.println(temp);
			}
		else
		{
			System.out.println("sum not possible");
		}
		
	}

}
