import java.util.Scanner;

class Atividade17 {
    public static void main(String[] args) {

        float numerodesejado, total = 0;
        int numero;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Soma dos numero");

        for (numero = 1; numero <= 10; numero++) {
            System.out.print("Digite o número desejado para somar:");
            numerodesejado = entradaTeclado.nextFloat();
            total = total + numerodesejado;
        }
        System.out.println("O total da soma dos números:" + total);
    }
}
