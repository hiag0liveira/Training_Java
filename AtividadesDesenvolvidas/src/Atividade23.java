import java.util.Scanner;

class Atividade23 {
    public static void main(String[] args) {

        int n1,n2, numero = 0;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("\nPrograma para multiplicação ");
        System.out.println("\n****************************************\n");
        System.out.print("Digite o número que você deseja multiplicar: ");
        n1 = entradaTeclado.nextInt();
        System.out.print("Digite o numero o qual deseja mulplicar o anterior: ");
        n2 = entradaTeclado.nextInt();
        for ( int inicial = 0; inicial < n1; inicial ++ ){
            numero += n2;
        }
        System.out.println("\n****************************************\n");
        System.out.println("A multiplicação dos numero desejado possui o resulado de : " + numero);
    }
}
