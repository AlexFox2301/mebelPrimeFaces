package DAO;



import com.mysql.jdbc.StringUtils;
import tables.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//import org.apache.commons.lang3.StringUtils;


@Stateless
public class EmployeeDAO {

    @PersistenceContext (unitName = "WebAppPU")
    EntityManager emEmployee;

    public List<Employee> findAll() {
        return emEmployee.createQuery("select  e from Employee e").getResultList();
    }

    public boolean checkPassword (String login, String password){

        if (StringUtils.isEmptyOrWhitespaceOnly(login) || StringUtils.isEmptyOrWhitespaceOnly(password)){
            return false;
        }

        Employee employee = emEmployee.find(Employee.class, login);
        if (employee == null){return false;}

        if (password.equals(employee.getPassword())){
            return true;
        }

        return false;

    }



}
