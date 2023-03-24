import java.util.Scanner;

class Atividade16 {
    public static void main(String[] args) {

        int ano;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Verifique se o ano é bissexto");
        System.out.print("Digite o ano: ");
        ano = entradaTeclado.nextInt();

        if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            System.out.println(ano + " é um ano Bissexto!");
        }
        else{
            System.out.println(ano + " não é um ano Bissexto!");
        }
    }
}