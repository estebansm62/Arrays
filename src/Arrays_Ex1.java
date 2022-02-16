import java.util.Scanner;

public class Arrays_Ex1 {
    public static void mostrarMatriz(int[][] matrizMostrar) {
        for (int i = 0; i < matrizMostrar.length; i++) {
            for (int j = 0; j < matrizMostrar.length; j++) {
                System.out.print(matrizMostrar[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int[][] sumaMatriz(int[][] matriz1, int[][] matriz2, int t1, int t2) {
        int[][] resultado;
        if (matriz1.length == matriz2.length) {
            resultado = new int[t1][t2];
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1.length; j++) {
                    resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
            return resultado;
        } else {
            return resultado=new int[0][0];
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Creame 2 matrices para luego sumarlas");
        System.out.println("Para ello me gustaria saber el tamaño que tendran");
        int t1 = reader.nextInt();
        int t2 = reader.nextInt();
        int[][] matr1 = new int[t1][t2];
        for (int i = 0; i < matr1.length; i++) {
            for (int j = 0; j < matr1.length; j++) {
                System.out.println("Array " + i + "," + j);
                matr1[i][j] = reader.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Ahora te preguntare lo mismo para el segundo array(recomendariamos que fueran del mismo tamaño)");
        System.out.println("Que tamaño tendra el array");
        int t3 = reader.nextInt();
        int t4 = reader.nextInt();
        int[][] matr2 = new int[t3][t4];
        for (int k = 0; k < matr2.length; k++) {
            for (int l = 0; l < matr2.length; l++) {
                System.out.println("Array " + k + "," + l);
                matr2[k][l] = reader.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Matriz1");
        mostrarMatriz(matr1);
        System.out.println("Matriz2");
        mostrarMatriz(matr2);

        int [][] resultado = sumaMatriz(matr1,matr2,t1,t2);

        mostrarMatriz(resultado);
    }

}
