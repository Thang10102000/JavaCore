package lab2.bai2.qlsp.jFrame;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lab2.bai2.qlsp.JDBC.DBConnection;
import lab2.bai2.qlsp.Entity.Products;
import lab2.bai2.qlsp.Entity.ProductsController;

public class QLSP extends javax.swing.JFrame {

    ProductsController productsController = new ProductsController();
    private ArrayList<Products> list;
    private DefaultTableModel model;

    public QLSP() {
        initComponents();
        initTable();
        centreWindow(this);
    }
    public static void centreWindow(QLSP frame) {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
    frame.setLocation(x, y);
}

    private void initTable() {
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Tên SP");
        model.addColumn("Giá SP");
        model.addColumn("Số lượng");
        //model.setColumnIdentifiers(collumHeaders);
        list = ProductsController.getAllProducts();

        for (Products products : list) {
            model.addRow(products.toArray());
        }

        tbProducts.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();
        MaHH = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cbxItem = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProducts = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu23 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        MaHH.setText("Mã HH");

        jLabel2.setText("Tên HH");

        jLabel3.setText("Số Lượng");

        jLabel4.setText("Giá ");

        txtID.setEnabled(false);

        txtSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSLActionPerformed(evt);
            }
        });

        btnReset.setText("THêm Mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSearch.setText("Tìm kiếm theo ID");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnSort.setText("sắp xếp theo ");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSave.setText("Lưu dữ liệu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cbxItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Price", "SL" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(MaHH, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(txtName)
                    .addComponent(txtSL, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txtGia))
                .addGap(108, 108, 108)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSearch)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addComponent(cbxItem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaHH, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset)
                    .addComponent(btnSave))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSort)
                            .addComponent(cbxItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("List of Product"));

        tbProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbProductsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbProducts);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu23.setText("Menu");
        jMenuBar1.add(jMenu23);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDesktopPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSLActionPerformed

    }//GEN-LAST:event_txtSLActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

 Connection connection;
        try {
           // Products products = new Products();
            connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             String sql2 = "select *from `sanpham` where ID="+txtSearch.getText();
              ResultSet resultSet = statement.executeQuery(sql2);
              if (resultSet.next()) {
                txtID.setText(resultSet.getString("ID"));
                txtName.setText(resultSet.getString("name"));
                txtSL.setText(resultSet.getString("soLuong"));
                txtGia.setText(resultSet.getString("giaSP"));
            }
              else{
                  JOptionPane.showMessageDialog(this, "Không có Sản phẩm nào có id ="+txtSearch.getText());
              }
        } catch (SQLException ex) {
            Logger.getLogger(QLSP.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        txtID.setText("");
        txtName.setText("");
        txtSL.setText("");
        txtGia.setText("");
        btnSave.setText("Save");

        txtID.setFocusable(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            StringBuilder error = new StringBuilder();

            if (txtName.getText().equals("")) {
                error.append("Name k được để trống ");
            }

            if (txtSL.getText().equals("")) {
                error.append("Số lượng k được để trống ");
            }
            if (txtGia.getText().equals("")) {
                error.append("Giá k được để trống ");
            }
            if (!error.isEmpty()) {
                JOptionPane.showMessageDialog(this, error.toString());
                return;
            }
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();

            boolean isExisted = false;
            Products products = new Products();
            products.setID(txtID.getText());
            products.setName(txtName.getText());
            products.setSoluong(Integer.parseInt(txtSL.getText()));
            products.setGiaSP(Double.parseDouble(txtGia.getText()));

            if (btnSave.getText().equals("update")) {
                for (Products sp : list) {
                    if (sp.getID().equals(txtID.getText())) {
                        String sql2 = "update `sanpham` set name='" + txtName.getText() + "',soLuong=" + txtSL.getText()
                                + ",giaSP=" + txtGia.getText() + "where ID=" + sp.getID() + ";";
                        int resultSet = statement.executeUpdate(sql2);
                        initTable();
                    }

                }
            } else {
                boolean isName = false;
                for (Products sp : list) {
                    if (sp.getName().equals(txtName.getText())) {
                        JOptionPane.showMessageDialog(this, " Tên sản phẩm đã tồn tại");
                        isName = true;
                    }

                }
                if (!isName) {

                    String sql = "INSERT INTO `sanpham` (`name`, `soLuong`, `giaSP`)"
                            + " VALUES ('" + products.getName() + "'," + products.getSoluong() + "," + products.getGiaSP() + ");";
                    int resultSet = statement.executeUpdate(sql);
                    //System.out.println(sql);
                    JOptionPane.showMessageDialog(this, "Lưu thành công");
                    txtID.setText("");
                    txtName.setText("");
                    txtSL.setText("");
                    txtGia.setText("");
                }
                initTable();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductsMousePressed
//        int selectedRow = tbProducts.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            Products products = list.get(selectedRow);
//            txtID.setText(products.getID());
//            txtName.setText(products.getName());
//            txtSL.setText("" + products.getSoluong());
//            txtGia.setText("" + products.getGiaSP());
//            btnSave.setText("update");
//        }
    }//GEN-LAST:event_tbProductsMousePressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            if (txtID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời chọn Sản phẩm cần xóa");
                return;
            } else {
                if (JOptionPane.showConfirmDialog(this, "bạn có muốn xóa sản phẩm có id :" + txtID.getText(),
                        "thông báo ", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                    return;
                }

                String sql = "delete from `sanpham` where ID=" + txtID.getText();
                int resultSet = statement.executeUpdate(sql);
                txtID.setText("");
                txtName.setText("");
                txtSL.setText("");
                txtGia.setText("");
                initTable();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed

        model.setRowCount(0);
        list.forEach(item -> {
            model.addRow(new Object[]{item.getID(), item.getName(), item.getSoluong(), item.getGiaSP()});
        });

        String selectedItem = (String) cbxItem.getSelectedItem();

        if (selectedItem.equals("Name")) {
            Collections.sort(list, new Comparator<Products>() {
                @Override
                public int compare(Products o1, Products o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            model.fireTableDataChanged();
        } else if (selectedItem.equals("Price")) {
            Collections.sort(list, new Comparator<Products>() {
                @Override
                public int compare(Products o1, Products o2) {
                    return o1.getGiaSP() > (o2.getGiaSP()) ? 1 : -1;
                }
            });
            model.fireTableDataChanged();
        } else {
            Collections.sort(list, new Comparator<Products>() {
                @Override
                public int compare(Products o1, Products o2) {
                    return o1.getSoluong() > (o2.getSoluong()) ? 1 : -1;
                }
            });
            model.fireTableDataChanged();
        }

        model.fireTableDataChanged();

    }//GEN-LAST:event_btnSortActionPerformed

    private void tbProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductsMouseClicked
        int selectedRow = tbProducts.getSelectedRow();

        if (selectedRow >= 0) {
            Products products = list.get(selectedRow);
            txtID.setText(products.getID());
            txtName.setText(products.getName());
            txtSL.setText("" + products.getSoluong());
            txtGia.setText("" + products.getGiaSP());
            btnSave.setText("update");
    }//GEN-LAST:event_tbProductsMouseClicked
        }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MaHH;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JComboBox<String> cbxItem;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProducts;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
