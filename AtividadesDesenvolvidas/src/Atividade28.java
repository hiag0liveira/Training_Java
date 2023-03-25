import java.util.Scanner;

class Atividade28 {
    public static void main(String[] args) {

        int numero,soma = 0, limitador, negativo = 0;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("\nSoma dos positivos e o total dos negativos");
        System.out.println("\n****************************************\n");
        for (limitador = 1; limitador<=20; limitador++ ){
            System.out.print("Digite um numero: ");
            numero = entradaTeclado.nextInt();
            if (numero > 0){
                soma += numero;
            }
            else if ( numero < 0 ){
                negativo = 1 + negativo;
            }
        }
        System.out.print("\n****************************************\n");
        System.out.println("A soma dos numero positivos é " + soma);
        System.out.println("Dentro dos numeros digitados tem " + negativo + " numeros negativos.");
    }
}
