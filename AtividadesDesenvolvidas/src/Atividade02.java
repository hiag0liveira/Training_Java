import java.util.Scanner;

class Atividade02 {
    public static void main(String[] args) {

        float metros, centimetros;
        Scanner entradateclado = new Scanner(System.in);

        System.out.println("Conversão de medidas, de metros para centimetros");
        System.out.print("Qual a medida em metros:");
        metros = entradateclado.nextFloat();
        centimetros= (metros * 100);

        System.out.println(metros + "m. em centimetros é "+ centimetros + "cm");

    }
}