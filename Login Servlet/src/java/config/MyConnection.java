/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author hidayah creating connection
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

    Connection con;        
   
    /*static {
        try {
            /*Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
		} catch(Exception e){
			e.printStackTrace();
		}
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/account;create=true;user=account;password=account");
        }
        catch(Exception e){
			e.printStackTrace();
		}
    }*/
    public Connection getConnection() 
    
    {
        try {
            /*Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
		} catch(Exception e){
			e.printStackTrace();org.apache.derby.jdbc.ClientDriver
		}*/
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Account;create=true;user=account;password=account");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
