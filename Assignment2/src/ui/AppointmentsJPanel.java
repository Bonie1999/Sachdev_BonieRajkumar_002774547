/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author hp
 */
public class AppointmentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ApprovalJPanel
     */
    public AppointmentsJPanel() {
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

        txtApprPatientName = new javax.swing.JTextField();
        txtApprPatientId = new javax.swing.JTextField();
        btnApprAddHos = new javax.swing.JButton();
        txtApprPatientAddr = new javax.swing.JTextField();
        lblApprPatientId = new javax.swing.JLabel();
        txtApprPatientPincode = new javax.swing.JTextField();
        lblApprPatientPassword = new javax.swing.JLabel();
        lblApprPatientName = new javax.swing.JLabel();
        lblApprPatientPhn = new javax.swing.JLabel();
        lblApprPatientAddr = new javax.swing.JLabel();
        lblApprPatientPincode = new javax.swing.JLabel();
        lblApprPatientDoc = new javax.swing.JLabel();
        txtApprPatientPassword = new javax.swing.JTextField();
        lblApprPatientHos = new javax.swing.JLabel();
        txtApprPatientPhn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblApprPatientDetails = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        setMaximumSize(new java.awt.Dimension(1300, 700));
        setPreferredSize(new java.awt.Dimension(1300, 700));

        txtApprPatientId.setEnabled(false);

        btnApprAddHos.setText("Create an Appointment");
        btnApprAddHos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprAddHosActionPerformed(evt);
            }
        });

        lblApprPatientId.setText("Patient ID:");

        lblApprPatientPassword.setText("Password:");

        lblApprPatientName.setText("Patient Name:");

        lblApprPatientPhn.setText("Patient Phone:");

        lblApprPatientAddr.setText("Patient Address:");

        lblApprPatientPincode.setText("Patient Pincode:");

        lblApprPatientDoc.setText("Select Doctor:");

        txtApprPatientPassword.setEnabled(false);

        lblApprPatientHos.setText("Select Hospital:");

        jLabel1.setText("Appointment Requests");

        tblApprPatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Doctor ", "Hospital", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblApprPatientDetails);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApprPatientPassword)
                            .addComponent(lblApprPatientId)
                            .addComponent(lblApprPatientName)
                            .addComponent(lblApprPatientPhn)
                            .addComponent(lblApprPatientAddr)
                            .addComponent(lblApprPatientPincode)
                            .addComponent(lblApprPatientHos)
                            .addComponent(lblApprPatientDoc))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnApprAddHos)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApprPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(txtApprPatientPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(txtApprPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(txtApprPatientPhn, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(txtApprPatientAddr, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(txtApprPatientPincode, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblApprPatientId)
                                    .addComponent(txtApprPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblApprPatientPassword)
                                    .addComponent(txtApprPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblApprPatientName)
                                    .addComponent(txtApprPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblApprPatientPhn)
                                    .addComponent(txtApprPatientPhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblApprPatientAddr)
                                    .addComponent(txtApprPatientAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(lblApprPatientPincode))
                            .addComponent(txtApprPatientPincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblApprPatientHos)
                                .addGap(95, 95, 95)
                                .addComponent(lblApprPatientDoc)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnApprAddHos)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApprAddHosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprAddHosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApprAddHosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprAddHos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblApprPatientAddr;
    private javax.swing.JLabel lblApprPatientDoc;
    private javax.swing.JLabel lblApprPatientHos;
    private javax.swing.JLabel lblApprPatientId;
    private javax.swing.JLabel lblApprPatientName;
    private javax.swing.JLabel lblApprPatientPassword;
    private javax.swing.JLabel lblApprPatientPhn;
    private javax.swing.JLabel lblApprPatientPincode;
    private javax.swing.JTable tblApprPatientDetails;
    private javax.swing.JTextField txtApprPatientAddr;
    private javax.swing.JTextField txtApprPatientId;
    private javax.swing.JTextField txtApprPatientName;
    private javax.swing.JTextField txtApprPatientPassword;
    private javax.swing.JTextField txtApprPatientPhn;
    private javax.swing.JTextField txtApprPatientPincode;
    // End of variables declaration//GEN-END:variables
}
