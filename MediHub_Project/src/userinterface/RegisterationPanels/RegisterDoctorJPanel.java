/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RegisterationPanels;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.*;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Doctor;
import Business.Organization.OrganizationDirectory;
import Business.Role.AdminRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccessApprovalRequest;
import Business.WorkQueue.DoctorRegistrationRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Organization.Organization.Type;
import Business.Role.LabAssistantRole;

/**
 *
 * @author hp
 */
public class RegisterDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterMedicalSchool
     */
    JPanel userProcessContainer;
    EcoSystem system;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    private Role role;
    private Role.RoleType roleSelect;

    public RegisterDoctorJPanel(JPanel userProcessContainer, EcoSystem system, Role role, Role.RoleType roleSelect) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.role = role;
        this.roleSelect = roleSelect;
        populateNetworkComboBox();
        if (roleSelect.equals(Role.RoleType.Doctor)) {
            msgTxt.setText("Doctor");
        } else {
            msgTxt.setText("Lab Assistant");
        }

    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();
        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network n) {
        enterpriseTypeJComboBox.removeAllItems();
        for (Enterprise enter : n.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseTypeJComboBox.addItem(enter);

        }
    }

    private void create(Enterprise ent, Organization org) {
        Employee empDoctor = org.getEmployeeDirectory().createEmployee(txtFiledFname.getText(), null, null, networkJComboBox.getSelectedItem().toString(), ent.getEnterpriseType().toString());
        UserAccount ua = org.getUserAccountDirectory().createEmployeeAccount(userNameTxt.getText(), pwsTxt.getText(), empDoctor, role);

        AccessApprovalRequest request = new AccessApprovalRequest();
        request.setRole(roleSelect.toString());
        request.setSender(ua);
        request.setStatus("Pending");

//        for (UserAccount u : system.getUserAccountDirectory().getUserAccountList()) {
//            if (u.getUsername().equals("sysadmin")) {
//                u.getWorkQueue().getWorkRequestList().add(request);
//            }
//
//        }
        for (UserAccount u : ent.getUserAccountDirectory().getUserAccountList()) {
            if (u.getUsername().equalsIgnoreCase(ent.getName())) {
                u.getWorkQueue().getWorkRequestList().add(request);
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<String>();
        msgTxt = new javax.swing.JLabel();
        txtFiledFname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textFieldLname = new javax.swing.JTextField();
        textFieldept = new javax.swing.JTextField();
        txtFieldSSN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        pwsTxt = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        txtfieldRetype = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        userNameMsg1 = new javax.swing.JLabel();
        userNameMsg2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 5));
        setMaximumSize(new java.awt.Dimension(602, 390));
        setPreferredSize(new java.awt.Dimension(550, 390));
        setLayout(null);

        msgTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgTxt.setForeground(new java.awt.Color(0, 102, 51));
        add(msgTxt);
        msgTxt.setBounds(184, 90, 120, 36);
        add(txtFiledFname);
        txtFiledFname.setBounds(250, 170, 200, 30);

        jLabel2.setText("First Name:");
        add(jLabel2);
        jLabel2.setBounds(140, 170, 90, 20);

        jLabel3.setText("Last Name:");
        add(jLabel3);
        jLabel3.setBounds(490, 170, 110, 20);

        jLabel4.setText("Department: ");
        add(jLabel4);
        jLabel4.setBounds(140, 210, 100, 20);

        jLabel5.setText("Employee Id");
        add(jLabel5);
        jLabel5.setBounds(140, 250, 90, 20);
        add(textFieldLname);
        textFieldLname.setBounds(610, 170, 200, 30);
        add(textFieldept);
        textFieldept.setBounds(250, 210, 200, 30);
        add(txtFieldSSN);
        txtFieldSSN.setBounds(250, 250, 200, 30);

        jLabel6.setText("Region:");
        add(jLabel6);
        jLabel6.setBounds(140, 310, 90, 20);

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        add(registerBtn);
        registerBtn.setBounds(550, 450, 110, 29);

        jLabel7.setText("Select Provider:");
        add(jLabel7);
        jLabel7.setBounds(140, 350, 120, 20);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1);
        jSeparator1.setBounds(490, 220, 10, 170);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("Create:");
        add(jLabel8);
        jLabel8.setBounds(520, 210, 150, 40);

        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        add(userNameTxt);
        userNameTxt.setBounds(640, 250, 140, 30);
        add(pwsTxt);
        pwsTxt.setBounds(640, 320, 140, 30);

        jLabel9.setText("Password:");
        add(jLabel9);
        jLabel9.setBounds(520, 320, 80, 30);

        jLabel10.setText("User Name:");
        add(jLabel10);
        jLabel10.setBounds(520, 250, 110, 30);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox);
        networkJComboBox.setBounds(270, 300, 150, 30);

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseTypeJComboBox);
        enterpriseTypeJComboBox.setBounds(270, 340, 150, 30);

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(340, 450, 93, 29);
        add(txtfieldRetype);
        txtfieldRetype.setBounds(640, 360, 140, 26);

        jLabel11.setText("Re-Type Pass:");
        add(jLabel11);
        jLabel11.setBounds(520, 360, 110, 20);
        add(userNameMsg1);
        userNameMsg1.setBounds(790, 250, 140, 20);
        add(userNameMsg2);
        userNameMsg2.setBounds(640, 290, 140, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 51));
        jLabel12.setText("Registration");
        add(jLabel12);
        jLabel12.setBounds(320, 90, 244, 36);
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        if (txtFiledFname.getText().isEmpty() && txtFieldSSN.getText().isEmpty() && textFieldLname.getText().isEmpty() && textFieldept.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill mandatory fields");
        } else {
            Enterprise ent = (Enterprise) enterpriseTypeJComboBox.getSelectedItem();
            OrganizationDirectory directory = ent.getOrganizationDirectory();

            if (roleSelect.equals(Role.RoleType.Doctor)) {

                Organization.Type type = Organization.Type.Doctor;
                Organization org = directory.createOrganization(type);

                Employee empDoctor = org.getEmployeeDirectory().createEmployee(txtFiledFname.getText(), textFieldept.getText(), null, networkJComboBox.getSelectedItem().toString(), type.toString());
                UserAccount ua = org.getUserAccountDirectory().createEmployeeAccount(userNameTxt.getText(), pwsTxt.getText(), empDoctor, new DoctorRole());

                for (UserAccount entAccount : ent.getUserAccountDirectory().getUserAccountList()) {
                    System.out.println(entAccount);

                }

                AccessApprovalRequest request = new AccessApprovalRequest();
                request.setRole(roleSelect.toString());
                request.setSender(ua);
                request.setStatus("Pending");
                for (UserAccount u : ent.getUserAccountDirectory().getUserAccountList()) {
                    if (u.getUsername().equalsIgnoreCase(ent.getName())) {
                        System.out.println(u.getUsername() + " " + u.getRole());
                        u.getWorkQueue().getWorkRequestList().add(request);
                    }

                }

            } else {

                Organization.Type type = Organization.Type.Lab;
                Organization org = directory.createOrganization(type);

                Employee empDoctor = org.getEmployeeDirectory().createEmployee(txtFiledFname.getText(), textFieldept.getText(), null, networkJComboBox.getSelectedItem().toString(), type.toString());
                UserAccount ua = org.getUserAccountDirectory().createEmployeeAccount(userNameTxt.getText(), pwsTxt.getText(), empDoctor, new LabAssistantRole());

                for (UserAccount entAccount : ent.getUserAccountDirectory().getUserAccountList()) {
                    System.out.println(entAccount);

                }

                AccessApprovalRequest request = new AccessApprovalRequest();
                request.setRole(roleSelect.toString());
                request.setSender(ua);
                request.setStatus("Pending");
                for (UserAccount u : ent.getUserAccountDirectory().getUserAccountList()) {
                    if (u.getUsername().equalsIgnoreCase(ent.getName())) {
                        System.out.println(u.getUsername() + " " + u.getRole());
                        u.getWorkQueue().getWorkRequestList().add(request);
                    }

                }

            }

            JOptionPane.showMessageDialog(null, "Request successfully sent to provider \n Your status is Pending");
            RegisterationSelectionJPanel origin = new RegisterationSelectionJPanel(userProcessContainer, system, role);
            userProcessContainer.add("Original Panel", origin);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void txtfieldRetypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfieldRetypeKeyTyped
        // TODO add your handling code here:
        checkForButtonVisibility();
        String check = "" + evt.getKeyChar();
        String compare = txtfieldRetype.getText();
        if (!check.isEmpty()) {
            compare += check;
        }
        if (pwsTxt.getText().equals(compare)
                && userNameMsg2.getText().equals("Available")) {
            registerBtn.setEnabled(true);
            txtfieldRetype.setBackground(Color.white);
        } else {
            registerBtn.setEnabled(false);
            txtfieldRetype.setBackground(Color.red);
        }


    }//GEN-LAST:event_txtfieldRetypeKeyTyped

    private void userNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameTxtKeyReleased
        // TODO add your handling code here:
        userNameMsg1.setText("");
        userNameMsg2.setText("");
        for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getUsername().equalsIgnoreCase(userNameTxt.getText())) {
                System.out.println(ua.getUsername());
                userNameMsg1.setText("Username is not available");
                userNameMsg2.setText("");
            } else {
                userNameMsg1.setText("");
                userNameMsg2.setText("Available");
            }
        }
    }//GEN-LAST:event_userNameTxtKeyReleased
    public boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$");
        Matcher m = p.matcher(pwsTxt.getText());
        boolean b = m.matches();
        if (b == true) {
            System.out.println("There is special character in my string");
            return false;
        } else {
            System.out.println("There is no speacial character");
            return true;
        }

    }

    public void checkForButtonVisibility() {
        if (!userNameTxt.getText().isEmpty()
                && !pwsTxt.getText().isEmpty()
                && !txtfieldRetype.getText().isEmpty()) {
            registerBtn.setEnabled(true);
        } else {
            registerBtn.setEnabled(false);
        }

    }

    private void initialize() {
        checkForButtonVisibility();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel msgTxt;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField pwsTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField textFieldLname;
    private javax.swing.JTextField textFieldept;
    private javax.swing.JTextField txtFieldSSN;
    private javax.swing.JTextField txtFiledFname;
    private javax.swing.JPasswordField txtfieldRetype;
    private javax.swing.JLabel userNameMsg1;
    private javax.swing.JLabel userNameMsg2;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
