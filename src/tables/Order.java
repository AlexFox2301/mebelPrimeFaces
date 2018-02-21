package tables;

import javax.faces.bean.ManagedBean;
import javax.persistence.*;
import java.util.Date;


@ManagedBean(name = "order")
//@EntityListeners(value = "")
@Entity
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Client client;
    @Basic
    private String orderName;
    @Basic
    private Date deadLine;
    @Basic
    private int costPrice;
    @Basic
    private int valueOrder;
    @Basic
    private String adressOrder;
    @Basic
    private String measurement;
    @Basic
    private String designModel;
    @Basic
    private String techDoc;
    @Basic
    private boolean confirmation;
    @Basic
    private boolean state;
    @ManyToOne
    private Employee employee;
    @Basic
    private Date actualDateOfDelivery;
    @Basic
    private String foto;
    @Basic
    private String note;

    /////////////Геттеры / Сеттеры /////////////////////////////////////////


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getActualDateOfDelivery() {
        return actualDateOfDelivery;
    }

    public void setActualDateOfDelivery(Date actualDateOfDelivery) {
        this.actualDateOfDelivery = actualDateOfDelivery;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
