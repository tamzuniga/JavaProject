/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tamara
 */
public class ventasVentana extends javax.swing.JFrame {

private Connection connection=null;
private PreparedStatement st;
private ResultSet rs;
            
            private Element01 element01;

private String cantidadesString;
private int quant;
private  DefaultTableModel modeloTabla;
private Request01 request = new Request01();

private  int parar=0;
private int identificadorId;
float gTotal;


    /**
     * Creates new form ventasVentana
     */
    public ventasVentana() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbCategoriaVentas = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnAnadirProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buscarLabel = new javax.swing.JLabel();
        panelCestaCompra = new javax.swing.JPanel();
        labelTotalCoste = new javax.swing.JLabel();
        labelCestaCompra = new javax.swing.JLabel();
        btnFin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaCestaCompra = new javax.swing.JTextArea();
        labelGananciaUno = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JTextField();
        labelCantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventas");

        cmbCategoriaVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "embutido", "aceitunas", "delMar", "Pate", "Snacks", "Arroces", "Legumbres", "Caldos", "Pasta", "Dulces", "Aceites", "Vinagres", "Salsas", "Vinos Blancos", "Vinos Tintos" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAnadirProducto.setText("Anadir");
        btnAnadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirProductoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "producto", "precio", "cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        buscarLabel.setFont(new java.awt.Font("DejaVu Sans", 3, 11)); // NOI18N
        buscarLabel.setText("Buscar en la categoria:");

        panelCestaCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas añadidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 11))); // NOI18N

        labelTotalCoste.setFont(new java.awt.Font("DejaVu Sans", 2, 11)); // NOI18N
        labelTotalCoste.setText("Ganancia anadida:");

        btnFin.setText("Finalizar");
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });

        txtareaCestaCompra.setEditable(false);
        txtareaCestaCompra.setBackground(new java.awt.Color(204, 204, 204));
        txtareaCestaCompra.setColumns(20);
        txtareaCestaCompra.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        txtareaCestaCompra.setRows(10);
        jScrollPane2.setViewportView(txtareaCestaCompra);

        javax.swing.GroupLayout panelCestaCompraLayout = new javax.swing.GroupLayout(panelCestaCompra);
        panelCestaCompra.setLayout(panelCestaCompraLayout);
        panelCestaCompraLayout.setHorizontalGroup(
            panelCestaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCestaCompraLayout.createSequentialGroup()
                .addGroup(panelCestaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCestaCompraLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(labelCestaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCestaCompraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelCestaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCestaCompraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCestaCompraLayout.createSequentialGroup()
                        .addComponent(labelTotalCoste, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelGananciaUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38)))
                .addContainerGap())
        );
        panelCestaCompraLayout.setVerticalGroup(
            panelCestaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelCestaCompraLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCestaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelCestaCompraLayout.createSequentialGroup()
                .addGroup(panelCestaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGananciaUno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotalCoste, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFin))
        );

        labelCantidad.setFont(new java.awt.Font("DejaVu Sans", 2, 11)); // NOI18N
        labelCantidad.setText("Cantidad: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelCestaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 94, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buscarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbCategoriaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnBuscar)
                                .addGap(211, 211, 211))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnadirProducto)
                                .addGap(318, 318, 318))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarLabel)
                    .addComponent(cmbCategoriaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnadirProducto)
                        .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(panelCestaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     
       buscarproducto(cmbCategoriaVentas.getSelectedItem().toString(), jTable1);       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAnadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirProductoActionPerformed
         
                  element01 = new Element01();
         anadirproductos();            
                 reservarcantidades(); 
         earnings();
         
    }//GEN-LAST:event_btnAnadirProductoActionPerformed

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Ganancias: " + gTotal);
        EarningsSaved nnn = new EarningsSaved();      
        nnn.saveDate(gTotal);        
        txtareaCestaCompra.setText("");
        
        restarenDataBase();
        
    }//GEN-LAST:event_btnFinActionPerformed
  
    
    
    private void earnings(){ 
        String va = labelGananciaUno.getText();
        
        float ve = Float.parseFloat(va);
        gTotal+= ve;
        
        }
    
    private void restarenDataBase (){

        for (int i = 0; i < request.size(); i++) {

            Element01 kkk = request.getIndex(i);

            int ident = kkk.getIdentify();
            int quantity = kkk.getQuantity();

            System.out.println(ident);
            System.out.println(quantity);

            request.connectTodatabase(quantity, ident);

                    }
      }
            
                                 
   
    private void reservarcantidades (){
                     
        identificadorId = Integer.parseInt(String.valueOf(modeloTabla.getValueAt(jTable1.getSelectedRow(),0)));
        cantidadesString = String.valueOf(modeloTabla.getValueAt(jTable1.getSelectedRow(),3));
        
        int cantidadesTabla = Integer.parseInt(cantidadesString);
        int cantidadResta = quant;
        int cantidadRestada = cantidadesTabla - cantidadResta;
        
                            int ide = identificadorId;   
                            element01.setIdentify(ide);
                            element01.setQuantity(cantidadRestada);
                            request.add(element01);
      
            } 
    
    private void anadirproductos (){
        
        String mensaje= "";
       
        try {
      
        String productoString= String.valueOf(modeloTabla.getValueAt(jTable1.getSelectedRow(),1)); 
        
        String precioString = String.valueOf(modeloTabla.getValueAt(jTable1.getSelectedRow(),2));
        
             
        float precio = Float.parseFloat(precioString);
        quant = Integer.parseInt(txtCantidadProducto.getText());
                       
        
        float totalPrecio = (float) precio*quant;

        
                mensaje+= productoString + " " + quant + " unidades " + totalPrecio + " € ";
               
        
           
                if (parar<11) {
                    txtareaCestaCompra.append(mensaje + '\n');  
                    
                    parar++;     
                                       
                    labelGananciaUno.setText(String.valueOf(totalPrecio));
                    
                } else
                    JOptionPane.showMessageDialog(null, "Sólo se permiten 10 lotes por pedido");
                
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no ha seleccionado ningún producto");
        }
    }  
    
       
    private void buscarproducto(String categoria, JTable tabla){
            
        String [] columnas = {"id", "producto","precio", "cantidad"};
        String [] registros = new String [4];
        modeloTabla = new DefaultTableModel(null, columnas);
        
        String sql; 
        
        
         try {
             
             sql= "SELECT id, producto,precio, cantidad FROM mercado_espanol.productos WHERE categ LIKE '%" + categoria + "%'";
             
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercado_espanol?&user=root&password=Pasword123"
                     + "&useLegacyDatetimeCode=false&serverTimezone=UTC");
                       
             st = connection.prepareStatement(sql);
             
             rs= st.executeQuery();
             
             while (rs.next()) {
                 registros[0] = rs.getString("id");
                 registros[1] = rs.getString("producto");
                 registros[2] = rs.getString("precio");
                 registros[3] = rs.getString("cantidad");
                 
                 modeloTabla.addRow(registros);
                 
                 }
                        
             
             jTable1.setModel(modeloTabla);
             connection.close();
             
         } catch (SQLException ex) {
             Logger.getLogger(ventasVentana.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
    
    public static void ventanaNueva() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventasVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirProducto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFin;
    private javax.swing.JLabel buscarLabel;
    private javax.swing.JComboBox<String> cmbCategoriaVentas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCestaCompra;
    private javax.swing.JLabel labelGananciaUno;
    private javax.swing.JLabel labelTotalCoste;
    private javax.swing.JPanel panelCestaCompra;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextArea txtareaCestaCompra;
    // End of variables declaration//GEN-END:variables

}