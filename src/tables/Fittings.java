package tables;

import javax.persistence.*;

//ФУРНИТУРА
@Entity
public class Fittings {

    @Id
    private Integer id;
    @Basic
    private String nameFittings;
    @Basic
    private int quantity;           //количество
    @Basic
    private int priceFittings;   //цена в копейках

    ///////////////

    public Fittings(String nameFittings) {
        this.nameFittings = nameFittings;
    }

    public Fittings() {
    }

    //////////////


    public String getNameFittings() {
        return nameFittings;
    }

    public void setNameFittings(String nameFittings) {
        this.nameFittings = nameFittings;
    }

    public int getPriceFittings() {
        return priceFittings;
    }

    public void setPriceFittings(int priceFittings) {
        this.priceFittings = priceFittings;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}