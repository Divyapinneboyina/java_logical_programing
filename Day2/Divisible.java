import java.util.Scanner;
public class Divisible
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a number:");
int num=scanner.nextInt();
if(num%5==0)
{
System.out.println(num+"is divisible by 5");
}
else if (num%11==0)
{
System.out.println(num+"is divisible by 11");
}
else
{
System.out.println(num+"is not divisible by 5 or 11");
}
scanner.close();
}
}