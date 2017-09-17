package fastmind;

import fastmind.interfaces.iluminaBtnListener;
import fastmind.interfaces.sequenciaListener;
import fastmind.mecanicas.Color;
import fastmind.mecanicas.Partida;
import java.awt.Component;

public class Juego extends javax.swing.JFrame {

    private Partida partida;
    private Sonidos sonidos;
    private final Component component;
    
    public Juego() {
        component = this;
        initComponents();
        this.partida = new Partida();
        this.sonidos = new Sonidos();
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAmarillo = new javax.swing.JButton();
        btnRojo = new javax.swing.JButton();
        btnVerde = new javax.swing.JButton();
        btnAzul = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtVidas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPuntuacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAmarillo.setBackground(new java.awt.Color(255, 255, 153));
        btnAmarillo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAmarillo.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmarilloActionPerformed(evt);
            }
        });

        btnRojo.setBackground(new java.awt.Color(255, 0, 51));
        btnRojo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRojo.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRojoActionPerformed(evt);
            }
        });

        btnVerde.setBackground(new java.awt.Color(102, 255, 51));
        btnVerde.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVerde.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdeActionPerformed(evt);
            }
        });

        btnAzul.setBackground(new java.awt.Color(0, 51, 255));
        btnAzul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAzul.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btnVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btnAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Tiempo: ");

        txtTiempo.setText("00.00.15");

        jLabel2.setText("Vidas:");

        jLabel3.setText("Puntuación:");

        txtPuntuacion.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtVidas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTiempo)
                    .addComponent(jLabel2)
                    .addComponent(txtVidas)
                    .addComponent(jLabel3)
                    .addComponent(txtPuntuacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmarilloActionPerformed
        // TODO add your handling code here:
        comprobarSequencia(Color.AMARILLO);
    }//GEN-LAST:event_btnAmarilloActionPerformed

    private void btnVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdeActionPerformed
        // TODO add your handling code here:
        comprobarSequencia(Color.VERDE);
    }//GEN-LAST:event_btnVerdeActionPerformed

    private void btnRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRojoActionPerformed
        // TODO add your handling code here:
        comprobarSequencia(Color.ROJO);
    }//GEN-LAST:event_btnRojoActionPerformed

    private void btnAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzulActionPerformed
        // TODO add your handling code here:
        comprobarSequencia(Color.AZUL);
    }//GEN-LAST:event_btnAzulActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }
    
    private void comprobarSequencia(Color c){     
        System.out.println("Compruebo ->>>" +c);
        partida.comprobarColorSequencia(c,new sequenciaListener() {
            @Override
            public void onColorCorrecto() {
                System.out.println("color correcto");
                sonidos.reproducirAcierto();
            }

            @Override
            public void onColorFallido() {
                System.out.println("color erroneo");
                setEstadisticas();
                if(partida.getNumFallos() == Partida.limiteFallosPermitidos){
                    Mensajes.mostrarMensajeConfirmacion(component,"Reiniciar ?");
                }
            }

            @Override
            public void onSequenciaCompletada() {
                System.out.println("Sequencia completada!!!");
                System.out.println("iniciando nueva sequencia...");
                partida.siguienteSequencia();
                iniciar();
            }
        });
    }
    
    private void iniciar(){               
        setEstadisticas();
        iluminarColoresTurno();
    }    
    
     private void setEstadisticas(){
         txtVidas.setText(Partida.limiteFallosPermitidos-partida.getNumFallos()+"");
         txtPuntuacion.setText(partida.getPuntuacion()+"");
     }
     
     private void iluminarColoresTurno(){
        new iluminaBotones(partida.getColoresSequencia(),new iluminaBtnListener() {
            @Override
            public void onStart() {                
                bloquearAcciones(true);
            }
            @Override
            public void onFinish() {
                bloquearAcciones(false);
            }
        }).start();
    }
     
     private void bloquearAcciones(boolean bloqueo){
        if(bloqueo){
            btnAmarillo.setEnabled(false);
            btnAzul.setEnabled(false);
            btnVerde.setEnabled(false);
            btnRojo.setEnabled(false);
        }else{
            btnAmarillo.setEnabled(true);
            btnAzul.setEnabled(true);
            btnVerde.setEnabled(true);
            btnRojo.setEnabled(true);            
        }        
    }
    
    private class iluminaBotones extends Thread {

        private Color[] colores;
        private iluminaBtnListener btnListener;
        
        public iluminaBotones(Color[] c,iluminaBtnListener btnListener) {
            this.colores = c;
            this.btnListener = btnListener;
        }
        @Override
        public void run() {
            btnListener.onStart();
            for (Color c : colores) {
                try {
                    Thread.sleep(500);
                    marcarBoton(c);                   
                    Thread.sleep(800);
                    restaurarColorBotones();
                } catch (Exception e) {
                }
            }//for
            btnListener.onFinish();
        }
    }
    
    private void marcarBoton(Color c) {
        switch (c) {
            case ROJO:
                btnRojo.setBackground(java.awt.Color.black);
                break;
            case VERDE:
                btnVerde.setBackground(java.awt.Color.black);
                break;
            case AZUL:
                btnAzul.setBackground(java.awt.Color.black);
                break;
            case AMARILLO:
                btnAmarillo.setBackground(java.awt.Color.black);
                break;
            default:
                break;
        }
    }  
   
    
    private void restaurarColorBotones(){
        btnAmarillo.setBackground(java.awt.Color.yellow);
        btnAzul.setBackground(java.awt.Color.blue);
        btnVerde.setBackground(java.awt.Color.green);
        btnRojo.setBackground(java.awt.Color.red);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmarillo;
    private javax.swing.JButton btnAzul;
    private javax.swing.JButton btnRojo;
    private javax.swing.JButton btnVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtPuntuacion;
    private javax.swing.JLabel txtTiempo;
    private javax.swing.JLabel txtVidas;
    // End of variables declaration//GEN-END:variables
}