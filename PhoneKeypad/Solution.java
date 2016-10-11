import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner br=new Scanner(System.in);
        String str=br.nextLine();
        int c=0;
        while(Character.isDigit(str.charAt(c)))
                c++;
        String str1=str.substring(0,c);
        String str2=str.substring(c+1,str.length()-1);
        //System.out.println(str1+" "+str2);
        char num[]=str1.toCharArray();
         int n,i,j,temp = 0,total=1;
        char[][] map=new char[][] {
                                     {'+','#','#','#'},
                                     {'$','#','#','#'},
                                     {'a','b','c','#'},
                                     {'d','e','f','#'},
                                     {'g','h','i','#'},
                                     {'j','k','l','#'},
                                     {'m','n','o','#'},
                                     {'p','q','r','s'},
                                     {'t','u','v','#'},
                                     {'w','x','y','z'} };
   
       
   int sizemap[]=new int[]{1,1,3,3,3,3,3,4,3,4};
    String result="";
    n = num.length;
     int count=0;
    for(i = 0; i < n; i++) total *= sizemap[num[i]-'0' ];

    for(i = 0;i < total;i++){
        temp = i;
        for(j = 0;j < n;j++){
            if(map[ num[j] - '0' ][ temp % sizemap[num[j]-'0'] ]!='#')
            result+=map[ num[j] - '0' ][ temp % sizemap[num[j]-'0'] ];
            if(temp > 0) temp /= sizemap[num[j] - '0'];
        }
        System.out.println(result);
        if(result.contains(str2))
            {
            count++;
            System.out.println(result+"_"+count);
        }
        else
        {System.out.println(result);}
        result="";
    }
        System.out.println(count);
    }
}
