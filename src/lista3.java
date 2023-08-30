import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean sair = true;

        while (sair) {
            System.out.print("\n\t qual execicio voce quer ver[1-3] 0 para sair: ");
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1 -> ex1(input);
                case 2 -> ex2(input);
                case 3 -> ex3(input);
                case 0 -> sair = false;
            }
        }

        input.close();

    }

    // 1 - Faça um programa que repita a leitura de uma senha até que ela seja
    // válida.
    // Para cada leitura de senha incorreta informada, escrever a mensagem "Senha
    // Invalida".
    // Quando a senha for informada corretamente deve ser impressa a mensagem
    // "Acesso Permitido" e o algoritmo encerrado.
    // Considere que a senha correta é o valor 2002.
    static void ex1(Scanner input) {
        int senha = 0;
        while (senha != 2002) {
            System.out.print("\nsenha incorreta");
            System.out.print("\ncoloque a senha: ");
            senha = input.nextInt();
        }
        System.out.print("\nsenha correta");
    }

    // 2- Faça um programa para ler as coordenadas (X,Y) de uma quantidade
    // indeterminada de pontos no sistema cartesiano.
    // Para cada ponto escrever o quadrante a que ele pertence.
    // O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
    // (nesta situação sem escrever mensagem alguma).
    static void ex2(Scanner input) {
        while (true) {
            System.out.print("digite o valor X: ");
            float x = input.nextFloat();

            System.out.print("digite o valor Y: ");
            float y = input.nextFloat();

            if (x == 0 || y == 0) {
                System.out.print("esta no eixo");
                break;
            } else if (x > 0 && y > 0) {
                System.out.println("1 quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("2 quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("3 quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("4 quadrante");
            }
        }
    }

    // 3- Um Posto de combustíveis deseja determinar qual de seus produtos tem a
    // preferência de seus clientes.
    // Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da
    // seguinte forma:
    // 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
    // Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
    // deve ser solicitado um novo código (até que seja válido).
    // O programa será encerrado quando o código informado for o número 4.
    // Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
    // abasteceram cada tipo de combustível, conforme exemplo.
    static void ex3(Scanner input) {
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int cod = 0;
        while (cod != 4) {
            System.out
                    .print("combustivel abastecido: \n\t1.Alcool \n\t2.Gasolina \n\t3.Diesel \n\t4.Fim \n\t digite: ");
            cod = input.nextInt();
            switch (cod) {
                case 1 -> alcool++;
                case 2 -> gasolina++;
                case 3 -> diesel++;
            }
        }
        System.out.printf("\n\tAlcool: %s  \n\tGasolina: %s \n\tDiesel: %s", alcool, gasolina, diesel);
    }
}