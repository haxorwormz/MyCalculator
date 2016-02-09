/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jCalculator;

/**
 *
 * @author USER
 */
public class JavaCalculator extends javax.swing.JFrame {
    
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    
    /**
     * Creates new form JavaCalculator
     */
    public JavaCalculator() {
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

        jSlider1 = new javax.swing.JSlider();
        txtDisplay = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnFour = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(210, 210));

        btnFour.setBackground(new java.awt.Color(204, 204, 204));
        btnFour.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnTwo.setBackground(new java.awt.Color(204, 204, 204));
        btnTwo.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnThree.setBackground(new java.awt.Color(204, 204, 204));
        btnThree.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnOne.setBackground(new java.awt.Color(204, 204, 204));
        btnOne.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnSeven.setBackground(new java.awt.Color(204, 204, 204));
        btnSeven.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnZero.setBackground(new java.awt.Color(204, 204, 204));
        btnZero.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnFive.setBackground(new java.awt.Color(204, 204, 204));
        btnFive.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setBackground(new java.awt.Color(204, 204, 204));
        btnSix.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnEight.setBackground(new java.awt.Color(204, 204, 204));
        btnEight.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setBackground(new java.awt.Color(204, 204, 204));
        btnNine.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        dot.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dot.setText(".");
        dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        btnClear.setText("CE");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnZero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnEight, btnEqual, btnFive, btnFour, btnNine, btnOne, btnSeven, btnSix, btnThree, btnTwo, btnZero, dot});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThree, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFour)
                    .addComponent(btnFive)
                    .addComponent(btnSix))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSeven))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClear, btnEight, btnEqual, btnFive, btnFour, btnNine, btnOne, btnSeven, btnSix, btnThree, btnTwo, btnZero, dot});

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnMulti.setText("*");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.setToolTipText("");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPlus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMinus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMulti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDiv)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        jLabel1.setText("Don't forget to Clear Your Past");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(txtDisplay.getText( ) );
        txtDisplay.setText("");
    }
    
    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        // TODO add your handling code here:
        String btnFourText= txtDisplay.getText() + btnFour.getText();
        txtDisplay.setText( btnFourText);
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        // TODO add your handling code here:
        String btnSevenText= txtDisplay.getText() + btnSeven.getText();
        txtDisplay.setText( btnSevenText);
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        // TODO add your handling code here:
        String btnOneText= txtDisplay.getText() + btnOne.getText();
        txtDisplay.setText( btnOneText);
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        // TODO add your handling code here:
        String button_text = btnMinus.getText();
        getOperator(button_text);
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        // TODO add your handling code here:
        switch ( math_operator ) {
        case '+':
            total2 = total1 + Double.parseDouble(txtDisplay.getText( ) );
            break;
        case '-':
            total2 = total1 - Double.parseDouble(txtDisplay.getText( ) );
            break;
        case '/':
            total2 = total1 / Double.parseDouble(txtDisplay.getText( ) );
            break;
        case '*':
            total2 = total1 * Double.parseDouble(txtDisplay.getText( ) );
            break;
}
        txtDisplay.setText( Double.toString(total2) );
        total1 = 0;
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        total2 = 0;
        txtDisplay.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        // TODO add your handling code here:
        String btnTwoText= txtDisplay.getText() + btnTwo.getText();
        txtDisplay.setText( btnTwoText);
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        // TODO add your handling code here:
        String btnThreeText= txtDisplay.getText() + btnThree.getText();
        txtDisplay.setText( btnThreeText);
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        // TODO add your handling code here:
        String btnFiveText= txtDisplay.getText() + btnFive.getText();
        txtDisplay.setText( btnFiveText);
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        // TODO add your handling code here:
        String btnSixText= txtDisplay.getText() + btnSix.getText();
        txtDisplay.setText( btnSixText);
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        // TODO add your handling code here:
        String btnEightText= txtDisplay.getText() + btnEight.getText();
        txtDisplay.setText( btnEightText);
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        // TODO add your handling code here:
        String btnNineText= txtDisplay.getText() + btnNine.getText();
        txtDisplay.setText( btnNineText);
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        // TODO add your handling code here:
        String btnZeroText= txtDisplay.getText() + btnZero.getText();
        txtDisplay.setText( btnZeroText);
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
        String button_text = btnPlus.getText();
        getOperator(button_text);
    }//GEN-LAST:event_btnPlusActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        // TODO add your handling code here:
        String dotText= txtDisplay.getText() + dot.getText();
        txtDisplay.setText( dotText);
    }//GEN-LAST:event_dotActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        // TODO add your handling code here:
        String button_text = btnMulti.getText();
        getOperator(button_text);
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
        String button_text = btnDiv.getText();
        getOperator(button_text);
    }//GEN-LAST:event_btnDivActionPerformed

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
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JButton dot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
