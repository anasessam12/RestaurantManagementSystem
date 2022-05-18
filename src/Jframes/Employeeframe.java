
package Jframes;

import java.awt.Frame;
import Classes.*;
import Repositories.*;
import java.util.logging.*;
import java.sql.SQLException;

public class Employeeframe extends javax.swing.JFrame {

    public Employeeframe() {
        initComponents();
    }

    int customerID, userRole, SeleectedRow;

    CustomerRepository customerModel = new CustomerRepository();
    Customer customerController = new Customer();
    OrderRepository orderModel = new OrderRepository();
    Order orderController = new Order();
    EmployeeRepository employeeModel = new EmployeeRepository();
    Employee employeeController = new Employee();
    MealsRepository mealModel = new MealsRepository();
    Meals mealController = new Meals();

    
    
    private void clearAddCustomer() {
        customerAddNameField.setText(null);
        customerAddIdField.setText(null);
    }

    private void clearDeleteCustomer() {
        customerDeleteIdField.setText(null);
    }

    private void clearSearchCustomer() {
        customerSearchField.setText(null);
    }

    private void clearUpdatacustomer() {
        customerUpdateIdField.setText(null);
        customerUpdateNameField.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        offersPanalBotton = new javax.swing.JLabel();
        orderPanalBotton = new javax.swing.JLabel();
        customerPanalBotton = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        backBotton = new javax.swing.JLabel();
        showOfferBotton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        offersTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        employeeIdField = new javax.swing.JTextField();
        customerIdField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mealsTable = new javax.swing.JTable();
        mealIdField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        totalPriceField = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        listMenuBotton = new javax.swing.JLabel();
        listOrdersBotton = new javax.swing.JLabel();
        setOrderBotton = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        customerAddPanalBotton = new javax.swing.JLabel();
        customerListPanalBotton = new javax.swing.JLabel();
        customerSearchPanalBotton = new javax.swing.JLabel();
        cust_manage = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        customerAddBotton = new javax.swing.JLabel();
        customerAddNameField = new javax.swing.JTextField();
        customerAddIdField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        customerDeleteIdField = new javax.swing.JTextField();
        customerDeleteBotton = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        customerToUpdateBotton = new javax.swing.JLabel();
        customerListBotton = new javax.swing.JLabel();
        customerToDeleteBotton = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        customerSerachTable = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        customerSearchField = new javax.swing.JTextField();
        customerSearchBotton = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        customerUpdateIdField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        customerUpdateNameField = new javax.swing.JTextField();
        customerUpdateBotton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        offersPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Offerstap.png"))); // NOI18N
        offersPanalBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                offersPanalBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                offersPanalBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                offersPanalBottonMouseExited(evt);
            }
        });

        orderPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ordartap.png"))); // NOI18N
        orderPanalBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderPanalBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderPanalBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                orderPanalBottonMouseExited(evt);
            }
        });

        customerPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Customertap.png"))); // NOI18N
        customerPanalBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerPanalBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerPanalBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerPanalBottonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(offersPanalBotton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(orderPanalBotton)
                .addGap(180, 180, 180)
                .addComponent(customerPanalBotton)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerPanalBotton)
                    .addComponent(orderPanalBotton)
                    .addComponent(offersPanalBotton))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        backBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Back.png"))); // NOI18N
        backBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBottonMouseExited(evt);
            }
        });

        showOfferBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ShowOffers.png"))); // NOI18N
        showOfferBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showOfferBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showOfferBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showOfferBottonMouseExited(evt);
            }
        });

        jScrollPane1.setBorder(null);

        offersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Offer_ID", "Offer_Details"
            }
        ));
        offersTable.setRowHeight(25);
        offersTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(offersTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backBotton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showOfferBotton)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showOfferBotton)
                    .addComponent(backBotton))
                .addGap(52, 52, 52))
        );

        jTabbedPane1.addTab("tab1", jPanel3);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Employee ID");

        employeeIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIdFieldActionPerformed(evt);
            }
        });

        customerIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Customer ID");

        jScrollPane2.setBorder(null);

        mealsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Available Quantity"
            }
        ));
        mealsTable.setRowHeight(25);
        mealsTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(mealsTable);

        mealIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealIdFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Meal ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Quantity");

        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Total Price");

        totalPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        listMenuBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ShowMenu.png"))); // NOI18N
        listMenuBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMenuBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listMenuBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listMenuBottonMouseExited(evt);
            }
        });

        listOrdersBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Showorders.png"))); // NOI18N
        listOrdersBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listOrdersBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listOrdersBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listOrdersBottonMouseExited(evt);
            }
        });

        setOrderBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SetOrder.png"))); // NOI18N
        setOrderBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setOrderBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setOrderBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setOrderBottonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(351, 351, 351)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(listOrdersBotton)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customerIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(354, 354, 354))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(setOrderBotton)
                                .addGap(50, 50, 50)
                                .addComponent(listMenuBotton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mealIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(employeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(customerIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(216, 216, 216)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(setOrderBotton)
                            .addComponent(listMenuBotton))
                        .addGap(50, 50, 50)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(mealIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(listOrdersBotton)
                                .addGap(17, 17, 17))))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(225, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 0, 760, 50));

        customerAddPanalBotton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        customerAddPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ADD.png"))); // NOI18N
        customerAddPanalBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerAddPanalBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerAddPanalBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerAddPanalBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerAddPanalBottonMouseExited(evt);
            }
        });

        customerListPanalBotton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        customerListPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List.png"))); // NOI18N
        customerListPanalBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerListPanalBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerListPanalBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerListPanalBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerListPanalBottonMouseExited(evt);
            }
        });

        customerSearchPanalBotton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        customerSearchPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
        customerSearchPanalBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerSearchPanalBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerSearchPanalBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerSearchPanalBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerSearchPanalBottonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerSearchPanalBotton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerAddPanalBotton)
                    .addComponent(customerListPanalBotton))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(customerAddPanalBotton)
                .addGap(18, 18, 18)
                .addComponent(customerListPanalBotton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerSearchPanalBotton)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 455));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Customer Name");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Customer ID");

        customerAddBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddBottom.png"))); // NOI18N
        customerAddBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerAddBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerAddBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerAddBottonMouseExited(evt);
            }
        });

        customerAddNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        customerAddIdField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerAddNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customerAddIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(customerAddBotton)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(customerAddNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(customerAddIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(customerAddBotton)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        cust_manage.addTab("tab1", jPanel8);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Customer ID");

        customerDeleteIdField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        customerDeleteBotton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        customerDeleteBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); // NOI18N
        customerDeleteBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerDeleteBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerDeleteBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerDeleteBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerDeleteBottonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel25)
                        .addGap(29, 29, 29)
                        .addComponent(customerDeleteIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(customerDeleteBotton)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(customerDeleteIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(customerDeleteBotton)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        cust_manage.addTab("tab2", jPanel9);

        jScrollPane3.setBorder(null);

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        customerTable.setRowHeight(25);
        customerTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(customerTable);

        customerToUpdateBotton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        customerToUpdateBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); // NOI18N
        customerToUpdateBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerToUpdateBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerToUpdateBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerToUpdateBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerToUpdateBottonMouseExited(evt);
            }
        });

        customerListBotton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        customerListBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ListBottom.png"))); // NOI18N
        customerListBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerListBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerListBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerListBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerListBottonMouseExited(evt);
            }
        });

        customerToDeleteBotton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        customerToDeleteBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); // NOI18N
        customerToDeleteBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerToDeleteBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerToDeleteBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerToDeleteBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerToDeleteBottonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(customerToUpdateBotton)
                        .addGap(132, 132, 132)
                        .addComponent(customerListBotton)
                        .addGap(143, 143, 143)
                        .addComponent(customerToDeleteBotton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerToUpdateBotton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerListBotton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerToDeleteBotton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        cust_manage.addTab("tab3", jPanel10);

        jScrollPane4.setBorder(null);

        customerSerachTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Password"
            }
        ));
        customerSerachTable.setRowHeight(25);
        customerSerachTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane4.setViewportView(customerSerachTable);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Customer ID");

        customerSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSearchFieldActionPerformed(evt);
            }
        });

        customerSearchBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SearchBottom.png"))); // NOI18N
        customerSearchBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerSearchBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerSearchBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerSearchBottonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customerSearchBotton)
                .addGap(200, 200, 200))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customerSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(customerSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerSearchBotton)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        cust_manage.addTab("tab4", jPanel11);

        customerUpdateIdField.setEditable(false);
        customerUpdateIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerUpdateIdFieldActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Customer ID");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Customer Name");

        customerUpdateNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerUpdateNameFieldActionPerformed(evt);
            }
        });

        customerUpdateBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); // NOI18N
        customerUpdateBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerUpdateBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerUpdateBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerUpdateBottonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(41, 41, 41)
                                .addComponent(customerUpdateIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customerUpdateNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(customerUpdateBotton)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customerUpdateIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(customerUpdateNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(customerUpdateBotton)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        cust_manage.addTab("tab5", jPanel12);

        jPanel5.add(cust_manage, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 9, 710, 430));

        jTabbedPane1.addTab("tab3", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 35, 830, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void offersPanalBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offersPanalBottonMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_offersPanalBottonMouseClicked

    private void orderPanalBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderPanalBottonMouseClicked
         jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_orderPanalBottonMouseClicked

    private void customerPanalBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerPanalBottonMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_customerPanalBottonMouseClicked

    private void offersPanalBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offersPanalBottonMouseEntered
        offersPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Offerstep[Hover].png"))); 
    }//GEN-LAST:event_offersPanalBottonMouseEntered

    private void offersPanalBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offersPanalBottonMouseExited
        offersPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Offerstap.png"))); 
    }//GEN-LAST:event_offersPanalBottonMouseExited

    private void orderPanalBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderPanalBottonMouseEntered
        orderPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ordartap[Hover].png"))); 
    }//GEN-LAST:event_orderPanalBottonMouseEntered

    private void orderPanalBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderPanalBottonMouseExited
        orderPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ordartap.png"))); 
    }//GEN-LAST:event_orderPanalBottonMouseExited

    private void customerPanalBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerPanalBottonMouseEntered
        customerPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Customertap[Hover].png"))); 
    }//GEN-LAST:event_customerPanalBottonMouseEntered

    private void customerPanalBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerPanalBottonMouseExited
        customerPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Customertap.png"))); 
    }//GEN-LAST:event_customerPanalBottonMouseExited

    private void showOfferBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showOfferBottonMouseEntered
        showOfferBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ShowOffers[Hover].png"))); 
    }//GEN-LAST:event_showOfferBottonMouseEntered

    private void showOfferBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showOfferBottonMouseExited
        showOfferBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ShowOffers.png"))); 
    }//GEN-LAST:event_showOfferBottonMouseExited

    private void backBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBottonMouseEntered
        backBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Back[Hover].png"))); 
    }//GEN-LAST:event_backBottonMouseEntered

    private void backBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBottonMouseExited
        backBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Back.png"))); 
    }//GEN-LAST:event_backBottonMouseExited

    private void employeeIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIdFieldActionPerformed
        
    }//GEN-LAST:event_employeeIdFieldActionPerformed

    private void customerIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdFieldActionPerformed
        
    }//GEN-LAST:event_customerIdFieldActionPerformed

    private void mealIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealIdFieldActionPerformed
        
    }//GEN-LAST:event_mealIdFieldActionPerformed

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void totalPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceFieldActionPerformed
        
    }//GEN-LAST:event_totalPriceFieldActionPerformed

    private void listOrdersBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listOrdersBottonMouseEntered
        listOrdersBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Showorders[Hover].png"))); 
    }//GEN-LAST:event_listOrdersBottonMouseEntered

    private void listOrdersBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listOrdersBottonMouseExited
        listOrdersBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Showorders.png"))); 
    }//GEN-LAST:event_listOrdersBottonMouseExited

    private void listMenuBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMenuBottonMouseEntered
        listMenuBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ShowMenu[Hover].png"))); 
    }//GEN-LAST:event_listMenuBottonMouseEntered

    private void listMenuBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMenuBottonMouseExited
        listMenuBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ShowMenu.png"))); 
    }//GEN-LAST:event_listMenuBottonMouseExited

    private void customerAddPanalBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerAddPanalBottonMouseEntered
        customerAddPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ADD[Hover].png"))); 
    }//GEN-LAST:event_customerAddPanalBottonMouseEntered

    private void customerAddPanalBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerAddPanalBottonMouseExited
        customerAddPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ADD.png"))); 
    }//GEN-LAST:event_customerAddPanalBottonMouseExited

    private void customerListPanalBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerListPanalBottonMouseEntered
        customerListPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List[Hover].png"))); 
    }//GEN-LAST:event_customerListPanalBottonMouseEntered

    private void customerListPanalBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerListPanalBottonMouseExited
        customerListPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List.png"))); 
    }//GEN-LAST:event_customerListPanalBottonMouseExited

    private void customerSearchPanalBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerSearchPanalBottonMouseEntered
        customerSearchPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search[Hover].png"))); 
    }//GEN-LAST:event_customerSearchPanalBottonMouseEntered

    private void customerSearchPanalBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerSearchPanalBottonMouseExited
        customerSearchPanalBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); 
    }//GEN-LAST:event_customerSearchPanalBottonMouseExited

    private void customerAddPanalBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerAddPanalBottonMouseClicked
        cust_manage.setSelectedIndex(0);
    }//GEN-LAST:event_customerAddPanalBottonMouseClicked

    private void customerListPanalBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerListPanalBottonMouseClicked
        cust_manage.setSelectedIndex(2);
    }//GEN-LAST:event_customerListPanalBottonMouseClicked

    private void customerSearchPanalBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerSearchPanalBottonMouseClicked
        cust_manage.setSelectedIndex(3);
    }//GEN-LAST:event_customerSearchPanalBottonMouseClicked

    private void customerAddBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerAddBottonMouseEntered
        customerAddBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddBottom[Hover].png"))); 
    }//GEN-LAST:event_customerAddBottonMouseEntered

    private void customerAddBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerAddBottonMouseExited
        customerAddBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddBottom.png"))); 
    }//GEN-LAST:event_customerAddBottonMouseExited

    private void customerDeleteBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDeleteBottonMouseClicked
        customerModel.setId(customerID);
        customerController.DeleteACustomer(customerModel);
        cust_manage.setSelectedIndex(2);
        customerController.ListCustomers(customerTable);
        clearDeleteCustomer();
    }//GEN-LAST:event_customerDeleteBottonMouseClicked

    private void customerDeleteBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDeleteBottonMouseEntered
        customerDeleteBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom[Hover].png"))); 
    }//GEN-LAST:event_customerDeleteBottonMouseEntered

    private void customerDeleteBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDeleteBottonMouseExited
        customerDeleteBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); 
    }//GEN-LAST:event_customerDeleteBottonMouseExited

    private void customerToUpdateBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerToUpdateBottonMouseClicked
        cust_manage.setSelectedIndex(4);
        SeleectedRow = customerTable.getSelectedRow();
        customerID = Integer.parseInt((String) customerTable.getValueAt(SeleectedRow, 0));
        customerModel.setId(customerID);
        customerController.SendCustomer(customerModel, customerUpdateNameField, customerUpdateIdField);
    }//GEN-LAST:event_customerToUpdateBottonMouseClicked

    private void customerToUpdateBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerToUpdateBottonMouseEntered
        customerToUpdateBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom[Hover].png"))); 
    }//GEN-LAST:event_customerToUpdateBottonMouseEntered

    private void customerToUpdateBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerToUpdateBottonMouseExited
        customerToUpdateBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); 
    }//GEN-LAST:event_customerToUpdateBottonMouseExited

    private void customerListBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerListBottonMouseClicked
        customerController.ListCustomers(customerTable);
    }//GEN-LAST:event_customerListBottonMouseClicked

    private void customerListBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerListBottonMouseEntered
        customerListBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ListBottom[Hover].png"))); 
    }//GEN-LAST:event_customerListBottonMouseEntered

    private void customerListBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerListBottonMouseExited
        customerListBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ListBottom.png"))); 
    }//GEN-LAST:event_customerListBottonMouseExited

    private void customerToDeleteBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerToDeleteBottonMouseClicked
        cust_manage.setSelectedIndex(1);
        SeleectedRow = customerTable.getSelectedRow();
        customerID = Integer.parseInt((String) customerTable.getValueAt(SeleectedRow, 0));
        customerDeleteIdField.setText("" + customerID);
    }//GEN-LAST:event_customerToDeleteBottonMouseClicked

    private void customerToDeleteBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerToDeleteBottonMouseEntered
        customerToDeleteBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom[Hover].png"))); 
    }//GEN-LAST:event_customerToDeleteBottonMouseEntered

    private void customerToDeleteBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerToDeleteBottonMouseExited
        customerToDeleteBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); 
    }//GEN-LAST:event_customerToDeleteBottonMouseExited

    private void customerSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerSearchFieldActionPerformed
        
    }//GEN-LAST:event_customerSearchFieldActionPerformed

    private void customerSearchBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerSearchBottonMouseClicked
        customerID = Integer.parseInt(customerSearchField.getText());
        customerModel.setId(customerID);
        customerController.SearchForCustomer(customerSerachTable, customerModel);
        clearSearchCustomer();
    }//GEN-LAST:event_customerSearchBottonMouseClicked

    private void customerSearchBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerSearchBottonMouseEntered
        customerSearchBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SearchBottom[Hover].png"))); 
    }//GEN-LAST:event_customerSearchBottonMouseEntered

    private void customerSearchBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerSearchBottonMouseExited
        customerSearchBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SearchBottom.png"))); 
    }//GEN-LAST:event_customerSearchBottonMouseExited

    private void customerUpdateIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerUpdateIdFieldActionPerformed
        
    }//GEN-LAST:event_customerUpdateIdFieldActionPerformed

    private void customerUpdateNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerUpdateNameFieldActionPerformed
        
    }//GEN-LAST:event_customerUpdateNameFieldActionPerformed

    private void customerUpdateBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerUpdateBottonMouseClicked
        String name = customerUpdateNameField.getText();
        customerModel.setId(customerID);
        customerModel.setName(name);
        customerController.UpdateCustomer(customerModel);
        cust_manage.setSelectedIndex(2);
        customerController.ListCustomers(customerTable);
        clearUpdatacustomer();

    }//GEN-LAST:event_customerUpdateBottonMouseClicked

    private void customerUpdateBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerUpdateBottonMouseEntered
        
        customerUpdateBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom[Hover].png"))); 
    }//GEN-LAST:event_customerUpdateBottonMouseEntered

    private void customerUpdateBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerUpdateBottonMouseExited
        
        customerUpdateBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); 
    }//GEN-LAST:event_customerUpdateBottonMouseExited

    private void backBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBottonMouseClicked
        
        this.toBack();
        setVisible(false);
        new Login().toFront();
        new Login().setState(Frame.NORMAL);
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_backBottonMouseClicked

    private void showOfferBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showOfferBottonMouseClicked
        Offer offerContoller = new Offer();
        offerContoller.showoffer(offersTable);
    }//GEN-LAST:event_showOfferBottonMouseClicked

    private void setOrderBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setOrderBottonMouseEntered
        
        setOrderBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SetOrder[Hover].png"))); 
    }//GEN-LAST:event_setOrderBottonMouseEntered

    private void setOrderBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setOrderBottonMouseExited
        setOrderBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SetOrder.png"))); 
    }//GEN-LAST:event_setOrderBottonMouseExited

    private void listMenuBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMenuBottonMouseClicked
        Meals mealsController = new Meals();
        try {
            mealsController.listMeals(mealsTable);
        } catch (SQLException ex) {
            Logger.getLogger(Employeeframe.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_listMenuBottonMouseClicked

    private void setOrderBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setOrderBottonMouseClicked
        int mealID = Integer.parseInt(mealIdField.getText());
        int requiredQuantity = Integer.parseInt(quantityField.getText());
        int employeeID = Integer.parseInt(employeeIdField.getText());
        int customerID = Integer.parseInt(customerIdField.getText());  
        BillingRepository billingModel = new BillingRepository();
        Billing billingController = new Billing();  
        orderModel.setQuantity(requiredQuantity);
        employeeModel.setId(employeeID);
        mealModel.setMealId(mealID);
        customerModel.setId(customerID);       
        totalPriceField.setText("" + billingController.totalPrice(mealModel, orderModel, billingModel));
        orderController.setOrder(orderModel, employeeModel, mealModel, customerModel, billingModel);
    }//GEN-LAST:event_setOrderBottonMouseClicked

    private void listOrdersBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listOrdersBottonMouseClicked
        dispose();
        new showorder().setVisible(true);
    }//GEN-LAST:event_listOrdersBottonMouseClicked

    private void customerAddBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerAddBottonMouseClicked
        customerID = Integer.parseInt(customerAddIdField.getText());
        String name = customerAddNameField.getText();
        customerModel.setId(customerID);
        customerModel.setName(name);
        customerController.AddCustomer(customerModel);
        cust_manage.setSelectedIndex(2);
        customerController.ListCustomers(customerTable);
        clearAddCustomer();
    }//GEN-LAST:event_customerAddBottonMouseClicked

    
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
            java.util.logging.Logger.getLogger(Employeeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employeeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employeeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employeeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employeeframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBotton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTabbedPane cust_manage;
    private javax.swing.JLabel customerAddBotton;
    private javax.swing.JTextField customerAddIdField;
    private javax.swing.JTextField customerAddNameField;
    private javax.swing.JLabel customerAddPanalBotton;
    private javax.swing.JLabel customerDeleteBotton;
    private javax.swing.JTextField customerDeleteIdField;
    private javax.swing.JTextField customerIdField;
    private javax.swing.JLabel customerListBotton;
    private javax.swing.JLabel customerListPanalBotton;
    private javax.swing.JLabel customerPanalBotton;
    private javax.swing.JLabel customerSearchBotton;
    private javax.swing.JTextField customerSearchField;
    private javax.swing.JLabel customerSearchPanalBotton;
    private javax.swing.JTable customerSerachTable;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel customerToDeleteBotton;
    private javax.swing.JLabel customerToUpdateBotton;
    private javax.swing.JLabel customerUpdateBotton;
    private javax.swing.JTextField customerUpdateIdField;
    private javax.swing.JTextField customerUpdateNameField;
    private javax.swing.JTextField employeeIdField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel listMenuBotton;
    private javax.swing.JLabel listOrdersBotton;
    private javax.swing.JTextField mealIdField;
    private javax.swing.JTable mealsTable;
    private javax.swing.JLabel offersPanalBotton;
    private javax.swing.JTable offersTable;
    private javax.swing.JLabel orderPanalBotton;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel setOrderBotton;
    private javax.swing.JLabel showOfferBotton;
    private javax.swing.JTextField totalPriceField;
    // End of variables declaration//GEN-END:variables
}
