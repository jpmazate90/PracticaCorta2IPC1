
package LogicaDelJuego;

public class Jugador {
    //atributos privados
    private String nombreJugador;
    private int punteo;
    private int claveJugador;
    private boolean estadoJugadorPartida;
    
    // constructor
    
    public Jugador(String nombreJugador, int claveJugador){
        this.nombreJugador = nombreJugador;
        this.claveJugador = claveJugador;
        punteo=0;
        estadoJugadorPartida=false;
        
    }
    // sets y gets

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    public int getClaveJugador() {
        return claveJugador;
    }

    public void setClaveJugador(int claveJugador) {
        this.claveJugador = claveJugador;
    }

    public boolean isEstadoJugadorPartida() {
        return estadoJugadorPartida;
    }

    public void setEstadoJugadorPartida(boolean estadoJugadorPartida) {
        this.estadoJugadorPartida = estadoJugadorPartida;
    }
    
    
}
