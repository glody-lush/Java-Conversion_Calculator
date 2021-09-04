
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lushombo
 */
public class weightGui extends javax.swing.JFrame {

    /**
     * Creates new form weightGui
     */
    public weightGui() {
        initComponents();
        
        /* object**/
       ButtonHandler handler = new ButtonHandler();
       /*add buttons*/
       KgjButton.addActionListener(handler);
       gjButton.addActionListener(handler);
       mgjButton.addActionListener(handler);
       TonnesjButton.addActionListener(handler);
       PoundsjButton.addActionListener(handler);
       backjButton.addActionListener(handler);
       exitjButton.addActionListener(handler);
       resetjButton.addActionListener(handler);
        
    }
    
    /*private ButtonHandler class*/
    private class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           
           if(e.getSource()==KgjButton){
               /*if condition checking if the consern JtextField is empty*/
              if(kgJtextFiled.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unit Empty");
              }//end of condition checking if the consern JtextField is empty
              else
              {
              float JtextFiledkg = Float.parseFloat(kgJtextFiled.getText());   
              mgJtextField.setText(new DecimalFormat("##.###").format(JtextFiledkg * 1000000));
              gJTextField.setText(new DecimalFormat("##.###").format(JtextFiledkg * 1000));
              PoundsjTextField.setText(new DecimalFormat("##.###").format(JtextFiledkg * 2.20462));
              TonnesjTextField.setText(new DecimalFormat("##.###").format(JtextFiledkg * 0.001));     
              }// end if condition for KgjButton     
          }// end of KgjButton ActionPerfomed
           
           else if(e.getSource()==gjButton){
                /*if condition checking if the consern JtextField is empty*/
              if(gJTextField.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unit Empty");
              }//end of condition checking if the consern JtextField is empty
              else{
              float JTextFieldg = Float.parseFloat(gJTextField.getText());   
             mgJtextField.setText(new DecimalFormat("##.###").format(JTextFieldg * 1000));
              kgJtextFiled.setText(new DecimalFormat("##.###").format(JTextFieldg * 0.001));
              PoundsjTextField.setText(new DecimalFormat("###.0E0").format(JTextFieldg * 0.00220462));
               TonnesjTextField.setText(new DecimalFormat("###.0E0").format(JTextFieldg * 1*0.000001));
             }// end if condition for gjButton     
          }// end of gjButton ActionPerfomed
           
           else if(e.getSource()==mgjButton){
               /*if condition checking if the consern JtextField is empty*/
              if(mgJtextField.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unit Empty");
              }//end of condition checking if the consern JtextField is empty
              else
              {
               float JtextFieldmg = Float.parseFloat(mgJtextField.getText());   
              gJTextField.setText(new DecimalFormat("##.###").format(JtextFieldmg * 0.001));
              PoundsjTextField.setText(new DecimalFormat("###.0E0").format(JtextFieldmg * 2.20462*0.000001));
               kgJtextFiled.setText(new DecimalFormat("###.0E0").format(JtextFieldmg * 0.000001));
               TonnesjTextField.setText(new DecimalFormat("###.0E0").format(JtextFieldmg * 0.000000001));
           }// end if condition for mgjButton     
          }// end of mgjButton ActionPerfomed
           
           else if(e.getSource()==TonnesjButton){
               /*if condition checking if the consern JtextField is empty*/
              if(TonnesjTextField.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unit Empty");
              }//end of condition checking if the consern JtextField is empty
              else
              {
               float jTextFieldTonnes = Float.parseFloat(TonnesjTextField.getText());   
             mgJtextField.setText(new DecimalFormat("##.###").format(jTextFieldTonnes * 1000000000));
              gJTextField.setText(new DecimalFormat("##.###").format(jTextFieldTonnes * 1000000));
              kgJtextFiled.setText(new DecimalFormat("##.###").format(jTextFieldTonnes * 1000));
              PoundsjTextField.setText(new DecimalFormat("##.###").format(jTextFieldTonnes * 2204.62));           
           }// end if condition for TonnesjButton     
          }// end of TonnesjButton ActionPerfomed
           
