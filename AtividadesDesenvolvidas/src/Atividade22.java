class Atividade22 {
    public static void main(String[] args) {

        int numero, total = 0;
        System.out.println("\nSoma dos numero que são multiplos de 3 e 5\n");
        numero = 1;

        while(numero < 1000) {
            if ((numero % 3 == 0) ||(numero % 5 == 0)) {
                total += numero;
            }
            numero++;
        }
        System.out.println("\nO total da soma dos números:" + total);
    }
}
