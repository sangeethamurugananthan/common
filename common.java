import java.util.*;
class common
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
TreeSet<String> ts=new TreeSet<String>();
String b[]=new String[a];
Arrays.sort(b);
int c=b[0].length();
String h=b[0];
for(int j=1;j<=c;j++)
{
int count=0;
String yy=h.substring(0,j);
for(int i=0;i<b.length;i++)
{
if(b[i].contains(yy))
count++;
}
if(count==b.length)
ts.add(yy);
}
System.out.println(ts.first());
}
}
