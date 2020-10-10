package tsosman.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tsosman.entities.Customers;
import tsosman.services.CustomerService;


public class ListOfCustomersServlet extends HttpServlet {
        
    CustomerService service = new CustomerService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Customers> customerList = service.selectAll();
        req.setAttribute("customers", customerList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("customers.jsp");
        dispatcher.forward(req, resp);
        
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doGet(req,resp);
//    }
    
    

    

}
