package DAO;

import tables.Order;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class OrderDAO {

    @PersistenceContext (unitName = "WebAppPU")
    EntityManager emOrder;

    public List<Order> findAll(){
        return  emOrder.createQuery("select o from Order o").getResultList();
    }
}
