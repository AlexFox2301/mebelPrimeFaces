package DAO;


import tables.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class EmployeeDAO {

    @PersistenceContext (unitName = "WebAppPU")
    EntityManager emEmployee;

    public List<Employee> findAll() {
        return emEmployee.createQuery("select  e from Employee e").getResultList();
    }

}
