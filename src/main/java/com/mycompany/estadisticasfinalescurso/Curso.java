/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticasfinalescurso;

/**
 *
 * @author labctr
 */
class Curso {
    private String nombre;
    private int cantidadEst;
    private double notaProm;
    private int ganadores;
    private int perdedores;
    private int semestreProm;

    public Curso(String nombre, int cantidadEst) {
        this.nombre = nombre;
        this.cantidadEst = cantidadEst;
        this.notaProm = 0.0;
        this.ganadores = 0;
        this.perdedores = 0;
        this.semestreProm = 0;
    }

    public void calcularEstadisticas(double nota, int semestre) {
        notaProm = (notaProm * (ganadores + perdedores) + nota) / (ganadores + perdedores + 1);

        if (nota >= 5.0) {
            ganadores++;
        } else {
            perdedores++;
        }

        Semestre semestreObj = new Semestre();
        semestreObj.setNota(nota);
        semestreObj.setSemestre(semestre);

        semestreProm = (semestreProm * (ganadores + perdedores - 1) + semestreObj.getSemestre()) / (ganadores + perdedores);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEst() {
        return cantidadEst;
    }

    public double getNotaProm() {
        return notaProm;
    }

    public int getGanadores() {
        return ganadores;
    }

    public int getPerdedores() {
        return perdedores;
    }

    public int getSemestreProm() {
        return semestreProm;
    }

    
}