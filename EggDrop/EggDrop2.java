import java.util.Scanner;

public class EggDrop2 {
	public static int max(int i,int j)
	{
		return (i>=j?i:j);
	}
	public static void main(String args[])
	{
		//Scanner br=new Scanner(System.in);
		
		int nf=Integer.parseInt(args[0]);//br.nextInt();
		int ne=Integer.parseInt(args[1]);//br.nextInt();
		int min=Integer.MAX_VALUE;
		int temp=0;
		int arr[][]=new int [ne+1][nf+1];
		
		for(int j=0;j<=nf;j++)
			arr[0][j]=0;
		for(int i=0;i<=ne;i++)
			arr[i][0]=0;
		for(int j=0;j<=nf;j++)
			arr[1][j]=j;
		
		for(int i=2;i<=ne;i++)
		{
			for(int j=1;j<=nf;j++)
			{
				if(i>j)
				{
					arr[i][j]=arr[i-1][j];
				}
				else
				{
					for(int k=1;k<=j;k++)
					{
						temp=max(arr[i-1][k-1],arr[i][j-k]);
						temp++;
						if(temp<min)
							min=temp;
						
					}
					
					arr[i][j]=min;
					min=Integer.MAX_VALUE;
				}
					
			}
		}
		
		System.out.println(arr[ne][nf]);
	}


	

}
