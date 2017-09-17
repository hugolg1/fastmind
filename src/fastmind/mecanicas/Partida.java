/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastmind.mecanicas;

import fastmind.Sonidos;
import fastmind.interfaces.sequenciaListener;

/**
 *
 * @author Administrador
 */
public class Partida {
    
    public static final int limiteFallosPermitidos = 3;
    private static final int puntosPorSequencia = 75;
    private static final int puntosPorFallos = 20;
    
    private int numFallos;
    private int puntuacion;    
    private int contadorSequencia;
    private SequenciaColores sequencia;

    public Partida() {
        this.numFallos = 0;
        this.puntuacion = 0;
        this.contadorSequencia = 0;
        this.sequencia = new SequenciaColores();
        
    }
    
    public void siguienteSequencia(){
        contadorSequencia=0;
        sequencia.añadirColorRandom();        
    }
    
    public Color[] getColoresSequencia(){
        Color[] colores=new Color[sequencia.getListColores().size()];
        return sequencia.getListColores().toArray(colores);
    }
    
    public void comprobarColorSequencia(Color c, sequenciaListener seqListener) {
        try {
            if (c.equals(getColoresSequencia()[contadorSequencia])) {
                seqListener.onColorCorrecto();
                contadorSequencia++;
                if (contadorSequencia >= getColoresSequencia().length) {
                    sumarPuntos();
                    seqListener.onSequenciaCompletada();
                }
            } else {
                numFallos++;
                restarPuntos();
                seqListener.onColorFallido();                
            }
        } catch (Exception e) {
            System.out.println("Error comprobar sequencia");
        }
    }

    public int getNumFallos() {
        return numFallos;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
    
    private void sumarPuntos(){
        puntuacion+=Partida.puntosPorSequencia;
    }
    
    private void restarPuntos(){
        puntuacion-=Partida.puntosPorFallos;
        
    }
    
    
}
