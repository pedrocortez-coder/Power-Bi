import java.util.Scanner;

public class AlunoNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, media;

        // Leitura das 3 notas
        System.out.print("Digite a 1ª nota: ");
        n1 = sc.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        n2 = sc.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        n3 = sc.nextDouble();

        // Cálculo da média
        media = (n1 + n2 + n3) / 3;

        System.out.println("Média: " + media);

        // Verificação de aprovação
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno em exame.");

            // Leitura da nota do exame
            System.out.print("Digite a nota do exame: ");
            double exame = sc.nextDouble();

            // Cálculo da média final
            double mediaFinal = (media + exame) / 2;

            System.out.println("Média final: " + mediaFinal);

            if (mediaFinal >= 5) {
                System.out.println("Aluno aprovado após exame!");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }

        sc.close();
    }
}