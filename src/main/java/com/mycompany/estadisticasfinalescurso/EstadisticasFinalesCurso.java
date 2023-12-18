/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadisticasfinalescurso;
import java.util.Scanner;
/**
 *
 * @author labctr
 */
public class EstadisticasFinalesCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = scanner.nextLine();

        System.out.println("Ingrese la cantidad de estudiantes matriculados:");
        int cantidadEstudiantes = scanner.nextInt();

        Curso curso = new Curso(nombreCurso, cantidadEstudiantes);

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.println("Ingrese la nota del estudiante " + i + ":");
            double nota = scanner.nextDouble();

            System.out.println("Ingrese el semestre que cursa el estudiante " + i + ":");
            int semestre = scanner.nextInt();

            curso.calcularEstadisticas(nota, semestre);
        }

        System.out.println("Nota promedio del curso: " + curso.getNotaProm());
        System.out.println("Cantidad de estudiantes que ganaron la materia: " + curso.getGanadores());
        System.out.println("Cantidad de estudiantes que perdieron la materia: " + curso.getPerdedores());
        System.out.println("Semestre promedio que cursan los estudiantes: " + curso.getSemestreProm());
    }
}