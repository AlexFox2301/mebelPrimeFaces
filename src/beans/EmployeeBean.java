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

    /////////////Переменные/////////////////////////////////////////////////

    private String login;
    private String password;

    private boolean loginSuccess;
    private boolean createSuccess;

    private String searchText;

    /////////////Геттеры / Сеттеры /////////////////////////////////////////

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

    public boolean isLoginSuccess() {
        return loginSuccess;
    }

    public void setLoginSuccess(boolean loginSuccess) {
        this.loginSuccess = loginSuccess;
    }

    public boolean isCreateSuccess() {
        return createSuccess;
    }

    public void setCreateSuccess(boolean createSuccess) {
        this.createSuccess = createSuccess;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    ///////////////Методы//////////////////////////////////////////////////

    public void checkPassword(){
        loginSuccess = employeeDAO.checkPassword(login, password);
    }

    public void search(){

    }

    public void deleted(){}


}
