public class Factorial
{
public static void main (String args[])
{
int number=5;
long factorial=1;
for(inti=1; i<=number; i++)
{
factorial*=i;
}
System.out.println("Factorial of "+number+"is:"+factorial);
}
}