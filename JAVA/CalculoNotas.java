import java.util.Scanner;

public class CalculoNotas {
    public static void main(String[] args) {
        Scanner = new Scanner(System.in);

        double n1, n2, n3, media;

        
        System.out.print("Digite a Primeira nota: ");
        n1 = sc.nextDouble();

        System.out.print("Digite a Segunda nota: ");
        n2 = sc.nextDouble();

        System.out.print("Digite a Terceira nota: ");
        n3 = sc.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.println("Media: " + media);

      
        if (media >= 7) {
            System.out.println("Aluno APROVADO!");
        } else {
            System.out.println("Aluno em EXAME.");

        
            System.out.print("Digite a nota do exame: ");
            double exame = sc.nextDouble();

          
            double mediaFinal = (media + exame) / 2;

            System.out.println("Media final: " + mediaFinal);

            if (mediaFinal >= 5) {
                System.out.println("Aluno aprovado apos exame!");
            } else {
                System.out.println("Aluno REPROVADO!.");
            }
        }

        close();
    }
}
