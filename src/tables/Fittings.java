package tables;

import javax.persistence.*;

//ФУРНИТУРА
@Entity
public class Fittings {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    private String nameFittings;
    @Basic
    private int quantity;           //количество
    @Basic
    private int priceFittings;   //цена в копейках

    ////////////////////////Конструкторы////////////////////////

    public Fittings(String nameFittings) {
        this.nameFittings = nameFittings;
    }

    public Fittings() {
    }

    /////////////////////Геттеры / Сеттеры//////////////////////


    public String getNameFittings() {
        return nameFittings;
    }

    public void setNameFittings(String nameFitting) {
        this.nameFittings = nameFitting;
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
