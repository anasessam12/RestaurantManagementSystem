
package Jframes;
import Classes.*;
import Repositories.*;
import java.awt.Frame;
import java.sql.*;
import java.util.logging.*;


public class adminframe extends javax.swing.JFrame {

    public adminframe() {
        initComponents();
    }

    int ID, selectedRow;
    EmployeeRepository employeeModel = new EmployeeRepository();
    Employee employeeController = new Employee();
    MealsRepository mealModel = new MealsRepository();
    Meals mealController = new Meals();
    AdminRepository adminModel = new AdminRepository();
    Admin adminController = new Admin();
    OfferRepository offerModel = new OfferRepository();
    int roleID;

    private void clear_data() {
        emp_id.setText(null);
        emp_name.setText(null);
        emp_pass.setText(null);

    }

    private void clear_delete() {
        id_delete.setText(null);
    }

    private void clear_search() {
        search_idemp.setText(null);
    }

    private void clear_update() {
        e_id.setText(null);
        e_name.setText(null);
        e_pass.setText(null);
    }

    private void clear_addMeal() {
        description.setText(null);
        meal_name.setText(null);
        meal_price.setText(null);
        meal_quan.setText(null);
        a_id.setText(null);

    }

    private void clear_deleteMeal() {
        id_delete1.setText(null);
    }

    private void clear_searchMeal() {
        search_id1.setText(null);
    }

    private void clear_updataMeal() {
        m_id.setText(null);
        m_name.setText(null);
        m_price.setText(null);
        m_quan.setText(null);

    }

    private void clear_offer() {
        ofID.setText(null);
        offerDetalis.setText(null);
        admID.setText(null);
    }

