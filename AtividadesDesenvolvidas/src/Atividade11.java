import java.util.Scanner;

class Atividade11 {
    public static void main(String[] args) {

        char sexo;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Verifique se é masculino ou feminino");
        System.out.print(" Digite o sexo (F - Feminino, M - Masculino): ");
        sexo = entradaTeclado.nextLine().charAt(0);

        if ((sexo == 'M') || (sexo == 'm')) {
            System.out.println(" Masculino");
        }
        else {
            if ((sexo == 'F') || (sexo == 'f')) {
                System.out.println(" Feminino");
            }
            else {
                System.out.println("Sexo Inválido ");
            }
        }
    }
}