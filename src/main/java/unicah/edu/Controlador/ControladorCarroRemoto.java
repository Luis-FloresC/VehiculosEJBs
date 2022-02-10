package unicah.edu.Controlador;

import unicah.edu.Dominio.Carro;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
@Stateless
public class ControladorCarroRemoto implements  iControladorCarroRemoto {
    @Override
    public List<Carro> listCarro() {

        List<Carro> listCarro = new ArrayList<>();
        listCarro.add(new Carro(1,"BAE 2345","Honda","Honda CRV","Negro",2015));
        return listCarro;
    }

    @Override
    public Carro encontrarCarroById(Carro carro) {
        return null;
    }

    @Override
    public Carro encontrarCarroByPlaca(Carro carro) {
        return null;
    }

    @Override
    public void RegistrarNuevoCarro(Carro carro) {

    }

    @Override
    public void EditarCarro(Carro carro) {

    }

    @Override
    public void EliminarCarro(Carro carro) {

    }
}
