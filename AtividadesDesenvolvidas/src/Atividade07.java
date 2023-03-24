import java.util.Scanner;

class Atividade07 {
    public static void main(String[] args) {

        double altura,alturadouble,IMC,peso;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Calcule sua Indice de Massa Corporal");
        System.out.print("Digite a sua altura: ");
        altura = entradaTeclado.nextDouble();
        System.out.print("Digite o seu peso: ");
        peso = entradaTeclado.nextDouble();
        alturadouble = (altura * altura);
        IMC = peso / alturadouble;

        System.out.println("sua Indice de Massa Corporal é  " + IMC);
    }
}