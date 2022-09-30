/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.HumanResourceHistory;

/**
 *
 * @author hp
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    HumanResourceHistory history;
    
    public MainJFrame() {
        initComponents();
        
        history = new HumanResourceHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftControlPanel = new javax.swing.JPanel();
        btnAddEmp = new javax.swing.JButton();
        btnViewEmp = new javax.swing.JButton();
        btnUpdateEmp = new javax.swing.JButton();
        rightWorkArea = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Human Resource Management");
        setMaximumSize(new java.awt.Dimension(800, 700));
        setPreferredSize(new java.awt.Dimension(800, 700));

        btnAddEmp.setText("Add Employee");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        btnViewEmp.setText("View Employee");
        btnViewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEmpActionPerformed(evt);
            }
        });

        btnUpdateEmp.setText("Update Employee");
        btnUpdateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftControlPanelLayout = new javax.swing.GroupLayout(leftControlPanel);
        leftControlPanel.setLayout(leftControlPanelLayout);
        leftControlPanelLayout.setHorizontalGroup(
            leftControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddEmp)
                    .addComponent(btnViewEmp)
                    .addComponent(btnUpdateEmp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leftControlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddEmp, btnUpdateEmp, btnViewEmp});

        leftControlPanelLayout.setVerticalGroup(
            leftControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftControlPanelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnAddEmp)
                .addGap(101, 101, 101)
                .addComponent(btnViewEmp)
                .addGap(95, 95, 95)
                .addComponent(btnUpdateEmp)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftControlPanel);

        lblTitle.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        lblTitle.setText("Human Resource Management");

        javax.swing.GroupLayout rightWorkAreaLayout = new javax.swing.GroupLayout(rightWorkArea);
        rightWorkArea.setLayout(rightWorkAreaLayout);
        rightWorkAreaLayout.setHorizontalGroup(
            rightWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightWorkAreaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblTitle)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        rightWorkAreaLayout.setVerticalGroup(
            rightWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightWorkAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addContainerGap(650, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(rightWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateEmpActionPerformed

    private void btnViewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewEmpActionPerformed

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        // TODO add your handling code here:
        
        CreateEmpJPanel addEmployee = new CreateEmpJPanel(history);
        splitPane.setRightComponent(addEmployee);
    }//GEN-LAST:event_btnAddEmpActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnUpdateEmp;
    private javax.swing.JButton btnViewEmp;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel leftControlPanel;
    private javax.swing.JPanel rightWorkArea;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
