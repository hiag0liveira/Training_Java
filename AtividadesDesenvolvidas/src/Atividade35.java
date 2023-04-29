import java.util.Scanner;

class Atividade35 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        String nome, nomeDaPessoaMaisAlta = new String();
        int quantidadeDePessoas;
        float altura , alturaDaPessoaMaisBaixa = 10000, totalDasAlturas = 0, mediaDasAlturas = 0, alturaDaPessoaMaisAlta = 0;
        for (quantidadeDePessoas = 1; quantidadeDePessoas<=3; quantidadeDePessoas++ )
        {
            System.out.print("Digite o seu nome: ");
            nome = entradaTeclado.nextLine();
            System.out.print("Digite a sua altura: ");
            altura = entradaTeclado.nextFloat();
            entradaTeclado.nextLine();
            totalDasAlturas =  totalDasAlturas + altura;
            if (altura < alturaDaPessoaMaisBaixa)
            {
                alturaDaPessoaMaisBaixa = altura;
            }

            if (altura > alturaDaPessoaMaisAlta)
            {
                alturaDaPessoaMaisAlta = altura;
                nomeDaPessoaMaisAlta = nome;

            }
        }

        mediaDasAlturas = totalDasAlturas / 20;
        System.out.print("\n Somandado todas as alturas informadas tivemos a media de  "+ mediaDasAlturas+ "\n");
        System.out.print("\n A altura mais baixa da turme é de "+ alturaDaPessoaMaisBaixa+ "\n");
        System.out.print("\n O nome da pessoa mais alta é "+ nomeDaPessoaMaisAlta + "\n");

    }
}
