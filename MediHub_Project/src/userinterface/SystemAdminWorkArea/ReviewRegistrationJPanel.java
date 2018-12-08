/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import userinterface.RegisterationPanels.*;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.SysAdmin;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.AccessApprovalRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.ProviderRegistrationRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import userinterface.ProviderAdminRole.ProviderWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author pravinash
 */
public class ReviewRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProviderAdminRegistrationWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    private UserAccount userAccount;
    private UserAccount reviewer;

    public ReviewRegistrationJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount, UserAccount reviewer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.reviewer = reviewer;
        populateRegistration();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProviderNameJTxtField = new javax.swing.JTextField();
        ProviderCityJTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProviderAddrJTxtArea = new javax.swing.JTextArea();
        BtnUpdate = new javax.swing.JButton();
        FilePathTxtField = new javax.swing.JTextField();
        BtnBack = new javax.swing.JButton();
        BtnBrowse = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        entTypTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        StatusTxt = new javax.swing.JTextField();
        NetworkTxt = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Review Registration Request");

        jLabel2.setText("Name:");

        jLabel3.setText("Address:");

        jLabel4.setText("City:");

        jLabel5.setText("Network:");

        jLabel6.setText("License Document:");

        ProviderNameJTxtField.setEditable(false);

        ProviderCityJTxtField.setEditable(false);

        ProviderAddrJTxtArea.setEditable(false);
        ProviderAddrJTxtArea.setColumns(20);
        ProviderAddrJTxtArea.setRows(5);
        jScrollPane1.setViewportView(ProviderAddrJTxtArea);

        BtnUpdate.setText("Edit Status");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        FilePathTxtField.setEditable(false);

        BtnBack.setText("<< Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnBrowse.setText("Browse");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel10.setText("Enterprise Type:");

        entTypTxt.setEditable(false);

        jLabel7.setText("Status:");

        StatusTxt.setEditable(false);

        NetworkTxt.setEditable(false);

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnBrowse)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(NetworkTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ProviderNameJTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                        .addComponent(ProviderCityJTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FilePathTxtField, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(BtnBack))
                        .addGap(65, 65, 65)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(entTypTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnUpdate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(StatusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SaveBtn)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(226, 226, 226))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ProviderNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ProviderCityJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(NetworkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(FilePathTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBrowse)
                        .addGap(41, 41, 41)
                        .addComponent(BtnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(entTypTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(StatusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SaveBtn))
                                .addGap(38, 38, 38)
                                .addComponent(BtnUpdate))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateRegistration() {
        ProviderNameJTxtField.setText(userAccount.getEmployee().getName());
        ProviderAddrJTxtArea.setText(userAccount.getEmployee().getEnterpriseAddress());
        ProviderCityJTxtField.setText(userAccount.getEmployee().getEnterpriseCity());
        NetworkTxt.setText(userAccount.getEmployee().getEnterpriseState());
        entTypTxt.setText(userAccount.getEmployee().getType());
        StatusTxt.setText(userAccount.getEmployee().getRegStatus());
    }
    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        StatusTxt.setEditable(true);
        StatusTxt.setBackground(Color.green);

    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];

//        if (component.getName().equals("doctor")) {
//            ProviderWorkAreaJPanel providerWorkAreJPanel = (ProviderWorkAreaJPanel) component;
//            providerWorkAreJPanel.populateAccessRequestTbl();
//            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//            layout.previous(userProcessContainer);
//        } else {
            SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel = (SystemAdminWorkAreaJPanel) component;
            systemAdminWorkAreaJPanel.populateAccessRequestTbl();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
//        }
    }//GEN-LAST:event_BtnBackActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        userAccount.getEmployee().setRegStatus("Active");
//        for (UserAccount u : system.getUserAccountDirectory().getUserAccountList()){
//            if(u.getUsername().equals("sysadmin")){
//                System.out.println(u.getPassword());
//                for (WorkRequest wr : u.getWorkQueue().getWorkRequestList()){
//                    if(wr.getSender().equals(userAccount)){
//                        wr.setStatus(StatusTxt.getText());
//                        userAccount.setStatus(StatusTxt.getText());
//                    }
//                }
//            }
//        }
        for (WorkRequest wr : reviewer.getWorkQueue().getWorkRequestList()) {
            if (wr.getSender().equals(userAccount)) {
                wr.setStatus(StatusTxt.getText());
                userAccount.setStatus(StatusTxt.getText());
            }
        }

        JOptionPane.showMessageDialog(null, "User account ACTIVATED!");
        StatusTxt.setEditable(false);
    }//GEN-LAST:event_SaveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnBrowse;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JTextField FilePathTxtField;
    private javax.swing.JTextField NetworkTxt;
    private javax.swing.JTextArea ProviderAddrJTxtArea;
    private javax.swing.JTextField ProviderCityJTxtField;
    private javax.swing.JTextField ProviderNameJTxtField;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField StatusTxt;
    private javax.swing.JTextField entTypTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
