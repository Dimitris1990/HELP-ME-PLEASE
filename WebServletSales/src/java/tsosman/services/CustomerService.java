package tsosman.services;

import java.util.List;
import tsosman.dao.CustomerDao;
import tsosman.entities.Customers;


public class CustomerService {

    CustomerDao cDao = new CustomerDao();
    
    public List<Customers> selectAll() {
        return cDao.selectAll();
    }
    
}
