public class overload {
static int addition(int x, int y)    		
{return(x+y);
}
static double addition(double a, double b)
{
return(a+b);
}
public static void main(String[] args)
{
int Int = addition(85, 21);
double Double = addition(41.4, 54.5);
System.out.print(Int);
System.out.print("\n");
System.out.print(Double);
}}