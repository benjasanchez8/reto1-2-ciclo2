/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calcu1;

import javax.swing.JOptionPane;

/**
 *
 * @author 000440052
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Nueva Operación ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Calculadora Misión TIC ");

        jLabel2.setText("Marlon Ramirez ");

        jLabel3.setText("Benjamín Sánchez");

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(jButton2))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Option;
        Option = JOptionPane.showInputDialog("Seleccione una opciòn: \n 1. Realizar una operación \n 2. Salir");
        if (Option.equals("1")) {
            double num1, num2, res;
            String TipoOperacion = JOptionPane.showInputDialog("Seleccion una operación:\n1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División \n 5. Potencia \n 6. Raiz cuadrada \n 7. Salir\n ");
           try {
            switch (TipoOperacion) {
                case "1":
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    res = num1 + num2;
                    double res1 = Math.round(res * 100.0) / 100.0;
                    JOptionPane.showMessageDialog(null, "El resultado es :" + res1);
                    break;
                case "2":
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    res = num1 - num2;
                    double res2 = Math.round(res * 100.0) / 100.0;
                    JOptionPane.showMessageDialog(null, "El resultado es :" + res2);
                    break;
                case "3":
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    res = num1 * num2;
                    double res3 = Math.round(res * 100.0) / 100.0;
                    JOptionPane.showMessageDialog(null, "El resultado es :" + res3);
                    break;
                case "4":
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    //String num2str = String.valueOf(num2);                
                    //if("0".equals(num2str));{
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
                        break;
                    }
                    res = num1 / num2;
                    double res4 = Math.round(res * 100.0) / 100.0;
                    JOptionPane.showMessageDialog(null, "El resultado es :" + res4);
                    break;
                case "5":
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el exponente: "));
                    res = Math.pow(num1, num2);
                    double res5 = Math.round(res * 100.0) / 100.0;
                    JOptionPane.showMessageDialog(null, "El resultado es :" + res5);
                    break;
                case "6":
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    res = Math.sqrt(num1);
                    double res6 = Math.round(res * 100.0) / 100.0;
                    JOptionPane.showMessageDialog(null, "El resultado es :" + res6);
                    break;
                case "7":
                    System.exit(0);
            }
           } catch (NullPointerException e){
               System.out.println(e.getMessage());
           }
           
        }

        if (Option.equals("2")) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

     public static boolean Validar (String valor)
    {
        boolean respuesta;
        
        if (valor.matches("[0-9]*")) {
        
           respuesta = false;
        }
        else
        {
            //JOptionPane.showMessageDialog(null, "No es un número, ingreselo de nuevo");
            respuesta = true;
        }    
        
        return respuesta;
    }        
    

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
