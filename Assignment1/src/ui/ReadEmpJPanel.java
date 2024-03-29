/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HumanResource;
import model.HumanResourceHistory;
import javax.swing.JFileChooser;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hp
 */
public class ReadEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmpJPanel
     */
    HumanResourceHistory history;
    private final JFileChooser openFileChooser;
    private BufferedImage originalBI;
    public ReadEmpJPanel(HumanResourceHistory history) {
        initComponents();
        
        this.history = history;
        
        readTable();
        lblImageShowPath.setVisible(false);
        
        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("c:\\temp"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("PNG images", "png", "jpg"));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpDetails = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblImageShowPath = new javax.swing.JLabel();
        txtEmpStartDate = new javax.swing.JTextField();
        lblEmpLevel = new javax.swing.JLabel();
        lblImageShow = new javax.swing.JLabel();
        lblEmpGender = new javax.swing.JLabel();
        txtEmpLevel = new javax.swing.JTextField();
        txtEmpFullName = new javax.swing.JTextField();
        lblEmpPosTitle = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        txtEmpPhoneNo = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        lblEmpEmail = new javax.swing.JLabel();
        lblEmpFullName = new javax.swing.JLabel();
        txtEmpEmail = new javax.swing.JTextField();
        txtEmpAge = new javax.swing.JTextField();
        txtEmpTeamInfo = new javax.swing.JTextField();
        lblEmpPhoneNo = new javax.swing.JLabel();
        txtEmpGender = new javax.swing.JTextField();
        lblEmpAge = new javax.swing.JLabel();
        lblEmpTeamInfo = new javax.swing.JLabel();
        lblEmpStartDate = new javax.swing.JLabel();
        txtEmpPosTitle = new javax.swing.JTextField();

        setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(900, 700));

        lblTitle.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View an Employee");

        tblEmpDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Employee Name", "Employee ID", "Position Title", "Phone No", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmpDetails);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtEmpStartDate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        lblEmpLevel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpLevel.setText("Level:");

        lblEmpGender.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpGender.setText("Gender:");

        txtEmpLevel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpFullName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        lblEmpPosTitle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpPosTitle.setText("Position Title:");

        lblEmpId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpId.setText("Employee ID:");

        txtEmpPhoneNo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        lblEmpEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpEmail.setText("Email:");

        lblEmpFullName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpFullName.setText("Full Name:");

        txtEmpEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpAge.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmpTeamInfo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        lblEmpPhoneNo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpPhoneNo.setText("Phone Number:");

        txtEmpGender.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        lblEmpAge.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpAge.setText("Age:");

        lblEmpTeamInfo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpTeamInfo.setText("Team Info:");

        lblEmpStartDate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmpStartDate.setText("Start Date:");

        txtEmpPosTitle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(503, 503, 503)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(768, 768, 768)
                        .addComponent(lblImageShowPath)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmpId)
                    .addComponent(lblEmpFullName)
                    .addComponent(lblEmpAge)
                    .addComponent(lblEmpGender)
                    .addComponent(lblEmpStartDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtEmpGender, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpFullName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpStartDate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmpPhoneNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpLevel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmpTeamInfo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmpEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpPosTitle, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtEmpPhoneNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpPosTitle, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpTeamInfo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpLevel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblImageShow, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImageShow, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpFullName))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpId)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addComponent(lblEmpAge)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpGender)
                            .addComponent(txtEmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpStartDate)
                            .addComponent(txtEmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpLevel))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpTeamInfo))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpPosTitle)
                            .addComponent(txtEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpPhoneNo)
                            .addComponent(txtEmpPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpEmail)
                            .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImageShowPath)
                .addContainerGap(193, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int rowIndexPoint = tblEmpDetails.getSelectedRow();
        
        if(rowIndexPoint == -1) {
            JOptionPane.showMessageDialog(this, "To view a row, please choose one!!");
            return;
            
        }
         
        
        DefaultTableModel model = (DefaultTableModel) tblEmpDetails.getModel();
        HumanResource empDetailsSelected = (HumanResource)model.getValueAt(rowIndexPoint, 0);
      
        txtEmpFullName.setText(empDetailsSelected.getEmpFullName());
        txtEmpId.setText(String.valueOf(empDetailsSelected.getEmpId()));
        txtEmpAge.setText(String.valueOf(empDetailsSelected.getEmpAge()));
        txtEmpGender.setText(empDetailsSelected.getEmpGender());
        txtEmpStartDate.setText(empDetailsSelected.getEmpStartDate());
        txtEmpLevel.setText(empDetailsSelected.getEmpLevel());
        txtEmpTeamInfo.setText(empDetailsSelected.getEmpTeamInfo());
        txtEmpPosTitle.setText(empDetailsSelected.getEmpTitle());
        txtEmpPhoneNo.setText(empDetailsSelected.getEmpPhNumber());
        txtEmpEmail.setText(empDetailsSelected.getEmpEmail());
        lblImageShowPath.setText(empDetailsSelected.getEmpImage());
        ImageIcon imageDisplay = new ImageIcon (lblImageShowPath.getText());
        Image image = imageDisplay.getImage();
        Image newImage = image.getScaledInstance(230, 170, Image.SCALE_DEFAULT);
        imageDisplay = new ImageIcon(newImage);
        lblImageShow.setIcon(imageDisplay);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int rowIndexPoint = tblEmpDetails.getSelectedRow();
        
        if(rowIndexPoint == -1) {
            JOptionPane.showMessageDialog(this, "To delete a row, please choose one!!");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmpDetails.getModel();
        HumanResource selecteddetails = (HumanResource)model.getValueAt(rowIndexPoint,0);
        
        history.deletedetails(selecteddetails);
        
        JOptionPane.showMessageDialog(this, "Employee Details have been deleted Successfully!!");
        txtEmpFullName.setText("");
        txtEmpId.setText("");
        txtEmpAge.setText("");
        txtEmpGender.setText("");
        txtEmpStartDate.setText("");
        txtEmpLevel.setText("");
        txtEmpTeamInfo.setText("");
        txtEmpPosTitle.setText("");
        txtEmpPhoneNo.setText("");
        txtEmpEmail.setText("");
        lblImageShowPath.setText("");
        lblImageShow.setIcon(null);
        readTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JLabel lblImageShow;
    private javax.swing.JLabel lblImageShowPath;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmpDetails;
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

    private void readTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblEmpDetails.getModel();
        model.setRowCount(0);
        
        for(HumanResource hr : history.getHistory()){
            
            Object[] row = new Object[5];
            row[0] = hr;
            row[1] = hr.getEmpId();
            row[2] = hr.getEmpTitle();
            row[3] = hr.getEmpPhNumber();
            row[4] = hr.getEmpEmail();

            
            model.addRow(row);
        }
    }
}
