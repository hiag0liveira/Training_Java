import java.util.Scanner;

class Atividade9 {
    public static void main(String[] args) {

        float salarioatual, reajuste, partereajuste, salarionovo;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Reajuste de Salario");
        System.out.print("Digite o seu salario atual: ");
        salarioatual = entradaTeclado.nextFloat();
        System.out.print("Digite o percentual de reajuste ");
        reajuste = entradaTeclado.nextFloat();
        partereajuste = (reajuste / 100) * salarioatual;
        salarionovo = (salarioatual + partereajuste);
        
        System.out.println("O seu novo salario é de:  " + salarionovo);
    }
}