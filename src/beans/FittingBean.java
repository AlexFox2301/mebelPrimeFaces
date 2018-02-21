package beans;

import DAO.FittingDAO;
import tables.Fittings;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ManagedBean (name = "dtFittingBean")
@Named
@SessionScoped
public class FittingBean implements Serializable{

    @EJB
    FittingDAO fittingDAO;

    public List<Fittings> getFittings(){
        return fittingDAO.findAll();
    }

    ////////////Переменные/////////////////////////////////////////////////

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
