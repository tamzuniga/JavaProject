/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author tamara
 */
public class Request01 {
    private ArrayList <Element01> requestBag;
    
    
    public Request01(){
        
        this.requestBag = new ArrayList<Element01>();
        
    }
    
    
        public void add (Element01 element){
        this.requestBag.add(element);
       
    }
        
    
    public void connectTodatabase( int q, int i){
        Connection connection2;
        PreparedStatement ps2;
                        
         try {   
     
             connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercado_espanol?&user=root&password=Pasword123"
                     + "&useLegacyDatetimeCode=false&serverTimezone=UTC");

                      
             ps2 = connection2.prepareStatement("UPDATE productos SET cantidad=? WHERE id =?");
             
             ps2.setInt(1,q);
             ps2.setInt(2, i);
             
             ps2.executeUpdate();
                 
             connection2.close();
             
          } catch(SQLException e){
              JOptionPane.showMessageDialog(null, "No existe tanta cantidad en stock");
          }
            
        }
        
      
    
    public int size (){
        return requestBag.size();
    }
    
    public Element01 getIndex (int index){
        
        return requestBag.get(index);
    }

    
    
}
