package tables;



import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    private String clientLastName;          //Фамилия
    @Basic
    private String clientFirstName;         //Имя
    @Basic
    private String clientFatherName;        //Отчество
    @Basic
    private String adressHome;              //Адрес
    @Basic
    private String clientPhoneNumder;       //Номер телефона
    @Basic
    private Date dateRegistration;          //Дата регистрации

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

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
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

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public void setClientFatherName(String clientFatherName) {
        this.clientFatherName = clientFatherName;
    }

    public void setAdressHome(String adressHome) {
        this.adressHome = adressHome;
    }

    public void setClientPhoneNumder(String clientPhoneNumder) {
        this.clientPhoneNumder = clientPhoneNumder;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }
}
