/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import MODEL.History;
import MODEL.UIDATA;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author bharv
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    History history;
    public ViewJPanel(History history) {
        initComponents();
        this.history = history;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CPN = new javax.swing.JLabel();
        CPNT = new javax.swing.JTextField();
        EMID = new javax.swing.JLabel();
        EMIDT = new javax.swing.JTextField();
        PH = new javax.swing.JLabel();
        UpBtn = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SDT = new javax.swing.JTextField();
        L = new javax.swing.JLabel();
        LT = new javax.swing.JTextField();
        TI = new javax.swing.JLabel();
        TIT = new javax.swing.JTextField();
        PT = new javax.swing.JLabel();
        PTT = new javax.swing.JTextField();
        FN = new javax.swing.JLabel();
        FNT = new javax.swing.JTextField();
        EID = new javax.swing.JLabel();
        EIDT = new javax.swing.JTextField();
        A = new javax.swing.JLabel();
        AT = new javax.swing.JTextField();
        G = new javax.swing.JLabel();
        GT = new javax.swing.JTextField();
        SD = new javax.swing.JLabel();
        CPN1 = new javax.swing.JLabel();
        CPNT1 = new javax.swing.JTextField();
        EMID1 = new javax.swing.JLabel();
        EMIDT1 = new javax.swing.JTextField();
        PH1 = new javax.swing.JLabel();
        UploadLabel = new javax.swing.JLabel();
        ViewBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        UpBtn1 = new javax.swing.JButton();
        SEARCHT = new javax.swing.JTextField();

        CPN.setText("Cell Phone Number:");

        EMID.setText("Email Id:");

        PH.setText("Photo:");

        UpBtn.setText("UPLOAD");
        UpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpBtnActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("View Records");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cell Phone Number", "Email ID"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        L.setText("Level:");

        TI.setText("Team Info:");

        PT.setText("Position Title:");

        FN.setText("Full Name:");

        FNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNTActionPerformed(evt);
            }
        });

        EID.setText("Employee ID:");

        EIDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIDTActionPerformed(evt);
            }
        });

        A.setText("Age:");

        G.setText("Gender:");

        SD.setText("Start Date:");

        CPN1.setText("Cell Phone Number:");

        EMID1.setText("Email Id:");

        PH1.setText("Photo:");

        ViewBtn.setBackground(new java.awt.Color(0, 0, 0));
        ViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewBtn.setText("View");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(0, 0, 0));
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        UpBtn1.setBackground(new java.awt.Color(0, 0, 0));
        UpBtn1.setForeground(new java.awt.Color(255, 255, 255));
        UpBtn1.setText("Update");
        UpBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpBtn1ActionPerformed(evt);
            }
        });

        SEARCHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHTActionPerformed(evt);
            }
        });
        SEARCHT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SEARCHTKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SEARCHTKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SD)
                            .addComponent(G)
                            .addComponent(A)
                            .addComponent(EID)
                            .addComponent(FN))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(GT, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(AT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FNT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EIDT)
                            .addComponent(SDT))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TI)
                                    .addComponent(L)
                                    .addComponent(PT)
                                    .addComponent(EMID1)
                                    .addComponent(CPN1))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CPNT1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(PTT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TIT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EMIDT1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(UpBtn1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(PH1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UploadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 220, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SEARCHT, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DeleteBtn, UpBtn1, ViewBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L)
                            .addComponent(LT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TI)
                            .addComponent(TIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PT)
                            .addComponent(PTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CPN1)
                            .addComponent(CPNT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EMID1)
                            .addComponent(EMIDT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FN)
                            .addComponent(FNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EID)
                            .addComponent(EIDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A)
                            .addComponent(AT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(G)
                            .addComponent(GT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SD)
                            .addComponent(SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PH1)
                    .addComponent(UploadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(UpBtn1)
                    .addComponent(SEARCHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DeleteBtn, ViewBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void FNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNTActionPerformed

    private void EIDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EIDTActionPerformed

    private void UpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        
        int SelectedRowIndex = jTable1.getSelectedRow();
        
        if(SelectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return; 
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        UIDATA selectedUI = (UIDATA)model.getValueAt(SelectedRowIndex, 0);
        
        history.deleteUI(selectedUI);
        
            JOptionPane.showMessageDialog(this, "Record Deleted.");
            
            populateTable();

    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        // TODO add your handling code here:
        
         int SelectedRowIndex = jTable1.getSelectedRow();
        
        if(SelectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return; 
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        UIDATA selectedUI = history.getHistory().get(SelectedRowIndex);
        
        FNT.setText(selectedUI.getFullName());
        EIDT.setText(selectedUI.getEmployeeID());
        AT.setText(selectedUI.getAge());
        GT.setText(selectedUI.getGender());
        SDT.setText(selectedUI.getStartDate().toString());
        LT.setText(selectedUI.getLevel());
        TIT.setText(selectedUI.getTeamInfo());
        PTT.setText(selectedUI.getPositionTitle());
        CPNT1.setText(selectedUI.getCellPhoneNumber());
        EMIDT1.setText(selectedUI.getEmailID());
        Image image = selectedUI.getPhoto();
        ImageIcon imic = new ImageIcon(image);
        UploadLabel.setIcon(imic);
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //int SelectedRow = jTable1.getSelectedRow();
        //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //FNT.setText(model.getValueAt(SelectedRow, 0).toString());
        //EIDT.setText(model.getValueAt(SelectedRow, 1).toString());
        ///AT.setText(model.getValueAt(SelectedRow, 2).toString());
        //GT.setText(model.getValueAt(SelectedRow, 3).toString());
        //SDT.setText(model.getValueAt(SelectedRow, 4).toString());
        //LT.setText(model.getValueAt(SelectedRow, 5).toString());
        //TIT.setText(model.getValueAt(SelectedRow, 6).toString());
        //PTT.setText(model.getValueAt(SelectedRow, 7).toString());
        //CPNT.setText(model.getValueAt(SelectedRow, 8).toString());
        //EMIDT.setText(model.getValueAt(SelectedRow, 9).toString());
        //UpBtn.setText(model.getValueAt(SelectedRow, 10).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void UpBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpBtn1ActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(i >= 0){
            model.setValueAt(FNT.getText(), i, 0);
            model.setValueAt(EIDT.getText(), i, 1);
            model.setValueAt(AT.getText(), i, 2);
            model.setValueAt(GT.getText(), i, 3);
            model.setValueAt(SDT.getText(), i, 4);
            model.setValueAt(LT.getText(), i, 5);
            model.setValueAt(TIT.getText(), i, 6);
            model.setValueAt(PTT.getText(), i, 7);
            model.setValueAt(CPNT1.getText(), i, 8);
            model.setValueAt(EMIDT1.getText(), i, 9);
            model.setValueAt(UpBtn.getText().toString(), i, 10);
        }else{
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }//GEN-LAST:event_UpBtn1ActionPerformed

    private void SEARCHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHTActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SEARCHTActionPerformed

    private void SEARCHTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCHTKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_SEARCHTKeyReleased

    private void SEARCHTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCHTKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(SEARCHT.getText().trim()));
    }//GEN-LAST:event_SEARCHTKeyPressed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JTextField AT;
    private javax.swing.JLabel CPN;
    private javax.swing.JLabel CPN1;
    private javax.swing.JTextField CPNT;
    private javax.swing.JTextField CPNT1;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel EID;
    private javax.swing.JTextField EIDT;
    private javax.swing.JLabel EMID;
    private javax.swing.JLabel EMID1;
    private javax.swing.JTextField EMIDT;
    private javax.swing.JTextField EMIDT1;
    private javax.swing.JLabel FN;
    private javax.swing.JTextField FNT;
    private javax.swing.JLabel G;
    private javax.swing.JTextField GT;
    private javax.swing.JLabel L;
    private javax.swing.JTextField LT;
    private javax.swing.JLabel PH;
    private javax.swing.JLabel PH1;
    private javax.swing.JLabel PT;
    private javax.swing.JTextField PTT;
    private javax.swing.JLabel SD;
    private javax.swing.JTextField SDT;
    private javax.swing.JTextField SEARCHT;
    private javax.swing.JLabel TI;
    private javax.swing.JTextField TIT;
    private javax.swing.JLabel Title;
    private javax.swing.JButton UpBtn;
    private javax.swing.JButton UpBtn1;
    private javax.swing.JLabel UploadLabel;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (UIDATA ud : history.getHistory()){
        
            Object[] row = new Object[10];
            row[0] = ud;
            row[1] = ud.getEmployeeID();
            row[2] = ud.getAge();
            row[3] = ud.getGender();
            row[4] = ud.getStartDate();
            row[5] = ud.getLevel();
            row[6] = ud.getTeamInfo();
            row[7] = ud.getPositionTitle();
            row[8] = ud.getCellPhoneNumber();
            row[9] = ud.getEmailID();
            
            model.addRow(row);
        }
    }
}
