import java.util.Scanner;

class Atividade43 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner (System.in);
        int vetorNumeros[] = new int[5];
        int posicaoNumero, maiorNumero = 0;
        for(posicaoNumero = 0; posicaoNumero <5; posicaoNumero++)
        {
            System.out.print("Digite um número: ");
            vetorNumeros[posicaoNumero] = entradaTeclado.nextInt();
            if(vetorNumeros[posicaoNumero] > maiorNumero)
            {
                maiorNumero = vetorNumeros[posicaoNumero];
            }
        }
        for(posicaoNumero = 0; posicaoNumero <5; posicaoNumero++)
        {
            if(vetorNumeros[posicaoNumero] == maiorNumero)
            {
                System.out.println("\nPosição dos Números : " + (posicaoNumero + 1) );
            }
        }
        System.out.println("\nO maior numero é o  : " + maiorNumero);
    }
}
