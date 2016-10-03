package odessa;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner br= new Scanner(System.in);
        int n=br.nextInt();
        int i,j=0;
        int m;
        m=(2*n-2)/2;
        char arr[][]= new char[n][2*n-1];
        for( i=0;i<n;i++)
            for(j=0;j<2*n-1;j++)
               arr[i][j]=' ';
       
        int count_=0;
        for(i=0;i<n;i++)
            {
              
            for(j=m;count_<i+1;j--)
                {
            	if(n%2!=0)
            	{
                if(i%2==0 && j%2==0)
                    {
                    arr[i][j]='#';
                    count_++;
                    }
                if(i%2!=0 && j%2!=0)
                    {
                    arr[i][j]='#';
                    count_++;
                    }
            	}
            	else
            	{
            		  if(i%2!=0 && j%2==0)
                      {
                      arr[i][j]='#';
                      count_++;
                      }
            		  if(i%2==0 && j%2!=0)
                      {
                      arr[i][j]='#';
                      count_++;
                      }
            	}
    
                }
            count_=0;
              m++;
             
             
           }
        
        for( i=0;i<n;i++)
        {
            for(j=0;j<(2*n-1);j++)
            {
               System.out.print(arr[i][j]);
            }
            System.out.println("\n");
        }
      
        
        
    }

}
