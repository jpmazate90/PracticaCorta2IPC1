
package LogicaDelJuego;

public class Reportes {
    // atributos privados
    private String jugadorGanador;
    private String jugadorPerdedor;
    private int punteo;
    private int clave;
    private String fecha;
    private String hora;
    private boolean estaActivo;
    
    // CONSTRUCTOR
    public Reportes(int clave,String jugadorGanador,int punteo,  String jugadorPerdedor, String hora, String fecha) {
        this.jugadorGanador = jugadorGanador;
        this.jugadorPerdedor = jugadorPerdedor;
        this.punteo = punteo;
        this.fecha = fecha;
        this.hora = hora;
        estaActivo=true;
    }
    // sets y gets
    public String getJugadorGanador() {
        return jugadorGanador;
    }

    public void setJugadorGanador(String jugadorGanador) {
        this.jugadorGanador = jugadorGanador;
    }

    public String getJugadorPerdedor() {
        return jugadorPerdedor;
    }

    public void setJugadorPerdedor(String jugadorPerdedor) {
        this.jugadorPerdedor = jugadorPerdedor;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public int getClave(){
        return clave;
    }
    
    public void setClave(int clave){
        this.clave=clave;
    }

    public boolean isEstaActivo() {
        return estaActivo;
    }

    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }
    
    
    
}
