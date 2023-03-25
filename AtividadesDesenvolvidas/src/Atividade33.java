import java.util.Scanner;

class Atividade33 {
    public static void main(String[] args) {

        int opcao;
        float lado, Aquadrado, base, altura, Aretangulo, basetriangulo, alturatriangulo, Atriangulo, raio;
        double Acirculo;
        Scanner entradaTeclado = new Scanner(System.in);

        do {
            System.out.print("\nCálculo de áreas de figuras geometricas! \n");
            System.out.println("\n****************************************\n");
            System.out.println("\n1- Calcular a área do quadrado ");
            System.out.println("\n2- Calcular a área do retângulo ");
            System.out.println("\n3- Calcular a área do triângulo ");
            System.out.println("\n4-  Calcular a área do círculo");
            System.out.println("\n5- sair do programa ");
            System.out.println("\n****************************************\n");
            System.out.print("\nDigite a opção que você deseja: ");
            opcao = entradaTeclado.nextInt();
            switch (opcao) {
                case 1: System.out.print("Digite umas das medida do quadrado");
                    lado = entradaTeclado.nextFloat();
                    Aquadrado = lado *lado;
                    System.out.print("A área do quadrado é: " + Aquadrado);
                    System.out.println("\n****************************************\n");
                    break;

                case 2: System.out.print("Digite a medida da base do retângulo: ");
                    base = entradaTeclado.nextFloat();
                    System.out.print("Digite a medida da altura do retângulo: ");
                    altura = entradaTeclado.nextFloat();
                    Aretangulo = base * altura;
                    System.out.print("A área do retângulo é : " + Aretangulo);
                    System.out.println("\n****************************************\n");
                    break;

                case 3: System.out.print("Digite a medida da base do triângulo: ");
                    basetriangulo = entradaTeclado.nextFloat();
                    System.out.print("Digite a medida da altura do triângulo: ");
                    alturatriangulo = entradaTeclado.nextFloat();
                    Atriangulo = (basetriangulo * alturatriangulo) / 2;
                    System.out.print("A área do triângulo é : " + Atriangulo);
                    System.out.println("\n****************************************\n");
                    break;

                case 4: System.out.print("Digite a medida do raio do círculo: ");
                    raio = entradaTeclado.nextFloat();
                    Acirculo = 3.14 * (raio * raio);
                    System.out.print("Área do círculo: " + Acirculo);
                    System.out.println("\n****************************************\n");
                    break;

                case 5: System.out.print("Programa encerrado");
                    break;

                default: System.out.print("Opção inválida");
            }
        } while(opcao != 5);

    }
}
