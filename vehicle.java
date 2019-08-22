class vehicle
{
vehicle()
{
System.out.println("default/no argument constructor called\nvalue of x is null");
}
vehicle(int x)
{
System.out.println("parameterized constructer called");
System.out.println("value of x is "+x);
}
public static void main(String args[])
{
vehicle v1 = new vehicle();
vehicle v2 = new vehicle();
v2.vehicle();
v1.vehicle(5);
v2.vehicle(7);
}
}
