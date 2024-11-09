import java.util.Scanner;
public class Number
{
public static void main(String args[])
{
int number=5;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a number");
number=scanner.nextInt();
if(number>0)
{
System.out.println("The number"+number+"is positive");
}
else if(number<0)
{
System.out.println("The number is negative");
}
else
{
System.out.println("The number is zero");
}
scanner.close();
}
}