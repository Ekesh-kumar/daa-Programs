public class method1{
public void Mypublic() {
System.out.print("public methods can be executed by creating objects \n");
}
static void Mystatic() {
System.out.print("static methods can be called by without creating objects");
}
public static void main(String[] args)
{
method1 myobj = new method1();
myobj.Mypublic();
Mystatic();
}}
