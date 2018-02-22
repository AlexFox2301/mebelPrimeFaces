package tables;

import javax.persistence.*;
import java.util.Date;

@Entity
//@ApplicationScoped
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    private String lastName;            //Фамилия Имя Отчество
    @Basic
    private String firstName;            //Фамилия Имя Отчество
    @Basic
    private String fatherName;            //Фамилия Имя Отчество
    @Basic
    private String position;            //Должность
    @Basic
    private String address;             //Адрес
    @Basic
    private String phoneNumber;         //Номер телефона
    @Basic
    private String e_mail;               //Электронный почтовый ящик
    @Basic
    private Integer id_foto;            //Id фото
    @Basic
    private Date dateAdmissiom;         //Дата приёма
    @Basic
    private Date dateOfDismissal;       //Дата увольнения
    @Basic
    private String login;               //Логин
    @Basic
    private String password;            //Пароль

    ////////////////////////Конструкторы////////////////////////

//    public Employee(String fatherName, String position) {
//        this.fatherName = fatherName;
//        this.position = position;
//    }
//
//    public Employee(String fatherName, String position, String address) {
//        this.fatherName = fatherName;
//        this.position = position;
//        this.address = address;
//    }
//
//    public Employee(String fatherName, String position, String address, String phoneNumber) {
//        this.fatherName = fatherName;
//        this.position = position;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//    }

    public Employee() {
    }

//////////////////////////Геттеры / Сеттеры//////////////////////


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
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

    public void setFatherName(String fullName) {
        this.fatherName = fullName;
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
