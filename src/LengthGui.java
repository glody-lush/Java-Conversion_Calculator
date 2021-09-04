
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
public class LengthGui extends javax.swing.JFrame {

    /**
     * Creates new form LengthGui
     */
    public LengthGui() {
        initComponents();
        
        /* object*/
        ButtonHandler handler = new ButtonHandler();
        /*Add button*/
        Convertmm.addActionListener(handler);
        convertcm.addActionListener(handler);
        convertfeet.addActionListener(handler);
        convertinch.addActionListener(handler);
        convertkm.addActionListener(handler);
        convertm.addActionListener(handler);
        convertmile.addActionListener(handler);
        resetLength.addActionListener(handler);
        backLength.addActionListener(handler);
        exitLength.addActionListener(handler);
       
    }// end of constructor
    /*private ButtonHandler class*/
   private class ButtonHandler implements ActionListener{

      @Override
      public void actionPerformed(ActionEvent e){
     
                
          if(e.getSource()==Convertmm){
              /*if condition checking if the consern JtextField is empty*/
              if(JTextFieldmm.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unit Empty");
              }//end of condition checking if the consern JtextField is empty
              else{
                  float mmJtexfield =Float.parseFloat(JTextFieldmm.getText());
             JTextFieldlcm.setText(new DecimalFormat("##.###").format(mmJtexfield * 0.1));
              JTextFieldm.setText(new DecimalFormat("##.###").format(mmJtexfield * 0.001));
              JTextFieldkm.setText(new DecimalFormat("###.0E0").format(mmJtexfield * 0.000001));
               JTextFieldmile.setText(new DecimalFormat("###.0E0").format(mmJtexfield * 6.21371*0.0000001));
                JTextFieldinch.setText(new DecimalFormat("##.###").format(mmJtexfield * 0.0393701));
                 JTextFieldfeet.setText(new DecimalFormat("##.###").format(mmJtexfield * 0.00328084));     
              }// end if condition for convertmmJButton     
          }// end of convertmmJbutton ActionPerfomed
         
          else if(e.getSource()==convertcm){
              /*if condition checking if the consern JtextField is empty*/
              if(JTextFieldlcm.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unint Empty");
               }// end of if condition checking if the consern JtextField is empty
              else{
               float cmJtexfield =Float.parseFloat(JTextFieldlcm.getText());          
              JTextFieldmm.setText(new DecimalFormat("##.###").format(cmJtexfield * 10));
              JTextFieldm.setText(new DecimalFormat("##.###").format(cmJtexfield * 0.01));
              JTextFieldkm.setText(new DecimalFormat("###.0E0").format(cmJtexfield * 0.00001));
               JTextFieldmile.setText(new DecimalFormat("###.0E0").format(cmJtexfield * 6.21371*0.000001));
                JTextFieldinch.setText(new DecimalFormat("##.###").format(cmJtexfield * 0.393701));
                 JTextFieldfeet.setText(new DecimalFormat("##.###").format(cmJtexfield * 0.0328084));        
                }// end of if condition for convertcmJbutton
          }// end of convertcmJbutton ActionPerformed  
          
          if(e.getSource()==convertfeet){
               /*if condition checking if the consern JtextField is empty*/ 
               if(JTextFieldfeet.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unint Empty");
                }// end of if condition checking if the consern JtextField is empty
               else{
            float feetJtexfield =Float.parseFloat(JTextFieldfeet.getText()); 
            JTextFieldmm.setText(new DecimalFormat("##.###").format(feetJtexfield * 304.8));
              JTextFieldlcm.setText(new DecimalFormat("##.###").format(feetJtexfield * 30.48));
              JTextFieldm.setText(new DecimalFormat("##.###").format(feetJtexfield * 0.3048));
              JTextFieldkm.setText(new DecimalFormat("###.0E0").format(feetJtexfield * 0.0003048));
               JTextFieldmile.setText(new DecimalFormat("###.0E0").format(feetJtexfield * 0.000189394));
                JTextFieldinch.setText(new DecimalFormat("##.###").format(feetJtexfield * 12));
            }// end of if condition for convertfeetJbutton
          }// end of convertfeetJbutton ActionPerformed 
          
          if(e.getSource()==convertinch){
              /*if condition checking if the consern JtextField is empty*/ 
               if(JTextFieldinch.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unint Empty");
                }// end of if condition checking if the consern JtextField is empty
               else{
              float inchJtexfield =Float.parseFloat(JTextFieldinch.getText());
              JTextFieldmm.setText(new DecimalFormat("##.###").format(inchJtexfield * 25.4));
              JTextFieldlcm.setText(new DecimalFormat("##.###").format(inchJtexfield * 2.54));
              JTextFieldm.setText(new DecimalFormat("##.###").format(inchJtexfield * 0.0254));
              JTextFieldkm.setText(new DecimalFormat("###.0E0").format(inchJtexfield * 2.54*0.00001));
               JTextFieldmile.setText(new DecimalFormat("###.0E0").format(inchJtexfield * 1.57828*0.00001));
                 JTextFieldfeet.setText(new DecimalFormat("###.0E0").format(inchJtexfield * 0.0833333));        
             }// end of if condition for convertinchJbutton
          }// end of convertinchJbutton ActionPerformed 
          
          if(e.getSource()==convertkm){
              /*if condition checking if the consern JtextField is empty*/ 
               if(JTextFieldkm.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unint Empty");
                }// end of if condition checking if the consern JtextField is empty
               else{
              float kmJtexfield =Float.parseFloat(JTextFieldkm.getText()); 
              JTextFieldmm.setText(new DecimalFormat("##.###").format(kmJtexfield * 1000000));
              JTextFieldlcm.setText(new DecimalFormat("##.###").format(kmJtexfield * 100000));
              JTextFieldm.setText(new DecimalFormat("##.###").format(kmJtexfield * 1000));
              JTextFieldmile.setText(new DecimalFormat("##.###").format(kmJtexfield * 0.621371));
               JTextFieldinch.setText(new DecimalFormat("##.###").format(kmJtexfield * 39370.1));
               JTextFieldfeet.setText(new DecimalFormat("##.###").format(kmJtexfield * 3280.84));      
              }// end of if condition for convertkmJbutton
          }// end of convertkmJbutton ActionPerformed 
          
          if(e.getSource()==convertm){
              /*if condition checking if the consern JtextField is empty*/ 
               if(JTextFieldm.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unint Empty");
                }// end of if condition checking if the consern JtextField is empty
               else{
               float mJtexfield =Float.parseFloat(JTextFieldm.getText());
               JTextFieldmm.setText(new DecimalFormat("##.###").format(mJtexfield * 0.01));
              JTextFieldlcm.setText(new DecimalFormat("##.###").format(mJtexfield * 100));
              JTextFieldkm.setText(new DecimalFormat("##.###").format(mJtexfield * 0.001));
               JTextFieldmile.setText(new DecimalFormat("###.0E0").format(mJtexfield * 0.000621371));
                JTextFieldinch.setText(new DecimalFormat("##.###").format(mJtexfield * 39.3701));
                 JTextFieldfeet.setText(new DecimalFormat("##.###").format(mJtexfield * 3.28084));
              }// end of if condition for convertmJbutton
          }// end of convertmJbutton ActionPerformed 
          
          if(e.getSource()==convertmile){
              /*if condition checking if the consern JtextField is empty*/ 
               if(JTextFieldmile.getText().length()<= 0){
                  JOptionPane.showMessageDialog(null, "Dont leave The Unint Empty");
                }// end of if condition checking if the consern JtextField is empty
               else{
              float mileJtexfield =Float.parseFloat(JTextFieldmile.getText());
              JTextFieldmm.setText(new DecimalFormat("##.###").format(mileJtexfield * 1.609*1000000));
              JTextFieldlcm.setText(new DecimalFormat("##.###").format(mileJtexfield * 160934));
              JTextFieldm.setText(new DecimalFormat("##.###").format(mileJtexfield * 1609.34));
              JTextFieldkm.setText(new DecimalFormat("##.###").format(mileJtexfield * 1.60934));
                JTextFieldinch.setText(new DecimalFormat("##.###").format(mileJtexfield * 63360));
                 JTextFieldfeet.setText(new DecimalFormat("##.###").format(mileJtexfield * 5280));        
             }// end of if condition for convertmileJbutton
          }// end of convertmileJbutton ActionPerformed 
          
         else if(e.getSource()==resetLength){
           JTextFieldmm.setText("");
           JTextFieldlcm.setText("");
           JTextFieldm.setText("");
           JTextFieldkm.setText("");
           JTextFieldmile.setText("");
           JTextFieldinch.setText("");
           JTextFieldfeet.setText("");
         }
          
          
          else if(e.getSource()==backLength){
              dispose();
               MainGui gui = new  MainGui();
               gui.setVisible(true);
               gui.setLocationRelativeTo(null);
         }
          
         else if(e.getSource()==exitLength){
             JOptionPane.showMessageDialog(null, "Everytime you Exit, The Program terminate!!!\n Thank you");
              System.exit(0);
         } 
      
          
      
          
    }//end of actionPerfomerd method    
      
    
}//end of private ButtonHandler class

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTextFieldmm = new javax.swing.JTextField();
        JTextFieldlcm = new javax.swing.JTextField();
        JTextFieldm = new javax.swing.JTextField();
        JTextFieldkm = new javax.swing.JTextField();
        JTextFieldmile = new javax.swing.JTextField();
        JTextFieldfeet = new javax.swing.JTextField();
        JTextFieldinch = new javax.swing.JTextField();
        backLength = new javax.swing.JButton();
        resetLength = new javax.swing.JButton();
        exitLength = new javax.swing.JButton();
        mmJLabel = new javax.swing.JLabel();
        cmJLabel = new javax.swing.JLabel();
        mJLabel = new javax.swing.JLabel();
        kmJLabel = new javax.swing.JLabel();
        mileJLabel = new javax.swing.JLabel();
        feetJLabel = new javax.swing.JLabel();
        inchJLabel = new javax.swing.JLabel();
        Convertmm = new javax.swing.JButton();
        convertcm = new javax.swing.JButton();
        convertm = new javax.swing.JButton();
        convertkm = new javax.swing.JButton();
        convertmile = new javax.swing.JButton();
        convertfeet = new javax.swing.JButton();
        convertinch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Length Convert");

