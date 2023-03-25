import java.util.Scanner;

class Atividade31 {
    public static void main(String[] args) {

        int quantidade;
        float altura, maiorAltura = 0 , menorAltura = 10, somaAlturaM = 0, somaTotal = 0, totalmulher = 0;
        char sexo;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("\nLeitor de ficha");
        System.out.println("\n****************************************\n");
        for (quantidade = 1; quantidade<=50; quantidade++) {
            System.out.print("\n Digite a sua altura: ");
            altura = entradaTeclado.nextFloat();
            System.out.print("Digite F para feminino ou M para masculino: ");
            entradaTeclado.nextLine();
            sexo = entradaTeclado.nextLine().charAt(0);
            somaTotal += altura;
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            else if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if((sexo == 'F') || (sexo == 'f')) {
                somaAlturaM = somaAlturaM + altura;
                totalmulher = totalmulher + 1;
            }
        }
        somaTotal = somaTotal /50;
        if (totalmulher > 0) {
            somaAlturaM = somaAlturaM / totalmulher;
        }
        System.out.println("\n****************************************\n");
        System.out.println(" A maior altura da turma é: " + maiorAltura);
        System.out.println(" A menor altura da turma é: " + menorAltura);
        System.out.println(" A média de altura das mulheres é: " + somaAlturaM);
        System.out.println(" A média altura da turma é: " + somaTotal);
    }
}
