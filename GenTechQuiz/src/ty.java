
import gentechquiz.Main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ty.java
 *
 * Created on Nov 1, 2017, 8:53:54 PM
 */

/**
 *
 * @author Admin
 */
public class ty extends javax.swing.JFrame {

    /** Creates new form ty */
    public ty() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Thanks For Playing.");

        jLabel2.setText("Hope You Had a Nice Learning Experience");

        b2.setText("Play Again");
        b2.setEnabled(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("Exit");
        b3.setEnabled(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b1.setText("Obtain Score");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setText("Developers Team");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Yogansh Gupta");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Shashwat Singh");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setText("(KIET 3rd year IT-B)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1)
                                .addGap(40, 40, 40)
                                .addComponent(b2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
b1.setEnabled(false);
b2.setEnabled(true);
b3.setEnabled(true);
if(Main.a!=0)
{
l1.setText("Your total score in this session = "+Main.a);
}
if(Main.b!=0)
{
l1.setText("Your total score in this session = "+Main.b);
}
if(Main.c!=0)
{
l1.setText("Your total score in this session = "+Main.c);
}
if(Main.d!=0)
{
l1.setText("Your total score in this session = "+Main.d);
}
if(Main.e!=0)
{
l1.setText("Your total score in this session = "+Main.e);
}
if(Main.f!=0)
{
l1.setText("Your total score in this session = "+Main.f);
}
if(Main.g!=0)
{
l1.setText("Your total score in this session = "+Main.g);
}
if(Main.h!=0)
{
l1.setText("Your total score in this session = "+Main.h);
}
if(Main.i!=0)
{
l1.setText("Your total score in this session = "+Main.i);
}
if(Main.j!=0)
{
l1.setText("Your total score in this session = "+Main.j);
}


}//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
      new Front().setVisible(true);
      dispose();

    }//GEN-LAST:event_b2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables

}