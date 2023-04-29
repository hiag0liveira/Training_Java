import java.util.Scanner;

class Atividade46 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        String vetorPalavra1[] = new String[20];
        String vetorPalavra2[] = new String[20];
        int quantidadeDePalavras1, quantidadeDePalavras2, posicaoDaPalavra1, posicaoDaPalavra2;
        quantidadeDePalavras1 = vetorPalavra1.length;
        quantidadeDePalavras2 = vetorPalavra2.length;
        for (posicaoDaPalavra1 = 0; posicaoDaPalavra1 < quantidadeDePalavras1; posicaoDaPalavra1++)
        {
            System.out.print ("Digite uma palavra: ");
            vetorPalavra1[posicaoDaPalavra1] = entradaTeclado.nextLine();
        }
        System.out.println ("\nOrdem inversa: \n");
        posicaoDaPalavra2 = 0;
        posicaoDaPalavra1 = quantidadeDePalavras2 - 1;
        while (posicaoDaPalavra2 < quantidadeDePalavras2 )
        {
            vetorPalavra2[posicaoDaPalavra2] = vetorPalavra1[posicaoDaPalavra1];
            posicaoDaPalavra1 = posicaoDaPalavra1 - 1;
            posicaoDaPalavra2 = posicaoDaPalavra2 + 1;
        }
        for(posicaoDaPalavra2 = 0; posicaoDaPalavra2 < quantidadeDePalavras2; posicaoDaPalavra2++)
        {
            System.out.println(vetorPalavra2[posicaoDaPalavra2]);
        }
    }
}
