import java.util.Scanner;

class Atividade10 {
    public static void main(String[] args) {

        float n1,n2;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Verifique qual dos numeros é maior");
        System.out.print("Digite o primeiro Número: ");
        n1 = entradaTeclado.nextFloat();
        System.out.print("Digite o segundo Número: ");
        n2 = entradaTeclado.nextFloat();
        if (n1>n2) {
            System.out.println(" O número " + n1+ " é maior que " + n2);
        }
        else {
            if(n2>n1){
                System.out.println(" O número " + n2 + " é maior que " + n1);
            }
            else{
                System.out.println(" Os números digitados são iguais");
            }
        }
    }
}