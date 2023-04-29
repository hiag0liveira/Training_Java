import java.util.Scanner;

class Atividade38 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        String nome1, nome2 = new String();
        int tamanhoDoNome1, tamanhoDoNome2;

        System.out.print("Digite uma frase: ");
        nome1 = entradaTeclado.nextLine();
        tamanhoDoNome1 = nome1.length();
        System.out.print("Digite outra frase: ");
        nome2 = entradaTeclado.nextLine();
        tamanhoDoNome2 = nome2.length();

        System.out.println("A frase 1 é  "+ nome1 + " com "+ tamanhoDoNome1+ " letras");
        System.out.println("A frase 2 é "+ nome2 + " com "+ tamanhoDoNome2+ " letras");
        if (tamanhoDoNome1 == tamanhoDoNome2)
        {
            System.out.println("As frases possuem o mesmo comprimento.");
        }
        else
            System.out.println("As frases  não possuem o mesmo comprimento.");
        if (nome1.contains(nome2))
        {
            System.out.println("As frases possuem o mesmo conteudo.");
        }
        else
        {
            System.out.println("As frases não possuem o mesmo conteudo.");
        }

    }
}
