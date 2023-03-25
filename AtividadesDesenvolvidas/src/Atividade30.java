import java.util.Scanner;

class Atividade30 {
    public static void main(String[] args) {

        int numero, divisor;
        boolean numeroPrimo = true;

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("\nPrograma números primos\n");
        System.out.println("\n****************************************\n");
        System.out.print("Digite um número para verificar se é primo: ");
        numero = entradaTeclado.nextInt();
        divisor = 2;
        while ((divisor < numero) && (numeroPrimo == true)) {
            if ( numero % divisor == 0) {
                numeroPrimo = false;
            }
            divisor++;
        }
        System.out.println ("\n****************************************\n");
        if (numeroPrimo) {
            System.out.print(" O número  " + numero + "  é primo");
        }
        else {
            System.out.print(" O número " + numero + " não é primo");
        }
    }
}