        JTextFieldmm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldmmKeyPressed(evt);
            }
        });

        JTextFieldlcm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldlcmKeyPressed(evt);
            }
        });

        JTextFieldm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldmKeyPressed(evt);
            }
        });

        JTextFieldkm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldkmKeyPressed(evt);
            }
        });

        JTextFieldmile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldmileKeyPressed(evt);
            }
        });

        JTextFieldfeet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldfeetKeyPressed(evt);
            }
        });

        JTextFieldinch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldinchKeyPressed(evt);
            }
        });

        backLength.setText("BACK");

        resetLength.setText("RESET");

        exitLength.setText("EXIT");

        mmJLabel.setText("mm");

        cmJLabel.setText("cm");

        mJLabel.setText("m");

        kmJLabel.setText("km");

        mileJLabel.setText("mile");

        feetJLabel.setText("feet");

        inchJLabel.setText("inch");

        Convertmm.setText("convert");

        convertcm.setText("convert");

        convertm.setText("convert");

        convertkm.setText("convert");

        convertmile.setText("convert");

        convertfeet.setText("convert");

        convertinch.setText("convert");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JTextFieldfeet)
                                .addComponent(JTextFieldmile)
                                .addComponent(JTextFieldinch, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                            .addComponent(backLength))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mileJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(convertmile))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(feetJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(convertfeet))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inchJLabel)
                                    .addComponent(resetLength))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(convertinch)
                                    .addComponent(exitLength)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTextFieldmm)
                            .addComponent(JTextFieldlcm)
                            .addComponent(JTextFieldm)
                            .addComponent(JTextFieldkm, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mmJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Convertmm))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kmJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(convertkm))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mJLabel)
                                    .addComponent(cmJLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(convertcm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(convertm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mmJLabel)
                            .addComponent(JTextFieldmm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Convertmm))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextFieldlcm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmJLabel)
                            .addComponent(convertcm))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextFieldm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mJLabel)
                            .addComponent(convertm))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextFieldkm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kmJLabel)
                            .addComponent(convertkm))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextFieldmile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mileJLabel)
                            .addComponent(convertmile))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextFieldfeet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(feetJLabel)
                            .addComponent(convertfeet))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextFieldinch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inchJLabel)
                            .addComponent(convertinch))
                        .addGap(28, 102, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backLength)
                            .addComponent(resetLength)
                            .addComponent(exitLength))
                        .addGap(43, 43, 43))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    /* validating method for JTextfieldmm*/
    private void JTextFieldmmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldmmKeyPressed
        // TODO add your handling code here
        char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            JTextFieldmm.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             JTextFieldmm.setEditable(true);
        }
        else{
            JTextFieldmm.setEditable(true);
        }
    }//GEN-LAST:event_JTextFieldmmKeyPressed
