public class APOSENTADORIA 
{
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int tempoContribuicao;
        char sexo;

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Digite seu sexo (M para masculino / F para feminino): ");
        sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite seu tempo de contribuição (em anos): ");
        tempoContribuicao = scanner.nextInt();

        boolean podeAposentar = false;

        if (sexo == 'Masculino') {
            if (idade >= 65 || tempoContribuicao >= 35) {
                podeAposentar = true;
            }
        } else if (sexo == 'Feminino') {
            if (idade >= 60 || tempoContribuicao >= 30) {
                podeAposentar = true;
            }
        } else {
            System.out.println("Sexo inválido!");
            return;
        }

        if (podeAposentar) {
            System.out.println("Você já pode se aposentar!");
        } else {
            System.out.println("Você ainda não pode se aposentar.");
        }

        scanner.close();
    }
}


}