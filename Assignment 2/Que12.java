import java.util.Scanner;
class Que12
{
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			double d1 = sc.nextDouble();
			double d2 = sc.nextDouble();
			double d3 = sc.nextDouble();
			double d4 = ((d1+d2+d3)/3);
			System.out.println("The avg is: "+d4);
	}
}