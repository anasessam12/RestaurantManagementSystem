
package Jframes;

import Classes.Admin;
import Classes.Employee;
import Repositories.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    private void clear_deta() {
        Id.setText(null);
        Password.setText(null);
    }

    int roleID;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        AdminButton = new javax.swing.JRadioButton();
        EmployeeButton = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        LogInButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 430));

        jPanel7.setPreferredSize(new java.awt.Dimension(400, 100));

        Welcome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Welcome.setText("Welcome SE project");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(Welcome)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Welcome)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7);

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 150));

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel5.setRequestFocusEnabled(false);
        jPanel5.setLayout(new java.awt.BorderLayout(4, 4));

        Id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Id.setPreferredSize(new java.awt.Dimension(64, 30));
        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });
        jPanel5.add(Id, java.awt.BorderLayout.PAGE_END);

        jLabel2.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        jLabel2.setText("ID ");
        jPanel5.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setLayout(new java.awt.BorderLayout(4, 4));

        jLabel3.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        jLabel3.setText("Password ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel3, java.awt.BorderLayout.CENTER);

        Password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Password.setPreferredSize(new java.awt.Dimension(90, 30));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel6.add(Password, java.awt.BorderLayout.PAGE_END);

        jPanel4.add(jPanel6);

        jPanel8.setPreferredSize(new java.awt.Dimension(300, 20));
        jPanel8.setLayout(new java.awt.BorderLayout(3, 0));

        buttonGroup1.add(AdminButton);
        AdminButton.setText("Admin ");
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });
        jPanel8.add(AdminButton, java.awt.BorderLayout.CENTER);

        buttonGroup1.add(EmployeeButton);
        EmployeeButton.setText("Employee");
        EmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeButtonActionPerformed(evt);
            }
        });
        jPanel8.add(EmployeeButton, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel8);

        jPanel2.add(jPanel4);

        jPanel9.setPreferredSize(new java.awt.Dimension(400, 100));

        LogInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        LogInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogInButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogInButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(LogInButton)
                .addGap(108, 108, 108))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(LogInButton)
                .addGap(15, 15, 15))
        );

        jPanel2.add(jPanel9);

        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 450));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/90[Converted].png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addGap(0, 524, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(119, 119, 119))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        roleID = 1;
    }//GEN-LAST:event_AdminButtonActionPerformed

    private void EmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeButtonActionPerformed
        roleID = 2;
    }//GEN-LAST:event_EmployeeButtonActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

    }//GEN-LAST:event_jLabel3MouseClicked

    private void LogInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseEntered
        LogInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button(1).png")));
    }//GEN-LAST:event_LogInButtonMouseEntered

    private void LogInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseExited
        LogInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png")));
    }//GEN-LAST:event_LogInButtonMouseExited

    private void LogInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseClicked
        int loginId = Integer.parseInt(Id.getText());
        String loginPassword = Password.getText();
        switch (roleID) {
            case 1: {
                AdminRepository adminModel = new AdminRepository();
                Admin adminController = new Admin();
                adminModel.setId(loginId);
                adminModel.setPassword(loginPassword);
                adminController.login(adminModel);
                break;
            }
            case 2: {
                EmployeeRepository employeeModel = new EmployeeRepository();
                Employee employeeController = new Employee();
                employeeModel.setId(loginId);
                employeeModel.setPassword(loginPassword);
                employeeController.login(employeeModel);
                break;
            }
        }
        dispose();
        clear_deta();
    }//GEN-LAST:event_LogInButtonMouseClicked

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
    }//GEN-LAST:event_IdActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
    }//GEN-LAST:event_PasswordActionPerformed

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminButton;
    private javax.swing.JRadioButton EmployeeButton;
    private javax.swing.JTextField Id;
    private javax.swing.JLabel LogInButton;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Welcome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
