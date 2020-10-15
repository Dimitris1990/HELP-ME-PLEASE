package tsosman;

import entity.Student;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class MainClass {

    private static StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    
    public static void main(String[] args){
        
        SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = (Transaction) session.beginTransaction();
        
        Student student = new Student();
        student.setSname("Dimitris");
        student.setDob(LocalDate.now());
        student.setFees(100.0);
        
        session.save(student);
        try {
            transaction.commit();
        } catch (RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | SystemException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        session.close();
        factory.close();
        
    }
    
}
