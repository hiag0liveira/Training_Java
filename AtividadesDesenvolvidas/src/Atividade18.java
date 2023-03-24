import java.util.Scanner;

class Atividade18 {
    public static void main(String[] args) {

        float numerodesejado, total = 0;
        int numero;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Soma dos numero");
        numero = 1;
        while(numero <= 100) {
            System.out.print("Digite o número desejado para somar:");
            numerodesejado = entradaTeclado.nextFloat();
            total = total + numerodesejado;
            numero++;
        }
        System.out.println("O total da soma dos números:" + total);
    }
}
