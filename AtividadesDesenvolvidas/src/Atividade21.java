import java.util.Scanner;

class Atividade21 {
    public static void main(String[] args) {

        int numero,soma = 0;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("A soma de 1 até o número desejado ");
        System.out.print("Ate que número deseja somar: ");
        numero = entradaTeclado.nextInt();
        for (int inicio = 1; inicio<=numero; inicio++) {
            soma += inicio;
        }
        System.out.print("A soma dos números entre 1 e " +numero+" é " +soma);
    }
}
