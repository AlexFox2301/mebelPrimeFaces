package DAO;

import tables.Fittings;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class FittingDAO {

    @PersistenceContext (unitName = "WebAppPU")
    EntityManager emFitting;

    public List<Fittings> findAll(){
        return emFitting.createQuery("select f from Fittings f").getResultList();
    }
}
