import java.util.Scanner;

class Atividade32 {
    public static void main(String[] args) {

        int escolha;
        float deposito, retirada, saldo = 0, saldo2 = 0;
        Scanner entradaTeclado = new Scanner(System.in);

        do {
            System.out.print("\nMenu do banco eletrônico!\n ");
            System.out.println("\n****************************************\n");
            System.out.println("1- Depósito ");
            System.out.println("2- Retirada ");
            System.out.println("3- Saldo ");
            System.out.println("4- Sair do programa ");
            System.out.println("\n****************************************\n");
            System.out.print("Digite a opção que você deseja:  ");
            escolha = entradaTeclado.nextInt();
            System.out.println("\n****************************************\n");
            switch (escolha) {
                case 1: System.out.print("Digite o valor que deseja depositar:  ");
                    deposito = entradaTeclado.nextFloat();
                    saldo = saldo + deposito;
                    System.out.println("\n****************************************\n");
                    break;

                case 2: System.out.print("Digite o valor que desejar ser sacado: ");
                    retirada = entradaTeclado.nextFloat();
                    saldo2 = saldo2 + retirada;
                    System.out.println("\n****************************************\n");
                    break;

                case 3: System.out.print("Seu saldo atual é de: " + (saldo - saldo2));
                    System.out.println("\n****************************************\n");
                    break;

                case 4: System.out.print("Operação encerrada");
                    System.out.println("\n****************************************\n");
                    break;
                default: System.out.print("Opção inválida");
            }
        } while(escolha != 4);
    }
}
