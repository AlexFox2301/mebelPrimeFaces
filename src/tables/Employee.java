package tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;            //Фамилия Имя Отчество
    private String position;            //Должность
    private String address;             //Адрес
    private String phoneNumber;         //Номер телефона
    private String e_mail;               //Электронный почтовый ящик
    private Integer id_foto;            //Id фото
    private Date dateAdmissiom;         //Дата приёма
    private Date dateOfDismissal;       //Дата увольнения
    private String login;               //Логин
    private String password;            //Пароль

    ////////////////////////Конструкторы////////////////////////

    public Employee(String fullName, String position) {
        this.fullName = fullName;
        this.position = position;
    }

    public Employee(String fullName, String position, String address) {
        this.fullName = fullName;
        this.position = position;
        this.address = address;
    }

    public Employee(String fullName, String position, String address, String phoneNumber) {
        this.fullName = fullName;
        this.position = position;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Employee() {
    }

//////////////////////////Геттеры / Сеттеры//////////////////////

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getId_foto() {
        return id_foto;
    }

    public void setId_foto(Integer id_foto) {
        this.id_foto = id_foto;
    }

    public Date getDateAdmissiom() {
        return dateAdmissiom;
    }

    public void setDateAdmissiom(Date dateAdmissiom) {
        this.dateAdmissiom = dateAdmissiom;
    }

    public Date getDateOfDismissal() {
        return dateOfDismissal;
    }

    public void setDateOfDismissal(Date dateOfDismissal) {
        this.dateOfDismissal = dateOfDismissal;
    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}
