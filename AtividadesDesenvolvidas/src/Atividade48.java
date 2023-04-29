import java.util.Scanner;

class Atividade48 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        String vetorNome[] = new String[50];
        int quantidadeDeNomes,posicaoDoNome;
        quantidadeDeNomes = vetorNome.length;
        float valorArrecadadoProduto, valorTotalArrecadado = 0;
        for (posicaoDoNome = 0; posicaoDoNome < quantidadeDeNomes; posicaoDoNome++)
        {
            System.out.print("Digite o  seu nome: ");
            vetorNome[posicaoDoNome] = entradaTeclado.nextLine();
        }
        System.out.println ("Ordem inversa: ");
        for (posicaoDoNome = quantidadeDeNomes - 1 ; posicaoDoNome >= 0 ; posicaoDoNome--)
        {
            System.out.println (vetorNome[posicaoDoNome]);
        }
    }
}