           else if(e.getSource()==PoundsjButton){
               /*if condition checking if the consern JtextField is empty*/
              if(PoundsjTextField.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unit Empty");
              }//end of condition checking if the consern JtextField is empty
              else{
               float jTextFieldPounds = Float.parseFloat(PoundsjTextField.getText());   
             mgJtextField.setText(new DecimalFormat("##.###").format(jTextFieldPounds * 453592));
              gJTextField.setText(new DecimalFormat("##.###").format(jTextFieldPounds * 453.592));
              kgJtextFiled.setText(new DecimalFormat("###.0E0").format(jTextFieldPounds * 0.453592));
               TonnesjTextField.setText(new DecimalFormat("###.0E0").format(jTextFieldPounds * 0.000453592));
             }// end if condition for PoundsjButton     
          }// end of PoundsjButton ActionPerfomed
           else if(e.getSource()==backjButton){
               dispose();
               MainGui gui = new  MainGui();
               gui.setVisible(true);
               gui.setLocationRelativeTo(null);
               
           }
            else if(e.getSource()==exitjButton){
                 JOptionPane.showMessageDialog(null, "Everytime you Exit, The Program terminate!!!\n Thank you");
              System.exit(0);
               
           }
            else if(e.getSource()==resetjButton){
                mgJtextField.setText("");
                kgJtextFiled.setText("");        
                gJTextField.setText("");
                TonnesjTextField.setText("");
                PoundsjTextField.setText("");       
                
           }
        }// end of actionPerfomerd Method
    
}// end of constructoer
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mgJtextField = new javax.swing.JTextField();
        gJTextField = new javax.swing.JTextField();
        kgJtextFiled = new javax.swing.JTextField();
        PoundsjTextField = new javax.swing.JTextField();
        TonnesjTextField = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();
        resetjButton = new javax.swing.JButton();
        exitjButton = new javax.swing.JButton();
        mgjButton = new javax.swing.JButton();
        gjButton = new javax.swing.JButton();
        KgjButton = new javax.swing.JButton();
        PoundsjButton = new javax.swing.JButton();
        TonnesjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Weight Converter");

        mgJtextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mgJtextFieldKeyPressed(evt);
            }
        });

        gJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gJTextFieldKeyPressed(evt);
            }
        });

        kgJtextFiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kgJtextFiledKeyPressed(evt);
            }
        });

        PoundsjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PoundsjTextFieldKeyPressed(evt);
            }
        });

        TonnesjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TonnesjTextFieldKeyPressed(evt);
            }
        });

        backjButton.setText("BACK");

        resetjButton.setText("RESET");

        exitjButton.setText("EXIT");

        mgjButton.setText("convert");

        gjButton.setText("convert");

        KgjButton.setText("convert");

        PoundsjButton.setText("convert");

        TonnesjButton.setText("convert");

        jLabel2.setText("mg");

        jLabel3.setText("g");

        jLabel4.setText("kg");

        jLabel5.setText("pounds");

        jLabel6.setText("tonnes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(40, 79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(backjButton)
                .addGap(117, 117, 117)
                .addComponent(resetjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitjButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mgJtextField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addComponent(gJTextField))
                            .addComponent(kgJtextFiled, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(PoundsjTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TonnesjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mgjButton)
                    .addComponent(gjButton)
                    .addComponent(KgjButton)
                    .addComponent(PoundsjButton)
                    .addComponent(TonnesjButton))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mgJtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mgjButton)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gjButton)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kgJtextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KgjButton)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PoundsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PoundsjButton)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TonnesjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TonnesjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton)
                    .addComponent(resetjButton)
                    .addComponent(exitjButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/* validating method for mgJtextField*/
    private void mgJtextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mgJtextFieldKeyPressed
        // TODO add your handling code here:
         char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            mgJtextField.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             mgJtextField.setEditable(true);
        }
        else{
            mgJtextField.setEditable(true);
        }
    }//GEN-LAST:event_mgJtextFieldKeyPressed
/* validating method for gJTextField*/
    private void gJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gJTextFieldKeyPressed
        // TODO add your handling code here:
         char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            gJTextField.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             gJTextField.setEditable(true);
        }
        else{
            gJTextField.setEditable(true);
        }
    }//GEN-LAST:event_gJTextFieldKeyPressed
/* validating method for kgJtextFiled*/
    private void kgJtextFiledKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kgJtextFiledKeyPressed
        // TODO add your handling code here:
         char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            kgJtextFiled.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             kgJtextFiled.setEditable(true);
        }
        else{
            kgJtextFiled.setEditable(true);
        }
    }//GEN-LAST:event_kgJtextFiledKeyPressed
/* validating method for PoundsjTextField*/
    private void PoundsjTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PoundsjTextFieldKeyPressed
        // TODO add your handling code here:
         char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            PoundsjTextField.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             PoundsjTextField.setEditable(true);
        }
        else{
            PoundsjTextField.setEditable(true);
        }
    }//GEN-LAST:event_PoundsjTextFieldKeyPressed
/* validating method for TonnesjTextField*/
    private void TonnesjTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TonnesjTextFieldKeyPressed
        // TODO add your handling code here:
         char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            TonnesjTextField.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             TonnesjTextField.setEditable(true);
        }
        else{
            TonnesjTextField.setEditable(true);
        }
    }//GEN-LAST:event_TonnesjTextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(weightGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(weightGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(weightGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(weightGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new weightGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KgjButton;
    private javax.swing.JButton PoundsjButton;
    private javax.swing.JTextField PoundsjTextField;
    private javax.swing.JButton TonnesjButton;
    private javax.swing.JTextField TonnesjTextField;
    private javax.swing.JButton backjButton;
    private javax.swing.JButton exitjButton;
    private javax.swing.JTextField gJTextField;
    private javax.swing.JButton gjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField kgJtextFiled;
    private javax.swing.JTextField mgJtextField;
    private javax.swing.JButton mgjButton;
    private javax.swing.JButton resetjButton;
    // End of variables declaration//GEN-END:variables
}
