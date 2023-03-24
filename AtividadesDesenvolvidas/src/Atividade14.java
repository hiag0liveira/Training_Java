import java.util.Scanner;

class Atividade14 {
    public static void main(String[] args) {

        char letra;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Verifique se é vogal ou consoante");
        System.out.print(" Digite uma letra: ");
        letra = entradaTeclado.nextLine().charAt(0);

        if ((letra == 'a') || (letra == 'A') || (letra == 'e') || (letra == 'E') || (letra == 'i') || (letra == 'I') || (letra == 'o') || (letra == 'O') || (letra == 'u') || (letra == 'U')) {
            System.out.println(" A letra "+ letra+" é uma vogal. ");
        }
        else if ((letra == 'b') || (letra == 'B') || (letra == 'c') || (letra == 'C') || (letra == 'd') || (letra == 'D') || (letra == 'f') || (letra == 'F') || (letra == 'g') || (letra == 'G') || (letra == 'h') || (letra == 'H') || (letra == 'j') || (letra == 'J') || (letra == 'k') || (letra == 'K') || (letra == 'l') || (letra == 'L') || (letra == 'm') || (letra == 'M') || (letra == 'n') || (letra == 'N') || (letra == 'p') || (letra == 'O') || (letra == 'q') || (letra == 'Q') || (letra == 'r') || (letra == 'R') || (letra == 's') || (letra == 'S') || (letra == 't') || (letra == 'T') || (letra == 'v') || (letra == 'V') || (letra == 'x') || (letra == 'X')|| (letra == 'w') || (letra == 'W') || (letra == 'y') || (letra == 'Y') || (letra == 'z') || (letra == 'Z')) {
                System.out.println(" A letra "+ letra+" é uma consoante. ");
        }
        else {
            System.out.println("A tecla digitada não é uma letra");
        }
    }
}