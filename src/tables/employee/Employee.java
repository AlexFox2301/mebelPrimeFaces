package tables.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String lastName;
    private String firstName;
    private String fatherName;
    private String phoneNumber;

    /////////////////

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Employee(String lastName, String firstName, String fatherName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
    }

    public Employee(String lastName, String firstName, String fatherName, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.phoneNumber = phoneNumber;
    }

    public Employee() {
    }

///////////////////

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
