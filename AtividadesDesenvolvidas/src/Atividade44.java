import java.util.Scanner;

class Atividade44 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        String vetorNome[] = new String[30];
        int quantidadeDePessoas, posicaoDaPessoa, idade, idadeTotal = 0;
        int vetorIdade[] = new int[30];
        float idadeMedia = 0 ;
        quantidadeDePessoas = vetorNome.length;
        for (posicaoDaPessoa = 0; posicaoDaPessoa < quantidadeDePessoas; posicaoDaPessoa++)
        {
            System.out.print("\nDigite o seu nome: ");
            vetorNome[posicaoDaPessoa] = entradaTeclado.nextLine();
            System.out.print("Digite a sua idade: ");
            vetorIdade[posicaoDaPessoa] = entradaTeclado.nextInt();
            entradaTeclado.nextLine();
            idadeTotal+= vetorIdade[posicaoDaPessoa];
        }
        idadeMedia =  idadeTotal / 30;
        for (posicaoDaPessoa = 0; posicaoDaPessoa < quantidadeDePessoas; posicaoDaPessoa++)
        {
            if(vetorIdade[posicaoDaPessoa] > idadeMedia)
            {
                System.out.println("\n A pessoa que tem a idade acima da média é : " + vetorNome[posicaoDaPessoa]);
            }
        }
    }
}
