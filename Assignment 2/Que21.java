import java.util.*;
class Que21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int a= sc.nextInt();
		String b= Integer.toOctalString(a);
		System.out.println("Octal number is: "+b);
		
	}
}