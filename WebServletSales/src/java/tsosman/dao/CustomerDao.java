package tsosman.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tsosman.entities.Customers;


public class CustomerDao extends SuperDuperDao {
    
    private final String SELECTALL = "SELECT ccode,cname FROM customer";
    
    public List<Customers> selectAll(){
        
        List<Customers> customers = new ArrayList();
        Statement st = null;
        ResultSet rs = null;
        Connection conn = null;
        
        try {
            conn = openConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SELECTALL);
            while(rs.next()){
                int ccode = rs.getInt(1);
                String cname = rs.getString(2);
                Customers c = new Customers(ccode,cname);
                customers.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
        closeConnection(st, rs);
        }
        return customers;
        
    }
    
}
