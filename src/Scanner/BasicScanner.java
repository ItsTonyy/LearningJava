package Scanner;

import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor abaixo");

        int valorDigitado = leitor.nextInt();

        System.out.println("Valor digitado: " + valorDigitado);
    }
}
