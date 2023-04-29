import java.util.Scanner;

class Atividade49 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner (System.in);
        int vetorNumeros[] = new int[200];
        int posicaoNumero, somaNumeros = 0;
        float media;
        for(posicaoNumero = 0; posicaoNumero < 200; posicaoNumero++)
        {
            System.out.print("\nDigite um número: ");
            vetorNumeros[posicaoNumero] = entradaTeclado.nextInt();
            somaNumeros = somaNumeros + vetorNumeros[posicaoNumero];
        }
        media = somaNumeros / 200;
        System.out.println("\nA média é : " + media + "\n");
        for(posicaoNumero = 0; posicaoNumero < 200; posicaoNumero++)
        {
            if(vetorNumeros[posicaoNumero] > media)
            {
                System.out.println("Números maiores que a média: " + vetorNumeros	[posicaoNumero]);
                System.out.println("Posição dos Números : " + posicaoNumero);
            }
        }
    }
}
