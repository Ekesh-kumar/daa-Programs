class Vehicle {
protected String brand = "Ford";
public void honk()
{
System.out.println("My Super fast car is");
}
}
public class car extends Vehicle {
private String modelname = "Ecosport";
public static void main(String[] args) {
car mycar = new car();
mycar.honk();
System.out.println(mycar.brand + mycar.modelname);
}}