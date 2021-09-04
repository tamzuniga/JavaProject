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
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author tamara
 */
public class EarningsSaved {
    private final Calendar fecha = Calendar.getInstance();
    private int day;
    private int month;
    private int referenceNum;
    private ResultSet rs;
    
    public EarningsSaved(){
        day = fecha.get(Calendar.DAY_OF_MONTH);
        month = fecha.get(Calendar.MONTH) + 1;
        referenceNum = (int) (Math.random()*10000);
    }

    public int getDia() {
        return day;
    }

    public int getMes() {
        return month;
    }
    
    public void saveDate(float earnings){
        
        Connection con;
        PreparedStatement ps;
        
         try {
             
             con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mercado_espanol?&user=root&password=Pasword123"
                           + "&useLegacyDatetimeCode=false&serverTimezone=UTC");  
              
             ps = con.prepareStatement("INSERT INTO ganancias VALUES (?,?,?,?)");
        
        ps.setInt(1, referenceNum);
    
        ps.setFloat(2, earnings);

        ps.setInt(3, this.month);
        
        ps.setInt(4, this.day);

        
                ps.executeUpdate(); 
                
                rs=null;
                
             } catch (NumberFormatException | SQLException e) {
             
                 JOptionPane.showMessageDialog(null, "Inténtelo de nuevo");
             }
    }
}
