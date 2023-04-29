import java.util.Scanner;

class Atividade41 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        String fraseDigitada = new String();
        String fraseAuxiliar = new String();
        int posicaoAtualDaString, tamanhoDaFrase;
        System.out.print("Digite uma frase: ");
        fraseDigitada = entradaTeclado.nextLine();
        tamanhoDaFrase = fraseDigitada.length();
        for(posicaoAtualDaString=0; posicaoAtualDaString<tamanhoDaFrase; posicaoAtualDaString++)
        {
            if(fraseDigitada.charAt(posicaoAtualDaString) != ' ' )
            {
                fraseAuxiliar = fraseAuxiliar + fraseDigitada.charAt(posicaoAtualDaString);
            }
        }
        System.out.println(fraseAuxiliar);
    }
}
