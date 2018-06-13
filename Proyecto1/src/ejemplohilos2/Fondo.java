
package ejemplohilos2;


public class Fondo extends javax.swing.JFrame {
    public Tablero tab;
    public boolean tablerocreado =false;

    public Fondo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Tam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Mov = new javax.swing.JTextField();
        Generar = new javax.swing.JButton();
        MoverAbajo = new javax.swing.JButton();
        fondo = new javax.swing.JPanel();
        MOverArriba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tamaño");

        jLabel2.setText("Movimientos");

        Mov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovActionPerformed(evt);
            }
        });

        Generar.setText("Generar");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        MoverAbajo.setText("Mover Abajo");
        MoverAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverAbajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        MOverArriba.setText("Mover Arriba");
        MOverArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOverArribaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tam, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Mov, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Generar)
                        .addGap(18, 18, 18)
                        .addComponent(MoverAbajo)
                        .addGap(18, 18, 18)
                        .addComponent(MOverArriba)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generar)
                    .addComponent(MoverAbajo)
                    .addComponent(MOverArriba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MovActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        // TODO add your handling code here:
        fondo.removeAll();
        fondo.repaint();
        tab=new Tablero(Integer.parseInt(Tam.getText()),fondo);
        tablerocreado=true;
    }//GEN-LAST:event_GenerarActionPerformed

    private void MoverAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverAbajoActionPerformed
        // TODO add your handling code here:
        if (!tablerocreado) {
            System.out.println("Error no hay tablero.");
            return;
        }
        MovimientoAbajo mov=new MovimientoAbajo(Integer.parseInt(Mov.getText()), tab);
        mov.start();
    }//GEN-LAST:event_MoverAbajoActionPerformed

    private void MOverArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOverArribaActionPerformed
        // TODO add your handling code here:
        if (!tablerocreado) {
            System.out.println("Error no hay tablero.");
            return;
        }
        Movimiento movi=new Movimiento(Integer.parseInt(Mov.getText()), tab);
        movi.start();
              
    }//GEN-LAST:event_MOverArribaActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fondo().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Generar;
    private javax.swing.JButton MOverArriba;
    private javax.swing.JTextField Mov;
    private javax.swing.JButton MoverAbajo;
    private javax.swing.JTextField Tam;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
