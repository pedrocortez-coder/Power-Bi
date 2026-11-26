import java.util.Scanner;

class triangulo 
{
    public static void main(String args [])
 {
        int lado1, lado2, lado3;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite primeiro lado: ");
        lado1 = entrada.nextInt();

        System.out.print("Digite segundo lado: ");
        lado2 = entrada.nextInt();

        System.out.print("Digite terceiro lado: ");
        lado3 = entrada.nextInt();

        if (lado1 < (lado2 + lado3) && 
            lado2 < (lado1 + lado3) && 
            lado3 < (lado1 + lado2)) {

            System.out.println("Forma um TRIANGULO");

                       int maior = lado1;

            if (lado2 > maior) maior = lado2;
            if (lado3 > maior) maior = lado3;

            
            if (maior == lado1 && (lado1*lado1 == lado2*lado2 + lado3*lado3) ||
                maior == lado2 && (lado2*lado2 == lado1*lado1 + lado3*lado3) ||
                maior == lado3 && (lado3*lado3 == lado1*lado1 + lado2*lado2)) {

                System.out.println("E um triangulo retangulo");
            } else {
                System.out.println("Nao e um triangulo retangulo");
            }

        } else {
            System.out.println("Nao forma triangulo");
        }

        entrada.close();
    }
}
