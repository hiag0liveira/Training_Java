import java.util.Scanner;

class Atividade03 {
    public static void main(String[] args) {

        float altura,largura,comprimento, volume;
        Scanner entradateclado = new Scanner(System.in);

        System.out.println("Calculo de volume de uma caixa d'agua");
        System.out.print("Qual a altura da caixa?:");
        altura = entradateclado.nextFloat();
        System.out.print("Qual a largura da caixa?");
        largura = entradateclado.nextFloat();
        System.out.print("Qual o comprimento da caixa?");
        comprimento = entradateclado.nextFloat();
        volume= (altura * largura * comprimento);

        System.out.println("O volume da caixa d'agua é " + volume +" litros");
    }
}