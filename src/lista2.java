import java.util.Scanner;

public class lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean sair = true;

        while (sair) {
            System.out.print("\t qual execicio voce quer ver[1-8] 0 para sair: ");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1 -> ex1(input);
                case 2 -> ex2(input);
                case 3 -> ex3(input);
                case 4 -> ex4(input);
                case 5 -> ex5(input);
                case 6 -> ex6(input);
                case 7 -> ex7(input);
                case 8 -> ex8(input);
                case 0 -> sair = false;
            }
        }

        input.close();

    }

    // 1- Faça um programa para ler um número inteiro, e e depois dizer
    // se este número é negativo ou não.
    static void ex1(Scanner input) {
        System.out.print("digite um numero ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("positivo");
        } else {
            System.out.println("negativo");
        }
    }

    // Faça um programa para ler um número inteiro e dizer se este
    // número é par ou impar.
    static void ex2(Scanner input) {
        System.out.print("digite um numero ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }

    // Leia 2 valores inteiros (A e B). Após, o programa deve mostrar O
    // uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indi-
    // cando se os valores lidos são múltiplos entre si. Atenção: os núme-
    // ros devem poder ser digitados em ordem crescente ou decres-
    // cente.
    static void ex3(Scanner input) {
        System.out.print("digite um numero ");
        int num = input.nextInt();

        System.out.print("digite um numero ");
        int num2 = input.nextInt();

        if (num % num2 == 0) {
            System.out.println("São multiplos");
        } else if (num2 % num == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }

    // Leia hora inicial e a hora final de um jogo. A seguir calcule a
    // duração do Jogo, sabendo que O mesmo pode começar em um dia
    // e terminar em outro, tendo uma duração mínima de 1 hora e má-
    // xima de 24 horas (refazer para que nenhum seja maior que 24)
    static void ex4(Scanner input) {
        System.out.print("digite a hora inicial ");
        int num = input.nextInt();

        System.out.print("digite a hora final ");
        int num2 = input.nextInt();

        if (num >= 1 && num <= 24 && num2 >= 1 && num2 <= 24) {
            System.out.printf("o jogo durou %s horas \n", num2 - num);
        } else {
            System.out.println("voce digitou a/as horas erradas");
        }

    }

    // Com base na tabela abaixo, escreva um programa que leia o có-
    // digo de um item e a quantidade deste item. A seguir, calcule e
    // mostre o valor da conta a pagar: (refazer co if)
    // Código Descrição Preço
    // 1 Pizza 4
    // 2 Xburger 4,5
    // 3 Xbacon 5
    // 4 Xsalada 2
    // 5 Refri 1,5
    static void ex5(Scanner input) {
        System.out.print("\t1\tPizza" +
                "\n\t2\tXburger" +
                "\n\t3\tXbacon" +
                "\n\t4\tXsalada" +
                "\n\t5\tRefri\ndigite o codigo do pedido: ");
        int cod = input.nextInt();

        System.out.print("digite a quantidade: ");
        int quant = input.nextInt();

        switch (cod) {
            case 1 -> System.out.printf("voce pediu %s de Pizza isso vai custar %s\n", quant, quant * 4);
            case 2 -> System.out.printf("voce pediu %s de Xburger isso vai custar  %.2f\n", quant, quant * 4.5);
            case 3 -> System.out.printf("voce pediu %s de Xbacon isso vai custar  %s\n", quant, quant * 5);
            case 4 -> System.out.printf("voce pediu %s de Xsalada isso vai custar  %s\n", quant, quant * 2);
            case 5 -> System.out.printf("voce pediu %s de Refri isso vai custar  %.2f\n", quant, quant * 1.5);
            default -> System.out.println("digite um codigo valido");
        }
    }

    // Faça um programa que leia um valor qualquer e apresente uma
    // mensagem dizendo em qual dos seguintes intervalos ([0,25],
    // (25,50], (50,75], (75,100]) este valor se encontra.Se o valor não
    // estiver em nenhum destes intervalos, deverá ser impressa a men-
    // sagem "Fora de intervalo"
    static void ex6(Scanner input) {
        System.out.print("digite um valor: ");
        int num = input.nextInt();

        if (num >= 0 && num <= 25) {
            System.out.println("entre 0 e 25");
        } else if (num >= 25 && num <= 50) {
            System.out.println("entre 25 e 50");
        } else if (num >= 50 && num <= 75) {
            System.out.println("entre 50 e 75");
        } else if (num >= 75 && num <= 100) {
            System.out.println("entre 75 e 100");
        } else {
            System.out.println("não esta em nenhum intervalo");
        }
    }

    // Leia 2 valores com uma casa decimal (x e y), que devem repre-
    // sentar as coordenadas de um ponto em um plano. A seguir, determine
    // qual o quadrante ao qual pertence o ponto, ou se se está sobre
    // um dos eïxos cartesianos ou na origem (x= y=0). (faltou dizer se está no eixo
    // X, no eixo Y ou origem)
    static void ex7(Scanner input) {
        System.out.print("digite o valor X: ");
        float x = input.nextFloat();

        System.out.print("digite o valor Y: ");
        float y = input.nextFloat();

        if (x == 0 || y == 0) {
            if (x == 0 && y == 0) {
                System.out.println("esta no eixo origem");
            } else if (x != 0 || y == 0) {
                System.out.println("esta no eixo y");
            } else if (x == 0 && y != 0) {
                System.out.println("esta no eixo x");
            }
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

    // 8- Faça um programa que leia um valor com duas casas de-
    // cimais, equivalente ao salário de uma pessoa. Em seguida
    // calcule e mostre o valor que esta þessoa deve pagar de Imposto de Renda,
    // segundo a tabela abaixo
    // Base calculo Aliquota
    // de R$ 1903,99 até R$ 2826,65 7,5%
    // de R$ 2826,65 até R$ 3751,05 15,0%
    // de R$ 3751,06 até R$ 4664,68 22,5%
    // acima de R$ 4664,68 27,5%
    static void ex8(Scanner input) {
        System.out.print("Qual o salario: ");
        double salario = input.nextDouble();

        if (salario >= 1903.99 && salario < 2826.65) {
            System.out.println("voce deve pagar 7,5% de aliquota, que é igual a " + salario * 0.075);
        } else if (salario >= 2826.65 && salario <= 3751.05) {
            System.out.println("voce deve pagar 15,0% de aliquota, que é igual a " + salario * 0.15);
        } else if (salario >= 3751.05 && salario <= 4664.68) {
            System.out.println("voce deve pagar 22,5% de aliquota, que é igual a " + salario * 0.225);
        } else if (salario > 4664.68) {
            System.out.println("voce deve pagar 27,5% de aliquota, que é igual a " + salario * 0.275);
        } else {
            System.out.println("salario isento");
        }

    }

}