/* validating method for JTextfieldcm*/
    private void JTextFieldlcmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldlcmKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            JTextFieldlcm.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             JTextFieldlcm.setEditable(true);
        }
        else{
            JTextFieldlcm.setEditable(true);
        }
    }//GEN-LAST:event_JTextFieldlcmKeyPressed
/* validating method for JTextfieldm*/
    private void JTextFieldmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldmKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            JTextFieldm.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             JTextFieldm.setEditable(true);
        }
        else{
            JTextFieldm.setEditable(true);
        }
    }//GEN-LAST:event_JTextFieldmKeyPressed
/* validating method for JTextfieldkm*/
    private void JTextFieldkmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldkmKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            JTextFieldkm.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             JTextFieldkm.setEditable(true);
        }
        else{
            JTextFieldkm.setEditable(true);
        }
    }//GEN-LAST:event_JTextFieldkmKeyPressed
/* validating method for JTextfieldmile*/
    private void JTextFieldmileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldmileKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            JTextFieldmile.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             JTextFieldmile.setEditable(true);
        }
        else{
            JTextFieldmile.setEditable(true);
        }
    }//GEN-LAST:event_JTextFieldmileKeyPressed
/* validating method for JTextfieldfeet*/
    private void JTextFieldfeetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldfeetKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            JTextFieldfeet.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             JTextFieldfeet.setEditable(true);
        }
        else{
            JTextFieldfeet.setEditable(true);
        }
    }//GEN-LAST:event_JTextFieldfeetKeyPressed
