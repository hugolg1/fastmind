/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastmind;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Administrador
 */
public class Sonidos {
    
    private File fileSonidoAcierto;
    private AudioInputStream audioAciertoIn;
    private Clip clip;

    public Sonidos() {        
       fileSonidoAcierto = new File("botonClick.wav"); 
       cargarAudios();
        
    }
    
    private void cargarAudios(){
        try{
            clip = AudioSystem.getClip();        
            audioAciertoIn = AudioSystem.getAudioInputStream(fileSonidoAcierto);           
        } catch (Exception ex) {
            System.out.println("error sonido");
        } 
    }
    
    public void reproducirAcierto(){
        try {            
            clip.open(audioAciertoIn);  
            clip.loop(0);           
        } catch (Exception ex) {
            System.out.println("Error sonido acierto: "+ex.getLocalizedMessage());
        }
    }
    
    
    
}
