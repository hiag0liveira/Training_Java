import java.util.Scanner;

class Atividade12 {
    public static void main(String[] args) {

        float n1,n2,n3,n4,n5,n6;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Salario total de um vendedor");
        System.out.print("Digite o seu salario total: ");
        n1 = entradaTeclado.nextFloat();
        System.out.print("Digite quanto vendeu: ");
        n2 = entradaTeclado.nextFloat();
        n3 = (n2 * 3 / 100);
        n4 = (n3 + n1);
        n5 = (n2 * 5 / 100);
        n6 = (n5 + n1);

        if (n2<1500) {
            System.out.println(" O seu salario total é de " + n4+ " e teve o bonus de vendas " + n3);
        }
        else {
            System.out.println(" O seu salario total é de " + n6+ " e teve o bonus de vendas " + n5);
        }
    }
}