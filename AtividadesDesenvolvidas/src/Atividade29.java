import java.util.Scanner;

class Atividade29 {
    public static void main(String[] args) {

        int numero, soma = 0;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("\nContador de numeros positivos. ");
        System.out.println("\n****************************************\n");
        do {
            System.out.print("Digite um numero: ");
            numero = entradaTeclado.nextInt();
            if (numero >= 0) {
                soma = soma + 1;
            }
        } while (numero > -1);
        soma = soma + 1;
        System.out.print("\n****************************************\n");
        System.out.println("Foram digitados " + soma + " numeros no total.");
        soma = soma - 1;
        System.out.println("Foram digitados " + soma + " numeros positivos.");
    }
}
