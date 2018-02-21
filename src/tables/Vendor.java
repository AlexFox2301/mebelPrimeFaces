package tables;

//import vendor.PriceList;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

//ПОСТАВЩИК

@Entity
public class Vendor {

    @Id
    private Integer id;
    @Basic
    private String vendorName;
    @Basic
    private String vendorAdress;
    @Basic
    private String vendorPhoneNumber;
    @Basic
    private String e_mail;
    @Basic
    private String priceList;

    ///////////////////

    public Vendor(String vendorName, String vendorPhoneNumber, String price) {
        this.vendorName = vendorName;
        this.vendorPhoneNumber = vendorPhoneNumber;
        this.priceList = price;
    }

    public Vendor(String vendorName, String vendorPhoneNumber) {
        this.vendorName = vendorName;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

//    public Vendor(String vendorName, String vendorAdress, String vendorPhoneNumber) {
//        this.vendorName = vendorName;
//        this.vendorAdress = vendorAdress;
//        this.vendorPhoneNumber = vendorPhoneNumber;
//    }

    public Vendor(String vendorName, String vendorAdress, String vendorPhoneNumber, String price) {
        this.vendorName = vendorName;
        this.vendorAdress = vendorAdress;
        this.vendorPhoneNumber = vendorPhoneNumber;
        this.priceList = price;
    }

    public Vendor() {
    }

    ///////////////////

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorAdress() {
        return vendorAdress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public String getPriceList() {
        return priceList;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorAdress(String vendorAdress) {
        this.vendorAdress = vendorAdress;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public void setPriceList(String priceList) {
        this.priceList = priceList;
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
