import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws Exception {

        Scanner EntradaTeclado = new Scanner(System.in);
		String caminhoDoArquivo = "C:\\Users\\win10\\Desktop\\Atividades ED\\3B\\grafo.txt";
        int escolha = 100;
		while (escolha != 0) { 
            System.out.println("O que deseja fazer?\n"
					+ "1 = Sua Lista de Adjacência\n"
					+ "2 = Sua Matriz A de Adjacência\n"
					+ "3 = Sua matriz B de incidência\n"
					+ "0 = sair do programa");
            escolha = EntradaTeclado.nextInt();
            switch (escolha) {
                case 1:
                    imprimirListaAdjacencia(fazerListaDeAdjacencia(caminhoDoArquivo));
                break;
                case 2:
                    imprimirMatrizAdjacencia(fazerMatrizDeAdjacencia(caminhoDoArquivo));
                break;
                case 3:
                    imprimirMatrizIncidencia(fazerMatrizDeIncidencia(caminhoDoArquivo));
                break;
                case 0:
                break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
    
    public static LinkedList<Integer>[] fazerListaDeAdjacencia(String caminhoDoArquivo){
        System.out.println("\n**********Fazendo Lista Adjacente**********\n");
        Scanner entradaDados = new Scanner(System.in);
        try {
            entradaDados = new Scanner(new File(caminhoDoArquivo));  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String[] QtdVerticesArestas = entradaDados.nextLine().split(" ");
        int n = Integer.parseInt(QtdVerticesArestas[0])+1;
        int m = Integer.parseInt(QtdVerticesArestas[1]);

        LinkedList<Integer>[] listaDeAdjacencia = gerarListasDeVertices(n);
        while(entradaDados.hasNextLine()){
            String[] aresta = entradaDados.nextLine().split(" ");
            
            int coluna0 = Integer.parseInt(aresta[0]);
            int coluna1 = Integer.parseInt(aresta[1]);
            listaDeAdjacencia[coluna0].add(coluna1);
            listaDeAdjacencia[coluna1].add(coluna0);
        }
        try {
            entradaDados.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaDeAdjacencia;
    }

    public static LinkedList<Integer>[] gerarListasDeVertices(int n) {
        LinkedList<Integer>[] listaDeVertices = new LinkedList[n];
        for (int i = 1; i < n; i++){
            listaDeVertices[i] = new LinkedList<Integer>();
        }
        return listaDeVertices;
    }

    public static void imprimirListaAdjacencia(LinkedList<Integer>[] listaDeAdjacencia) {
        System.out.println("\n*********Lista Adjacente*********\n");
        int n = listaDeAdjacencia.length;
        for(int i=1; i<n; i++){
            System.out.print("Vertice: " + i + " = ");
            for(int j=0; j<listaDeAdjacencia[i].size(); j++){
                System.out.print(listaDeAdjacencia[i].get(j)+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static int[][] fazerMatrizDeAdjacencia(String caminhoDoArquivo){
        System.out.println("\n**********Fazendo Matriz Adjacente**********\n");;
        Scanner entradaDados = new Scanner(System.in);
        try {
            entradaDados = new Scanner(new File(caminhoDoArquivo));  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String[] QtdVerticesArestas = entradaDados.nextLine().split(" ");
        int n = Integer.parseInt(QtdVerticesArestas[0])+1;
        int m = Integer.parseInt(QtdVerticesArestas[1]);
        int A[][] = new int[n][n];
        
        while(entradaDados.hasNextLine()){
            String[] aresta = entradaDados.nextLine().split(" ");  
            int coluna0 = Integer.parseInt(aresta[0]);
            int coluna1 = Integer.parseInt(aresta[1]);
            A[coluna0][coluna1] = 1;
            A[coluna1][coluna0] = 1;
        }
        try {
            entradaDados.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return A;
    }

    public static void imprimirMatrizAdjacencia(int[][] A) {
        System.out.println("\n*********Matriz Adjacente*********\n");
        System.out.println("     1 2 3 4 5");
        System.out.println("     ----------");
        for (int i = 1; i < A.length; i++){
            System.out.print(i+"  | ");
            for (int j = 1; j < A[i].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }

    public static int[][] fazerMatrizDeIncidencia(String caminhoDoArquivo){
        System.out.println("\n**********Fazendo Matriz Indidente**********\n");;
        Scanner entradaDados = new Scanner(System.in);
        try {
            entradaDados = new Scanner(new File(caminhoDoArquivo));  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String[] QtdVerticesArestas = entradaDados.nextLine().split(" ");
        int n = Integer.parseInt(QtdVerticesArestas[0])+1;
        int m = Integer.parseInt(QtdVerticesArestas[1])+1;

        int B[][] = new int[n][m];
        int a =1;
        
        while(entradaDados.hasNextLine()){
            String[] aresta = entradaDados.nextLine().split(" ");   
            int coluna0 = Integer.parseInt(aresta[0]);
            int coluna1 = Integer.parseInt(aresta[1]);
            B[coluna0][a] = 1;
            B[coluna1][a] = 1;
            a++;
        }
        try {
            entradaDados.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return B;
    }

    public static void imprimirMatrizIncidencia(int[][] B) {
        System.out.println("\n*********Matriz Incidente*********\n");
        for (int i = 1; i < B.length; i++){
            for (int j = 1; j < B[i].length; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }
}
