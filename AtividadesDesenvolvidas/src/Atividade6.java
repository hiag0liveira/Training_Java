import java.util.Scanner;

class Atividade6 {
    public static void main(String[] args) {

        float nota1, nota2, nota3, media;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Media Ponderada");
        System.out.print("Digite o valor da primeira nota: ");
        nota1 = entradaTeclado.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        nota2 = entradaTeclado.nextFloat();
        System.out.print("Digite o valor da terceira nota: ");
        nota3 = entradaTeclado.nextFloat();
        media = ((nota1 * 1 + nota2 * 2 + nota3 * 3) / 6);

        System.out.println("A media Ponderada " + media);
    }
}