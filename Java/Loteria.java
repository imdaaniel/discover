import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        // Objetivo: sortear 6 números de 1 a 60, x vezes

        Scanner reader = new Scanner(System.in);

        System.out.println("Gerador de numeros de loteria - desenvolvido por Daniel Tavares");
        System.out.print("\nInsira o valor mínimo a ser sorteado: ");
        final int MIN_NUMBER = reader.nextInt();

        System.out.print("\nInsira o valor máximo a ser sorteado: ");
        final int MAX_NUMBER = reader.nextInt();

        System.out.print("\nInsira a quantidade de numeros por jogo: ");
        final int NUMBERS_PER_GAME = reader.nextInt();

        System.out.print("\nInsira a quantidade de jogos: ");
        final int NUMBER_OF_GAMES = reader.nextInt();

        final int RANGE = MAX_NUMBER - MIN_NUMBER + 1;

        System.out.println("Gerando " + NUMBER_OF_GAMES + " jogos, cada um com " + NUMBERS_PER_GAME + " números aleatórios entre " + MIN_NUMBER + " e " + MAX_NUMBER);

        for (int i = 0; i < NUMBER_OF_GAMES; i++) {
            System.out.print("Jogo " + (i+1) + ": ");

            for (int j = 0; j < NUMBERS_PER_GAME; j++) {
                /* Math.random() gera um numero aleatorio entre 0.0 (inclusivo) e 1.0 (exlusivo), portanto, quando multiplicar, sempre sera menor que 60 (no maximo 59.9999)
                que ao retirar a parte inteira, fica no maximo 59 + 1 (MIN_NUMBER), ficando dentro do range estabelecido.
                */
                System.out.print(((int) (Math.random() * RANGE) + MIN_NUMBER) + " | ");
            }
            System.out.println();
        }

        // Missao: nao repetir numeros num mesmo jogo
        // Missao: exibir numeros em ordem crescente
    }
}