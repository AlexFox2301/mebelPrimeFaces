package beans;


import DAO.ClientDAO;
import tables.Client;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name="dtClientBean")
@Named
@SessionScoped
public class ClientBean implements Serializable {
   @EJB
    ClientDAO clientDAO;

   public List<Client> getClients(){
       return clientDAO.findAll();
   }

    /////////////Переменные/////////////////////////////////////////////////

    private String searchText;

   /////////////Геттеры / Сеттеры /////////////////////////////////////////

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

///////////////Методы//////////////////////////////////////////////////

    public void search(){}//липовая заглушка

    public void deleted(){}//липовая заглушка
}
