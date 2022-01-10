public class obh {
public void carstatus()
{
System.out.print("car is running as fast as it can \n");
}
public void carspeed(int speed)
{
System.out.print("it is running at the speed of:\t" + speed);
}
public static void main(String[] args)
{
obh car = new obh();
car.carstatus();
car.carspeed(3);
}
}