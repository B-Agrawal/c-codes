import java.io.*;
class JProg1
{
public static void main(String ar[])
{
int n ,k=0;
DataInputStream in = new DataInputStream(System.in);
try
{
System.out.println("Enter the Number: ");
k=Integer.parseInt(in.readLine());
}
catch(Exception e){System.out.println(e);}
n=k;
int d=0,s=0;
while(n>0)
{
d=n%10;
s=s+(d*d*d);
n=n/10;
}
if(k==s)
System.out.println("The Number "+k+" "+"is an armstrong number");

else
System.out.println("The Number "+k+" "+ "is not an armstrong number");
}
}
