import java.util.Scanner;

import java.lang.reflect.Array;

public class NotasSemestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicia el escaner
    
    
        System.out.println("porfavor ingrese la cantidad de materias"); // se pide la cantidad de materias
        int numeroMaterias = scanner.nextInt();
        double[][] materias = new double[numeroMaterias][];
        double[] notaFinal = new double[Array.getLength(materias)];// se hacen 3 arreglos nombre de la materia, materias, notas finales
        String[] nombreMaterias = new String[Array.getLength(materias)];

        for (int x = 0; Array.getLength(materias) > x; x++) {// ciclo
            System.out.println("ingrese el nombre de la materia");
            nombreMaterias[x] = scanner.next();

            System.out.println("cuantas notas deseas ingresar " + nombreMaterias[x]);
            int size = scanner.nextInt();

            double[] notas = new double[size];
            double[] porcentajes = new double[Array.getLength(notas)];
            
            for (int contador = 0; Array.getLength(notas) > contador; contador++) {  //ciclo 2 aninado en el 1, notas y porcentaje

                System.out.println("ingrese la nota " + (contador + 1) + " de " + nombreMaterias[x]);
                notas[contador] = scanner.nextDouble();
                System.out.println(
                        "ingrese el porcentaje de la nota numero " + (contador + 1) + " de " + nombreMaterias[x]);
                porcentajes[contador] = scanner.nextDouble();

            }
            for (int contador = 0; Array.getLength(notas) > contador; contador++) {  //ciclo 3 aninado en el 1, calculo de promedio por materias
                notaFinal[contador] = notaFinal[contador] + (notas[contador] * (porcentajes[contador] / 100));
            }

        }// fin ciclo 1

        for (int x = 0; Array.getLength(notaFinal) > x; x++) {  //ciclo 2, imprime el promedio para cada materia

            System.out.println("la nota de la materia " + nombreMaterias[x] + " es " + notaFinal[x]);

        }

        scanner.close();
    }// fin main
}// fin class
