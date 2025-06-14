
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Jay Villanueva
 */
public class LandscapeGUI extends javax.swing.JFrame {

    /**
     * Creates new form LandscapeGUI
     */
    // class level references
    DefaultListModel<Customer> customerList = new DefaultListModel();
    private final double GRASS_PER_SQFT = 5.00;
    private final double GRAVEL_PER_SQFT = 2.00;

// constructor
    public LandscapeGUI() {
        initComponents();

// center the form
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgYardType = new javax.swing.ButtonGroup();
        tabMain = new javax.swing.JTabbedPane();
        pnlWelcome = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblCompanyName = new javax.swing.JLabel();
        lblInstructions1 = new javax.swing.JLabel();
        lblGravelCost = new javax.swing.JLabel();
        lblGrassCost = new javax.swing.JLabel();
        rdoGrass = new javax.swing.JRadioButton();
        rdoGravel = new javax.swing.JRadioButton();
        lblPhoto = new javax.swing.JLabel();
        pnlInformation = new javax.swing.JPanel();
        btnCalculate = new javax.swing.JButton();
        btnSubmitOrder = new javax.swing.JButton();
        txtLength = new javax.swing.JTextField();
        lblLength = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOrderInfo = new javax.swing.JTextArea();
        lblOrderSummary = new javax.swing.JLabel();
        lblCompanyName1 = new javax.swing.JLabel();
        lblInstructions = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblInstructions2 = new javax.swing.JLabel();
        txtWidth = new javax.swing.JTextField();
        lblWidth = new javax.swing.JLabel();
        pnlCustomerList = new javax.swing.JPanel();
        lblCompanyName2 = new javax.swing.JLabel();
        lblCustomerList = new javax.swing.JLabel();
        lblCustomerDetails = new javax.swing.JLabel();
        lstCustomerInfo = new javax.swing.JScrollPane();
        txaCustomerInfo = new javax.swing.JTextArea();
        btnLoad = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCustomers = new javax.swing.JList<>();
        mnbMain = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenu();
        mnuSubmitOrder = new javax.swing.JMenuItem();
        mnuReset = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jay Villanueva Landscaping");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblCompanyName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCompanyName.setText("Jay Villanueva LandScapes");

        lblInstructions1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInstructions1.setText("Would you like a grass or gravel yard?");

        lblGravelCost.setText("$2 per sqft");

        lblGrassCost.setText("$5 per sqft");
        lblGrassCost.setToolTipText("");

        btgYardType.add(rdoGrass);
        rdoGrass.setText("Grass");
        rdoGrass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGrassActionPerformed(evt);
            }
        });

        btgYardType.add(rdoGravel);
        rdoGravel.setText("Gravel");
        rdoGravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGravelActionPerformed(evt);
            }
        });

        lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dirt.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(lblCompanyName))
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGrassCost)
                            .addComponent(rdoGrass))
                        .addGap(109, 109, 109)
                        .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoGravel)
                            .addComponent(lblGravelCost)))
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(lblInstructions1)))
                .addGap(141, 147, Short.MAX_VALUE))
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblInstructions1)
                .addGap(26, 26, 26)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoGrass)
                    .addComponent(rdoGravel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrassCost)
                    .addComponent(lblGravelCost))
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnNext)
                        .addGap(33, 33, 33)
                        .addComponent(btnReset))
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabMain.addTab("Welcome", pnlWelcome);

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnSubmitOrder.setText("Submit Order");
        btnSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrderActionPerformed(evt);
            }
        });

        lblLength.setText("Length(ft)");

        txaOrderInfo.setColumns(20);
        txaOrderInfo.setRows(5);
        jScrollPane1.setViewportView(txaOrderInfo);

        lblOrderSummary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOrderSummary.setText("Order Summary");

        lblCompanyName1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCompanyName1.setText("Jay Villanueva LandScapes");

        lblInstructions.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInstructions.setText("Please enter your information");

        txtName.setNextFocusableComponent(txtAddress);

        lblName.setText("Name:");

        lblAddress.setText("Address:");
        lblAddress.setToolTipText("");

        txtAddress.setNextFocusableComponent(txtWidth);

        lblInstructions2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInstructions2.setText("Enter the length and width of your yard");
        lblInstructions2.setToolTipText("");

        txtWidth.setNextFocusableComponent(txtLength);

        lblWidth.setText("Width(ft)");

        javax.swing.GroupLayout pnlInformationLayout = new javax.swing.GroupLayout(pnlInformation);
        pnlInformation.setLayout(pnlInformationLayout);
        pnlInformationLayout.setHorizontalGroup(
            pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformationLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformationLayout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(77, 77, 77)
                        .addComponent(btnCalculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformationLayout.createSequentialGroup()
                                .addComponent(lblOrderSummary)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformationLayout.createSequentialGroup()
                                .addComponent(btnSubmitOrder)
                                .addGap(111, 111, 111))))
                    .addGroup(pnlInformationLayout.createSequentialGroup()
                        .addComponent(lblInstructions)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformationLayout.createSequentialGroup()
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformationLayout.createSequentialGroup()
                                .addComponent(lblWidth)
                                .addGap(18, 18, 18)
                                .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblInstructions2)
                                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformationLayout.createSequentialGroup()
                                        .addComponent(lblAddress)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformationLayout.createSequentialGroup()
                                .addComponent(lblLength)
                                .addGap(18, 18, 18)
                                .addComponent(txtLength)))))
                .addGap(30, 30, 30))
            .addGroup(pnlInformationLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(lblCompanyName1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInformationLayout.setVerticalGroup(
            pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCompanyName1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstructions)
                    .addComponent(lblOrderSummary))
                .addGap(9, 9, 9)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformationLayout.createSequentialGroup()
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(lblInstructions2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWidth)
                    .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLength)
                    .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnSubmitOrder))
                .addGap(15, 15, 15))
        );

        tabMain.addTab("Information", pnlInformation);

        pnlCustomerList.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblCompanyName2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCompanyName2.setText("Jay Villanueva LandScapes");

        lblCustomerList.setText("Customer List");

        lblCustomerDetails.setText("Customer Details");

        txaCustomerInfo.setColumns(20);
        txaCustomerInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaCustomerInfo.setRows(5);
        lstCustomerInfo.setViewportView(txaCustomerInfo);

        btnLoad.setText("Load List");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnDelete.setText("DeleteCustomer");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lstCustomers.setModel(customerList);
        lstCustomers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCustomersValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstCustomers);

        javax.swing.GroupLayout pnlCustomerListLayout = new javax.swing.GroupLayout(pnlCustomerList);
        pnlCustomerList.setLayout(pnlCustomerListLayout);
        pnlCustomerListLayout.setHorizontalGroup(
            pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerListLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblCustomerList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCustomerDetails)
                .addGap(135, 135, 135))
            .addGroup(pnlCustomerListLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(lstCustomerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(pnlCustomerListLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(lblCompanyName2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlCustomerListLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnLoad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(119, 119, 119))
        );
        pnlCustomerListLayout.setVerticalGroup(
            pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerListLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblCompanyName2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerList)
                    .addComponent(lblCustomerDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lstCustomerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoad)
                    .addComponent(btnDelete))
                .addGap(53, 53, 53))
        );

        tabMain.addTab("Customer List", pnlCustomerList);

        mnuFile.setText("File");

        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuExit);

        mnbMain.add(mnuFile);

        mnuOrder.setText("Order");

        mnuSubmitOrder.setText("Submit Order");
        mnuSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSubmitOrderActionPerformed(evt);
            }
        });
        mnuOrder.add(mnuSubmitOrder);

        mnuReset.setText("Reset");
        mnuReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuResetActionPerformed(evt);
            }
        });
        mnuOrder.add(mnuReset);

        mnbMain.add(mnuOrder);

        setJMenuBar(mnbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_mnuResetActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSubmitOrderActionPerformed
        if (validateInputs() == false) {
            return;    // end the method if validation failed
        }

        Customer cust = createCustomer();
        customerList.addElement(cust);
        txaOrderInfo.setText(cust.getDetails());

        try {
            DataIO data = new DataIO(); // create DataIO object
            data.add(cust);

            // reset for the next customer
            reset();

            //move to the client orders tab
            tabMain.setSelectedIndex(2);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                    "File IO Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(this, "Driver not found Error: " + ex.getMessage(),
                    "Database Driver Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_mnuSubmitOrderActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // confirm that a selection was made then move to next tab
        if (rdoGrass.isSelected() == false && rdoGravel.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Please select the type of yard.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            tabMain.setSelectedIndex(1);
        }

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void rdoGrassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGrassActionPerformed
        // TODO add your handling code here:
        if (rdoGrass.isSelected()) {
            // look in directory where class exists, and get location of "grass.jpg"
            URL location = this.getClass().getResource("grass.jpg");

            // create image using the location of "grass.jpg"
            ImageIcon icon = new ImageIcon(location);

            // set the image icon to the label
            lblPhoto.setIcon(icon);
        }
    }//GEN-LAST:event_rdoGrassActionPerformed

    private void rdoGravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGravelActionPerformed
        // TODO add your handling code here:
        if (rdoGravel.isSelected()) {
            // find image, create image icon, and set image icon to label
            lblPhoto.setIcon(new ImageIcon(this.getClass().getResource("gravel.jpg")));
        }
    }//GEN-LAST:event_rdoGravelActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // validate the inputs
        if (validateInputs() == false) {
            return;    // end the method if validation failed
        }

