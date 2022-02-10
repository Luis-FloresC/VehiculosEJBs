package unicah.edu.Dominio;

import java.io.Serializable;

public class Carro  implements Serializable {

    private static final long serialVersionUIO = -6555504856528103960L;

    private int IdCarro;
    private String Placa;
    private String Marca;
    private String Modelo;
    private String Color;
    private int Año;

    public Carro(){}

    public Carro(int idCarro,String  placa,String marca,String modelo, String color,int año)
    {
        this.IdCarro = idCarro;
        this.Placa =placa;
        setAño(año);
        this.Color = color;
        this.Marca = marca;
        this.Modelo = modelo;
    }

    public int getIdCarro(){return  IdCarro;}
    public void setIdCarro(int id){ this.IdCarro = id; }
    public String getPlaca(){return  Placa;}
    public void setPlaca(String placa){ this.Placa = placa; }
    public String getModelo(){return  Modelo;}
    public void setModelo(String modelo){ this.Modelo = modelo; }
    public String getColor(){return  Color;}
    public void setColor(String color){ this.Color = color; }
    public String getMarca(){return  Marca;}
    public void setMarca(String marca){ this.Marca = marca; }
    public int getAño(){return  Año;}
    public void setAño(int año)
    {
        if(año < 1990)
        {
            this.Año = 1990;
        }
        else if(año > 2022)
        {
            this.Año = 2022;
        }
        else
        {
            this.Año = año;
        }
    }

    @Override
    public String toString()
    {
        return "{" +  '\n' +
                "idCarro: " + IdCarro + "," + '\n' +
                "Placa: " + Placa + "," +  '\n' +
                "Modelo: " + Modelo +  "," + '\n' +
                "Marca: " + Marca + "," + '\n' +
                "Año: " + Año + "," + '\n' +
                "Color: " + Color + '\n' +
                "},";
    }

}
