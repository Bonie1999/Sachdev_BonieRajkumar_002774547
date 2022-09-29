/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author hp
 */
public class CreateEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateEmpJPanel
     */
    public CreateEmpJPanel() {
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

        lblTitle = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        lblEmpFullName = new javax.swing.JLabel();
        lblEmpAge = new javax.swing.JLabel();
        lblEmpStartDate = new javax.swing.JLabel();
        lblEmpGender = new javax.swing.JLabel();
        lblEmpTeamInfo = new javax.swing.JLabel();
        lblEmpLevel = new javax.swing.JLabel();
        lblEmpPosTitle = new javax.swing.JLabel();
        lblEmpEmail = new javax.swing.JLabel();
        lblEmpPhoneNo = new javax.swing.JLabel();
        txtEmpFullName = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        txtEmpAge = new javax.swing.JTextField();
        txtEmpGender = new javax.swing.JTextField();
        txtEmpStartDate = new javax.swing.JTextField();
        txtEmpTeamInfo = new javax.swing.JTextField();
        txtEmpPosTitle = new javax.swing.JTextField();
        txtEmpLevel = new javax.swing.JTextField();
        txtEmpPhoneNo = new javax.swing.JTextField();
        txtEmpEmail = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 650));
        setPreferredSize(new java.awt.Dimension(800, 650));

        lblTitle.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        lblTitle.setText("Add an Employee");

        lblEmpId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpId.setText("Employee ID:");

        lblEmpFullName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpFullName.setText("Full Name:");

        lblEmpAge.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpAge.setText("Age:");

        lblEmpStartDate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpStartDate.setText("Start Date:");

        lblEmpGender.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpGender.setText("Gender:");

        lblEmpTeamInfo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpTeamInfo.setText("Team Info:");

        lblEmpLevel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpLevel.setText("Level:");

        lblEmpPosTitle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpPosTitle.setText("Position Title:");

        lblEmpEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpEmail.setText("Email:");

        lblEmpPhoneNo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpPhoneNo.setText("Phone Number:");

        txtEmpFullName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpAge.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpGender.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpStartDate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpTeamInfo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpPosTitle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpLevel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpPhoneNo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        btnSubmit.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmpEmail)
                    .addComponent(lblEmpId)
                    .addComponent(lblEmpFullName)
                    .addComponent(lblEmpAge)
                    .addComponent(lblEmpGender)
                    .addComponent(lblEmpStartDate)
                    .addComponent(lblEmpLevel)
                    .addComponent(lblEmpTeamInfo)
                    .addComponent(lblEmpPosTitle)
                    .addComponent(lblEmpPhoneNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpFullName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpId))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpAge)
                    .addComponent(txtEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpGender)
                    .addComponent(txtEmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpStartDate)
                    .addComponent(txtEmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpLevel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpTeamInfo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpPosTitle))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpPhoneNo)
                    .addComponent(txtEmpPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpEmail)
                    .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnSubmit)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblEmpAge;
    private javax.swing.JLabel lblEmpEmail;
    private javax.swing.JLabel lblEmpFullName;
    private javax.swing.JLabel lblEmpGender;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblEmpLevel;
    private javax.swing.JLabel lblEmpPhoneNo;
    private javax.swing.JLabel lblEmpPosTitle;
    private javax.swing.JLabel lblEmpStartDate;
    private javax.swing.JLabel lblEmpTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtEmpAge;
    private javax.swing.JTextField txtEmpEmail;
    private javax.swing.JTextField txtEmpFullName;
    private javax.swing.JTextField txtEmpGender;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtEmpLevel;
    private javax.swing.JTextField txtEmpPhoneNo;
    private javax.swing.JTextField txtEmpPosTitle;
    private javax.swing.JTextField txtEmpStartDate;
    private javax.swing.JTextField txtEmpTeamInfo;
    // End of variables declaration//GEN-END:variables
}