    private void clear_report() {
        id2.setText(null);
        description.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        admin = new javax.swing.JTabbedPane();
        employee = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        emp_mange = new javax.swing.JTabbedPane();
        add_emp = new javax.swing.JPanel();
        emp_add = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        emp_name = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        emp_id = new javax.swing.JTextField();
        emp_pass = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        delete_emp = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        id_delete = new javax.swing.JTextField();
        delete = new javax.swing.JLabel();
        list_emp = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        emp_table = new javax.swing.JTable();
        updateButton = new javax.swing.JLabel();
        listButton = new javax.swing.JLabel();
        deleteButton = new javax.swing.JLabel();
        search_cust1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        search_emp = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        search_idemp = new javax.swing.JTextField();
        searchEmployee = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        e_id = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        e_name = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        updateEmployee = new javax.swing.JLabel();
        e_pass = new javax.swing.JPasswordField();
        Meal = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        meals = new javax.swing.JTabbedPane();
        add_emp1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cust_add = new javax.swing.JLabel();
        meal_id = new javax.swing.JTextField();
        a_id = new javax.swing.JTextField();
        meal_name = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        meal_price = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        meal_quan = new javax.swing.JTextField();
        delete_cust2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        id_delete1 = new javax.swing.JTextField();
        delete_meal = new javax.swing.JLabel();
        list_cust2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        meal_table2 = new javax.swing.JTable();
        butupdate = new javax.swing.JLabel();
        butllist = new javax.swing.JLabel();
        butdelete = new javax.swing.JLabel();
        search_cust2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        search_table1 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        search_id1 = new javax.swing.JTextField();
        search = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        m_id = new javax.swing.JTextField();
        m_name = new javax.swing.JTextField();
        m_price = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        m_quan = new javax.swing.JTextField();
        offer = new javax.swing.JPanel();
        add_offer = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        offerDetalis = new javax.swing.JTextField();
        admID = new javax.swing.JTextField();
        ofID = new javax.swing.JTextField();
        Report1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        description = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id2 = new javax.swing.JTextField();
        reportButton = new javax.swing.JLabel();
        custRadio = new javax.swing.JRadioButton();
        empRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Employee.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Meals.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Offer.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Report.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(106, 106, 106)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(114, 114, 114)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        employee.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 0, -1, 60));

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ADD.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Backbtn.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(back))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel27))))))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addGap(87, 87, 87)
                .addComponent(back)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        employee.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 455));

        emp_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddBottom.png"))); // NOI18N
        emp_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emp_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emp_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emp_addMouseExited(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Employee Name");

        emp_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel45.setText("Employee ID");

        emp_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        emp_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setText("Employee Password");

        javax.swing.GroupLayout add_empLayout = new javax.swing.GroupLayout(add_emp);
        add_emp.setLayout(add_empLayout);
        add_empLayout.setHorizontalGroup(
            add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_empLayout.createSequentialGroup()
                .addGroup(add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_empLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel45)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emp_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(add_empLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(emp_add)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        add_empLayout.setVerticalGroup(
            add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_empLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(emp_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(emp_add)
                .addGap(126, 126, 126))
        );

        emp_mange.addTab("tab1", add_emp);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Employee ID");

        id_delete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        delete.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); // NOI18N
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout delete_empLayout = new javax.swing.GroupLayout(delete_emp);
        delete_emp.setLayout(delete_empLayout);
        delete_empLayout.setHorizontalGroup(
            delete_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_empLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(delete_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delete_empLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(29, 29, 29)
                        .addComponent(id_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(delete_empLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(delete)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        delete_empLayout.setVerticalGroup(
            delete_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_empLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(delete_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(id_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(delete)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        emp_mange.addTab("tab2", delete_emp);

        jScrollPane5.setBorder(null);

        emp_table.setModel(new javax.swing.table.DefaultTableModel(
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
        emp_table.setRowHeight(25);
        emp_table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane5.setViewportView(emp_table);

        updateButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); // NOI18N
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButtonMouseExited(evt);
            }
        });

        listButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        listButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ListBottom.png"))); // NOI18N
        listButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listButtonMouseExited(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); // NOI18N
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout list_empLayout = new javax.swing.GroupLayout(list_emp);
        list_emp.setLayout(list_empLayout);
        list_empLayout.setHorizontalGroup(
            list_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list_empLayout.createSequentialGroup()
                .addGroup(list_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(list_empLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(updateButton)
                        .addGap(132, 132, 132)
                        .addComponent(listButton)
                        .addGap(143, 143, 143)
                        .addComponent(deleteButton))
                    .addGroup(list_empLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        list_empLayout.setVerticalGroup(
            list_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list_empLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(list_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        emp_mange.addTab("tab3", list_emp);

        jScrollPane6.setBorder(null);

        search_emp.setModel(new javax.swing.table.DefaultTableModel(
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
        search_emp.setRowHeight(25);
        search_emp.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane6.setViewportView(search_emp);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setText("Employee ID");

        search_idemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_idempActionPerformed(evt);
            }
        });

        searchEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SearchBottom.png"))); // NOI18N
        searchEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchEmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchEmployeeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout search_cust1Layout = new javax.swing.GroupLayout(search_cust1);
        search_cust1.setLayout(search_cust1Layout);
        search_cust1Layout.setHorizontalGroup(
            search_cust1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_cust1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(search_cust1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(search_cust1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_idemp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, search_cust1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchEmployee)
                .addGap(200, 200, 200))
        );
        search_cust1Layout.setVerticalGroup(
            search_cust1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_cust1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(search_cust1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(search_idemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchEmployee)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        emp_mange.addTab("tab4", search_cust1);

        e_id.setEditable(false);
        e_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_idActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setText("Employee ID");

        e_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_nameActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setText("Employee Name");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setText("Employee Password");

        updateEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); // NOI18N
        updateEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateEmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateEmployeeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(updateEmployee)
                .addContainerGap(334, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(e_id, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(e_name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e_pass)))
                .addGap(334, 334, 334))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(e_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(e_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(e_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(updateEmployee)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        emp_mange.addTab("tab5", jPanel21);

        employee.add(emp_mange, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 19, 710, 420));

        admin.addTab("tab3", employee);

        Meal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        Meal.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 0, -1, 60));

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ADD.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        Meal.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 455));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Meal Name");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Meal ID");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Meal Price");

        cust_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddBottom.png"))); // NOI18N
        cust_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cust_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cust_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cust_addMouseExited(evt);
            }
        });

        meal_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        a_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        meal_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Admin ID");

        meal_price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setText("Quantity");

        meal_quan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout add_emp1Layout = new javax.swing.GroupLayout(add_emp1);
        add_emp1.setLayout(add_emp1Layout);
        add_emp1Layout.setHorizontalGroup(
            add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_emp1Layout.createSequentialGroup()
                .addGroup(add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(add_emp1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, add_emp1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(meal_id, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, add_emp1Layout.createSequentialGroup()
                                .addGroup(add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meal_quan, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(meal_name, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(meal_price, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, add_emp1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(a_id, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cust_add)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        add_emp1Layout.setVerticalGroup(
            add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_emp1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meal_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meal_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(20, 20, 20)
                .addGroup(add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meal_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(meal_quan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cust_add)
                    .addGroup(add_emp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(a_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        meals.addTab("tab1", add_emp1);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Meal ID");

        id_delete1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        delete_meal.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        delete_meal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); // NOI18N
        delete_meal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_meal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_mealMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_mealMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_mealMouseExited(evt);
            }
        });

        javax.swing.GroupLayout delete_cust2Layout = new javax.swing.GroupLayout(delete_cust2);
        delete_cust2.setLayout(delete_cust2Layout);
        delete_cust2Layout.setHorizontalGroup(
            delete_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_cust2Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(delete_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delete_cust2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(29, 29, 29)
                        .addComponent(id_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(delete_cust2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(delete_meal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        delete_cust2Layout.setVerticalGroup(
            delete_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_cust2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(delete_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(id_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(delete_meal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        meals.addTab("tab2", delete_cust2);

        jScrollPane3.setBorder(null);

        meal_table2.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Name", "Price", "Quantity"
            }
        ));
        meal_table2.setRowHeight(25);
        meal_table2.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(meal_table2);

        butupdate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        butupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); // NOI18N
        butupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butupdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butupdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butupdateMouseExited(evt);
            }
        });

        butllist.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        butllist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ListBottom.png"))); // NOI18N
        butllist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butllist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butllistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butllistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butllistMouseExited(evt);
            }
        });

        butdelete.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        butdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); // NOI18N
        butdelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butdeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butdeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butdeleteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout list_cust2Layout = new javax.swing.GroupLayout(list_cust2);
        list_cust2.setLayout(list_cust2Layout);
        list_cust2Layout.setHorizontalGroup(
            list_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list_cust2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(list_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(list_cust2Layout.createSequentialGroup()
                        .addComponent(butupdate)
                        .addGap(132, 132, 132)
                        .addComponent(butllist)
                        .addGap(143, 143, 143)
                        .addComponent(butdelete)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        list_cust2Layout.setVerticalGroup(
            list_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list_cust2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(list_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butupdate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(butllist, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(butdelete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        meals.addTab("tab3", list_cust2);

        jScrollPane4.setBorder(null);

        search_table1.setModel(new javax.swing.table.DefaultTableModel(
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
        search_table1.setRowHeight(25);
        search_table1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane4.setViewportView(search_table1);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Meal ID");

        search_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_id1ActionPerformed(evt);
            }
        });

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SearchBottom.png"))); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout search_cust2Layout = new javax.swing.GroupLayout(search_cust2);
        search_cust2.setLayout(search_cust2Layout);
        search_cust2Layout.setHorizontalGroup(
            search_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_cust2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(search_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(search_cust2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, search_cust2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search)
                .addGap(200, 200, 200))
        );
        search_cust2Layout.setVerticalGroup(
            search_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_cust2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(search_cust2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(search_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        meals.addTab("tab4", search_cust2);

        m_id.setEditable(false);
        m_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_idActionPerformed(evt);
            }
        });

        m_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_nameActionPerformed(evt);
            }
        });

        m_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_priceActionPerformed(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel35MouseExited(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText("Meal ID");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setText("Meal Name");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setText("Meal Price");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setText("Quantity");

        m_quan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_quanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(m_name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m_price, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m_quan, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel35)))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(m_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(m_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(m_quan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(112, 112, 112))
        );

        meals.addTab("tab5", jPanel12);

        Meal.add(meals, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 19, 710, 420));

        admin.addTab("tab3", Meal);

        add_offer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddOffer.png"))); // NOI18N
        add_offer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_offerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_offerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_offerMouseExited(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel49.setText("Offer Details");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel50.setText("Admin ID");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setText("Offer ID");

        offerDetalis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offerDetalisActionPerformed(evt);
            }
        });

        admID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admIDActionPerformed(evt);
            }
        });

        ofID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ofIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout offerLayout = new javax.swing.GroupLayout(offer);
        offer.setLayout(offerLayout);
        offerLayout.setHorizontalGroup(
            offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offerLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(offerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel51)
                        .addGap(39, 39, 39)
                        .addComponent(ofID, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(offerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel49)
                        .addGap(18, 18, 18)
                        .addComponent(offerDetalis, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(offerLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(18, 18, 18)
                        .addComponent(admID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(add_offer)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        offerLayout.setVerticalGroup(
            offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offerLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(ofID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(offerDetalis, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(offerLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel49)))
                .addGroup(offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(offerLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(admID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(offerLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(add_offer)))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        admin.addTab("tab1", offer);

        jScrollPane2.setBorder(null);

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Name", "Password / Type", "Description"
            }
        ));
        reportTable.setRowHeight(25);
        reportTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(reportTable);

        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Description");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("ID");

        id2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id2ActionPerformed(evt);
            }
        });

        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Reportbtn.png"))); // NOI18N
        reportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportButtonMouseExited(evt);
            }
        });

        buttonGroup2.add(custRadio);
        custRadio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custRadio.setText("Customer ");
        custRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custRadioActionPerformed(evt);
            }
        });

        buttonGroup2.add(empRadio);
        empRadio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        empRadio.setText("Employee");
        empRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Report1Layout = new javax.swing.GroupLayout(Report1);
        Report1.setLayout(Report1Layout);
        Report1Layout.setHorizontalGroup(
            Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Report1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(empRadio)
                .addGap(144, 144, 144)
                .addComponent(custRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Report1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Report1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Report1Layout.createSequentialGroup()
                        .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Report1Layout.createSequentialGroup()
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reportButton)
                        .addGap(81, 81, 81))))
        );
        Report1Layout.setVerticalGroup(
            Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Report1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custRadio)
                    .addComponent(empRadio))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Report1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10))
                    .addComponent(reportButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(description, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        admin.addTab("tab2", Report1);

        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 35, 830, 470));

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        admin.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        admin.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        admin.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Employee[Hover].png"))); // NOI18N
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Employee.png"))); // NOI18N
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Meals[Hover].png"))); // NOI18N
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Meals.png"))); // NOI18N
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Offer[Hover].png"))); // NOI18N
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Offer.png"))); // NOI18N
    }//GEN-LAST:event_jLabel3MouseExited

    private void add_offerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_offerMouseEntered
        
        add_offer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddOffer[Hover].png"))); // NOI18N
    }//GEN-LAST:event_add_offerMouseEntered

    private void add_offerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_offerMouseExited
        
        add_offer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddOffer.png"))); // NOI18N
    }//GEN-LAST:event_add_offerMouseExited

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        
    }//GEN-LAST:event_descriptionActionPerformed

    private void id2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id2ActionPerformed
        
    }//GEN-LAST:event_id2ActionPerformed

    private void reportButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseEntered
        
        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Reportbtn[Hover].png"))); // NOI18N
    }//GEN-LAST:event_reportButtonMouseEntered

    private void reportButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseExited
        
        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Reportbtn.png"))); // NOI18N
    }//GEN-LAST:event_reportButtonMouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ADD[Hover].png"))); // NOI18N
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ADD.png"))); // NOI18N
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List[Hover].png"))); // NOI18N
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List.png"))); // NOI18N
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search[Hover].png"))); // NOI18N
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        
        meals.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        
        meals.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        
        meals.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void cust_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cust_addMouseEntered
        
        cust_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_cust_addMouseEntered

    private void cust_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cust_addMouseExited
        
        cust_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddBottom.png"))); // NOI18N
    }//GEN-LAST:event_cust_addMouseExited

    private void delete_mealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_mealMouseClicked
        
        meals.setSelectedIndex(2);
        mealModel.setMealId(ID);
        mealController.deleteMeal(mealModel);
        try {
            mealController.listMeals(meal_table2);
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        clear_deleteMeal();
    }//GEN-LAST:event_delete_mealMouseClicked

    private void delete_mealMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_mealMouseEntered
        
        delete_meal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_delete_mealMouseEntered

    private void delete_mealMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_mealMouseExited
        
        delete_meal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); // NOI18N
    }//GEN-LAST:event_delete_mealMouseExited

    private void butupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butupdateMouseClicked
        

        meals.setSelectedIndex(4);
        selectedRow = meal_table2.getSelectedRow();
        ID = Integer.parseInt((String) meal_table2.getValueAt(selectedRow, 0));
        m_id.setText("" + ID);
        mealModel.setMealId(ID);
        try {
            mealController.sendMeal(mealModel, m_name, m_price, m_quan);
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butupdateMouseClicked

    private void butupdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butupdateMouseEntered
        
        butupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_butupdateMouseEntered

    private void butupdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butupdateMouseExited
        
        butupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); // NOI18N
    }//GEN-LAST:event_butupdateMouseExited

    private void butllistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butllistMouseClicked
        try {
            
            mealController.listMeals(meal_table2);
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_butllistMouseClicked

    private void butllistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butllistMouseEntered
        
        butllist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ListBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_butllistMouseEntered

    private void butllistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butllistMouseExited
        
        butllist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ListBottom.png"))); // NOI18N
    }//GEN-LAST:event_butllistMouseExited

    private void butdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butdeleteMouseClicked
        
        
        meals.setSelectedIndex(1);
        
        selectedRow = meal_table2.getSelectedRow();
        
        ID = Integer.parseInt((String) meal_table2.getValueAt(selectedRow, 0));
        id_delete1.setText("" + ID);
    }//GEN-LAST:event_butdeleteMouseClicked

    private void butdeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butdeleteMouseEntered
        
        butdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_butdeleteMouseEntered

    private void butdeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butdeleteMouseExited
        
        butdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); // NOI18N
    }//GEN-LAST:event_butdeleteMouseExited

    private void search_id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_id1ActionPerformed
        
    }//GEN-LAST:event_search_id1ActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        
        ID = Integer.parseInt(search_id1.getText());
        mealModel.setMealId(ID);
        try {
            mealController.searchMeals(search_table1, mealModel);
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        clear_searchMeal();
    }//GEN-LAST:event_searchMouseClicked

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SearchBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SearchBottom.png"))); // NOI18N
    }//GEN-LAST:event_searchMouseExited

    private void add_offerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_offerMouseClicked
        
        ID = Integer.parseInt(ofID.getText());
        String offerDetails = offerDetalis.getText();
        offerModel.setOfferId(ID);
        offerModel.setOfferDetails(offerDetails);
        Offer offerContorller = new Offer();
        offerContorller.SetOffers(offerModel);
        clear_offer();
    }//GEN-LAST:event_add_offerMouseClicked

    private void reportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseClicked
        ModulesData userModel = new ModulesData();
        Admin adminController = new Admin();
        int userId = Integer.parseInt(id2.getText());
        String reportDescription = description.getText();
        userModel.setId(userId);
        adminController.ReportAboutEmployees(roleID, reportTable, userModel, reportDescription);
        id2.setText("");
        description.setText("");
        clear_report();
    }//GEN-LAST:event_reportButtonMouseClicked

    private void cust_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cust_addMouseClicked
        ID = Integer.parseInt(meal_id.getText());
        String mealName = meal_name.getText();
        double mealPrice = Double.parseDouble(meal_price.getText());
        int mealQuantity = Integer.parseInt(meal_quan.getText());
        int adminId = Integer.parseInt(a_id.getText());
        mealModel.setMealId(ID);
        mealModel.setMealName(mealName);
        mealModel.setPrice(mealPrice);
        mealModel.setQuantity(mealQuantity);
        adminModel.setId(adminId);
        mealController.addMeal(mealModel, adminModel);
        meals.setSelectedIndex(2);
        try {
            mealController.listMeals(meal_table2);
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        clear_addMeal();


    }//GEN-LAST:event_cust_addMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        admin.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Report[Hover].png"))); // NOI18N
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Report.png"))); // NOI18N
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        
        emp_mange.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ADD[Hover].png"))); // NOI18N
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ADD.png"))); // NOI18N
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        
        emp_mange.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
        
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List[Hover].png"))); // NOI18N
    }//GEN-LAST:event_jLabel27MouseEntered

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List.png"))); // NOI18N
    }//GEN-LAST:event_jLabel27MouseExited

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        
        emp_mange.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
        
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search[Hover].png"))); // NOI18N
    }//GEN-LAST:event_jLabel28MouseEntered

    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
        
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
    }//GEN-LAST:event_jLabel28MouseExited

    private void emp_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_addMouseClicked
        

        ID = Integer.parseInt(emp_id.getText());
        String name = emp_name.getText();
        String pass = emp_pass.getText();
        employeeModel.setId(ID);
        employeeModel.setName(name);
        employeeModel.setPassword(pass);
        employeeController.add(employeeModel);
        emp_mange.setSelectedIndex(2);
        employeeController.list(emp_table);
        clear_data();

    }//GEN-LAST:event_emp_addMouseClicked

    private void emp_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_addMouseEntered
        
        emp_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_emp_addMouseEntered

    private void emp_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_addMouseExited
        
        emp_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddBottom.png"))); // NOI18N
    }//GEN-LAST:event_emp_addMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        

        employeeModel.setId(ID);
        
        employeeController.delete(employeeModel);
        emp_mange.setSelectedIndex(2);
        employeeController.list(emp_table);
        clear_delete();
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); // NOI18N
    }//GEN-LAST:event_deleteMouseExited

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        

        emp_mange.setSelectedIndex(4);
        selectedRow = emp_table.getSelectedRow();
        ID = Integer.parseInt((String) emp_table.getValueAt(selectedRow, 0));
        employeeModel.setId(ID);
        e_id.setText("" + ID);
        employeeController.send(employeeModel, e_name, e_pass);

    }//GEN-LAST:event_updateButtonMouseClicked

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
        
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); // NOI18N
    }//GEN-LAST:event_updateButtonMouseExited

    private void listButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listButtonMouseClicked
        

        employeeController.list(emp_table);

    }//GEN-LAST:event_listButtonMouseClicked

    private void listButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listButtonMouseEntered
        
        listButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ListBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_listButtonMouseEntered

    private void listButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listButtonMouseExited
        
        listButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ListBottom.png"))); // NOI18N
    }//GEN-LAST:event_listButtonMouseExited

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        
        emp_mange.setSelectedIndex(1);
        selectedRow = emp_table.getSelectedRow();
        ID = Integer.parseInt((String) emp_table.getValueAt(selectedRow, 0));
        id_delete.setText("" + ID);


    }//GEN-LAST:event_deleteButtonMouseClicked

    private void deleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseEntered
        
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_deleteButtonMouseEntered

    private void deleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseExited
        
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DeleteBottom.png"))); // NOI18N
    }//GEN-LAST:event_deleteButtonMouseExited

    private void search_idempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_idempActionPerformed
        
    }//GEN-LAST:event_search_idempActionPerformed

    private void searchEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchEmployeeMouseClicked
        
        ID = Integer.parseInt(search_idemp.getText());
        employeeModel.setId(ID);
        employeeController.search(search_emp, employeeModel);
        clear_search();

    }//GEN-LAST:event_searchEmployeeMouseClicked

    private void searchEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchEmployeeMouseEntered
        
        searchEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SearchBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_searchEmployeeMouseEntered

    private void searchEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchEmployeeMouseExited
        
        searchEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SearchBottom.png"))); // NOI18N
    }//GEN-LAST:event_searchEmployeeMouseExited

    private void e_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_idActionPerformed
        
    }//GEN-LAST:event_e_idActionPerformed

    private void e_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_nameActionPerformed
        
    }//GEN-LAST:event_e_nameActionPerformed

    private void updateEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateEmployeeMouseClicked
        
        String name = e_name.getText();
        String pass = e_pass.getText();
        employeeModel.setId(ID);
        employeeModel.setName(name);
        employeeModel.setPassword(pass);
        employeeController.update(employeeModel);
        emp_mange.setSelectedIndex(2);
        employeeController.list(emp_table);
        clear_update();

    }//GEN-LAST:event_updateEmployeeMouseClicked

    private void updateEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateEmployeeMouseEntered
        
        updateEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_updateEmployeeMouseEntered

    private void updateEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateEmployeeMouseExited
        
        updateEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); // NOI18N
    }//GEN-LAST:event_updateEmployeeMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Backbtn[Hover].png"))); // NOI18N
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Backbtn.png"))); // NOI18N
    }//GEN-LAST:event_backMouseExited

    private void jLabel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseExited
        
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom.png"))); // NOI18N
    }//GEN-LAST:event_jLabel35MouseExited

    private void jLabel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseEntered
        
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UpdateBottom[Hover].png"))); // NOI18N
    }//GEN-LAST:event_jLabel35MouseEntered

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        
        String name = m_name.getText();
        double price = Double.parseDouble(m_price.getText());
        int quan = Integer.parseInt(m_quan.getText());
        mealModel.setMealId(ID);
        mealModel.setMealName(name);
        mealModel.setPrice(price);
        mealModel.setQuantity(quan);
        mealController.updateMeal(mealModel);
        meals.setSelectedIndex(2);
        try {
            mealController.listMeals(meal_table2);
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        clear_updataMeal();
    }//GEN-LAST:event_jLabel35MouseClicked

    private void m_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_priceActionPerformed
        
    }//GEN-LAST:event_m_priceActionPerformed

    private void m_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_nameActionPerformed
        
    }//GEN-LAST:event_m_nameActionPerformed

    private void m_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_idActionPerformed
        
    }//GEN-LAST:event_m_idActionPerformed

    private void m_quanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_quanActionPerformed
        
    }//GEN-LAST:event_m_quanActionPerformed

    private void offerDetalisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offerDetalisActionPerformed
        
    }//GEN-LAST:event_offerDetalisActionPerformed

    private void admIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admIDActionPerformed
        
    }//GEN-LAST:event_admIDActionPerformed

    private void ofIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ofIDActionPerformed
        
    }//GEN-LAST:event_ofIDActionPerformed

    private void custRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custRadioActionPerformed
        
        roleID = 3;

    }//GEN-LAST:event_custRadioActionPerformed

    private void empRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empRadioActionPerformed
        

        roleID = 2;

    }//GEN-LAST:event_empRadioActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        
        this.toBack();
        setVisible(false);
        new Login().toFront();
        new Login().setState(Frame.NORMAL);
        new Login().setVisible(true);
        dispose();

    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Meal;
    private javax.swing.JPanel Report1;
    private javax.swing.JTextField a_id;
    private javax.swing.JPanel add_emp;
    private javax.swing.JPanel add_emp1;
    private javax.swing.JLabel add_offer;
    private javax.swing.JTextField admID;
    private javax.swing.JTabbedPane admin;
    private javax.swing.JLabel back;
    private javax.swing.JLabel butdelete;
    private javax.swing.JLabel butllist;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel butupdate;
    private javax.swing.JRadioButton custRadio;
    private javax.swing.JLabel cust_add;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel deleteButton;
    private javax.swing.JPanel delete_cust2;
    private javax.swing.JPanel delete_emp;
    private javax.swing.JLabel delete_meal;
    private javax.swing.JTextField description;
    private javax.swing.JTextField e_id;
    private javax.swing.JTextField e_name;
    private javax.swing.JPasswordField e_pass;
    private javax.swing.JRadioButton empRadio;
    private javax.swing.JLabel emp_add;
    private javax.swing.JTextField emp_id;
    private javax.swing.JTabbedPane emp_mange;
    private javax.swing.JTextField emp_name;
    private javax.swing.JTextField emp_pass;
    private javax.swing.JTable emp_table;
    private javax.swing.JPanel employee;
    private javax.swing.JTextField id2;
    private javax.swing.JTextField id_delete;
    private javax.swing.JTextField id_delete1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel listButton;
    private javax.swing.JPanel list_cust2;
    private javax.swing.JPanel list_emp;
    private javax.swing.JTextField m_id;
    private javax.swing.JTextField m_name;
    private javax.swing.JTextField m_price;
    private javax.swing.JTextField m_quan;
    private javax.swing.JTextField meal_id;
    private javax.swing.JTextField meal_name;
    private javax.swing.JTextField meal_price;
    private javax.swing.JTextField meal_quan;
    private javax.swing.JTable meal_table2;
    private javax.swing.JTabbedPane meals;
    private javax.swing.JTextField ofID;
    private javax.swing.JPanel offer;
    private javax.swing.JTextField offerDetalis;
    private javax.swing.JLabel reportButton;
    private javax.swing.JTable reportTable;
    private javax.swing.JLabel search;
    private javax.swing.JLabel searchEmployee;
    private javax.swing.JPanel search_cust1;
    private javax.swing.JPanel search_cust2;
    private javax.swing.JTable search_emp;
    private javax.swing.JTextField search_id1;
    private javax.swing.JTextField search_idemp;
    private javax.swing.JTable search_table1;
    private javax.swing.JLabel updateButton;
    private javax.swing.JLabel updateEmployee;
    // End of variables declaration//GEN-END:variables
}
