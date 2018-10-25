/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qrcode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author VIKRANT
 */
public class DBconnection {
    
     static Statement stt;
     static Connection con=null;
 public static Connection getCOnb(){
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/qrcode";
            con=DriverManager.getConnection(url,"root","");
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
        
    }
    }
}
