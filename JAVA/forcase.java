import.java.util.Scanner;
public class paresImpares
{
	public static void main(String[] args)
	{
		int n, ContPar=0, ContImpar=0;
		Scanner entrada = new Scanner(System.in);
		for (int i = 1; i <= 5; i++)
	}
	System.out.print("Digite um numero: ");
   n = entrada.nextInt();
switch(n % 2)
{
case 0;
ContPar++;
break;
case 1
ContImpar++;
break;
}
}
System.out.println("Qtde Pares: "+ContPar);
System.out.println("Qtde Impares: "+ContImpar);
