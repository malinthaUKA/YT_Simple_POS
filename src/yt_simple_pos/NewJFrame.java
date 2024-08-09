/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yt_simple_pos;

import java.awt.Font;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author malin
 */
public class NewJFrame extends javax.swing.JFrame {

   
    public NewJFrame() {
        initComponents();
        
        buying_table.getColumnModel().getColumn(0).setPreferredWidth(30); // Set Preferred Width for the First Column of buying_table 
        buying_table.getColumnModel().getColumn(1).setPreferredWidth(200); // Set Preferred Width for the Second Column
        
        
    }
    
    // add data to table
    public void addTable(int id, String Name, int Qty, Double Price){
        DefaultTableModel dt = (DefaultTableModel) buying_table.getModel();  // The method retrieves the table's data model and casts it to DefaultTableModel. This model is responsible for managing the data displayed in the table.
        
        
        DecimalFormat df = new DecimalFormat();
        double totPrice = Price * Double.valueOf(Qty);
        String TotalPrice = df.format(totPrice);
        
        
        // delet row 
        for (int row = 0; row < buying_table.getRowCount(); row++) {
            if(Name == buying_table.getValueAt(row, 1)){ // get value of column 1 (cloumn indexes are 0,1,3,...) of row wchich we want
                dt.removeRow(buying_table.convertRowIndexToModel(row));
            }
        }
        
        Vector v = new Vector();  // A Vector is created to hold the data for the new row. A Vector is essentially a dynamic array that can grow as needed.
        
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(TotalPrice);
        
        dt.addRow(v);
    }

    
    // calculate subtotal and show 
    // calculate subtotal and show 
public void cal() {
    
    // cal total table values
    int numOfRow = buying_table.getRowCount();
    
    double tot = 0.0;
    
    for (int i = 0; i < numOfRow; i++) {
        // Remove commas before parsing the value
        String valueStr = buying_table.getValueAt(i, 3).toString().replace(",", "");
        double value = Double.valueOf(valueStr);
        tot += value;
    }
    
    DecimalFormat df = new DecimalFormat("#,##0.00"); // Format with comma and 2 decimal places
    total.setText(df.format(tot));
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_rolls = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        btn_curryRoti = new javax.swing.JButton();
        btn_eggRoti = new javax.swing.JButton();
        q3 = new javax.swing.JLabel();
        btn_kottu = new javax.swing.JButton();
        q6 = new javax.swing.JLabel();
        btn_eggHoppers = new javax.swing.JButton();
        q5 = new javax.swing.JLabel();
        btn_fishPatties = new javax.swing.JButton();
        q4 = new javax.swing.JLabel();
        btn_lavariya = new javax.swing.JButton();
        q8 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        btn_parataWithGravy = new javax.swing.JButton();
        btn_ulunduWaday = new javax.swing.JButton();
        q7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        buying_table = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        printing_area = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        bal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        btn_print = new javax.swing.JButton();
        btn_pay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_rolls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        btn_rolls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rollsActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");

        q2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");

        btn_curryRoti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpg"))); // NOI18N
        btn_curryRoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_curryRotiActionPerformed(evt);
            }
        });

        btn_eggRoti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.jpg"))); // NOI18N
        btn_eggRoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eggRotiActionPerformed(evt);
            }
        });

        q3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");

        btn_kottu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6.jpg"))); // NOI18N
        btn_kottu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kottuActionPerformed(evt);
            }
        });

        q6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");

        btn_eggHoppers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.jpg"))); // NOI18N
        btn_eggHoppers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eggHoppersActionPerformed(evt);
            }
        });

        q5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");

        btn_fishPatties.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.jpg"))); // NOI18N
        btn_fishPatties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fishPattiesActionPerformed(evt);
            }
        });

        q4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");

        btn_lavariya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.jpg"))); // NOI18N
        btn_lavariya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lavariyaActionPerformed(evt);
            }
        });

        q8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");

        q9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("0");

        btn_parataWithGravy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8.jpg"))); // NOI18N
        btn_parataWithGravy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_parataWithGravyActionPerformed(evt);
            }
        });

        btn_ulunduWaday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.jpg"))); // NOI18N
        btn_ulunduWaday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ulunduWadayActionPerformed(evt);
            }
        });

        q7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_rolls, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_fishPatties, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_lavariya, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(q2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_curryRoti, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eggHoppers, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(q8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_parataWithGravy, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(q3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eggRoti, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kottu, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(q9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ulunduWaday, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_eggRoti, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_curryRoti, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_rolls, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_kottu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_eggHoppers, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_fishPatties, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_ulunduWaday, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_parataWithGravy, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_lavariya, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        buying_table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buying_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Qty", "Price"
            }
        ));
        jScrollPane1.setViewportView(buying_table);

        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_delete)
                .addGap(24, 24, 24))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        printing_area.setColumns(20);
        printing_area.setRows(5);
        jScrollPane2.setViewportView(printing_area);

        bal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bal.setText("00");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Cash :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Balance :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Total :");

        total.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        total.setText("00");

        cash.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        btn_print.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_pay.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_pay.setText("Pay");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cash, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addComponent(btn_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_print)
                .addGap(138, 138, 138))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_print, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bal)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // pay button 
    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
        
        /*
        
             ensure that any text you convert to a double does not contain commas. You can do this by using the .replace(",", "") method to remove commas from the string before parsing it.
        
        */

        // Remove commas before parsing the values
        double tot = Double.valueOf(total.getText().replace(",", ""));
        double payedCash = Double.valueOf(cash.getText().replace(",", ""));
        double balance = payedCash - tot;

        // Set the balance text, formatted with commas and two decimal places
        DecimalFormat df = new DecimalFormat("#,##0.00");
        bal.setText(df.format(balance));
        
        
        
        
        // show printing details
        // Setting the printing area text with a fixed-width font
            printing_area.setFont(new Font("Monospaced", Font.PLAIN, 11));
            printing_area.setText("                     Malintha Randika\n");
            printing_area.setText(printing_area.getText() + "             335/C/1, Kosmodara, Kotapola.\n");
            printing_area.setText(printing_area.getText() + "                     +94123456789\n");
            printing_area.setText(printing_area.getText() + "  -------------------------------------------------------\n\n");
            printing_area.setText(printing_area.getText() + "         -----------------------------------------\n");
            printing_area.setText(printing_area.getText() + String.format("\t   %-20s %-10s %-10s\n", "Items", "Qty", "Price"));
            printing_area.setText(printing_area.getText() + "         -----------------------------------------\n");

            DefaultTableModel dt = (DefaultTableModel) buying_table.getModel();

            // Get table product details
            for (int i = 0; i < buying_table.getRowCount(); i++) {
                String item = dt.getValueAt(i, 1).toString();
                String qty = dt.getValueAt(i, 2).toString();
                String price = dt.getValueAt(i, 3).toString();

                // Format the string with padding
                String formattedLine = String.format("\t   %-20s %-10s %-10s", item, qty, price);
                printing_area.setText(printing_area.getText() + formattedLine + "\n");
            }
            printing_area.setText(printing_area.getText() + "         -----------------------------------------\n\n");
            printing_area.setText(printing_area.getText() + "\t   Sub Total : " + total.getText()+ "\n");
            printing_area.setText(printing_area.getText() + "\t   Cash      : " + cash.getText()+ "\n");
            printing_area.setText(printing_area.getText() + "\t   Balance   : " + bal.getText()+ "\n\n");
            printing_area.setText(printing_area.getText() + "         -----------------------------------------\n");
            printing_area.setText(printing_area.getText() + "         Thanks For Business...!\n");
            printing_area.setText(printing_area.getText() + "         -----------------------------------------\n\n");
            printing_area.setText(printing_area.getText() + "         This software created from youtube chanel \n         which name is Dapp Code\n");
            printing_area.setText(printing_area.getText() + "         I am Malintha Randika\n");

    }//GEN-LAST:event_btn_payActionPerformed

    private void btn_rollsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rollsActionPerformed
        
        // increment lable value one by one for each click
        int i = Integer.valueOf(q1.getText());
        ++i;
        q1.setText(String.valueOf(i));
        
        addTable(1, "Rolls", i, 150.00);
        
        // when button is clicked add row to table, i reflect how many times button is clicked, and we can use i as Quantity.
        
        
        cal(); // show sub total of items prices
    }//GEN-LAST:event_btn_rollsActionPerformed

    private void btn_curryRotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_curryRotiActionPerformed
        
        // increment lable value one by one for each click
        int i = Integer.valueOf(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));
        
        
        
        addTable(2, "Curry Rotti", i, 100.00);
        
        cal();
    }//GEN-LAST:event_btn_curryRotiActionPerformed

    private void btn_eggRotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eggRotiActionPerformed
        
        int i = Integer.valueOf(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));
        
        addTable(3, "Egg Rotti", i, 120.00);
        
        cal();
    }//GEN-LAST:event_btn_eggRotiActionPerformed

    private void btn_fishPattiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fishPattiesActionPerformed
        int i = Integer.valueOf(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));
        
        addTable(4, "Fish Patties", i, 60.00);
        
        cal();
    }//GEN-LAST:event_btn_fishPattiesActionPerformed

    private void btn_eggHoppersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eggHoppersActionPerformed
        int i = Integer.valueOf(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));
        
        addTable(5, "Egg Hoppers", i, 80.00);
        
        cal();
    }//GEN-LAST:event_btn_eggHoppersActionPerformed

    private void btn_kottuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kottuActionPerformed
        int i = Integer.valueOf(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));
        
        addTable(6, "Kottu", i, 900.00);
        
        cal();
    }//GEN-LAST:event_btn_kottuActionPerformed

    private void btn_lavariyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lavariyaActionPerformed
        int i = Integer.valueOf(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));
        
        addTable(7, "Lavariya", i, 70.00);
        
        cal();
    }//GEN-LAST:event_btn_lavariyaActionPerformed

    private void btn_parataWithGravyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_parataWithGravyActionPerformed
        int i = Integer.valueOf(q8.getText());
        ++i;
        q8.setText(String.valueOf(i));
        
        addTable(8, "Parata With Gravy", i, 150.00);
        
        cal();
    }//GEN-LAST:event_btn_parataWithGravyActionPerformed

    private void btn_ulunduWadayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ulunduWadayActionPerformed
        int i = Integer.valueOf(q9.getText());
        ++i;
        q9.setText(String.valueOf(i));
        
        addTable(9, "Ulundu Waday", i, 75.00);
        
        cal();
    }//GEN-LAST:event_btn_ulunduWadayActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // Get the table model
        DefaultTableModel dt = (DefaultTableModel) buying_table.getModel();

        // Ensure that a row is selected before attempting to delete
        int selectedRow = buying_table.getSelectedRow();
        
        if (selectedRow != -1) {
            // Get the ID of the selected row before deletion
            String r = dt.getValueAt(selectedRow, 0).toString();

            // Remove the selected row
            dt.removeRow(selectedRow);

            // Set the removed item's label quantity to 0
            switch (r) {
                case "1":
                    q1.setText("0");
                    break;
                case "2":
                    q2.setText("0");
                    break;
                case "3":
                    q3.setText("0");
                    break;
                case "4":
                    q4.setText("0");
                    break;
                case "5":
                    q5.setText("0");
                    break;
                case "6":
                    q6.setText("0");
                    break;
                case "7":
                    q7.setText("0");
                    break;
                case "8":
                    q8.setText("0");
                    break;
                case "9":
                    q9.setText("0");
                    break;
                default:
                    System.err.println("Invalid item ID");
            }

            // Recalculate the total after removing the row
            cal();
        } else {
            System.err.println("No row selected for deletion");
        }
        
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        try {
            //        printing_area.setText("                                             Malintha Randika\n");
            //        printing_area.setText(printing_area.getText() + "                                    335/C/1, Kosmodara, Kotapola.\n");
            //        printing_area.setText(printing_area.getText() + "                                             +94123456789\n");
            //        printing_area.setText(printing_area.getText() + "  ------------------------------------------------------------------------------------------\n");
            //        printing_area.setText(printing_area.getText() + "\tItems \tQty \tPrice\n");
            //           
            //        DefaultTableModel df = (DefaultTableModel) buying_table.getModel();
            //        
            //        // get table product details
            //        for (int i = 0; i < buying_table.getRowCount(); i++){
            //            
            //            String item = df.getValueAt(i, 1).toString();
            //            String qty = df.getValueAt(i, 2).toString();
            //            String price = df.getValueAt(i, 3).toString();
            //            
            //            printing_area.setText(printing_area.getText() + "\t" + item + "\t" + qty + "\t" + price + "\n");
            //        }

            
            // print the bill
            printing_area.print();
        } catch (PrinterException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_printActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bal;
    private javax.swing.JButton btn_curryRoti;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_eggHoppers;
    private javax.swing.JButton btn_eggRoti;
    private javax.swing.JButton btn_fishPatties;
    private javax.swing.JButton btn_kottu;
    private javax.swing.JButton btn_lavariya;
    private javax.swing.JButton btn_parataWithGravy;
    private javax.swing.JButton btn_pay;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_rolls;
    private javax.swing.JButton btn_ulunduWaday;
    private javax.swing.JTable buying_table;
    private javax.swing.JTextField cash;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea printing_area;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
