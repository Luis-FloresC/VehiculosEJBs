package unicah.edu.Controlador;

import unicah.edu.Dominio.Carro;

import javax.ejb.Remote;
import java.util.List;
@Remote
public interface iControladorCarroRemoto {

    public List<Carro> listCarro();
    public Carro encontrarCarroById(Carro carro);
    public Carro encontrarCarroByPlaca(Carro carro);
    public void RegistrarNuevoCarro(Carro carro);
    public void EditarCarro(Carro carro);
    public void EliminarCarro(Carro carro);
}
