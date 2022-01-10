public class recurssion{

public static void main(String[] args)
{
System.out.print(add(3,6));
}
static int add(int start, int end)
{
if(start<end)
{return(end+add(start, end-1));
}
else
{
return(end);
}}
}