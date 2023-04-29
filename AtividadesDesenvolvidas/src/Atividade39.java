import java.util.Scanner;

class Atividade39 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        String palavra = new String();
        int posicaoAtualDaString,tamanhoDaPalavra;

        System.out.print("Digite uma palavra: ");
        palavra = entradaTeclado.nextLine();
        tamanhoDaPalavra = palavra.length();
        for (posicaoAtualDaString = 0; posicaoAtualDaString < tamanhoDaPalavra; posicaoAtualDaString++)
        {
            System.out.println(palavra.charAt (posicaoAtualDaString));
        }


    }
}
