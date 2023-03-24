import java.util.Scanner;

class Atividade5 {
    public static void main(String[] args) {

        int numero,antecessor, sucessor;
        Scanner entradateclado = new Scanner(System.in);

        System.out.println("Programa de sucessor e antecessor");
        System.out.print("Digite um numero inteiro:");
        numero = entradateclado.nextInt();
        antecessor = (numero - 1);
        sucessor = (numero + 1);
        System.out.println("Antecessor: "+antecessor+"\nSucessor: " + sucessor);
    }
}