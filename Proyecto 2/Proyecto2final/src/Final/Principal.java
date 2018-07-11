package Final;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author FABIO SANCHEZ
 */
public class Principal extends javax.swing.JFrame {
    public GrafAviones gA = new GrafAviones();
    public MostrarAviones ma = new MostrarAviones();
    public GrafDesabordaje gP = new GrafDesabordaje();
    public MostrarPasajeros mP = new MostrarPasajeros();
    public GrafEquipaje gE = new GrafEquipaje();
    public NewJFrame mE = new NewJFrame();
    public GrafColaMa gM = new GrafColaMa();
    public MostrarEstaciones mM = new MostrarEstaciones();
    public GrafColaEst gME = new GrafColaEst();

    ListaDobleAvion avion = new ListaDobleAvion();
    ColaPasajeros pasajeros = new ColaPasajeros();
    ListaCircularDobleMaleta maleta = new ListaCircularDobleMaleta();

    ListaDobleEscritorios lEscritorios = new ListaDobleEscritorios();
    ColaEscritorios cEscritorios = new ColaEscritorios();

    
    
public Todas tod=new Todas();
    int turno = 1;
    int CantidadAviones = 1;
    int jtextAviones;
    int jtextEstaciones;
    int CantidadEstaciones = 1;

    int CantidadEscritorios = 1;

