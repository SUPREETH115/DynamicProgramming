import java.util.Scanner;

public class MinimumJump {
	static int min(int i,int j)
	{
		return (i<j?i:j);
	}
	public static void main(String args[])
	{
		Scanner br=new Scanner(System.in);
		String str=br.nextLine();
		char a[]=str.toCharArray();
		int T []=new int[str.length()];
		int P []=new int[str.length()];
		for(int k=0;k<str.length();k++)
		{
			T[k]=Integer.MAX_VALUE;
			P[k]=0;
		}
		int i=0;
		int j=1;
		T[0]=0;
		P[0]=-1;
		while(i<str.length() && j<str.length())
		{
			while(i<j)
			{
				if(Integer.parseInt(a[i]+"")+i>=j)
				{
					if(T[i]+1<T[j])
						P[j]=i;
					T[j]=min(T[i]+1,T[j]);
					i++;
				}
				else
					i++;
			}
			i=0;
			j++;
		}
		
		
		System.out.println(T[str.length()-1]);
		int n=str.length()-1;
		String temp=n+"";
		while(n>0)
		{
		temp=P[n]+"->"+temp;
		n=P[n];
	    }
     System.out.println(temp);
}
}
