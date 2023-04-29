import java.util.Scanner;

class Atividade50 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        float vetorPreco[] = new float[500];
        int vetorQuantidade[] = new int[500];
        int quantidadeDeProdutos,posicaoDoProduto;
        quantidadeDeProdutos = vetorQuantidade.length;
        float valorArrecadadoProduto = 0, valorTotalArrecadado = 0;
        for (posicaoDoProduto = 0; posicaoDoProduto < quantidadeDeProdutos; posicaoDoProduto++)
        {
            System.out.print("Digite a quantidade do produto: ");
            vetorQuantidade[posicaoDoProduto] = entradaTeclado.nextInt();
            System.out.print("Digite o preço do produto: ");
            vetorPreco[posicaoDoProduto] = entradaTeclado.nextFloat();
        }
        System.out.print("\n***********************\n");
        for (posicaoDoProduto = 0; posicaoDoProduto < quantidadeDeProdutos; posicaoDoProduto++)
        {
            valorArrecadadoProduto = vetorQuantidade[posicaoDoProduto] * vetorPreco[posicaoDoProduto];
            System.out.println("Valor arrecado com o produto " +( posicaoDoProduto + 1) + "  é de: R$ " + valorArrecadadoProduto);
            valorTotalArrecadado = valorTotalArrecadado + valorArrecadadoProduto;
        }
        System.out.print("\n***********************\n");
        System.out.println("Valor total arrecadado é de : R$ " + valorTotalArrecadado);
    }
}
