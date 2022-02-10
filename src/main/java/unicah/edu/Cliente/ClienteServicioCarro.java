package unicah.edu.Cliente;
import unicah.edu.Controlador.iControladorCarroRemoto;
import unicah.edu.Dominio.Carro;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

public class ClienteServicioCarro {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB remoto...");
        try{
            Context jndi = new InitialContext();
            iControladorCarroRemoto carroServiceRemote =
                    (iControladorCarroRemoto) jndi.lookup("java:global/gestionVehiculos-1.0/ControladorCarroRemoto");
            List<Carro> carros = carroServiceRemote.listCarro();

            for(Carro carro: carros){
                System.out.println(carro.toString());
            }

        } catch (NamingException e){
            e.printStackTrace(System.out);
        }
        System.out.println("Finalizó la llamada al EJB remoto.");
    }
}
