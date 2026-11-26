public class Trigo
{
	public static void main(String[] args)
	{
		double graos = 1;
		double total = 1;
		System.out.print("[1]");
		for (int i = 2; i <= 64; i++)
		{
			sementes = 2*sementes;
			System.out.println("[" + graos + "]");
			total = total + graos;
		}
		System.out.println("Total: " + total);
	}
}