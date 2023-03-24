import java.util.Scanner;

class Atividade15 {
    public static void main(String[] args) {

        float altura, peso;
        double pesoideal;
        char sexo;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Programa para ver o peso ideal");
        System.out.print("Digite a sua altura: ");
        altura = entradaTeclado.nextFloat();
        System.out.print("Digite o seu peso: ");
        peso = entradaTeclado.nextFloat();
        entradaTeclado.nextLine();
        System.out.print(" Digite  (H) se voce é homem ou (M)  se voce é mulher: ");
        sexo = entradaTeclado.nextLine().charAt(0);

        if ((sexo == 'h') || (sexo == 'H')) {
            pesoideal = (72.7f * altura) - 58f;
            System.out.printf(" O Seu peso ideal é de = %.2f %n ", (pesoideal));

            if (peso - pesoideal > 2) {
                System.out.print("Voce esta acima do peso ideal");
            } else if (peso - pesoideal < 0) {
                System.out.print("Voce esta abaixo do peso ideal");
            } else {
                System.out.print("Voce esta no peso ideal");
            }
        }
        else if ((sexo == 'm') || (sexo == 'M')) {
            pesoideal = (62.1f * altura) - 44.7f;
            System.out.printf(" O Seu peso ideal é de = %.2f %n ", (pesoideal));

            if (peso - pesoideal > 2) {
                System.out.print("Voce esta acima do peso ideal");
            } else if (peso - pesoideal < 0) {
                System.out.print("Voce esta abaixo do peso ideal");
            } else {
                System.out.print("Voce esta no peso ideal");
            }
        }
    }
}