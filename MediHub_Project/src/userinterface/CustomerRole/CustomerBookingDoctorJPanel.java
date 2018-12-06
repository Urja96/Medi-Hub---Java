/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prabh
 */
public class CustomerBookingDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerBookingDoctorJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    private DefaultTableModel dtm;

    public CustomerBookingDoctorJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateNetwrokComboBox();
        for (Network n : system.getNetworkList()) {
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println(e.getName());
            }
        }
    }

    public void populateNetwrokComboBox() {
        for (Network n : system.getNetworkList()) {
            networkComboBox.addItem(n);
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

        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        scheduleDropDown = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        networkComboBox = new javax.swing.JComboBox();
        enterpriseComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTbl = new javax.swing.JTable();
        bookBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Schedule:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 233, 99, -1));

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 498, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Search Doctor");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 91, -1, -1));

        searchBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 274, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Network:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 194, 99, -1));

        scheduleDropDown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scheduleDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select Schedule>", "Morning", "Afternoon", "Evening" }));
        add(scheduleDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enterprise:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 194, 83, -1));

        networkComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 191, 143, -1));

        enterpriseComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(enterpriseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 191, 148, -1));

        doctorTbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doctorTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor", "Provider", "Location", "Timing", "Book"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doctorTbl);
        if (doctorTbl.getColumnModel().getColumnCount() > 0) {
            doctorTbl.getColumnModel().getColumn(0).setResizable(false);
            doctorTbl.getColumnModel().getColumn(1).setResizable(false);
            doctorTbl.getColumnModel().getColumn(2).setResizable(false);
            doctorTbl.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 320, 604, 142));

        bookBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookBtn.setText("Next>>");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        add(bookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 498, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        populate();
        Enterprise e = (Enterprise) enterpriseComboBox.getSelectedItem();
        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount acc : o.getUserAccountDirectory().getUserAccountList()) {
                System.out.println(acc.getRole());
            }
        }

    }//GEN-LAST:event_searchBtnActionPerformed

    public void populate() {

        dtm = (DefaultTableModel) doctorTbl.getModel();
        dtm.setRowCount(0);

        Enterprise e = (Enterprise) enterpriseComboBox.getSelectedItem();
        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
//            for (UserAccount acc : o.getUserAccountDirectory().getUserAccountList()) {
//                if (acc.getRole().toString().equals("Doctor")) {
//                    Object[] row = new Object[dtm.getColumnCount()];
//                    row[0] = acc;
//                    row[1] = networkComboBox.getSelectedItem();
//                    row[2] = acc.getPassword();
//                    row[3] = acc.getUsername();
//                    row[4] = acc.getStatus();
//                    dtm.addRow(row);
//                }
//            }
            if (o.getType().equals(Organization.Type.Doctor)) {
                for (UserAccount acc : o.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = acc;
                    row[1] = networkComboBox.getSelectedItem();
                    row[2] = acc.getPassword();
                    row[3] = acc.getUsername();
                    row[4] = acc.getStatus();
                    dtm.addRow(row);
                }
            }
        }
    }

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = doctorTbl.getSelectedRow();
//        if (selectRow < 0) {
//            JOptionPane.showMessageDialog(null, "Please select a Flight");
//        } else {
//            Airline airline = (Airline) doctorTbl.getValueAt(selectRow, 0);
//            Flight flight = (Flight) doctorTbl.getValueAt(selectRow, 1);
//            FlightBookJPanel bookFlight = new FlightBookJPanel(rightJPanel, airline, flight);
//            rightJPanel.add("FlightBookJPanel", bookFlight);
//            CardLayout layout = (CardLayout) rightJPanel.getLayout();
//            layout.next(rightJPanel);
//        }
    }//GEN-LAST:event_bookBtnActionPerformed

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        // TODO add your handling code here:
        enterpriseComboBox.removeAllItems();
        Network n = (Network) networkComboBox.getSelectedItem();
//        for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
//            enterpriseComboBox.addItem(e);
//        }
        for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseComboBox.addItem(e);
        }
    }//GEN-LAST:event_networkComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTable doctorTbl;
    private javax.swing.JComboBox enterpriseComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JComboBox scheduleDropDown;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}