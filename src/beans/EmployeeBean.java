package beans;


import DAO.EmployeeDAO;
import tables.Employee;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class EmployeeBean implements Serializable{

    @EJB
    EmployeeDAO employeeDAO;

    public List<Employee> getEmployees(){
        return employeeDAO.findAll();
    }

    /////////////Переменные////////////////////////////////////////

    private String login;
    private String password;
    private boolean logged;

    /////////////Геттеры / Сеттеры /////////////////////////////////////////

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    ///////////////Методы//////////////////////////////////

    public void doLogin(){

        logged = true;

    }


}
