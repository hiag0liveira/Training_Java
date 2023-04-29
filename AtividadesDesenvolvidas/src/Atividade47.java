import java.util.Scanner;

class Atividade47 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        String vetorPalavra1[] = new String[2];
        String vetorPalavra2[] = new String[2];
        String vetorJuncao[] = new String [4];
        int quantidadeDePalavras1,quantidadeDePalavras2, posicaoDaPalavra1, posicaoDaPalavra2;
        quantidadeDePalavras1 = vetorPalavra1.length;
        quantidadeDePalavras2 = vetorPalavra2.length;
        for (posicaoDaPalavra1 = 0; posicaoDaPalavra1 < quantidadeDePalavras1; posicaoDaPalavra1++)
        {
            System.out.print ("Digite uma palavra para o vetor 1: ");
            vetorPalavra1[posicaoDaPalavra1] = entradaTeclado.nextLine();
        }
        System.out.print ("\n**********\n");
        for (posicaoDaPalavra2 = 0; posicaoDaPalavra2 < quantidadeDePalavras2; posicaoDaPalavra2++)
        {
            System.out.print ("Digite uma palavra para o vetor 2: ");
            vetorPalavra2[posicaoDaPalavra2] = entradaTeclado.nextLine();
        }
        System.out.print ("\n**********\n");
        for(posicaoDaPalavra1 = 0; posicaoDaPalavra1 < (quantidadeDePalavras2 * 2); posicaoDaPalavra1++)

        {
            if(posicaoDaPalavra1 < quantidadeDePalavras2 )
            {
                vetorJuncao[posicaoDaPalavra1] = vetorPalavra1[posicaoDaPalavra1];
            }
            else
            {
                vetorJuncao[posicaoDaPalavra1] = vetorPalavra2[posicaoDaPalavra1 - quantidadeDePalavras2 ];
            }
            System.out.println("Junção dos vetores: " + vetorJuncao[posicaoDaPalavra1]);
        }
    }
}
