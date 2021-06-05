/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.KhachHang;
import Services.KhachHangServices;
import java.lang.System.Logger;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author congt
 */
public class addCustomer extends javax.swing.JFrame {

    /**
     * Creates new form addCustomer
     */
    KhachHangServices khServices;
    
    public addCustomer() throws SQLException {
        initComponents();
        
        int code = 0;
        String strCode = "";
        code = (int) Math.floor(((Math.random() * 899999) + 100000));
        strCode = String.valueOf(code);
        
        jTFMaKH.setText(strCode);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFMaKH = new javax.swing.JTextField();
        jTFDiaChiKH = new javax.swing.JTextField();
        jTFDienThoai = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jTFSoDu = new javax.swing.JTextField();
        jTFTenKH = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cập Nhật Khách Hàng");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã Khách Hàng");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên Khách Hàng");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Địa Chỉ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Điện Thoại");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Số Dư Tài Khoản");

        jTFMaKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFMaKH.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFMaKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFMaKH.setEnabled(false);
        jTFMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMaKHActionPerformed(evt);
            }
        });

        jTFDiaChiKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFDiaChiKH.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFDiaChiKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFDienThoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFDienThoai.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDienThoaiActionPerformed(evt);
            }
        });

        jTFEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFEmail.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });

        jTFSoDu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFSoDu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFSoDu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFSoDu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSoDuActionPerformed(evt);
            }
        });

        jTFTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFTenKH.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFTenKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(58, 58, 58)
                                .addComponent(jTFSoDu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(132, 132, 132)
                                .addComponent(jTFEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(97, 97, 97)
                                .addComponent(jTFDienThoai))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(120, 120, 120)
                                .addComponent(jTFDiaChiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(jTFTenKH))))
                .addGap(10, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jTFDiaChiKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTFDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFSoDu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDienThoaiActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailActionPerformed

    private void jTFSoDuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSoDuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSoDuActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        jTFMaKH.setText("");
        jTFTenKH.setText("");
        jTFDiaChiKH.setText("");
        jTFDienThoai.setText("");
        jTFEmail.setText("");
        jTFSoDu.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (jTFMaKH.getText().equals("") || jTFTenKH.getText().equals("") || jTFDiaChiKH.getText().equals("") || jTFDienThoai.getText().equals("") || jTFEmail.getText().equals("") || jTFSoDu.getText().equals("") ){
            JOptionPane.showMessageDialog(addCustomer.this, "Không Nhận Giá Trị Rỗng","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
        int confirm = JOptionPane.showConfirmDialog(addCustomer.this, "Bạn Có Chắc Chắn Muốn Thêm Không!","Thông Báo",JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION){
            try {
                if (!jTFEmail.getText().trim().contains("@")){
                    System.out.println("Định dạng email hoặc  SAI!");
                }
                else{
                    KhachHang kh = new KhachHang();
                    khServices = new KhachHangServices();
                    kh.setMaKH(jTFMaKH.getText().trim());
                    kh.setTenKH(jTFTenKH.getText().trim());
                    kh.setDiaChiKH(jTFDiaChiKH.getText().trim());
                    kh.setDienThoai(jTFDienThoai.getText().trim());
                    kh.setEmail(jTFEmail.getText().trim());
                    kh.setSoDuTaiKhoan(Long.parseLong(jTFSoDu.getText().trim()));

                    khServices.addKhachHang(kh);

                    // trở về trang trước
                    new Customer().setVisible(true);
                    this.dispose();
                }
                
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTFMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMaKHActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTFDiaChiKH;
    private javax.swing.JTextField jTFDienThoai;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFMaKH;
    private javax.swing.JTextField jTFSoDu;
    private javax.swing.JTextField jTFTenKH;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
