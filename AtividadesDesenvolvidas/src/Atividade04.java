import java.util.Scanner;

class Atividade04 {
    public static void main(String[] args) {

        float so, v, t, s;
        Scanner entradateclado = new Scanner(System.in);

        System.out.println("Espaço percorrido por um movel em movimento retilineo");
        System.out.print("Qual é o espaço inicial?:");
        so = entradateclado.nextFloat();
        System.out.print("Qual é a velocidade?");
        v = entradateclado.nextFloat();
        System.out.print("Qual é o tempo?");
        t = entradateclado.nextFloat();
        s= (so + v * t);
        System.out.println("Espaço percorrido por um movel em movimento retilineo " + s +" metros");
    }
}