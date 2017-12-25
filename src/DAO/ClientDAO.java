package DAO;

import tables.client.Client;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ClientDAO {
    @PersistenceContext
    EntityManager emClient;

    public List<Client> findAll(){
        return emClient.createQuery("select c from Client c").getResultList();
    }


    ////////////////////
    private String l_n;
    private String ft_n;
    private String fr_n;
    private String a_h;
    private String ph_n;

    public String getL_n() {
        return l_n;
    }

    public void setL_n(String l_n) {
        this.l_n = l_n;
    }

    public String getFt_n() {
        return ft_n;
    }

    public void setFt_n(String ft_n) {
        this.ft_n = ft_n;
    }

    public String getFr_n() {
        return fr_n;
    }

    public void setFr_n(String fr_n) {
        this.fr_n = fr_n;
    }

    public String getA_h() {
        return a_h;
    }

    public void setA_h(String a_h) {
        this.a_h = a_h;
    }

    public String getPh_n() {
        return ph_n;
    }

    public void setPh_n(String ph_n) {
        this.ph_n = ph_n;
    }

    public Client createClient (String l_n, String ft_n, String fr_n, String a_h, String ph_n){
        return new Client(l_n, ft_n, fr_n, a_h, ph_n);
    }

    public void addClient(){
        emClient.createQuery("INSERT INTO Clients (clientLastName, clientFirstName, clientFatherName, " +
                "adressHome, clientPhonNumber) VALUES (l_n, ft_n, fr_n, a_h, ph_n) ");
    }
}
