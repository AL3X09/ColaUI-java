
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlexCifuentes
 */
public class Cola extends javax.swing.JFrame {

    /**
     * Creates new form Cola
     */
    
    int Valor,Tiempo;
    DefaultListModel modeloP = new DefaultListModel<Object>(); //para listar procesos 
    DefaultListModel modeloT = new DefaultListModel<Object>(); // lpara listar tiempo
    Comparator<Integer> comparador = Collections.reverseOrder();
    private static ArrayList<Procesos> listProcesos = new ArrayList<>();
    //Procesos agregarp = new Procesos();
    
    public Cola() {
        initComponents();
        listaProceso.setModel(modeloP);
        listaTiempo.setModel(modeloT);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BTNcola = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtValor = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTiempo = new javax.swing.JEditorPane();
        BTNatender = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaProceso = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaTiempo = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Proceso");

        BTNcola.setText("En Cola");
        BTNcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcolaActionPerformed(evt);
            }
        });

        jLabel2.setText("prioridad");

        jScrollPane1.setViewportView(txtValor);

        jScrollPane2.setViewportView(txtTiempo);

        BTNatender.setText("Atender");
        BTNatender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNatenderActionPerformed(evt);
            }
        });

        listaProceso.setBackground(new java.awt.Color(255, 51, 51));
        listaProceso.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(listaProceso);

        listaTiempo.setBackground(new java.awt.Color(0, 102, 255));
        listaTiempo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaTiempo);

        jLabel3.setText("Procesos");

        jLabel4.setText("Tiempos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(BTNcola)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(134, 134, 134))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTNatender))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNatender)
                            .addComponent(BTNcola))))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcolaActionPerformed
        //condiciono intenmto tranformar los datos recividos
        try{
           Valor=Integer.parseInt(txtValor.getText());
           Tiempo=Integer.parseInt(txtTiempo.getText());
           modeloP.addElement(Valor);
           modeloT.addElement(Tiempo);
           listProcesos.add(new Procesos(Valor, Tiempo));
           JOptionPane.showMessageDialog(null,"Procesando!!");
           txtValor.setText("");
           txtTiempo.setText("");
        }catch(NumberFormatException ex){ // handle your exception
           JOptionPane.showMessageDialog(null,"Por favor llene los dos campos");
        }
       
    }//GEN-LAST:event_BTNcolaActionPerformed

    private void BTNatenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNatenderActionPerformed
        
        //ordeno el array con la interfaz coleccion
		Collections.sort(listProcesos, new Comparator<Procesos>() {
			@Override
			public int compare(Procesos p1, Procesos p2) {
				// Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
				return new Integer(p2.getTiempo()).compareTo(p1.getTiempo());
			}
	});
        //llamo a la interfas iterator para operar colecciones 
        Iterator<Procesos> itrArrayList = listProcesos.iterator();
              
		int posicion = 0;
		while (itrArrayList.hasNext()) {
                    //imprimo los valores a atender y los saco de la cola
			JOptionPane.showMessageDialog(null,"Atendiendo Proceso = " + itrArrayList.next().toString());
			
                        ///JOptionPane.showMessageDialog(null,modeloP.getElementAt(posicion));
                        
                        posicion++;
                }
                //vacio las listas
                modeloP.removeAllElements();
                modeloT.removeAllElements();

    }//GEN-LAST:event_BTNatenderActionPerformed

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
            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNatender;
    private javax.swing.JButton BTNcola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> listaProceso;
    private javax.swing.JList<String> listaTiempo;
    private javax.swing.JEditorPane txtTiempo;
    private javax.swing.JEditorPane txtValor;
    // End of variables declaration//GEN-END:variables
}
