import.java.util.Scanner;
public class Primes
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int n;
		boolean primo = true;
		System.out.print("Entre com o numero: ");
		n = entrada.nextInt();
		for (int i = 2; i <= n/2; i++)
			if (n%1 == 0)
			{
				primo = false;
				break;
			}
			if (primo) // primo == true
			System.out.println("PRIMO");
			else
				System.out.println("NAO PRIMO);
	}
}