    public Principal() {
        initComponents();
        consola.setEditable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Empezar = new javax.swing.JButton();
        pasarTurno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cantAviones = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cantEstaciones = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        consola = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        llegadaaviones = new javax.swing.JButton();
        llegadacolap = new javax.swing.JButton();
        equipaje = new javax.swing.JButton();
        mantenimiento = new javax.swing.JButton();
        Todas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aereopuerto");

        Empezar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Empezar.setText("Comenzar");
        Empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpezarActionPerformed(evt);
            }
        });

        pasarTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pasarTurno.setText("Pasar Turno");
        pasarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarTurnoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Shonar Bangla", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cantidad de Aviones");

        cantAviones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantAviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantAvionesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Shonar Bangla", 3, 24)); // NOI18N
        jLabel2.setText("Cantidad de Estaciones");

        cantEstaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        consola.setBackground(new java.awt.Color(0, 0, 0));
        consola.setColumns(20);
        consola.setForeground(new java.awt.Color(255, 255, 255));
        consola.setRows(5);
        consola.setCaretColor(new java.awt.Color(0, 255, 255));
        jScrollPane1.setViewportView(consola);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LISTAIRPORT");

        llegadaaviones.setText("Llegada Aviones");
        llegadaaviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llegadaavionesActionPerformed(evt);
            }
        });

        llegadacolap.setText("Desabordaje");
        llegadacolap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llegadacolapActionPerformed(evt);
            }
        });

        equipaje.setText("Equipaje");
        equipaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipajeActionPerformed(evt);
            }
        });

        mantenimiento.setText("Mantenimiento");
        mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoActionPerformed(evt);
            }
        });

        Todas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Todas.setText("Graficas");
        Todas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Todas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(llegadaaviones, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(llegadacolap, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(equipaje, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Empezar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pasarTurno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantAviones)
                            .addComponent(cantEstaciones))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cantAviones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantEstaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Empezar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pasarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llegadacolap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llegadaaviones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipaje, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Todas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantAvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantAvionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantAvionesActionPerformed

    private void EmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpezarActionPerformed
        jtextEstaciones = Integer.parseInt(cantEstaciones.getText());
        consola.append("++++++++++++++++++++ Inicio Turno " + turno + "++++++++++++++++++++");
        consola.append("\n");
        avion.insertarFinal(new NodoAvion(CantidadAviones));
        do {
            avion.CrearEstaciones(CantidadEstaciones);
            CantidadEstaciones++;
        } while (CantidadEstaciones <= jtextEstaciones);
        avion.recorrer(consola);
        consola.append("++++++++++++++++++++ Fin Turno " + turno + "+++++++++++++++++++++");
        consola.append("\n");

        gA.crearDot(avion.primero, "listaDoble");
        gA.generarImagen("listaDoble.dot", "listaDoble.png");
        ImageIcon fot = new ImageIcon("listaDoble.png");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(ma.imagen.getWidth(), ma.imagen.getHeight(), Image.SCALE_DEFAULT));
        ma.imagen.setIcon(icono);

        ma.repaint();


    }//GEN-LAST:event_EmpezarActionPerformed

    private void pasarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarTurnoActionPerformed
        jtextAviones = Integer.parseInt(cantAviones.getText());
        CantidadAviones++;
        turno++;
        consola.append("++++++++++++++++++++ Inicio Turno " + turno + "++++++++++++++++++++");
        consola.append("\n");
        avion.PasarTurnoDesabordaje();
        avion.eliminar();
        if (CantidadAviones <= jtextAviones) {
            avion.insertarFinal(new NodoAvion(CantidadAviones));
        }
        avion.ProcesosEstaciones();
        for (int i = 1; i <= 5; i++) {
            avion.DescolarPasajeros();

        }

        avion.recorrer(consola);
        consola.append("++++++++++++++++++++ Fin Turno " + turno + "+++++++++++++++++++++");
        consola.append("\n");

        gA.crearDot(avion.primero, "listaDoble");
        gA.generarImagen("listaDoble.dot", "listaDoble.png");
        ImageIcon fot = new ImageIcon("listaDoble.png");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(ma.imagen.getWidth(), ma.imagen.getHeight(), Image.SCALE_DEFAULT));
        ma.imagen.setIcon(icono);
        ma.repaint();
 

    }//GEN-LAST:event_pasarTurnoActionPerformed

    private void llegadaavionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llegadaavionesActionPerformed
        gA.crearDot(avion.primero, "listaDoble");
        gA.generarImagen("listaDoble.dot", "listaDoble.png");
        ImageIcon fot = new ImageIcon("listaDoble.png");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(ma.imagen.getWidth(), ma.imagen.getHeight(), Image.SCALE_DEFAULT));
        ma.imagen.setIcon(icono);

        ma.repaint();

   
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_llegadaavionesActionPerformed

    private void llegadacolapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llegadacolapActionPerformed

        mP.setVisible(true);
        mP.setLocationRelativeTo(null);
        mP.Mostrarimagen();

    }//GEN-LAST:event_llegadacolapActionPerformed

    private void equipajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipajeActionPerformed
        mE.setVisible(true);
        mE.setLocationRelativeTo(null);
        mE.Mostrarimagen();
    }//GEN-LAST:event_equipajeActionPerformed

    private void mantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoActionPerformed
        mM.setVisible(true);
        mM.setLocationRelativeTo(null);
        mM.Mostrarimagen();
        mM.Mostrar();
    }//GEN-LAST:event_mantenimientoActionPerformed

    private void TodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodasActionPerformed
        //mM.Mostrarimagen();
      //  mM.Mostrar();
       // mE.Mostrarimagen();
       // mP.Mostrarimagen();
        
        
        tod.setVisible(true);
       tod.setLocationRelativeTo(null);
       tod.mostraTodas1();
       tod.mostraTodas2();
       tod.mostraTodas3();
      tod.mostraTodas4();
      tod.mostraTodas5();
    }//GEN-LAST:event_TodasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Empezar;
    private javax.swing.JButton Todas;
    public static javax.swing.JTextField cantAviones;
    public static javax.swing.JTextField cantEstaciones;
    private javax.swing.JTextArea consola;
    private javax.swing.JButton equipaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton llegadaaviones;
    private javax.swing.JButton llegadacolap;
    private javax.swing.JButton mantenimiento;
    private javax.swing.JButton pasarTurno;
    // End of variables declaration//GEN-END:variables
}
