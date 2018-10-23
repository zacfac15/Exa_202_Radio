package GUI;

import beans.Radio;

public class RadioDialog extends javax.swing.JDialog
{

  private Radio radio;
  
  public RadioDialog(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jLabel1 = new javax.swing.JLabel();
    tfSender = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    tfFrequenz = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    tfBand = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridLayout(4, 2));

    jLabel1.setText("Sender");
    getContentPane().add(jLabel1);
    getContentPane().add(tfSender);

    jLabel2.setText("Frequenz");
    getContentPane().add(jLabel2);
    getContentPane().add(tfFrequenz);

    jLabel3.setText("Band");
    getContentPane().add(jLabel3);
    getContentPane().add(tfBand);

    jButton1.setText("Hinzufügen");
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onAdd(evt);
      }
    });
    getContentPane().add(jButton1);

    jButton2.setText("Abbrechen");
    getContentPane().add(jButton2);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void onAdd(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onAdd
  {//GEN-HEADEREND:event_onAdd
    String sender = tfSender.getText();
    double freq = Double.parseDouble(tfFrequenz.getText().replace(",", "."));
    String band = tfBand.getText();
    
    radio = new Radio(sender,freq,band);
    dispose();
  }//GEN-LAST:event_onAdd

  public Radio getRadio()
  {
    return radio;
  }
  
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(RadioDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(RadioDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(RadioDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(RadioDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        RadioDialog dialog = new RadioDialog(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter()
        {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e)
          {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JTextField tfBand;
  private javax.swing.JTextField tfFrequenz;
  private javax.swing.JTextField tfSender;
  // End of variables declaration//GEN-END:variables
}
