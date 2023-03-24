import java.util.Scanner;

class Atividade1 {
    public static void main(String[] args) {

        float celsius, fahrenheit, kelvin;
        Scanner entradateclado = new Scanner(System.in);

        System.out.println("Conversão de graus Celsius para graus Fahrenheit e Kelvin");
        System.out.print("Insira a Temperatura em graus Celsius:");
        celsius = entradateclado.nextFloat();
        kelvin = (celsius + 273);
        fahrenheit = ((9 * celsius + 160)/5);

        System.out.println("Temperatura em Kelvin:"+ kelvin);
        System.out.println("Temperatura em Fahrenheit:"+ fahrenheit);
    }
}