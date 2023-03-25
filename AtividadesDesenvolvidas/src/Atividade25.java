import java.util.Scanner;

class Atividade25 {
    public static void main(String[] args) {

        int numero1, numero2, intervalo, soma = 0;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("\nSoma dos numeros pares do intervalo desejado ");
        System.out.println("\n****************************************\n");
        System.out.print("Digite o primeiro numero do intervalo: ");
        numero1 = entradaTeclado.nextInt();
        System.out.print("Digite o ultimo numero do intervalo: ");
        numero2 = entradaTeclado.nextInt();

        System.out.println("\nNumeros pares dentro do intervalo desejado são : ");

        for (intervalo = numero1; intervalo<=numero2; intervalo++ ) {
            if (intervalo % 2 == 0) {
                System.out.println(intervalo);
                soma += intervalo;
            }
        }
        System.out.print("\nA soma dos números pares neste intervalo é igual a: " + soma);

    }
}
