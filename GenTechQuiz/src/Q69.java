
import gentechquiz.Main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Q69.java
 *
 * Created on Nov 1, 2017, 4:35:08 PM
 */

/**
 *
 * @author Admin
 */
public class Q69 extends javax.swing.JFrame {

    /** Creates new form Q69 */
    public Q69() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GenTech Quiz");

        jLabel2.setText("Q9)Gecis,a BPO company changed its name to Genpact after getting acquired by?");

        buttonGroup1.add(r3);
        r3.setText("GE   ");

        buttonGroup1.add(r4);
        r4.setText("L&T Infotech    ");

        buttonGroup1.add(r1);
        r1.setText("Infosys    ");

        buttonGroup1.add(r2);
        r2.setText("Westinghous                     ");

        b1.setText("Submit your answer");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("Next Question");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r1)
                            .addComponent(r3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(r4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(57, 57, 57))))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(b1)
                .addContainerGap(214, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(b2)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1)
                    .addComponent(r2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3)
                    .addComponent(r4))
                .addGap(27, 27, 27)
                .addComponent(b1)
                .addGap(35, 35, 35)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(b2)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if(r3.isSelected()==true) {
            Main.g=Main.g+1;
            l1.setText("Correct Answer.Your Total Score is "+Main.g);
            b1.setEnabled(false);
        }
        if(r2.isSelected()==true) {
            l1.setText("Wrong Answer.Your Total Score is "+Main.g);
            b1.setEnabled(false);
        }
        if(r1.isSelected()==true) {
            l1.setText("Wrong Answer.Your Total Score is "+Main.g);
            b1.setEnabled(false);
        }
        if(r4.isSelected()==true) {
            l1.setText("Wrong Answer.Your Total Score is "+Main.g);
            b1.setEnabled(false);
        }
}//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        new Q70().setVisible(true);
        dispose();
}//GEN-LAST:event_b2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q69().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    // End of variables declaration//GEN-END:variables

}
