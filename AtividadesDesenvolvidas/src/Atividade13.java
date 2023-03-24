import java.util.Scanner;

class Atividade13 {
    public static void main(String[] args) {

        int n1;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Idade do nadador");
        System.out.print("Digite sua idade: ");
        n1 = entradaTeclado.nextInt();

        if (n1>=18) {
            System.out.println(" O nadador com " + n1 + " anos de idade é maior de idade.");
        }
        else if((n1>=14) && ( n1 <= 17)) {
            System.out.println(" O nadador com  " + n1 + " anos de idade, é da classe juvenil B");
        }
        else if((n1>=11) && ( n1 <= 13)) {
            System.out.println(" O nadador com " + n1 + " anos de idade, é da classe juvenil A");
        }
        else if((n1>=8) && ( n1 <= 10)) {
            System.out.println(" O nadador com " + n1 + " anos de idade, é da classe Infantil B");
        }
        else if((n1>=5) && ( n1 <= 7)) {
            System.out.println(" O nadador com " + n1 + " anos de idade, é da classe Infantil A");
        }
        else {
            System.out.println("Não temos categoria para essa idade.");
        }
    }
}