import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean sair = true;

        while (sair) {
            System.out.print("\t qual execicio voce quer ver[1-7] 0 para sair: ");
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1 -> ex1(input);
                case 2 -> ex2(input);
                case 3 -> ex3(input);
                case 4 -> ex4(input);
                case 5 -> ex5(input);
                case 6 -> ex6(input);
                case 7 -> ex7(input);
                case 0 -> sair = false;
            }
        }

        input.close();

    }

    // 1- Leia um valor inteiro X (1 <= X <= 1000).
    // Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
    // se for o caso.
    static void ex1(Scanner input) {
        System.out.print("digite um numero: ");
        int x = input.nextInt();
        if (x >= 1 && x <= 1000) {
            for (int i = 0; i <= x; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    // 2- Leia um valor inteiro N. Este valor será a quantidade de valores inteiros
    // X que serão lidos em seguida.
    // Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
    // estão fora do intervalo,
    // mostrando essas informações conforme exemplo (use a palavra "in" para dentro
    // do intervalo, e "out" para fora do intervalo).
    static void ex2(Scanner input) {
        System.out.print("digite um valor n: ");
        int n = input.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i < n; i++) {
            if (i >= 10 && i <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("\tin: %s\n\tout: %s\n", in, out);

    }

    // 3- Leia 1 valor inteiro N, que representa o número de casos de teste que vem
    // a seguir.
    // Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa
    // decimal.
    // Apresente a média ponderada para cada um destes conjuntos de 3 valores,
    // sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o
    // terceiro valor tem peso 5.
    static void ex3(Scanner input) {
        System.out.print("digite um valor n: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("digite o valor do caso: ");
            float caso1 = input.nextFloat();
            System.out.print("digite o valor do caso: ");
            float caso2 = input.nextFloat();
            System.out.print("digite o valor do caso: ");
            float caso3 = input.nextFloat();

            float media = ((caso1 * 2) + (caso2 * 3) + (caso3 * 5)) / 3;
            System.out.printf("media ponderada = %.1f\n", media);
        }
    }

    // 4- Fazer um programa para ler um número N.
    // Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
    // Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
    static void ex4(Scanner input) {
        System.out.print("digite um valor n: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("digite um valor: ");
            float num1 = input.nextFloat();
            System.out.print("digite outro valor: ");
            float num2 = input.nextFloat();

            if (num2 == 0) {
                System.out.println("divisao impossivel");
                continue;
            }

            System.out.printf("divisao = %.1f\n", num1 / num2);
        }
    }

    // 5- Ler um valor N. Calcular e escrever seu respectivo fatorial.
    // Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por
    // definição, fatorial de 0 é 1.
    static void ex5(Scanner input) {
        System.out.print("digite um valor (fatorial): ");
        int n = input.nextInt();
        if (n == 0) {
            System.out.println("fatorial = 1");
        }
        int x = n;
        for (int i = n - 1; i > 0; i--) {
            // System.out.println(i);
            x = i * x;
            // System.out.println(x);
        }
        System.out.println(x);
    }

    // 6- Ler um número inteiro N e calcular todos os seus divisores.
    static void ex6(Scanner input) {
        System.out.print("digite um valor: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%s/%S = %s\n", n, i, n / i);
            }
        }
    }

    // 7- Fazer um programa para ler um número inteiro positivo N.
    // O programa deve então mostrar na tela N linhas, começando de 1 até N. Para
    // cada linha,
    // mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
    // exemplo.
    static void ex7(Scanner input) {
        System.out.print("digite um valor: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%s, quadrado: %s, cubo: %s\n", i, Math.pow(i, 2), Math.pow(i, 3));
        }
    }
}