// create the Customer object and show the information
        Customer cust = createCustomer();
        txaOrderInfo.setText(cust.getDetails());

    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrderActionPerformed
        submitOrder();
    }//GEN-LAST:event_btnSubmitOrderActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        loadCustomers();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            Customer old = lstCustomers.getSelectedValue();

            if (old != null) {
                DataIO data = new DataIO();
                data.delete(old.getCustomerID());
                txaCustomerInfo.setText("");
                loadCustomers();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lstCustomersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCustomersValueChanged
        // get selected item’s index number
        int index = lstCustomers.getSelectedIndex();

// if something was selected, show the object’s details
        if (index > -1) {
            Customer cust = customerList.getElementAt(index);
            txaCustomerInfo.setText(cust.getDetails());
        }

    }//GEN-LAST:event_lstCustomersValueChanged

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
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandscapeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgYardType;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmitOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblCompanyName1;
    private javax.swing.JLabel lblCompanyName2;
    private javax.swing.JLabel lblCustomerDetails;
    private javax.swing.JLabel lblCustomerList;
    private javax.swing.JLabel lblGrassCost;
    private javax.swing.JLabel lblGravelCost;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblInstructions2;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrderSummary;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JScrollPane lstCustomerInfo;
    private javax.swing.JList<Customer> lstCustomers;
    private javax.swing.JMenuBar mnbMain;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuOrder;
    private javax.swing.JMenuItem mnuReset;
    private javax.swing.JMenuItem mnuSubmitOrder;
    private javax.swing.JPanel pnlCustomerList;
    private javax.swing.JPanel pnlInformation;
    private javax.swing.JPanel pnlWelcome;
    private javax.swing.JRadioButton rdoGrass;
    private javax.swing.JRadioButton rdoGravel;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTextArea txaCustomerInfo;
    private javax.swing.JTextArea txaOrderInfo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        tabMain.setSelectedIndex(0);
