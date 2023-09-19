// Desafio 3
// Sequência de Fibonacci (Recursividade)
public class Ex03 {
    public static void main(String[] args) {
        int n = 3;

        long resultado = calcularFibonacci(n);

        System.out.println("Fib (" + n + ") = " + resultado);
    }

    public static long calcularFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long fibAtual = 1;
            long fibAnterior = 0;
            long resultado = 0;

            for (int i = 2; i <= n; i++) {
                resultado = fibAtual + fibAnterior;
                fibAnterior = fibAtual;
                fibAtual = resultado;
            }
            return resultado;
        }
    }
}
