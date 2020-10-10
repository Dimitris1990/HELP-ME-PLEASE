package tsosman.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SuperDuperDao {
    
    private final String URL = "jdbc:mysql://localhost:3306/sales?serverTimezone=UTC";
    private final String USER = "root";;
    private final String PASSWORD = "1234";;
    private Connection conn;
    
    protected Connection openConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            conn  = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(SuperDuperDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
        
    } 
    
    protected void closeConnection(Statement st, ResultSet rs){
        
        try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
        } catch (SQLException ex) {
            Logger.getLogger(SuperDuperDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
