import java.util.Scanner;

class Atividade20 {
    public static void main(String[] args) {

        int numero, num, somap = 0, somai = 0;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Programa números pares e números ímpares!");
        for (num = 1; num <= 20; num++ ) {
            System.out.print("Digite um número: ");
            numero = entradaTeclado.nextInt();
            if ( numero % 2 != 0){
                somai = 1 + somai;
            }
            else if (numero % 2 == 0){
                somap = 1 + somap;
            }
        }
        System.out.print("\n ");
        System.out.println("Números ímpares: " + somai);
        System.out.println("Números pares: " + somap);
    }
}
