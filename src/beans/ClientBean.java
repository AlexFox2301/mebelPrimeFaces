package beans;


import DAO.ClientDAO;
import tables.client.Client;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ClientBean implements Serializable {
   @EJB
    ClientDAO clientDAO;

   public List<Client> getClients(){
       return clientDAO.findAll();
   }

}
