import java.util.Scanner;

class Atividade36 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        String nome, sexo, nacionalidade, nomeDaMulherBrasileiraMaisLeve, nomeDaPessoaMaisPesado;
        int quantidadeDePessoas, quantidadeDePessoasInicial;
        float peso, pesoTotalDasPessoas = 0, mediaDoPeso, pessoaMaisPesada = 0 , pesoMaisLeve = 50000;
        nomeDaMulherBrasileiraMaisLeve = new String();
        nomeDaPessoaMaisPesado = new String();
        System.out.print("Digite a quantidade de pessoa que gostaria para pesquisa: ");
        quantidadeDePessoas = entradaTeclado.nextInt();
        entradaTeclado.nextLine();
        for (quantidadeDePessoasInicial = 1; quantidadeDePessoasInicial <= quantidadeDePessoas; quantidadeDePessoasInicial++ )
        {
            System.out.print("Digite o seu nome: ");
            nome = entradaTeclado.nextLine();
            System.out.print("Digite o seu sexo: ");
            sexo = entradaTeclado.nextLine();
            System.out.print("Digite a sua nacionalidade: ");
            nacionalidade = entradaTeclado.nextLine();
            System.out.print("Digite o seu Peso: ");
            peso = entradaTeclado.nextFloat();
            entradaTeclado.nextLine();
            System.out.println("***********");
            pesoTotalDasPessoas =  pesoTotalDasPessoas + peso;
            if (peso > pessoaMaisPesada)
            {
                pessoaMaisPesada = peso;
                nomeDaPessoaMaisPesado = nome;
            }
            if (((sexo.equals("feminino")) ||  (sexo.equals("FEMININO")))  && ((nacionalidade.equals("brasileira")) ||  (nacionalidade.equals("BRASILEIRA"))) && ( peso < pesoMaisLeve))
            {
                pesoMaisLeve = peso;
                nomeDaMulherBrasileiraMaisLeve = nome;
            }
        }
        mediaDoPeso = pesoTotalDasPessoas / quantidadeDePessoas;
        System.out.println("\nNa pesquisa feitas tivemos a media do peso das pessoas de "+ mediaDoPeso +"kl");
        System.out.println(" O nome da pessoa mais pesada era " + nomeDaPessoaMaisPesado);
        System.out.println(" O nome da mulher brasileira mais leve era  " + nomeDaMulherBrasileiraMaisLeve);
    }
}
