
package fastmind.mecanicas;

import java.util.ArrayList;
import java.util.HashMap;




public class SequenciaColores {
    
    private ArrayList<Color> sequencia;
    private HashMap<Integer,Color> numColor;

    public SequenciaColores() {
        sequencia = new ArrayList();
        establecerNumerosAColores();
        añadirColorRandom();
    }
    
    private void establecerNumerosAColores(){
        numColor=new HashMap();
        numColor.put(0,Color.AMARILLO);
        numColor.put(1,Color.VERDE);
        numColor.put(2,Color.AZUL);
        numColor.put(3,Color.ROJO);
    }  
    
    //añade un nuevo color (RANDOM) a la sequencia
    public void añadirColorRandom(){
        int nRandom = (int) (Math.random()*4);  
        //System.out.println("Color: "+numColor.get(nRandom));
        sequencia.add(numColor.get(nRandom));
    }    
  
    public ArrayList<Color> getListColores() {
        return sequencia;
    }
    
    
    
    
    
}
