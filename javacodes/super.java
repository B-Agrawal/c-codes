class person 
{
int id;
String name;
person(int id,String name)
{
this.id=id;
this.name=name;

}
}
class emp
{
float salary;
emp(int id,String name,float salary)
{
super(id,name);
this.salary=salary;
}
void display()
{
System.out.println(id+" "+name+" "salary);

}
}
class super3
{
public static void  main(String args[])
{
emp e=new emp();
e.display();
}
}
