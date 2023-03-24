import java.util.Scanner;

class Atividade24 {
    public static void main(String[] args) {

        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("\nUtilização de banco eletrônico! ");
        System.out.println("\n****************************************\n");
        do {
            System.out.println("Digite a opereção que deseja realizar: \n");
            System.out.println("1- Depósito ");
            System.out.println("2- Retirada ");
            System.out.println("3- Saldo ");
            System.out.println("4- Extrato ");
            System.out.println("5- sair do programa ");
            System.out.println("Digite a opção que você deseja: ");
            n = entradaTeclado.nextInt();
            if( n == 1) {
                n1 +=  1;
            }
            else if( n == 2) {
                n2 += 1;
            }
            else if ( n == 3) {
                n3 += 1;
            }
            else if (  n == 4) {
                n4 += 1;
            }
            else if ( n == 5){
                n5 +=1;
            }
        } while ( n != 5);

        System.out.println("\n****************************************\n");
        System.out.println("Números de depósitos efetuados: " + n1);
        System.out.println("Números de retiradas efetuadas: " + n2);
        System.out.println("Números de saldos efetuados: " + n3);
        System.out.println("Números de Extratos efetuados: " + n4);
        System.out.println("Números de saídas do programa: " + n5);
    }
}
