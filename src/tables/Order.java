package tables;


import javax.persistence.*;
import java.util.Date;

//class Confirmation {
//    public enum confirmation {CONFIRMED, CANCELED};
//}
//
//class State {
//    private enum state {DELIVERED, NOT_DELIVERED};
//}



//ЗАКАЗ
@Entity
public class Order {



    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Client client;                                  //Клиент
    @Basic
    private String orderName;                               //наименование заказа
    @Basic
    private Date deadLine;                                  //срок выполнения
    @Basic
    private int costPrice;                                  //себестоимость
    @Basic
    private int valueOrder;                                 //стоимость заказа
    @Basic
    private String adressOrder;                             //адрес заказа
    @Basic
    private String measurement;                            //замер ссылка на место хранения
    @Basic
    private String designModel;                            //дизайн модель ссылка на место хранения
    @Basic
    private String techDoc;                                //технологическая документация ссылка на место хранения
    @Basic
    private boolean confirmation;                         //Подтверждение (подтвержден / отменен)
    @Basic
    private boolean state;                                    //Статус (сдан / не сдан)
    @Basic
    private String employee;                                //исполнитель
    @Basic
    private Date actualDateOfDelivery;                      //Фактическая дата здачи заказа
    @Basic
    private String foto;                                    //фото ссылка на место хранения
    @Basic
    private String note;                                    //примечания


    /////////////////

    public Order(Client client) {
        this.client = client;
    }

    public Order(Client client, String orderName) {
        this.client = client;
        this.orderName = orderName;
    }

    public Order(Client client, String orderName, String adressOrder) {
        this.client = client;
        this.orderName = orderName;
        this.adressOrder = adressOrder;
    }

    public Order() {
    }

    /////////////////

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getOrderName() {
        return orderName;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getValueOrder() {
        return valueOrder;
    }

    public void setValueOrder(int valueOrder) {
        this.valueOrder = valueOrder;
    }

    public String getAdressOrder() {
        return adressOrder;
    }

    public void setAdressOrder(String adressOrder) {
        this.adressOrder = adressOrder;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getDesignModel() {
        return designModel;
    }

    public void setDesignModel(String designModel) {
        this.designModel = designModel;
    }

    public String getTechDoc() {
        return techDoc;
    }

    public void setTechDoc(String techDoc) {
        this.techDoc = techDoc;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Date getActualDateOfDelivery() {
        return actualDateOfDelivery;
    }

    public void setActualDateOfDelivery(Date actualDateOfDelivery) {
        this.actualDateOfDelivery = actualDateOfDelivery;
    }
}