/* validating method for JTextfieldinch*/
    private void JTextFieldinchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldinchKeyPressed
        // TODO add your handling code here:
         char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            JTextFieldinch.setEditable(false);
            
            JOptionPane.showMessageDialog(null, "Please Enter Only Number");
             JTextFieldinch.setEditable(true);
        }
        else{
            JTextFieldinch.setEditable(true);
        }
    }//GEN-LAST:event_JTextFieldinchKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convertmm;
    private javax.swing.JTextField JTextFieldfeet;
    private javax.swing.JTextField JTextFieldinch;
    private javax.swing.JTextField JTextFieldkm;
    private javax.swing.JTextField JTextFieldlcm;
    private javax.swing.JTextField JTextFieldm;
    private javax.swing.JTextField JTextFieldmile;
    private javax.swing.JTextField JTextFieldmm;
    private javax.swing.JButton backLength;
    private javax.swing.JLabel cmJLabel;
    private javax.swing.JButton convertcm;
    private javax.swing.JButton convertfeet;
    private javax.swing.JButton convertinch;
    private javax.swing.JButton convertkm;
    private javax.swing.JButton convertm;
    private javax.swing.JButton convertmile;
    private javax.swing.JButton exitLength;
    private javax.swing.JLabel feetJLabel;
    private javax.swing.JLabel inchJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kmJLabel;
    private javax.swing.JLabel mJLabel;
    private javax.swing.JLabel mileJLabel;
    private javax.swing.JLabel mmJLabel;
    private javax.swing.JButton resetLength;
    // End of variables declaration//GEN-END:variables
}// end of LenghtGui class
