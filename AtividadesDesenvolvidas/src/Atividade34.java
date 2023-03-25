import java.util.Scanner;

class Atividade34 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        String nome, sexo = new String();
        int quantidadeDePessoas, sexoMasculino = 0, sexoFeminino = 0 ;

        for (quantidadeDePessoas = 1; quantidadeDePessoas<=2; quantidadeDePessoas++ ) {
            System.out.print("Digite o seu nome: ");
            nome = entradaTeclado.nextLine();
            System.out.print("Digite o seu sexo: ");
            sexo = entradaTeclado.nextLine();
            if ((sexo.equals("masculino")) ||  (sexo.equals("MASCULINO"))) {
                sexoMasculino = 1 + sexoMasculino;
            }
            else if  ((sexo.equals("feminino")) ||  (sexo.equals("FEMININO"))) {
                sexoFeminino = 1 + sexoFeminino;
            }
        }
        System.out.print("\nNa pesquisa feitas tivemos "+ sexoMasculino + " homens e "+ sexoFeminino+ " mulheres\n");
    }
}
