import java.util.Scanner;

class Atividade27 {
    public static void main(String[] args) {

        int numero,limitador, par = 0, impar = 0;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("\nIdentificador para verificar quantos numeros são par ou quantos são impares");
        System.out.println("\n****************************************\n");
        System.out.println("\nDigite os numeros desejados para ser indentificado: \n");
        for (limitador = 1; limitador<=20; limitador++ ) {
            System.out.print("Digite um numero: ");
            numero = entradaTeclado.nextInt();
            if (numero % 2 == 0) {
                par = 1 + par;
            }
            else if ( numero % 2 != 0 ){
                    impar = 1 + impar;
            }
        }
        System.out.print("\n****************************************\n");
        System.out.println("Dentro dos números digitados tem " + par + " números pares.");
        System.out.println("Dentro dos números digitados tem " + impar + " números ímpares.");
    }
}
