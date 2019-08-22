class first{
void add(int a,int b){
System.out.println(a+b);
}
}
class second extends first{
void add(double a,double b){
System.out.println(a+b);
}
}
public class third extends second{
void sub(int c,int d){
System.out.println(c-d);
}
void sub(double c,double d){
System.out.println(c-d);
}
public static void main(String args[]){
third ob=new third();
ob.add(1,2);
ob.add(1.1,2.2);
ob.sub(2,1);
ob.sub(2.2,1.1);
}
}
