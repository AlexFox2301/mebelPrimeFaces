package tables.client;

import tables.order.Order;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    private String clientLastName;
    @Basic
    private String clientFirstName;
    @Basic
    private String clientFatherName;
    @Basic
    private String adressHome;
    @Basic
    private String clientPhoneNumder;

    @OneToMany(mappedBy = "client")
    private Collection<Order> orders;

    //////////////////

    public Client(String clientLastName, String clientFirstName) {
        this.clientLastName = clientLastName;
        this.clientFirstName = clientFirstName;
    }

    public Client(String clientLastName, String clientFirstName, String clientFatherName) {
        this.clientLastName = clientLastName;
        this.clientFirstName = clientFirstName;
        this.clientFatherName = clientFatherName;
    }

    public Client(String clientLastName, String clientFirstName, String clientFatherName, String adressHome) {
        this.clientLastName = clientLastName;
        this.clientFirstName = clientFirstName;
        this.clientFatherName = clientFatherName;
        this.adressHome = adressHome;
    }

    public Client(String clientLastName, String clientFirstName, String clientFatherName, String adressHome, String clientPhoneNumder) {
        this.clientLastName = clientLastName;
        this.clientFirstName = clientFirstName;
        this.clientFatherName = clientFatherName;
        this.adressHome = adressHome;
        this.clientPhoneNumder = clientPhoneNumder;
    }

    public Client() {
    }

///////////////////////

    public String getClientLastName() {
        return clientLastName;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public String getClientFatherName() {
        return clientFatherName;
    }

    public String getAdressHome() {
        return adressHome;
    }

    public String getClientPhoneNumder() {
        return clientPhoneNumder;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }


}
