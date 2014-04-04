
package br.com.ifpb.daca.barcommerce.util;

import br.com.ifpb.daca.barcommerce.bean.Sistema;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.eclipse.persistence.sessions.Session;

 /**
 *
 * @author vanderlan
 */
public class ConnectionFactory {
 
    private Session session;
    
    public static void main(String[] args) {
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Barcommerce-PU");
        EntityManager manager = entityManagerFactory.createEntityManager();
        
        manager.getTransaction().begin();
        
        Sistema sis = new Sistema(Integer.MIN_VALUE,"fiowqef", "diuwqbufiw","ghireu");
        
        manager.persist(sis);
        
        manager.getTransaction().commit();
        
        manager.close();
        entityManagerFactory.close();
        
    }
            
}