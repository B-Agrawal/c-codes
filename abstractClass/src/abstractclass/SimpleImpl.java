/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
 
import java.util.*;
class program23
{
public static void main(String ar[])
{
Arrays.sort(ar);
char c[]=ar[0].toCharArray();
Arrays.sort(c);
String s = new String(c);
ar[0]=s;
for(int i = 0;i<ar.length;i++)
{
System.out.println(ar[i]);
}
}
}
