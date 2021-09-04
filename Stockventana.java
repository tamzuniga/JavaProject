/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.HeadlessException;
import java.sql.*;

import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Stockventana extends javax.swing.JFrame {

   private static Connection con = null;
   ResultSet rs;
   
           
    
    public Stockventana() {
        initComponents();
        leerdatos();
 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        productoLabel = new javax.swing.JLabel();
        cantiLabel = new javax.swing.JLabel();
        catLabel = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        precioText = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        infocantiLabel = new javax.swing.JLabel();
        infoprecioLabel = new javax.swing.JLabel();
        cantidadText = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCambiarRegistro = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stock de Almacen");

        btnNuevo.setText("Agregar nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        idLabel.setText("ID del producto");

        productoLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        productoLabel.setText("Producto");

        cantiLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        cantiLabel.setText("Cantidad");

        catLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        catLabel.setText("Categoria");

        precioLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        precioLabel.setText("Precio");

        cmbCategoria.setEditable(true);
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Embutidos", "Aceitunas", "DelMar", "Pate", "Snacks", "Arroces", "Legumbres", "Caldos", "Pasta", "Dulces", "Aceites", "Vinagres", "Salsas", "Vinos Blancos", "Vinos Tintos" }));

        infocantiLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        infocantiLabel.setText("Min 50 Max 900");

        infoprecioLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        infoprecioLabel.setText("Ej. 3.90");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setText("Si la categoria es nueva, puede anadirla. ");

        btnCambiarRegistro.setText("Modificar");
        btnCambiarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(catLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(precioLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(66, 66, 66))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(infocantiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCambiarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(precioText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(infoprecioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnNuevo)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productoLabel)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(infocantiLabel)
                        .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cantiLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catLabel)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLabel)
                    .addComponent(precioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoprecioLabel))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnCambiarRegistro))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        insertData();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCambiarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarRegistroActionPerformed
        // TODO add your handling code here:
        updateData();
    }//GEN-LAST:event_btnCambiarRegistroActionPerformed

 
    public static void stockVentana () {
        java.awt.EventQueue.invokeLater(new Runnable() {
          
            
            public void run() {
                new Stockventana().setVisible(true);
            }
            
            
        });
    }
    
       
     private void insertData() {
           
        Connection connection;
        
        PreparedStatement ps;
        
         try {
             
             connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mercado_espanol?&user=root&password=Pasword123"
                           + "&useLegacyDatetimeCode=false&serverTimezone=UTC");  
              
             ps = connection.prepareStatement("INSERT INTO productos VALUES (?,?,?,?,?)");
     
           
        int idInt= Integer.parseInt(idText.getText());
        
        ps.setInt(1, idInt);
                 
   
        ps.setString(2, txtProducto.getText());
        
        int cantidadInt = Integer.parseInt(cantidadText.getText());
        ps.setInt(3, cantidadInt);
        
        ps.setString(4, cmbCategoria.getSelectedItem().toString());
        
        float precioFloat = Float.parseFloat(precioText.getText());
        ps.setFloat(5, precioFloat);
        
                ps.executeUpdate(); 
                
                rs=null;
                
                leerdatos();
                
             } catch ( SQLException e) {
             
                 JOptionPane.showMessageDialog(null, "Revise los datos introducidos");
             
             }

    
    }
        
    
    private void leerdatos(){
            
         try {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercado_espanol?&user=root&password=Pasword123"
                     + "&useLegacyDatetimeCode=false&serverTimezone=UTC");
             
             String sql = "SELECT id,producto,cantidad,categ,precio FROM mercado_espanol.productos;";
             
             Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
             
             rs = statement.executeQuery(sql);
             
            
             
         } catch (SQLException ex) {
             Logger.getLogger(Stockventana.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    private void updateData(){
    
        Connection connection;
        
        PreparedStatement ps;
        
        try {
            
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mercado_espanol?&user=root&password=Pasword123"
                           + "&useLegacyDatetimeCode=false&serverTimezone=UTC");
            
            ps = connection.prepareStatement("UPDATE productos SET producto=?,cantidad=?, categ=?, precio=? WHERE id=?");
            int ide= Integer.parseInt(idText.getText());
            int cant = Integer.parseInt(cantidadText.getText());
            float pre = Float.parseFloat(precioText.getText());
            
               
                ps.setString(1, txtProducto.getText());
                ps.setInt(2, cant);
                ps.setString(3, cmbCategoria.getSelectedItem().toString());
                ps.setFloat(4, pre);
                ps.setInt(5, ide);
                
            
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Se ha actualizado el Stock",
                 "Aviso", JOptionPane.WARNING_MESSAGE);
		
        } catch(SQLException e){
		
	JOptionPane.showMessageDialog(null, "error", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);}
        
		
                 
                
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarRegistro;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel cantiLabel;
    private javax.swing.JTextField cantidadText;
    private javax.swing.JLabel catLabel;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel infocantiLabel;
    private javax.swing.JLabel infoprecioLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JTextField precioText;
    private javax.swing.JLabel productoLabel;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
