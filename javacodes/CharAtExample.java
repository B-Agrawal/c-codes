import java.lang.String;

/*class CharAtExample{
public static void main(String args[]){
String name="javatpoint";
char ch=name.charAt(4);//returns the char value at the 4th index
System.out.println(ch);
}}*/
/*  public static void main(String args[]){
String name="what do you know about me";
System.out.println(name.contains("do you know"));
System.out.println(name.contains("about"));
System.out.println(name.contains("hello"));
}}*/

class CharAtExample{
  int cube(final int n)
  {
    n=n+2;
    n*n*n;
  }
  public static void main(String args[])
  {
    CharAtExample ch=new CharAtExample();
    ch.cube(3);
  }
}
