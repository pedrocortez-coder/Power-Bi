public class Vetor1
{
	public static void main(String[] args)
	{
		/* declaracao de Constante */
		 final int TAMANHO = 10;
		 
		 int[] vetor = new int[TAMANHO];
		 
		 for (int i = 0; i <= 9; i++)
		 	System.out.print(vetor[i] + " ");
		 	
		 	/* outra forma de criar um vetor */
		 	 int[] vetor2 = {2,3,5,7,11,13,17,19,23,27};
		 	 for (int i = 0; i <= 9; i++)
		 	System.out.print(vetor2[i] + " ");
		 	 
	}
}
