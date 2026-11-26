public class Vetor 2 {

    public static void main(String[] args) 
    {
    	int[] vetor = {1,3,5,7,9};
    	
    	try
    	{
         System.out.println(vetor[5]);
    	}
    	catch(ArrayIndexOutOfBoundsException e) {
    		//System.out.println(e);
    		System.out.println("Erro ao acessar vetor")
    	}
    	}
    
    
}