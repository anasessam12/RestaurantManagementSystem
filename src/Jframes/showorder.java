package Jframes;

import Classes.Order;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class showorder extends javax.swing.JFrame {

    
    public showorder() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        show_offer_panal = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        order_data_table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        order_table = new javax.swing.JTable();
        show_order = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(810, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_offer_panal.setPreferredSize(new java.awt.Dimension(800, 480));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });

        order_data_table.setBackground(new java.awt.Color(255, 255, 255));
        order_data_table.setPreferredSize(new java.awt.Dimension(748, 140));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        order_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Quantity", "Total Billing", "Customer ID", "Employee ID", "Meal ID"
            }
        ));
        order_table.setRowHeight(25);
        order_table.setSelectionBackground(new java.awt.Color(201, 201, 201));
        jScrollPane1.setViewportView(order_table);

        javax.swing.GroupLayout order_data_tableLayout = new javax.swing.GroupLayout(order_data_table);
        order_data_table.setLayout(order_data_tableLayout);
        order_data_tableLayout.setHorizontalGroup(
            order_data_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, order_data_tableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        order_data_tableLayout.setVerticalGroup(
            order_data_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
        );

        show_order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Showorders.png"))); // NOI18N
        show_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_orderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                show_orderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                show_orderMouseExited(evt);
            }
        });

        javax.swing.GroupLayout show_offer_panalLayout = new javax.swing.GroupLayout(show_offer_panal);
        show_offer_panal.setLayout(show_offer_panalLayout);
        show_offer_panalLayout.setHorizontalGroup(
            show_offer_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_offer_panalLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(show_offer_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(show_offer_panalLayout.createSequentialGroup()
                        .addComponent(order_data_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(show_offer_panalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(show_order)
                        .addGap(15, 15, 15))))
            .addGroup(show_offer_panalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        show_offer_panalLayout.setVerticalGroup(
            show_offer_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_offer_panalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(9, 9, 9)
                .addComponent(show_order)
                .addGap(14, 14, 14)
                .addComponent(order_data_table, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(show_offer_panal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_orderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_orderMouseEntered
        
        show_order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Showorders[Hover].png"))); 
    }//GEN-LAST:event_show_orderMouseEntered

    private void show_orderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_orderMouseExited
        
        show_order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Showorders.png"))); 
    }//GEN-LAST:event_show_orderMouseExited

    private void show_orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_orderMouseClicked
        
        Order Order_object = new Order();
        try 
        {
            Order_object.showOrder(order_table);
        } 
        catch (SQLException SQL_exception) 
        {
            Logger.getLogger(showorder.class.getName()).log(Level.SEVERE, null, SQL_exception);
        }
    }//GEN-LAST:event_show_orderMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       
        this.toBack();
        setVisible(false);
        new Employeeframe().toFront();
        new Employeeframe().setState(Frame.NORMAL);
        new Employeeframe().setVisible(true);
        dispose() ;
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Back[Hover].png"))); 
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        // TODO add your handling code here:
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Back.png"))); 
    }//GEN-LAST:event_backMouseExited
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(showorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showorder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel order_data_table;
    private javax.swing.JTable order_table;
    private javax.swing.JPanel show_offer_panal;
    private javax.swing.JLabel show_order;
    // End of variables declaration//GEN-END:variables
}
