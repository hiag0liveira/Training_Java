import java.util.Scanner;

class Atividade08 {
    public static void main(String[] args) {

        float n1;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Verifique se é positivo ou negativo o numero");
        System.out.print("Digite o Número: ");
        n1 = entradaTeclado.nextFloat();
        if (n1>0) {
            System.out.println(" Esse número positivo");
        }
        else if(n1<0) {
            System.out.println(" Esse número negativo");
        }
        else {
                System.out.println(" Esse número neutro");
        }
    }
}