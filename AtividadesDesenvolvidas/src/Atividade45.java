import java.util.Scanner;

class Atividade45 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int vetorA[];
        int vetorB[];
        int somaVetores[];
        int quantidade, posicao, inicialSoma, quantidadeDeRepeticao = 0;
        System.out.print("\nDigite a quantidade de numeros que contem os Vetores:  ");
        quantidade = entradaTeclado.nextInt();
        vetorA = new int[quantidade];
        vetorB = new int[quantidade];
        somaVetores = new int[quantidade];
        for (posicao = 0; posicao < quantidade; posicao++)
        {
            System.out.print("Digite o valor do Vetor A: ");
            vetorA[posicao] = entradaTeclado.nextInt();
        }
        System.out.print("\n************\n");
        for (posicao = 0; posicao < quantidade; posicao++)
        {
            System.out.print("Digite o valor do Vetor B: ");
            vetorB[posicao] = entradaTeclado.nextInt();
        }
        System.out.print("\n************\n");
        for(inicialSoma = 0; inicialSoma < quantidade; inicialSoma++)
        {
            somaVetores[inicialSoma] = vetorB[inicialSoma] + vetorA[inicialSoma];
            System.out.println("A soma dos Vetores A e B: " + somaVetores[inicialSoma] + " da posição: " + (inicialSoma + 1));
            if ( vetorA[inicialSoma] == vetorB[inicialSoma])
            {
                quantidadeDeRepeticao += 1;
            }
        }
        System.out.print("\n************\n");
        System.out.println("A quantidade de vezes que o mesmo valor repete no Vetor A e Vetor B é " + quantidadeDeRepeticao  );
    }
}
