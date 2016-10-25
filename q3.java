import java.io.*;
import java.util.*;

class Record{
String a[]=new String[10];
}
public class q3{
static boolean isInteger( String input )
{
   try
   {
      Integer.parseInt( input );
      return true;
   }
   catch( Exception e)
   {
      return false;
   }
}
public static void main(String args[])throws IOException,FileNotFoundException,NumberFormatException
{
Record rc[]=new Record[15];
int n=0,a=0;
BufferedReader in=new BufferedReader(new FileReader("q3.csv"));
String att[]=in.readLine().split(",");
a=att.length;
String line=in.readLine();
int i=0,j,k;
int sum[]=new int[a];
int den[]=new int[a];
int flagstr[]=new int[a];
while(line!=null)
{
rc[n]=new Record();
String temp[]=line.split(",");
for(k=0; k<a; k++){
	rc[n].a[k]=temp[k];
	if(isInteger(temp[k]))
	{
	  flagstr[k]=0;
	  sum[k]+=Integer.parseInt(temp[k]);
	  den[k]++;
	}
	else if(!temp[k].equals(""))
	flagstr[k]=1;
}
line=in.readLine();
n++;
}
String mode[]=new String[a];
HashMap<String,Integer> hm=new HashMap<>();
for(i=0; i<a; i++)
{
  if(flagstr[i]==1)
  {
    hm.clear();
    for(k=0; k<n; k++)
    {
	if(!rc[k].a[i].equals(""))
	{
	    int count=1;
	    if(hm.containsKey(rc[k].a[i]))
	    {
		count=hm.get(rc[k].a[i]);
		count++;
	    }
	    hm.put(rc[k].a[i],count);
	}
    }
    int max=0; String key="";
    Iterator<Map.Entry<String,Integer>>it=hm.entrySet().iterator();
    while(it.hasNext())
    {
	Map.Entry<String,Integer> me=it.next();
        if(max<me.getValue())
	{max=me.getValue(); key=me.getKey();
	}
    }
    mode[i]=key;
  }
}

in.close();
BufferedWriter out=new BufferedWriter(new FileWriter("q3.csv"));
PrintWriter pw=new PrintWriter(out);
pw.print(att[0]);
for(i=1; i<n; i++)
pw.print(","+att[i]);
pw.print("\n");

for(i=0; i<n; i++)
{
for(j=0; j<a-1; j++)
{
if(rc[i].a[j].equals(""))
	if(flagstr[j]==0)
	rc[i].a[j]=Integer.toString(sum[j]/den[j]);
	else
	rc[i].a[j]=mode[j];
pw.print(rc[i].a[j]+",");
}
pw.print(rc[i].a[j]+"\n");
}
pw.close();
}
}
