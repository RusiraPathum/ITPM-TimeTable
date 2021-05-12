/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.student_details;

import com.spm.timetablemanagement.models.GeneratedId;
import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/** 
 *
 * @author hvdil
 */
public class groupId_generate extends javax.swing.JPanel {
    
    Connection connection;
    PreparedStatement pstYns, pstDp, pstGno, pst, pst2;
    ResultSet rs;
    /**
     * Creates new form groupId_generate
     */
    public groupId_generate() {
        initComponents();
        yNsSelection();
        dpSelection();
        gNoSelection();
        showGeneratedIdList();
        txt_id.setVisible(false);
        gid.setVisible(false);
        yns_id.setVisible(false);
        dp_id.setVisible(false);
        gno_id.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_generate_gId = new javax.swing.JButton();
        btn_editGid = new javax.swing.JButton();
        btn_deleteGid = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        select_yNs = new javax.swing.JComboBox<>();
        select_dp = new javax.swing.JComboBox<>();
        txt_id = new javax.swing.JTextField();
        gid = new javax.swing.JTextField();
        txt_error = new javax.swing.JLabel();
        select_gn = new javax.swing.JComboBox<>();
        yns_id = new javax.swing.JTextField();
        dp_id = new javax.swing.JTextField();
        gno_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_gId = new javax.swing.JTable();

        setBackground(new java.awt.Color(186, 148, 243));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(833, 737));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(186, 148, 243));
        jPanel9.setToolTipText("");
        jPanel9.setPreferredSize(new java.awt.Dimension(1133, 688));

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btn_generate_gId.setBackground(new java.awt.Color(255, 255, 255));
        btn_generate_gId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_generate_gId.setForeground(new java.awt.Color(51, 51, 51));
        btn_generate_gId.setText("Generate");
        btn_generate_gId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_generate_gId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generate_gIdActionPerformed(evt);
            }
        });
        jPanel1.add(btn_generate_gId);

        btn_editGid.setBackground(new java.awt.Color(255, 255, 255));
        btn_editGid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_editGid.setText("Update");
        btn_editGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editGidActionPerformed(evt);
            }
        });
        jPanel1.add(btn_editGid);

        btn_deleteGid.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteGid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_deleteGid.setText("Delete");
        btn_deleteGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteGidActionPerformed(evt);
            }
        });
        jPanel1.add(btn_deleteGid);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel11.setPreferredSize(new java.awt.Dimension(456, 36));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Academic Year & Semester");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Degree Program");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel13.setPreferredSize(new java.awt.Dimension(456, 36));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Group Number");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        select_yNs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select"}));
        select_yNs.setToolTipText("");
        select_yNs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_yNsActionPerformed(evt);
            }
        });

        select_dp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        select_dp.setToolTipText("");
        select_dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_dpActionPerformed(evt);
            }
        });

        txt_id.setText("ID");
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        gid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gidActionPerformed(evt);
            }
        });

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 51, 51));
        txt_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        select_gn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        select_gn.setToolTipText("");
        select_gn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_gnActionPerformed(evt);
            }
        });

        yns_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yns_idActionPerformed(evt);
            }
        });

        dp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_idActionPerformed(evt);
            }
        });

        gno_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gno_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(select_gn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gno_id, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(select_dp, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(select_yNs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yns_id, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(select_yNs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yns_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(select_dp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(select_gn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gno_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        tbl_gId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_gId.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Group ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_gId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_gId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_gIdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_gId);
        if (tbl_gId.getColumnModel().getColumnCount() > 0) {
            tbl_gId.getColumnModel().getColumn(0).setResizable(false);
            tbl_gId.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(605, 605, 605))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, 1060, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generate_gIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generate_gIdActionPerformed
        // TODO add your handling code here:
        
        try{
            DefaultTableModel model = (DefaultTableModel)tbl_gId.getModel();
            connection = DBconnection.getConnection();
            

            if(select_yNs.getSelectedItem().equals("Select")&&select_dp.getSelectedItem().equals("Select")&&select_gn.getSelectedItem().equals("Select")){
                txt_error.setText("Select Items*");
            }
            else{
                txt_error.setText("");
                
            model.addRow(new Object[]{select_yNs.getSelectedItem().toString()+"."+select_dp.getSelectedItem().toString()+"."+select_gn.getSelectedItem().toString()});
            
            String getYnsQuery = "select id from academic_year_and_semester where yNs = '"+select_yNs.getSelectedItem().toString()+"'";
            String getDpQuery = "select id from degree_program where dp = '"+select_dp.getSelectedItem().toString()+"'";
            String getGnoQuery = "select id from group_number where gNo = '"+select_gn.getSelectedItem().toString()+"'";
            
            pstYns = connection.prepareStatement(getYnsQuery);
            rs = pstYns.executeQuery();
            while(rs.next())
            {        
                yns_id.setText(rs.getString("id"));
            }
            
            pstDp = connection.prepareStatement(getDpQuery);
            rs = pstDp.executeQuery();
            while(rs.next())
            {        
                dp_id.setText(rs.getString("id"));
            }
            pstGno = connection.prepareStatement(getGnoQuery);
            rs = pstGno.executeQuery();
            while(rs.next())
            {        
                gno_id.setText(rs.getString("id"));
            }
            
            pst = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_GROUP_ID_TABLE));
            
            pst2 = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_ALL_DETAILS_TABLE));
            
            String generateID = (select_yNs.getSelectedItem().toString()+"."+select_dp.getSelectedItem().toString()+"."+select_gn.getSelectedItem().toString());
            
            pst.setString(1, generateID);
            pst.setString(2, yns_id.getText());
            pst.setString(3, dp_id.getText());
            pst.setString(4, gno_id.getText());
            
            pst2.setString(1, select_yNs.getSelectedItem().toString());
            pst2.setString(2, select_dp.getSelectedItem().toString());
            pst2.setString(3, select_gn.getSelectedItem().toString());
            pst2.setString(4, generateID);
            pst2.setString(5, "-");
            
            pst.executeUpdate();
            pst2.executeUpdate();
            model.setRowCount(0);
            showGeneratedIdList();
            
            select_yNs.setSelectedIndex(0);
            select_dp.setSelectedIndex(0);
            select_gn.setSelectedIndex(0);
            
            JOptionPane.showMessageDialog(null, "Inserting Successful!");

            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_generate_gIdActionPerformed

    private void select_yNsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_yNsActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_select_yNsActionPerformed

    private void select_dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_dpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_dpActionPerformed

    private void select_gnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_gnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_gnActionPerformed

    private void tbl_gIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_gIdMouseClicked
        // TODO add your handling code here:
        int i = tbl_gId.getSelectedRow();
        TableModel model = tbl_gId.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_gIdMouseClicked

    private void btn_deleteGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteGidActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();

        try
        {
            
            
            DefaultTableModel model = (DefaultTableModel)tbl_gId.getModel();
            Statement smt = connection.createStatement();
            
            if(txt_id.getText().equals("ID")){
                txt_error.setText("Select Group ID*");
            }
            else{
                txt_error.setText("");
                
            int i = tbl_gId.getSelectedRow();
            TableModel mt = tbl_gId.getModel();
            gid.setText(mt.getValueAt(i, 1).toString());
            
            smt.execute("DELETE FROM generated_group_id WHERE id = "+id);
            smt.execute("DELETE FROM all_details WHERE gId = '"+gid.getText().toString()+"' AND sGid = '-' ");
            model.setRowCount(0);
            showGeneratedIdList();
            JOptionPane.showMessageDialog(this, "Record Deleted!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_deleteGidActionPerformed

    private void btn_editGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editGidActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();
        String newGenerateID = (select_yNs.getSelectedItem().toString()+"."+select_dp.getSelectedItem().toString()+"."+select_gn.getSelectedItem().toString());

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_gId.getModel();
            Statement smt = connection.createStatement();
            
            if(txt_id.getText().equals("ID")){
                txt_error.setText("Select Group ID*");
            }
            else{
                txt_error.setText("");
                
            int i = tbl_gId.getSelectedRow();
            TableModel mt = tbl_gId.getModel();
            gid.setText(mt.getValueAt(i, 1).toString());
            
            
            smt.execute("UPDATE generated_group_id SET gId = '"+newGenerateID+"' WHERE id = "+id);
            smt.execute("UPDATE all_details SET gId = '"+newGenerateID+"' WHERE gId = '"+gid.getText().toString()+"' AND sGid = '-' ");
            model.setRowCount(0);
            showGeneratedIdList();
            
            select_yNs.setSelectedIndex(0);
            select_dp.setSelectedIndex(0);
            select_gn.setSelectedIndex(0);
            
            JOptionPane.showMessageDialog(this, "Record Updated!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_editGidActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void gidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gidActionPerformed

    private void yns_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yns_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yns_idActionPerformed

    private void dp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dp_idActionPerformed

    private void gno_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gno_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gno_idActionPerformed

    public  void yNsSelection(){
        try{  
        connection = DBconnection.getConnection();
        String query = "select * from academic_year_and_semester";
        pst = connection.prepareStatement(query);
        rs = pst.executeQuery();
        
        while(rs.next())
        {
            String yNs = rs.getString("yNs");
            select_yNs.addItem(yNs);
        }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public  void dpSelection(){
        try{  
        connection = DBconnection.getConnection();
        String query = "select * from degree_program";
        pst = connection.prepareStatement(query);
        rs = pst.executeQuery();
        
        while(rs.next())
        {
            String dp = rs.getString("dp");
            select_dp.addItem(dp);
        }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public  void gNoSelection(){
        try{  
        connection = DBconnection.getConnection();
        String query = "select * from group_number";
        pst = connection.prepareStatement(query);
        rs = pst.executeQuery();
        
        while(rs.next())
        {
            String gNo = rs.getString("gNo");
            select_gn.addItem(gNo);
        }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public ArrayList<GeneratedId> GetGeneratedIdList()
    {
        ArrayList<GeneratedId> list = new ArrayList<GeneratedId>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from generated_group_id";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        GeneratedId GID;
        while(rs.next())
        {
            GID = new GeneratedId(rs.getInt("id"), rs.getString("gId"));
            list.add(GID);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showGeneratedIdList()
    {
        ArrayList<GeneratedId> list = GetGeneratedIdList();
        DefaultTableModel model = (DefaultTableModel)tbl_gId.getModel();
        Object[] row = new Object[2];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getGid();
            
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_deleteGid;
    private javax.swing.JButton btn_editGid;
    private javax.swing.JButton btn_generate_gId;
    private javax.swing.JTextField dp_id;
    private javax.swing.JTextField gid;
    private javax.swing.JTextField gno_id;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> select_dp;
    private javax.swing.JComboBox<String> select_gn;
    private javax.swing.JComboBox<String> select_yNs;
    private javax.swing.JTable tbl_gId;
    private javax.swing.JLabel txt_error;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField yns_id;
    // End of variables declaration//GEN-END:variables
}