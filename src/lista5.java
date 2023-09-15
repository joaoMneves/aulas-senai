import java.util.Scanner;

public class lista5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean sair = true;

        while (sair) {
            System.out.print("\t qual execicio voce quer ver[1-2] 0 para sair: ");
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1 -> ex1(input);
                case 2 -> ex2(input);
                case 0 -> sair = false;
            }
        }

        input.close();

    }

    // 1- Faça um programa de uma lanchonete que tenha um menu com 5 produtos e a
    // opção para continuar ou encerrar a compra.
    // Depois calcule o total da compra de um cliente e exiba o valor na tela.
    // Utilize o switch neste código.
    // Dica: utilize uma variável para armazenar o total das compras.
    static void ex1(Scanner input) {
        System.out.print("\t0 sair\n\t1\tPizza" +
                "\n\t2\tXburger" +
                "\n\t3\tXbacon" +
                "\n\t4\tXsalada" +
                "\n\t5\tRefri\n");
        boolean sair = false;
        double total = 0;
        while (!sair) {
            System.out.print("\ncodigo do pedido: ");
            int cod = input.nextInt();
            if (cod == 0) {
                break;
            }

            System.out.print("\ndigite a quantidade: ");
            int quant = input.nextInt();
            double preco = 0;

            switch (cod) {
                case 1:
                    preco = quant * 4;
                    System.out.printf("voce pediu %s de Pizza isso vai custar %s\n", quant,
                            preco);
                    break;
                case 2:
                    preco = quant * 4.5;
                    System.out.printf("voce pediu %s de Xburger isso vai custar  %.2f\n", quant,
                            preco);
                    break;
                case 3:
                    preco = quant * 5;
                    System.out.printf("voce pediu %s de Xbacon isso vai custar  %s\n", quant,
                            preco);
                    break;
                case 4:
                    preco = quant * 2;
                    System.out.printf("voce pediu %s de Xsalada isso vai custar  %s\n", quant,
                            preco);
                    break;
                case 5:
                    preco = quant * 1.5;
                    System.out.printf("voce pediu %s de Refri isso vai custar  %.2f\n", quant,
                            preco);
                    break;
                default:
                    System.out.println("digite um codigo valido");
                    break;
            }
            if (preco != 0) {
                System.out.println("deseja adicionar esse pedido? ");
                char resp = input.next().strip().charAt(0);
                switch (resp) {
                    case 's' -> total += preco;
                    case 'n' -> System.out.println("");
                    default -> System.out.println("");
                }
            }
        }
        System.out.printf("vc vai pagar %.2f", total);
    }

    // 2- Desenvolva um código que crie uma calculadora,
    // onde o usuário deverá escolher qual operação realizar (soma, multiplicação,
    // divisão, subtração, porcentagem, raiz, potência).
    // Utilize o switch neste código.
    static void ex2(Scanner input) {
        System.out.println(
                "escolha a operacao ([s]oma, [m]ultiplicao, [d]divisão, s[u]btração, [p]orcentagem, [r]aiz, po[t]encia).");
        char operacao = input.next().strip().charAt(0);
        System.out.println("digite o numero 1");
        int num1 = input.nextInt();
        System.out.println("digite o numero 2");
        int num2 = input.nextInt();
        switch (operacao) {
            case 's':
                System.out.printf("soma = %s", num1 + num2);
                break;
            case 'm':
                System.out.printf("multiplicao = %s", num1 * num2);
                break;
            case 'd':
                System.out.printf("divisão = %s", num1 / num2);
                break;
            case 'u':
                System.out.printf("subtraçao = %s", num1 - num2);
                break;
            case 'p':
                System.out.printf("porcentagem = %s", (num1 / 100) * num2);
                break;
            case 'r':
                System.out.printf("raiz num1 = %s, raiz num2 = %s", Math.sqrt(num1), Math.sqrt(num2));
                break;
            case 't':
                System.out.printf("potencia = %s", Math.pow(num1, num2));
                break;
            default:
                System.out.println("operação inválida");
                break;
        }
    }

}