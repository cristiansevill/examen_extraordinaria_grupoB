package ufv.extraordinaria.dis.csd.TWEETs;

import java.util.PrimitiveIterator;

public class tweet {
    private long ID;
    private String usuario;
    private String texto;
    private String fecha;

// Constructores
    public tweet(){
    }

    public tweet(long ID, String usuario, String texto, String fecha){
        this.ID = ID;
        this.usuario = usuario;
        this.texto = texto;
        this.fecha = fecha;
    }


    // gets
    public long getID() { return ID; }

    public String getUsuario() { return usuario; }

    public String getTexto() { return texto; }

    public String getFecha() { return fecha; }


    // sets

    public void setID(long ID) { this.ID = ID; }

    public void setUsuario(String usuario) { this.usuario = usuario; }

    public void setTexto(String texto) { this.texto = texto; }

    public void setFecha(String fecha) { this.fecha = fecha; }

    // To string
    @Override
    public String ToString() {
        return "ID: " + ID + ", usuario: " + usuario + ", texto: " + texto + ", fecha: " + fecha +".";
    }



}
