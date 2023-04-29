import java.util.Scanner;

class Atividade40 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        String fraseDigitada= new String();
        char letraLocalizada;
        int tamanhoDaFrase, posicaoAtualDaString, ultimaPosicaoString = -1;
        System.out.print("Digite uma frase: ");
        fraseDigitada = entradaTeclado.nextLine();
        System.out.print("\nDigite a letra que você deseja  saber qual foi a sua ultima posição na frase digitada: ");
        letraLocalizada = entradaTeclado.next().charAt(0);
        entradaTeclado.nextLine();
        tamanhoDaFrase = fraseDigitada.length();
        for(posicaoAtualDaString = 0; posicaoAtualDaString < tamanhoDaFrase; posicaoAtualDaString++)
        {
            if(fraseDigitada.charAt(posicaoAtualDaString) == letraLocalizada )
            {
                ultimaPosicaoString = posicaoAtualDaString;
            }
        }
        if (ultimaPosicaoString == -1)
        {
            System.out.println("\nCaracter não encontrado: ");
        }
        else
            System.out.println("\nPosiçao da última ocorrência do caracter: " + (ultimaPosicaoString + 1));
    }
}
