import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Desafio 1
// Ordenando Números Pares e Ímpares
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Quantos números você deseja ordenar?");
        int quantidadeNumeros = scanner.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println();
            System.out.println("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        Collections.sort(pares);

        Collections.sort(impares, Collections.reverseOrder());

        System.out.println("Tudo pronto!");

        System.out.println();
        System.out.println("Números pares em ordem crescente:");
        for (int par : pares) {
            System.out.println(par);
        }

        System.out.println();
        System.out.println("Números ímpares em ordem decrescente:");
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}

