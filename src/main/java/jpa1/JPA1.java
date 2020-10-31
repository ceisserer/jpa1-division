// (c) Clemens Eisserer, 2017-2020

package jpa1;

import java.util.List;
import javax.persistence.*;

public class JPA1 {
    EntityManagerFactory emf;
    EntityManager em;
    
    public JPA1() {
        emf = Persistence.createEntityManagerFactory("JPA1PU"); 
        em = emf.createEntityManager();
    }
    
    public void insertTestData() {
    }
    
    public void executeJPQLQueries() {
    }
    
    public static void main(String[] args) throws Exception {
        JPA1 jpa1 = new JPA1();
        jpa1.insertTestData();
        jpa1.executeJPQLQueries();
    }
}
