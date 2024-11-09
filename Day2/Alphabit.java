import java.util.Scanner;
public class Alphabit
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.print("Enter a letter:");
char ch=scanner.next().charAt(0);
ch=Character.toLowerCase(ch);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
System.out.println(ch+"is a vowei");
}
else if ((ch>='a'&& ch<='z'))
{
System.out.println(ch+" is a consonent");
}
else
{
System.out.println("Invalid input please enter an alphabitic letter");
}
scanner.close();
}
}