/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.tag_details;

import com.spm.timetablemanagement.models.tag;
import com.spm.timetablemanagement.models.SubGroupNo;
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
public class enterTag extends javax.swing.JPanel {

    Connection connection;
    PreparedStatement statement;
    /**
     * Creates new form enterTag
     */
    public enterTag() {
        initComponents();
        showTagList();
        txt_id.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_tag = new javax.swing.JTextField();
        txt_error = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_addTag = new javax.swing.JButton();
        btn_editTag = new javax.swing.JButton();
        btn_deleteTag = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tag = new javax.swing.JTable();
        txt_id = new javax.swing.JTextField();

        setBackground(new java.awt.Color(186, 148, 243));
        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(186, 148, 243));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Tag");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt_tag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tag.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tag.setText("Lecture/Practical/Tutorial");
        txt_tag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tagMouseClicked(evt);
            }
        });
        txt_tag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tagActionPerformed(evt);
            }
        });

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 51, 51));
        txt_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btn_addTag.setBackground(new java.awt.Color(255, 255, 255));
        btn_addTag.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_addTag.setForeground(new java.awt.Color(51, 51, 51));
        btn_addTag.setText("Insert");
        btn_addTag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTagActionPerformed(evt);
            }
        });
        jPanel4.add(btn_addTag);

        btn_editTag.setBackground(new java.awt.Color(255, 255, 255));
        btn_editTag.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_editTag.setText("Update");
        btn_editTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editTagActionPerformed(evt);
            }
        });
        jPanel4.add(btn_editTag);

        btn_deleteTag.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteTag.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_deleteTag.setText("Delete");
        btn_deleteTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteTagActionPerformed(evt);
            }
        });
        jPanel4.add(btn_deleteTag);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(txt_tag, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(txt_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(297, 297, 297))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txt_tag, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 940, 250));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tbl_tag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_tag.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tag"
            }
        ));
        tbl_tag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_tag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tagMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_tag);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 590, 370));

        txt_id.setText("ID");
        add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tagActionPerformed
        txt_tag.setText("");

    }//GEN-LAST:event_txt_tagActionPerformed

    private void btn_addTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTagActionPerformed
        // TODO add your handling code here:
        try{
            DefaultTableModel model = (DefaultTableModel)tbl_tag.getModel();
            connection = DBconnection.getConnection();

            if(txt_tag.getText().equals("")){
                txt_error.setText("Enter Tag*");
            }
            else{
                
                if(txt_tag.getText().contentEquals("Practical")||txt_tag.getText().contentEquals("Lecture")||txt_tag.getText().contentEquals("Tutorial")){
                    txt_error.setText("");

                    statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_TAG_TABLE));

                    statement.setString(1, txt_tag.getText());

                    statement.executeUpdate();
                    model.setRowCount(0);
                    showTagList();
                    txt_tag.setText("");
                    JOptionPane.showMessageDialog(null, "inserting successful");
                }else{
                    txt_error.setText("Please follow this types Lecture/Practical/Tutorial");
                }
            }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        
        txt_tag.setText("Lecture/Practical/Tutorial");
    }//GEN-LAST:event_btn_addTagActionPerformed

    private void tbl_tagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tagMouseClicked
        // TODO add your handling code here:
        int i = tbl_tag.getSelectedRow();
        TableModel model = tbl_tag.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
        txt_tag.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_tbl_tagMouseClicked

    private void btn_editTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editTagActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_tag.getModel();
            Statement smt = connection.createStatement();
            
            if(txt_tag.getText().equals("")){
                txt_error.setText("Select Tag*");
            }
            else{
                if(txt_tag.getText().contentEquals("Practical")||txt_tag.getText().contentEquals("Lecture")||txt_tag.getText().contentEquals("Tutorial")){
                    txt_error.setText("");

                    smt.execute("UPDATE tag SET tag = '"+txt_tag.getText()+"' WHERE id = "+id); 
                    model.setRowCount(0);
                    showTagList();
                    txt_tag.setText("");
                    JOptionPane.showMessageDialog(this, "Updated");
                }else{
                    txt_error.setText("Please follow this types Lecture/Practical/Tutorial");
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        txt_tag.setText("Lecture/Practical/Tutorial");
    }//GEN-LAST:event_btn_editTagActionPerformed

    private void btn_deleteTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteTagActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_tag.getModel();
            Statement smt = connection.createStatement();
            
            if(txt_tag.getText().equals("")){
                txt_error.setText("Select Tag*");
            }
            else{
                txt_error.setText("");
                
            smt.execute("DELETE FROM tag WHERE id = "+id); 
            model.setRowCount(0);
            showTagList();
            txt_tag.setText("");
            JOptionPane.showMessageDialog(this, "Deleted");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        txt_tag.setText("Lecture/Practical/Tutorial");
    }//GEN-LAST:event_btn_deleteTagActionPerformed

    private void txt_tagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tagMouseClicked
        txt_tag.setText("");
    }//GEN-LAST:event_txt_tagMouseClicked

    public ArrayList<tag> getTagList()
    {
        ArrayList<tag> list = new ArrayList<tag>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from tag";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        tag Tag;
        while(rs.next())
        {
            Tag = new tag(rs.getInt("id"), rs.getString("tag"));
            list.add(Tag);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showTagList()
    {
        ArrayList<tag> list = getTagList();
        DefaultTableModel model = (DefaultTableModel)tbl_tag.getModel();
        Object[] row = new Object[2];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getTag();
            
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addTag;
    private javax.swing.JButton btn_deleteTag;
    private javax.swing.JButton btn_editTag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_tag;
    private javax.swing.JLabel txt_error;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_tag;
    // End of variables declaration//GEN-END:variables
}
