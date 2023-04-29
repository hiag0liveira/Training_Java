import java.util.Scanner;

class Atividade37 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        String nome1, nome2 = new String();
        int tamanhoDoNome1, tamanhoDoNome2;

        System.out.print("Digite um  nome: ");
        nome1 = entradaTeclado.nextLine();
        tamanhoDoNome1 = nome1.length();
        System.out.print("Digite outro nome: ");
        nome2 = entradaTeclado.nextLine();
        tamanhoDoNome2 = nome2.length();


        if (tamanhoDoNome1> tamanhoDoNome2)
        {
            System.out.println("A menor palavra foi "+ nome2 + " com "+ tamanhoDoNome2+ " letras");
        }
        else {
            System.out.println("A menor palavra foi "+ nome1 + " com "+ tamanhoDoNome1+ " letras");
        }

    }
}
