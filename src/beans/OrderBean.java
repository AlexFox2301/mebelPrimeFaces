package beans;

import DAO.OrderDAO;
import tables.Order;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean (name = "dtOrderBean")
@Named
@SessionScoped
public class OrderBean implements Serializable{

    @EJB
    OrderDAO orderDAO;

    public List<Order> getOrders(){
        return orderDAO.findAll();
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

    public List<String> images (String textFilter){//липовая заглушка
        List<String> im = new ArrayList<>();
        return im;
    }
}