// clear the radiobutton selection
        btgYardType.clearSelection();
// put the image back to "Dirt"
        lblPhoto.setIcon(new ImageIcon(
                this.getClass().getResource("dirt.jpg")));
        txtName.setText("");
        this.txtName.requestFocusInWindow();
        txtAddress.setText("");
        txtLength.setText("");
        txtWidth.setText("");
        txaOrderInfo.setText("");

    }

    private boolean validateInputs() {
        // get inputs from user using the textboxes
        String sName = txtName.getText();
        String sAddress = txtAddress.getText();
        String sWidth = txtWidth.getText();
        String sLength = txtLength.getText();

        // confirm that a radiobutton has been selected
        if (btgYardType.getSelection() == null) {
            JOptionPane.showMessageDialog(this,
                    "Error. Please select the type of yard.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // make sure we have a name for the order
        if (sName.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a Name",
                    "Name Error", JOptionPane.ERROR_MESSAGE);
            txtName.requestFocusInWindow();
            return false;
        }

        // make sure we have an address for the order
        if (sAddress.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a Address",
                    "Address Error", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocusInWindow();
            return false;
        }

        if (sAddress.length() < 6) {
            JOptionPane.showMessageDialog(this, "Address must be six characters or more.",
                    "Address Error", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocusInWindow();
            return false;
        }

        if (sWidth.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a Width",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtWidth.requestFocusInWindow();
            return false;
        }

        // check to see if the width is a valid number
        try {
            Double.parseDouble(sWidth);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Width must be a number",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtWidth.setText("");
            txtWidth.requestFocusInWindow();
            return false;
        }

        if (Double.parseDouble(sWidth) <= 0) {
            JOptionPane.showMessageDialog(this, "Width must be greater than 0",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        }

        if (sLength.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a Length",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.requestFocusInWindow();
            return false;
        }

        try {
            Double.parseDouble(sLength);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Length must be a number",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        }

        if (Double.parseDouble(sLength) <= 0) {
            JOptionPane.showMessageDialog(this,
                    "Length must be must be greater than 0",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        }

        // all is good so return true
        return true;
    }

    private Customer createCustomer() {
        String name = txtName.getText();
        String address = txtAddress.getText();
        double width = Double.parseDouble(txtWidth.getText());
        double length = Double.parseDouble(txtLength.getText());
        String yardType = "";
        double totalCost = 0.0;

        if (rdoGrass.isSelected()) {
            yardType = "Grass";
            totalCost = GRASS_PER_SQFT * width * length;
        } else if (rdoGravel.isSelected()) {
            yardType = "Gravel";
            totalCost = GRAVEL_PER_SQFT * width * length;
        } else {
            JOptionPane.showMessageDialog(this,
                    "Error. Please select a yard type.");
            totalCost = 0.0;
        }

        Customer cust = new Customer(0, name, address, yardType,
                length, width, totalCost);
        return cust;
    }

    private void submitOrder() {
        if (validateInputs() == false) {
            return;    // end the method if validation failed
        }

        Customer cust = createCustomer();
        customerList.addElement(cust);
        txaOrderInfo.setText(cust.getDetails());

        try {
            DataIO data = new DataIO(); // create DataIO object
            data.add(cust);
            loadCustomers();  // load all customers

            // reset for the next customer
            reset();

            //move to the client orders tab
            tabMain.setSelectedIndex(2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Driver Not Found Error: " + ex.getMessage(),
                    "Database Driver Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void loadCustomers() {
        try {
            DataIO data = new DataIO(); // create DataIO object
            ArrayList<Customer> customers = data.getList();

            // clear out the DefaultListModel and textarea
            customerList.clear();
            txaOrderInfo.setText("");

            // copy each object from the ArrayList over to the DefaultListModel
            for (int i = 0; i < customers.size(); i++) {
                customerList.addElement(customers.get(i));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
