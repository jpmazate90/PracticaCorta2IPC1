
package InterfazGrafica;
// todos las librerias importadas de otros lados
import LogicaDelJuego.Jugador;
import LogicaDelJuego.LogicaDelJuego;
import LogicaDelJuego.Reportes;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JugarJuego extends javax.swing.JFrame {
    // variables de ambito global
    private LogicaDelJuego logica = new LogicaDelJuego();
    private int vecesQueSeMostroElMensaje=0;
    private boolean bocaArriba=false;
    private ImageIcon imagen1;
    private ImageIcon imagen2;
    private JButton[] pbtn = new JButton[2];
    private boolean primeraCarta=false;
    private int punteo=0;
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private ArrayList<Reportes> reportesJugadoresGanadores = new ArrayList<Reportes>();
    private ArrayList<Integer> punteoJugadores = new ArrayList<Integer>();
    private int  claveJugadorTemporal=0;
    private Jugador jugador1;
    private Jugador jugador2;
    private DefaultTableModel tablaJugadoresGanadoresDefault;
    
    
    public JugarJuego() {
        // todo lo que inicia el juego
        initComponents();
        activarUnPanel("panelMenuInicio");
        btnGroupCrearJugador.add(btnRadioCrearJugadorSi);
        btnGroupCrearJugador.add(btnRadioCrearJugadorNo);
        txtDondeVaElNombre.setVisible(false);
        lblEscogerNombre.setVisible(false);
        btnEnviarNombre.setVisible(false);
        String cabecera[] ={"Clave", "Nombre Jugador Ganador", "Punteo Obtenido", " Nombre Jugador Perdedor", "Hora De La Partida", "Fecha De La Partida"};
        String datos[][]={};
        setCartasDificil();
        setCartasFacil();
        setCartasNormal();
        lblPuntuacionJugador1Facil.setVisible(true);
        lblPuntuacionJugador1Facil.setText(Integer.toString(punteo));
        lblPuntuacionJugador1Normal.setVisible(true);
        lblPuntuacionJugador1Normal.setText(Integer.toString(punteo));
        
        
       
        
        
    }

    
    private void setCartasDificil(){
        // inserta las imagenes a todas las cartas segun con los numeros que salieron en el procedimiento de logica de get numeros cartas dificiles
        int[] numeros = logica.getNumeroCartasDificil();
        
        btnCarta1.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[0]+".png")));
        btnCarta2.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[1]+".png")));
        btnCarta3.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[2]+".png")));
        btnCarta4.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[3]+".png")));
        btnCarta5.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[4]+".png")));
        btnCarta6.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[5]+".png")));
        btnCarta7.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[6]+".png")));
        btnCarta8.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[7]+".png")));
        btnCarta9.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[8]+".png")));
        btnCarta10.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[9]+".png")));
        btnCarta11.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[10]+".png")));
        btnCarta12.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[11]+".png")));
        btnCarta13.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[12]+".png")));
        btnCarta14.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[13]+".png")));
        btnCarta15.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[14]+".png")));
        btnCarta16.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[15]+".png")));
        btnCarta17.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[16]+".png")));
        btnCarta18.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[17]+".png")));
        btnCarta19.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[18]+".png")));
        btnCarta20.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[19]+".png")));
        btnCarta21.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[20]+".png")));
        btnCarta22.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[21]+".png")));
        btnCarta23.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[22]+".png")));
        btnCarta24.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[23]+".png")));
        btnCarta25.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[24]+".png")));
        btnCarta26.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[25]+".png")));
        btnCarta27.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[26]+".png")));
        btnCarta28.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[27]+".png")));
        btnCarta29.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[28]+".png")));
        btnCarta30.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[29]+".png")));   
    }
    
    private void setCartasNormal(){
// inserta las imagenes a todas las cartas segun con los numeros que salieron en el procedimiento de logica de get numeros cartas dificiles

        int[] numeros = logica.getNumeroCartasNormal();
        btnCarta41.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[0]+".png")));
        btnCarta42.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[1]+".png")));
        btnCarta43.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[2]+".png")));
        btnCarta44.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[3]+".png")));
        btnCarta45.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[4]+".png")));
        btnCarta46.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[5]+".png")));
        btnCarta47.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[6]+".png")));
        btnCarta48.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[7]+".png")));
        btnCarta49.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[8]+".png")));
        btnCarta50.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[9]+".png")));
        btnCarta51.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[10]+".png")));
        btnCarta52.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[11]+".png")));
        btnCarta53.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[12]+".png")));
        btnCarta54.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[13]+".png")));
        btnCarta55.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[14]+".png")));
        btnCarta56.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[15]+".png")));
        btnCarta57.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[16]+".png")));
        btnCarta58.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[17]+".png")));
        btnCarta59.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[18]+".png")));
        btnCarta60.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[19]+".png")));
    }
    
    private void setCartasFacil(){
        // inserta las imagenes a todas las cartas segun con los numeros que salieron en el procedimiento de logica de get numeros cartas dificiles

        int[] numeros = logica.getNumeroCartasFacil();
        
        btnCarta31.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[0]+".png")));
        btnCarta32.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[1]+".png")));
        btnCarta33.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[2]+".png")));
        btnCarta34.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[3]+".png")));
        btnCarta35.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[4]+".png")));
        btnCarta36.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[5]+".png")));
        btnCarta37.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[6]+".png")));
        btnCarta38.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[7]+".png")));
        btnCarta39.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[8]+".png")));
        btnCarta40.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/imagen"+numeros[9]+".png")));
    }
    
    /* metodo que sirve para habilitar una carta al momento de darle click para voltearla
       y segun si es la primera o la segunda carta hace una accion u otra
    */
    private void btnHabilitado(JButton btn){
        lblPuntuacionJugador1Facil.setText(Integer.toString(jugador1.getPunteo()));
        lblPuntuacionJugador2Facil.setText(Integer.toString(jugador2.getPunteo()));
        if(!bocaArriba){
            btn.setEnabled(false);
            imagen1= (ImageIcon) btn.getDisabledIcon();
            pbtn[0]= btn;
            bocaArriba=true;
            primeraCarta=false;
            
        }
        else{
            btn.setEnabled(false);
            pbtn[1]= btn;
            imagen2= (ImageIcon) btn.getDisabledIcon();
            primeraCarta=true;
            
            
        }
        
        
    }
    
    /*
    Compara las cartas basicamente
    */
    private void compararCartas(){
        vecesQueSeMostroElMensaje=0;
        if(bocaArriba && primeraCarta){
            // esta condicional lo que hace es comparar la descripcion de la primera y segunda carta,
            // si son diferentes le quita punteo, si no le da punteo
            if(imagen1.getDescription().compareTo(imagen2.getDescription()) !=0){
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                repartirPunteoMalo();
                cambiarTurno();
                
                
            }else{
                repartirPunteoBueno();
                cambiarTurno();
            }
            
            bocaArriba=false;
        }
        
        // actualiza el punteo de los dos jugadores y verifica si todavia hay cartas despues de cada turno
        actualizarPunteoJugadores();
        verificarQuienGanoLaPartidaDificil();
        verificarQuienGanoLaPartidaNormal();
        verificarQuienGanoLaPartidaFacil();
    }
    
    // basicamente reparte el punteo malo al jugador que esta actualmente como activo
    private void repartirPunteoMalo(){
            if(jugador1.isEstadoJugadorPartida()==true){
                if(jugador1.getPunteo()-10<0){
                    jugador1.setPunteo(0);
                }
                else{
                    jugador1.setPunteo(jugador1.getPunteo()-10);
                }
                
            }else{
                if(jugador2.getPunteo()-10<0){
                    jugador2.setPunteo(0);
                }
                else{
                    jugador2.setPunteo(jugador2.getPunteo()-10);
                }
            }
        
    }
    
    
    private void repartirPunteoBueno(){
            if(jugador1.isEstadoJugadorPartida()==true){
                jugador1.setPunteo(jugador1.getPunteo()+50);
            }
            else{
                jugador2.setPunteo(jugador2.getPunteo()+50);
            }
    }
    
    // unicamente actualiza cada vez que cambia de turno el punteo de los jugadores
    private void actualizarPunteoJugadores(){
        lblPuntuacionJugador1Facil.setText(Integer.toString(jugador1.getPunteo()));
        lblPuntuacionJugador2Facil.setText(Integer.toString(jugador2.getPunteo()));
        lblPuntuacionJugador1Normal.setText(Integer.toString(jugador1.getPunteo()));
        lblPuntuacionJugador2Normal.setText(Integer.toString(jugador2.getPunteo()));
        lblPuntuacionJugador1Dificil.setText(Integer.toString(jugador1.getPunteo()));
        lblPuntuacionJugador2Dificil.setText(Integer.toString(jugador2.getPunteo()));
    }
    
    private void reiniciarPunteoJugadores(){
        lblPuntuacionJugador1Facil.setText(Integer.toString(0));
        lblPuntuacionJugador2Facil.setText(Integer.toString(0));
        lblPuntuacionJugador1Normal.setText(Integer.toString(0));
        lblPuntuacionJugador2Normal.setText(Integer.toString(0));
        lblPuntuacionJugador1Dificil.setText(Integer.toString(0));
        lblPuntuacionJugador2Dificil.setText(Integer.toString(0));
    }
    
    private void reiniciarPartida(){
        
        // reiniciar todas las cartas a su modo de escondidas
        btnCarta1.setEnabled(true);   btnCarta2.setEnabled(true);
        btnCarta3.setEnabled(true);   btnCarta4.setEnabled(true);
        btnCarta5.setEnabled(true);   btnCarta6.setEnabled(true);
        btnCarta7.setEnabled(true);   btnCarta8.setEnabled(true);
        btnCarta9.setEnabled(true);   btnCarta10.setEnabled(true);
        btnCarta11.setEnabled(true);  btnCarta12.setEnabled(true);
        btnCarta13.setEnabled(true);  btnCarta14.setEnabled(true);
        btnCarta15.setEnabled(true);  btnCarta16.setEnabled(true);
        btnCarta17.setEnabled(true);  btnCarta18.setEnabled(true);
        btnCarta19.setEnabled(true);  btnCarta20.setEnabled(true);
        btnCarta21.setEnabled(true);  btnCarta22.setEnabled(true);
        btnCarta23.setEnabled(true);  btnCarta24.setEnabled(true);
        btnCarta25.setEnabled(true);  btnCarta26.setEnabled(true);
        btnCarta27.setEnabled(true);  btnCarta28.setEnabled(true);
        btnCarta29.setEnabled(true);  btnCarta30.setEnabled(true);
        btnCarta31.setEnabled(true);  btnCarta32.setEnabled(true);
        btnCarta33.setEnabled(true);  btnCarta34.setEnabled(true);
        btnCarta35.setEnabled(true);  btnCarta36.setEnabled(true);
        btnCarta37.setEnabled(true);  btnCarta38.setEnabled(true);
        btnCarta39.setEnabled(true);  btnCarta40.setEnabled(true);
        btnCarta41.setEnabled(true);  btnCarta42.setEnabled(true);
        btnCarta43.setEnabled(true);  btnCarta44.setEnabled(true);
        btnCarta45.setEnabled(true);  btnCarta46.setEnabled(true);
        btnCarta47.setEnabled(true);  btnCarta48.setEnabled(true);
        btnCarta49.setEnabled(true);  btnCarta50.setEnabled(true);
        btnCarta51.setEnabled(true);  btnCarta52.setEnabled(true);
        btnCarta53.setEnabled(true);  btnCarta54.setEnabled(true);
        btnCarta55.setEnabled(true);  btnCarta56.setEnabled(true);
        btnCarta57.setEnabled(true);  btnCarta58.setEnabled(true);
        btnCarta59.setEnabled(true);  btnCarta60.setEnabled(true);
        
        
        
        // volver a poner aleatorias las cartas y reiniciar todos los componentes
        primeraCarta=false;
        bocaArriba=false;
        punteo=0;
        setCartasDificil();
        setCartasNormal();
        setCartasFacil();
    }
    // solo muestra quien gano la partida si el jugador 1, el 2 o empate
    private void mostrarQuienGanoLaPartida(){
        if(jugador1.getPunteo()>jugador2.getPunteo()){
                JOptionPane.showMessageDialog(this, "El ganador es: "+jugador1.getNombreJugador()+ " con un punteo de: "+jugador1.getPunteo());
                guardarHistorialJugadorGanador(jugador1.getNombreJugador(), jugador2.getNombreJugador(), jugador1.getPunteo(), jugador1.getClaveJugador());
            }else
                if(jugador2.getPunteo()>jugador1.getPunteo()){
                    JOptionPane.showMessageDialog(this,"El ganador es: "+jugador2.getNombreJugador()+ " con un punteo de: "+jugador2.getPunteo());
                    guardarHistorialJugadorGanador(jugador2.getNombreJugador(), jugador1.getNombreJugador(), jugador2.getPunteo(), jugador2.getClaveJugador());
                }else{
                    JOptionPane.showMessageDialog(this, "La partida ha acabado en empate, ambos jugadores con un punteo de: "+jugador1.getPunteo());

                }
    }
    // solo activa el panel de jugadores ganadores
    private void irAlPanelConJugadoresGanadores(){
        añadirAlHistorialJugadoresGanadores();
        activarUnPanel("panelMostrarReporteJugadoresGanadores");
    }
    
    private void guardarHistorialJugadorGanador(String jugadorGanador, String jugadorPerdedor, int punteoGanador, int clave){
        String fecha, hora;
        Calendar historial = Calendar.getInstance();
        fecha = historial.get(Calendar.DATE)+"/"+ historial.get(Calendar.MONTH)+"/"+historial.get(Calendar.YEAR);
        hora = historial.get(Calendar.HOUR_OF_DAY)+":"+ historial.get(Calendar.MINUTE)+":"+historial.get(Calendar.SECOND);
        reportesJugadoresGanadores.add(new Reportes(clave,jugadorGanador, punteoGanador, jugadorPerdedor, hora, fecha));
        
        // añadir a la lista de los que se muestran como ganadores
    } 
    
    // junta el punteo de los jugadores ganadores en un arreglo de enteros
    private void juntarLosPunteosDeTodosLosJugadoresGanadores(){
        if(reportesJugadoresGanadores.isEmpty()){
                JOptionPane.showMessageDialog(null, "NO HAY JUGADORES QUE ORDENAR PORQUE NO HAY JUGADORES GANADORES");
        }else{
            for (int i = 0; i < reportesJugadoresGanadores.size(); i++) {
                punteoJugadores.add(reportesJugadoresGanadores.get(i).getPunteo());
            }
            ordenarHistorialJugadoresGanadores(punteoJugadores, 0, (punteoJugadores.size()-1));
        }
    }
    
    // añade a jugadores a la jtable de jugadores ganadores, mediante una matriz
    private void añadirAlHistorialJugadoresGanadores(){
        
        String matriz[][] = new String[reportesJugadoresGanadores.size()][6]; 
        
        for(int i=0; i<reportesJugadoresGanadores.size();i++){
            // mete datos a la matriz
            matriz[i][0]= Integer.toString(reportesJugadoresGanadores.get(i).getClave());
            matriz[i][1]= reportesJugadoresGanadores.get(i).getJugadorGanador();
            matriz[i][2]= Integer.toString(reportesJugadoresGanadores.get(i).getPunteo());
            matriz[i][3]= reportesJugadoresGanadores.get(i).getJugadorPerdedor();
            matriz[i][4]= reportesJugadoresGanadores.get(i).getHora();
            matriz[i][5]= reportesJugadoresGanadores.get(i).getFecha();
        }   
        // añade datos a la matriz
        tablaJugadoresGanadores.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Clave ", "Jugador Ganador", "Punteo", "Jugador Perdedor", "Hora", "Fecha"
            }
        ));
    }
    // ordena a los jugadores por punteo de mayor a menor
    private void ordenarJugadoresGanadoresPorPunteo(){
        juntarLosPunteosDeTodosLosJugadoresGanadores();
        Reportes primerGanador;
        int auxiliarGanador;
        
        String matriz[][] = new String[reportesJugadoresGanadores.size()][6];
        /*
        prueba
        for(int j=0;j<reportesJugadoresGanadores.size();j++)
        {
        primerGanador = reportesJugadoresGanadores.get(j);
        auxiliarGanador= primerGanador.getPunteo()+1;
        for(int i=j+1;i<reportesJugadoresGanadores.size();i++){
            if(primerGanador.getPunteo()< reportesJugadoresGanadores.get(i).getPunteo() && reportesJugadoresGanadores.get(i).getPunteo()<auxiliarGanador){
                primerGanador= reportesJugadoresGanadores.get(i);
            }
        }
            matriz[j][0]= Integer.toString(primerGanador.getClave());
            matriz[j][1]= primerGanador.getJugadorGanador();
            matriz[j][2]= Integer.toString(primerGanador.getPunteo());
            matriz[j][3]= primerGanador.getJugadorPerdedor();
            matriz[j][4]= primerGanador.getHora();
            matriz[j][5]= primerGanador.getFecha();
            auxiliarGanador= primerGanador.getPunteo();
        }
        prueba
        */
        
        int f=0;
        for(int i=reportesJugadoresGanadores.size()-1;i>=0;i--){
            
            for (int j = 0; j < reportesJugadoresGanadores.size(); j++) {
                if(punteoJugadores.get(i)== reportesJugadoresGanadores.get(j).getPunteo() && reportesJugadoresGanadores.get(j).isEstaActivo()==true){
                    
                    matriz[f][0]= Integer.toString(reportesJugadoresGanadores.get(j).getClave());
                    matriz[f][1]= reportesJugadoresGanadores.get(j).getJugadorGanador();
                    matriz[f][2]= Integer.toString(reportesJugadoresGanadores.get(j).getPunteo());
                    matriz[f][3]= reportesJugadoresGanadores.get(j).getJugadorPerdedor();
                    matriz[f][4]= reportesJugadoresGanadores.get(j).getHora();
                    matriz[f][5]= reportesJugadoresGanadores.get(j).getFecha();
                    f++;
                    reportesJugadoresGanadores.get(j).setEstaActivo(false);
                    break;
                }
                
            }
            
        }
        regresarASuEstadoNormalLosJugadoresGanadores();
        // los añade a la jtable 

        tablaJugadoresGanadores1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Clave ", "Jugador Ganador", "Punteo", "Jugador Perdedor", "Hora", "Fecha"
            }
        ));
        
        activarUnPanel("panelMostrarReporteJugadoresGanadoresOrdenados");
    }
    // muestra el reporte del jugador con mayor punteo basado en el primero que aparece en la jtable
    private void mostrarReporteMayorPunteo(){
        juntarLosPunteosDeTodosLosJugadoresGanadores();
        for (int j = 0; j < reportesJugadoresGanadores.size(); j++) {
                if(punteoJugadores.get(punteoJugadores.size()-1)== reportesJugadoresGanadores.get(j).getPunteo()){
                    txtNombreJugadorMayorPunteo.setText(reportesJugadoresGanadores.get(j).getJugadorGanador());
                    txtPunteoJugadorMayorPunteo.setText(Integer.toString(reportesJugadoresGanadores.get(j).getPunteo()));
                    break;
                }
                
        }
        activarUnPanel("panelMostrarReporteJugadorMayorPunteo");
        
    }
    
     private void regresarASuEstadoNormalLosJugadoresGanadores(){
         for(int i=0; i< reportesJugadoresGanadores.size(); i++){
             reportesJugadoresGanadores.get(i).setEstaActivo(true);
         }
     }
    
    // es el metodo quicksort  para poder ordenar los punteos de los jugadores
    private void ordenarHistorialJugadoresGanadores(ArrayList<Integer> arregloNumeros, int primero, int ultimo){
         
        int i, j, pivote, auxiliar=0;
        i=primero;
        j=ultimo;
        pivote= arregloNumeros.get((primero+ultimo)/2);
        do{
            while(arregloNumeros.get(i)<pivote){
                i++;
            }
            while(arregloNumeros.get(j)>pivote){
                j--;
            }
            if(i<=j){
               auxiliar=arregloNumeros.get(i);
               arregloNumeros.set(i, arregloNumeros.get(j));
               arregloNumeros.set(j, auxiliar);
               
               /*
               arregloNumeros.get(i) = arregloNumeros.get(j);
               arregloNumeros.get(j)=auxiliar;
               */
               i++;
               j--;
            }
        } while(i<=j);
        if(primero<j){
            ordenarHistorialJugadoresGanadores(arregloNumeros, primero, j);
            
        }
        if(i<ultimo){
            ordenarHistorialJugadoresGanadores(arregloNumeros, i, ultimo);
        }
        
    
    }
            
            
    // prueba si todas las cartas estan boca arriba
    private void verificarQuienGanoLaPartidaDificil(){
        
        if(!btnCarta1.isEnabled() && !btnCarta2.isEnabled() && !btnCarta3.isEnabled() && !btnCarta4.isEnabled() && !btnCarta5.isEnabled() && !btnCarta6.isEnabled() 
                && !btnCarta7.isEnabled() && !btnCarta8.isEnabled() && !btnCarta9.isEnabled() && !btnCarta10.isEnabled() && !btnCarta11.isEnabled() && !btnCarta12.isEnabled() 
                && !btnCarta13.isEnabled() && !btnCarta14.isEnabled() && !btnCarta15.isEnabled() && !btnCarta16.isEnabled() && !btnCarta17.isEnabled() && !btnCarta18.isEnabled() &&
                !btnCarta19.isEnabled() && !btnCarta20.isEnabled() && !btnCarta21.isEnabled() && !btnCarta22.isEnabled() && !btnCarta23.isEnabled() && !btnCarta24.isEnabled() && 
                !btnCarta25.isEnabled() && !btnCarta26.isEnabled() && !btnCarta27.isEnabled() && !btnCarta28.isEnabled() && !btnCarta29.isEnabled() && !btnCarta30.isEnabled() && vecesQueSeMostroElMensaje<1){
            mostrarQuienGanoLaPartida();
            reiniciarPartida();
            reiniciarPunteoJugadores();
            activarUnPanel("panelMenuInicio");
        }
        
    }
    // prueba si todas las cartas estan boca arriba
    private void verificarQuienGanoLaPartidaFacil(){
        
        if(!btnCarta31.isEnabled() && !btnCarta32.isEnabled() && !btnCarta33.isEnabled() && !btnCarta34.isEnabled() && !btnCarta35.isEnabled() && 
                !btnCarta36.isEnabled() && !btnCarta37.isEnabled() && !btnCarta38.isEnabled() && !btnCarta39.isEnabled() && !btnCarta40.isEnabled()){
            mostrarQuienGanoLaPartida();
            reiniciarPartida();
            reiniciarPunteoJugadores();
            activarUnPanel("panelMenuInicio");
        }
        
    }
    // prueba si todas las cartas estan boca arriba
    private void verificarQuienGanoLaPartidaNormal(){
        
        if(!btnCarta41.isEnabled() && !btnCarta42.isEnabled() && !btnCarta43.isEnabled() && !btnCarta44.isEnabled() && !btnCarta45.isEnabled() && !btnCarta46.isEnabled() && 
                !btnCarta47.isEnabled() && !btnCarta48.isEnabled() && !btnCarta49.isEnabled() && !btnCarta50.isEnabled() && !btnCarta51.isEnabled() &&!btnCarta52.isEnabled() &&  
                !btnCarta53.isEnabled() && !btnCarta54.isEnabled() && !btnCarta55.isEnabled() && !btnCarta56.isEnabled() &&  !btnCarta57.isEnabled() && !btnCarta58.isEnabled() && 
                !btnCarta59.isEnabled() && !btnCarta60.isEnabled()){
            mostrarQuienGanoLaPartida();
            reiniciarPartida();
            reiniciarPunteoJugadores();
            activarUnPanel("panelMenuInicio");
        }
       
    }
    // eeste metodo muestra los datos del jugador
    private void mostrarInformacionParaNuevoJugador(){
        
            txtDondeVaElNombre.setVisible(true);
            lblEscogerNombre.setVisible(true);
            btnEnviarNombre.setVisible(true);
        
    }
    
    // este metodo oculta la informacion para el nuevo jugador
    private void ocultarInformacionParaNuevojugador(){
        txtDondeVaElNombre.setVisible(false);
        lblEscogerNombre.setVisible(false);
        btnEnviarNombre.setVisible(false);
    }
    // sirve para crear a un nuevo jugador y mira si equisto o no el nombre
    private void crearNuevoJugador(String nombreJugadorTemporal){
        boolean claveSiSePuedeCrearJugador=false;
        int nombreRepetido=0;
        // si no hay nada en el arreglo ya ni verifica si hay o no nombre repetido
        if(jugadores.isEmpty()){
                claveSiSePuedeCrearJugador=true;
                
        }
        else{
            //ciclo para ver si existe el nombre 
            for (int i = 0; i < jugadores.size(); i++) {
                //subciclo para ver si existe algun nombreRepetido en todo el arreglo
                for(int q=0;q<jugadores.size() && (nombreJugadorTemporal).equals(jugadores.get(i).getNombreJugador());q++){
                    nombreRepetido++;
                
                }
                    //sirve para mostrar que no se puede crear el jugador y rompe el ciclo
                if(jugadores.get(i).getNombreJugador().equals(nombreJugadorTemporal) && nombreRepetido >0){
                    JOptionPane.showMessageDialog(null,"NO PUEDES CREAR A ESTE JUGADOR, YA EXISTE UNO CON EL MISMO NOMBRE");
                    claveSiSePuedeCrearJugador=false;
                    break;
                    
                }
                // si se cumplen las condiciones se puede crear al jugador
                if(!jugadores.get(i).getNombreJugador().equals(nombreJugadorTemporal) && nombreRepetido<=0){
                    claveSiSePuedeCrearJugador=true;
                }
           
            }
        }
        // donde se crea al jugador y se añade a la lista del comboBox
        if(claveSiSePuedeCrearJugador==true){
            jugadores.add(new Jugador(nombreJugadorTemporal,claveJugadorTemporal));
            comboBoxNombreJugadores1.addItem(jugadores.get(claveJugadorTemporal).getNombreJugador());
            ComboBoxNombreJugadores2.addItem(jugadores.get(claveJugadorTemporal).getNombreJugador());
            txtDondeVaElNombre.setText("");
            JOptionPane.showMessageDialog(null, "Se ha creado al jugador "+nombreJugadorTemporal+" con exito");
            claveJugadorTemporal++;
        }
        
       
        
    }
    
    private void ponerNombreALosJugadoresEnPartida(){
        lblNombreJugador1Facil.setText("Puntuacion "+jugador1.getNombreJugador()+" :");
        lblNombreJugador2Facil.setText("Puntuacion "+jugador2.getNombreJugador()+" :");
        lblNombreJugador1Normal.setText("Puntuacion "+jugador1.getNombreJugador()+" :");
        lblNombreJugador2Normal.setText("Puntuacion "+jugador2.getNombreJugador()+" :");
        lblNombreJugador1Dificil.setText("Puntuacion "+jugador1.getNombreJugador()+" :");
        lblNombreJugador2Dificil.setText("Puntuacion "+jugador2.getNombreJugador()+" :");
    }
    
    // unicamente escoge quien lleva el turno en el primer movimiento de la partida
    // activa y desactiva el estado de estado de partida pertinente
    private void elegirTurno(){
        Random randomNumeroAleatorio = new Random();
        int numAleatorio1= 1 + randomNumeroAleatorio.nextInt(2);
        if(numAleatorio1==1){
            jugador1.setEstadoJugadorPartida(true);
            jugador2.setEstadoJugadorPartida(false);
            verQuienLlevaElTurno(jugador1.getNombreJugador());
        }
        else{
            jugador2.setEstadoJugadorPartida(true);
            jugador1.setEstadoJugadorPartida(false);
            ponerNombreALosJugadoresEnPartida();
            verQuienLlevaElTurno(jugador2.getNombreJugador());
            
        }
    }
    
    // actualiza el turno del jugador que lo lleva
    private void verQuienLlevaElTurno(String jugador){
        txtQuienLlevaElTurnoFacil.setText(jugador);
        txtQuienLlevaElTurnoNormal.setText(jugador);
        txtQuienLlevaElTurnoDificil.setText(jugador);
    }
    // cambia de turno, cambia el estado del jugador de activo a no activo con un booleano
    private void cambiarTurno(){
        
        if(jugador1.isEstadoJugadorPartida()==true){
            jugador1.setEstadoJugadorPartida(false);
            verQuienLlevaElTurno(jugador2.getNombreJugador());
        }
        else{
            jugador1.setEstadoJugadorPartida(true);
            verQuienLlevaElTurno(jugador1.getNombreJugador());
        }
        
        if(jugador2.isEstadoJugadorPartida()==false){
            jugador2.setEstadoJugadorPartida(true);
            verQuienLlevaElTurno(jugador2.getNombreJugador());
        }
        else{
            jugador2.setEstadoJugadorPartida(false);
            verQuienLlevaElTurno(jugador1.getNombreJugador());
        }
        
        
    }
    // muestra el pane que tiene la informacion de la aplicacion
    private void mostrarInformacionDeLaAplicacion(){
        JOptionPane.showMessageDialog(null, "Esta aplicacion fue creada bajo circunstancias muy extremas. Se creo en una laptop Dell Inspiron n9010\n"
                +"Ademas que se necesito de dos semanas para terminarlo. El dessarrollador fue Juan Pablo Orizabal Gil, carné 201730318. Estudiante de\n "
                + "Ingenieria en Ciencias Y Sistemas del Centro Universitario de Occidente, que es una extencio de la Universidad de San Carlos de Guatemala \n"
                + "en el interior del pais. Curso el tercer semestre de dicha ingenieria. ", "Datos del desarrollador",JOptionPane.INFORMATION_MESSAGE);
    }
    // crea una partida, si no existen dos contrincantes muestra un mensaje emergente que dice que no se puede
    private void crearPartida(){
        if(jugadores.size()>=2){
            
            activarUnPanel("panelIniciarPartida");
        
        }
        else{
            JOptionPane.showMessageDialog(null,"NO TIENES DOS CONTRINCANTES PARA PELEAR, PRIMERO REGISTRALOS EN EL MENU PRINCIPAL");
        }
    }
    
    // esta activo cuando el panel de empezar partida esta activa y agrega a los dos jugadores para que se unan a la partida
    
    private void verificarDatosParaEmpezarPartida(){
        // añade a los jugadores como activos
        jugador1= new Jugador(comboBoxNombreJugadores1.getSelectedItem().toString(), 0);
        jugador2= new Jugador(ComboBoxNombreJugadores2.getSelectedItem().toString(), 1);
        
        // si se selecciona al mismo jugador no deja iniciar la partida
        if(jugador1.getNombreJugador().equals(jugador2.getNombreJugador())){
            JOptionPane.showMessageDialog(null,"NO PUEDES PELEAR SI SELECCIONAS AL MISMO JUGADOR, SELECCIONA A OTRO JUGADOR POR FAVOR");
        }
        else{// segun que escojan a ese nivel de dificultad se ira
            if(btnRadioDificultadFacil.isSelected()){
                setCartasFacil();
                activarUnPanel("panelJuegoFacil");
               
                
            }
            if(btnRadioDificultadNormal.isSelected()){
                setCartasNormal();
                activarUnPanel("panelJuegoNormal");
                
            }
            if(btnRadioDificultadDificil.isSelected()){
                setCartasDificil();
                activarUnPanel("panelJuegoDificil");
                
            }
            
            
        }
    }
    
    //  este metodo solo activa el panel y desactiva al otro
    // y vacia el arreglo de enteros de punteoJugadores
    private void activarUnPanel(String panelActivado){
        
        if("panelMenuPrincipal".equals(panelActivado)){
            panelMenuPrincipal.setVisible(true);
            panelJuegoDificil.setVisible(false);
            panelJuegoFacil.setVisible(false);
            panelJuegoNormal.setVisible(false);
            panelMenuInicio.setVisible(false);
            panelIniciarPartida.setVisible(false);
            panelMostrarReporteJugadoresGanadores.setVisible(false);
            panelMostrarReporteJugadoresGanadoresOrdenados.setVisible(false);
            panelEscogerReporte.setVisible(false);
            panelAyuda.setVisible(false);
            panelMostrarReporteJugadorMayorPunteo.setVisible(false); 
            punteoJugadores.clear(); reiniciarPunteoJugadores();
            
            
        }
        if("panelJuegoDificil".equals(panelActivado)){
            panelJuegoDificil.setVisible(true); 
            panelJuegoFacil.setVisible(false);
            panelJuegoNormal.setVisible(false);
            panelMenuInicio.setVisible(false);
            panelIniciarPartida.setVisible(false);
            panelMostrarReporteJugadoresGanadores.setVisible(false);
            panelMostrarReporteJugadoresGanadoresOrdenados.setVisible(false);
            panelEscogerReporte.setVisible(false);
            panelAyuda.setVisible(false);
            panelMostrarReporteJugadorMayorPunteo.setVisible(false); 
            punteoJugadores.clear(); reiniciarPunteoJugadores();
            
        }
        if("panelJuegoFacil".equals(panelActivado)){
            panelJuegoFacil.setVisible(true);
            panelJuegoDificil.setVisible(false);
            panelJuegoNormal.setVisible(false);
            panelMenuInicio.setVisible(false);
            panelIniciarPartida.setVisible(false);
            panelMostrarReporteJugadoresGanadores.setVisible(false);
            panelMostrarReporteJugadoresGanadoresOrdenados.setVisible(false);
            panelEscogerReporte.setVisible(false);
            panelAyuda.setVisible(false);
            panelMostrarReporteJugadorMayorPunteo.setVisible(false);
            punteoJugadores.clear(); reiniciarPunteoJugadores();
        }
        if("panelJuegoNormal".equals(panelActivado)){
            panelJuegoNormal.setVisible(true);
            panelJuegoDificil.setVisible(false);
            panelJuegoFacil.setVisible(false);
            panelMenuInicio.setVisible(false);
            panelIniciarPartida.setVisible(false);
            panelMostrarReporteJugadoresGanadores.setVisible(false);
            panelMostrarReporteJugadoresGanadoresOrdenados.setVisible(false);
            panelEscogerReporte.setVisible(false);
            panelAyuda.setVisible(false);
            panelMostrarReporteJugadorMayorPunteo.setVisible(false); 
            punteoJugadores.clear(); reiniciarPunteoJugadores();
        }
        if("panelMenuInicio".equals(panelActivado)){
            panelMenuInicio.setVisible(true);
            panelJuegoDificil.setVisible(false);
            panelJuegoFacil.setVisible(false);
            panelJuegoNormal.setVisible(false);
            panelIniciarPartida.setVisible(false);
            panelMostrarReporteJugadoresGanadores.setVisible(false);
            panelMostrarReporteJugadoresGanadoresOrdenados.setVisible(false);
            panelEscogerReporte.setVisible(false);
            panelAyuda.setVisible(false);
            panelMostrarReporteJugadorMayorPunteo.setVisible(false); 
            punteoJugadores.clear(); reiniciarPunteoJugadores();
        }
        if("panelIniciarPartida".equals(panelActivado)){
            panelIniciarPartida.setVisible(true);
            panelJuegoDificil.setVisible(false);
            panelJuegoFacil.setVisible(false);
            panelJuegoNormal.setVisible(false);
            panelMenuInicio.setVisible(false);
            panelMostrarReporteJugadoresGanadores.setVisible(false);
            panelMostrarReporteJugadoresGanadoresOrdenados.setVisible(false);
            panelEscogerReporte.setVisible(false);
            panelAyuda.setVisible(false);
            panelMostrarReporteJugadorMayorPunteo.setVisible(false);
            punteoJugadores.clear(); reiniciarPunteoJugadores();
        }
        if("panelMostrarReporteJugadoresGanadores".equals(panelActivado)){
            panelMostrarReporteJugadoresGanadores.setVisible(true);
            panelJuegoDificil.setVisible(false);
            panelJuegoFacil.setVisible(false);
            panelJuegoNormal.setVisible(false);
            panelMenuInicio.setVisible(false);
            panelIniciarPartida.setVisible(false);
            panelMostrarReporteJugadoresGanadoresOrdenados.setVisible(false);
            panelEscogerReporte.setVisible(false);
            panelAyuda.setVisible(false);
            panelMostrarReporteJugadorMayorPunteo.setVisible(false); 
            punteoJugadores.clear(); reiniciarPunteoJugadores();
        }
        if("panelMostrarReporteJugadoresGanadoresOrdenados".equals(panelActivado)){
            panelMostrarReporteJugadoresGanadoresOrdenados.setVisible(true);
            panelJuegoDificil.setVisible(false);
            panelJuegoFacil.setVisible(false);
            panelJuegoNormal.setVisible(false);
            panelMenuInicio.setVisible(false);
            panelIniciarPartida.setVisible(false);
            panelMostrarReporteJugadoresGanadores.setVisible(false);
            panelEscogerReporte.setVisible(false);
            panelAyuda.setVisible(false);
            panelMostrarReporteJugadorMayorPunteo.setVisible(false); 
            punteoJugadores.clear(); reiniciarPunteoJugadores();
        }
        if("panelEscogerReporte".equals(panelActivado)){
            panelEscogerReporte.setVisible(true);
            panelJuegoDificil.setVisible(false);
            panelJuegoFacil.setVisible(false);
            panelJuegoNormal.setVisible(false);
            panelMenuInicio.setVisible(false);
            panelIniciarPartida.setVisible(false);
            panelMostrarReporteJugadoresGanadores.setVisible(false);
            panelMostrarReporteJugadoresGanadoresOrdenados.setVisible(false); punteoJugadores.clear();
            panelAyuda.setVisible(false);
            panelMostrarReporteJugadorMayorPunteo.setVisible(false);
            reiniciarPunteoJugadores();
            
        }
        if("panelAyuda".equals(panelActivado)){
            panelAyuda.setVisible(true);
            panelEscogerReporte.setVisible(false);
            panelJuegoDificil.setVisible(false);
            panelJuegoFacil.setVisible(false);
            panelJuegoNormal.setVisible(false);
            panelMenuInicio.setVisible(false);
            panelIniciarPartida.setVisible(false);
            panelMostrarReporteJugadoresGanadores.setVisible(false);
            panelMostrarReporteJugadoresGanadoresOrdenados.setVisible(false); punteoJugadores.clear();
            panelMostrarReporteJugadorMayorPunteo.setVisible(false);
            reiniciarPunteoJugadores();
        }
        if("panelMostrarReporteJugadorMayorPunteo".equals(panelActivado)){
            panelMostrarReporteJugadorMayorPunteo.setVisible(true);
            panelAyuda.setVisible(false);
            panelEscogerReporte.setVisible(false);
            panelJuegoDificil.setVisible(false);
            panelJuegoFacil.setVisible(false);
            panelJuegoNormal.setVisible(false);
            panelMenuInicio.setVisible(false);
            panelIniciarPartida.setVisible(false);
            panelMostrarReporteJugadoresGanadores.setVisible(false);
            panelMostrarReporteJugadoresGanadoresOrdenados.setVisible(false); 
            punteoJugadores.clear(); reiniciarPunteoJugadores();
        }
        
        // siempre mantiene activo el panel del menu principal
        panelMenuPrincipal.setVisible(true);
        reiniciarPartida();
        
    }
    
    
    
    
    
    // son los botones de las cartas
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnGroupCrearJugador = new javax.swing.ButtonGroup();
        btnGroupSeleccionarDificultad = new javax.swing.ButtonGroup();
        jLabel31 = new javax.swing.JLabel();
        panelIniciarPartida = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboBoxNombreJugadores1 = new javax.swing.JComboBox<>();
        ComboBoxNombreJugadores2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnEmpezarPartida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnRadioDificultadFacil = new javax.swing.JRadioButton();
        btnRadioDificultadNormal = new javax.swing.JRadioButton();
        btnRadioDificultadDificil = new javax.swing.JRadioButton();
        panelMenuPrincipal = new javax.swing.JPanel();
        btnJuego = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAcercaDe = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        panelMenuInicio = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnRadioCrearJugadorSi = new javax.swing.JRadioButton();
        btnRadioCrearJugadorNo = new javax.swing.JRadioButton();
        jTextField4 = new javax.swing.JTextField();
        lblEscogerNombre = new javax.swing.JLabel();
        txtDondeVaElNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnEnviarNombre = new javax.swing.JButton();
        panelJuegoFacil = new javax.swing.JPanel();
        btnCarta31 = new javax.swing.JButton();
        btnCarta32 = new javax.swing.JButton();
        btnCarta33 = new javax.swing.JButton();
        btnCarta34 = new javax.swing.JButton();
        btnCarta35 = new javax.swing.JButton();
        btnCarta36 = new javax.swing.JButton();
        btnCarta37 = new javax.swing.JButton();
        btnCarta38 = new javax.swing.JButton();
        btnCarta39 = new javax.swing.JButton();
        btnCarta40 = new javax.swing.JButton();
        lblModoDeJuegoFacil = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        txtQuienLlevaElTurnoFacil = new javax.swing.JTextField();
        lblNombreJugador1Facil = new javax.swing.JLabel();
        lblNombreJugador2Facil = new javax.swing.JLabel();
        lblPuntuacionJugador1Facil = new javax.swing.JLabel();
        lblPuntuacionJugador2Facil = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        panelJuegoNormal = new javax.swing.JPanel();
        btnCarta41 = new javax.swing.JButton();
        btnCarta42 = new javax.swing.JButton();
        btnCarta43 = new javax.swing.JButton();
        btnCarta44 = new javax.swing.JButton();
        btnCarta45 = new javax.swing.JButton();
        btnCarta46 = new javax.swing.JButton();
        btnCarta47 = new javax.swing.JButton();
        btnCarta48 = new javax.swing.JButton();
        btnCarta49 = new javax.swing.JButton();
        btnCarta50 = new javax.swing.JButton();
        btnCarta51 = new javax.swing.JButton();
        btnCarta52 = new javax.swing.JButton();
        btnCarta53 = new javax.swing.JButton();
        btnCarta54 = new javax.swing.JButton();
        btnCarta55 = new javax.swing.JButton();
        btnCarta56 = new javax.swing.JButton();
        btnCarta57 = new javax.swing.JButton();
        btnCarta58 = new javax.swing.JButton();
        btnCarta59 = new javax.swing.JButton();
        btnCarta60 = new javax.swing.JButton();
        lblModoDeJuegoNormal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQuienLlevaElTurnoNormal = new javax.swing.JTextField();
        lblNombreJugador1Normal = new javax.swing.JLabel();
        lblNombreJugador2Normal = new javax.swing.JLabel();
        lblPuntuacionJugador1Normal = new javax.swing.JLabel();
        lblPuntuacionJugador2Normal = new javax.swing.JLabel();
        panelMostrarReporteJugadoresGanadores = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugadoresGanadores = new javax.swing.JTable();
        btnOrdenarGanadoresPorPunteo = new javax.swing.JButton();
        panelMostrarReporteJugadoresGanadoresOrdenados = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaJugadoresGanadores1 = new javax.swing.JTable();
        panelEscogerReporte = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnReporteJugadoresGanadores = new javax.swing.JButton();
        btnReporteMayorPunteo = new javax.swing.JButton();
        panelAyuda = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        panelMostrarReporteJugadorMayorPunteo = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtNombreJugadorMayorPunteo = new javax.swing.JTextField();
        txtPunteoJugadorMayorPunteo = new javax.swing.JTextField();
        panelJuegoDificil = new javax.swing.JPanel();
        btnCarta1 = new javax.swing.JButton();
        btnCarta2 = new javax.swing.JButton();
        btnCarta3 = new javax.swing.JButton();
        btnCarta4 = new javax.swing.JButton();
        btnCarta5 = new javax.swing.JButton();
        btnCarta6 = new javax.swing.JButton();
        btnCarta12 = new javax.swing.JButton();
        btnCarta11 = new javax.swing.JButton();
        btnCarta10 = new javax.swing.JButton();
        btnCarta9 = new javax.swing.JButton();
        btnCarta8 = new javax.swing.JButton();
        btnCarta7 = new javax.swing.JButton();
        btnCarta18 = new javax.swing.JButton();
        btnCarta17 = new javax.swing.JButton();
        btnCarta16 = new javax.swing.JButton();
        btnCarta15 = new javax.swing.JButton();
        btnCarta14 = new javax.swing.JButton();
        btnCarta13 = new javax.swing.JButton();
        btnCarta24 = new javax.swing.JButton();
        btnCarta23 = new javax.swing.JButton();
        btnCarta22 = new javax.swing.JButton();
        btnCarta21 = new javax.swing.JButton();
        btnCarta20 = new javax.swing.JButton();
        btnCarta19 = new javax.swing.JButton();
        btnCarta30 = new javax.swing.JButton();
        btnCarta29 = new javax.swing.JButton();
        btnCarta28 = new javax.swing.JButton();
        btnCarta27 = new javax.swing.JButton();
        btnCarta26 = new javax.swing.JButton();
        btnCarta25 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txtQuienLlevaElTurnoDificil = new javax.swing.JTextField();
        lblNombreJugador1Dificil = new javax.swing.JLabel();
        lblPuntuacionJugador1Dificil = new javax.swing.JLabel();
        lblNombreJugador2Dificil = new javax.swing.JLabel();
        lblPuntuacionJugador2Dificil = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel31.setText("jLabel31");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego De Memoria");
        setBackground(java.awt.Color.black);
        setMinimumSize(new java.awt.Dimension(902, 713));

        panelIniciarPartida.setPreferredSize(new java.awt.Dimension(885, 585));

        jLabel8.setText("Escribe el nombre del jugador 1:");

        jLabel11.setText("Escribe el nombre del jugador 2:");

        comboBoxNombreJugadores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNombreJugadores1ActionPerformed(evt);
            }
        });

        ComboBoxNombreJugadores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNombreJugadores2ActionPerformed(evt);
            }
        });

        jLabel12.setText("ESCOGE A LOS CONTRINCANTES");

        btnEmpezarPartida.setText("Empezar Partida");
        btnEmpezarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarPartidaActionPerformed(evt);
            }
        });

        jLabel2.setText("ESCOGE LA DIFICULTAD QUE DESEAS");

        jLabel13.setText("Facil (5 parejas)");

        jLabel14.setText("Normal(10 parejas)");

        jLabel15.setText("Dificil(15 parejas)");

        btnGroupSeleccionarDificultad.add(btnRadioDificultadFacil);
        btnRadioDificultadFacil.setSelected(true);
        btnRadioDificultadFacil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRadioDificultadFacilMouseClicked(evt);
            }
        });
        btnRadioDificultadFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioDificultadFacilActionPerformed(evt);
            }
        });

        btnGroupSeleccionarDificultad.add(btnRadioDificultadNormal);

        btnGroupSeleccionarDificultad.add(btnRadioDificultadDificil);

        javax.swing.GroupLayout panelIniciarPartidaLayout = new javax.swing.GroupLayout(panelIniciarPartida);
        panelIniciarPartida.setLayout(panelIniciarPartidaLayout);
        panelIniciarPartidaLayout.setHorizontalGroup(
            panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniciarPartidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmpezarPartida)
                .addGap(336, 336, 336))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIniciarPartidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelIniciarPartidaLayout.createSequentialGroup()
                            .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelIniciarPartidaLayout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel2))
                                .addGroup(panelIniciarPartidaLayout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnRadioDificultadNormal)
                                        .addComponent(btnRadioDificultadFacil)
                                        .addComponent(btnRadioDificultadDificil))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelIniciarPartidaLayout.createSequentialGroup()
                            .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBoxNombreJugadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBoxNombreJugadores2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIniciarPartidaLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)))
                .addGap(50, 50, 50))
        );
        panelIniciarPartidaLayout.setVerticalGroup(
            panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIniciarPartidaLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxNombreJugadores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxNombreJugadores2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIniciarPartidaLayout.createSequentialGroup()
                        .addComponent(btnRadioDificultadFacil)
                        .addGap(11, 11, 11)))
                .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRadioDificultadNormal))
                .addGap(22, 22, 22)
                .addGroup(panelIniciarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelIniciarPartidaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnRadioDificultadDificil)))
                .addGap(32, 32, 32)
                .addComponent(btnEmpezarPartida))
        );

        panelMenuPrincipal.setBackground(java.awt.Color.orange);
        panelMenuPrincipal.setPreferredSize(new java.awt.Dimension(650, 64));

        btnJuego.setText("JUEGO");
        btnJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegoActionPerformed(evt);
            }
        });

        jButton2.setText("REPORTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnAcercaDe.setText("ACERCA DE...");
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });

        jButton4.setText("AYUDA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnMenuPrincipal.setText("MENU PRINCIPAL");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuPrincipalLayout = new javax.swing.GroupLayout(panelMenuPrincipal);
        panelMenuPrincipal.setLayout(panelMenuPrincipalLayout);
        panelMenuPrincipalLayout.setHorizontalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(38, 38, 38)
                .addComponent(btnAcercaDe)
                .addGap(39, 39, 39)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnMenuPrincipal))
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJuego)
                    .addComponent(jButton2)
                    .addComponent(btnAcercaDe)
                    .addComponent(jButton4)
                    .addComponent(btnMenuPrincipal)))
        );

        panelMenuInicio.setPreferredSize(new java.awt.Dimension(885, 585));

        jLabel7.setText("BIENVENIDO AL JUEGO DE MEMORIA DE MARIO BROS");

        jTextField3.setText("¿Quieres crear un Jugador?");

        btnRadioCrearJugadorSi.setText("Si");
        btnRadioCrearJugadorSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRadioCrearJugadorSiMouseClicked(evt);
            }
        });

        btnRadioCrearJugadorNo.setSelected(true);
        btnRadioCrearJugadorNo.setText("No");
        btnRadioCrearJugadorNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRadioCrearJugadorNoMouseClicked(evt);
            }
        });

        jTextField4.setText("Bienvenido al juego de memoria de Mario Bros, aqui podras hacer partidas de jugador vs jugador");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        lblEscogerNombre.setText("Magnifico dinos cual es el nombre que le deseas poner:");

        txtDondeVaElNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDondeVaElNombreActionPerformed(evt);
            }
        });

        jLabel9.setText("El jugar es la mejor manera de distraerse...");

        jLabel10.setText("Lucha por ser el mejor");

        btnEnviarNombre.setText("Enviar");
        btnEnviarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuInicioLayout = new javax.swing.GroupLayout(panelMenuInicio);
        panelMenuInicio.setLayout(panelMenuInicioLayout);
        panelMenuInicioLayout.setHorizontalGroup(
            panelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuInicioLayout.createSequentialGroup()
                .addGroup(panelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuInicioLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuInicioLayout.createSequentialGroup()
                                .addComponent(lblEscogerNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDondeVaElNombre))
                            .addGroup(panelMenuInicioLayout.createSequentialGroup()
                                .addGroup(panelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRadioCrearJugadorSi)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRadioCrearJugadorNo)
                                    .addComponent(btnEnviarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelMenuInicioLayout.createSequentialGroup()
                        .addGroup(panelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuInicioLayout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabel7))
                            .addGroup(panelMenuInicioLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMenuInicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        panelMenuInicioLayout.setVerticalGroup(
            panelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuInicioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRadioCrearJugadorSi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRadioCrearJugadorNo)
                .addGap(18, 18, 18)
                .addGroup(panelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEscogerNombre)
                    .addComponent(txtDondeVaElNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviarNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(panelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(43, 43, 43))
        );

        panelJuegoFacil.setPreferredSize(new java.awt.Dimension(885, 585));
        panelJuegoFacil.setLayout(null);

        btnCarta31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta31.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta31.setBorderPainted(false);
        btnCarta31.setContentAreaFilled(false);
        btnCarta31.setFocusable(false);
        btnCarta31.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta31MouseExited(evt);
            }
        });
        btnCarta31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta31ActionPerformed(evt);
            }
        });
        panelJuegoFacil.add(btnCarta31);
        btnCarta31.setBounds(182, 132, 102, 102);

        btnCarta32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta32.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta32.setBorderPainted(false);
        btnCarta32.setContentAreaFilled(false);
        btnCarta32.setFocusable(false);
        btnCarta32.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta32MouseExited(evt);
            }
        });
        btnCarta32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta32ActionPerformed(evt);
            }
        });
        panelJuegoFacil.add(btnCarta32);
        btnCarta32.setBounds(398, 132, 102, 102);

        btnCarta33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta33.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta33.setBorderPainted(false);
        btnCarta33.setContentAreaFilled(false);
        btnCarta33.setFocusable(false);
        btnCarta33.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta33MouseExited(evt);
            }
        });
        btnCarta33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta33ActionPerformed(evt);
            }
        });
        panelJuegoFacil.add(btnCarta33);
        btnCarta33.setBounds(506, 240, 102, 102);

        btnCarta34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta34.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta34.setBorderPainted(false);
        btnCarta34.setContentAreaFilled(false);
        btnCarta34.setFocusable(false);
        btnCarta34.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta34MouseExited(evt);
            }
        });
        btnCarta34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta34ActionPerformed(evt);
            }
        });
        panelJuegoFacil.add(btnCarta34);
        btnCarta34.setBounds(506, 132, 102, 102);

        btnCarta35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta35.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta35.setBorderPainted(false);
        btnCarta35.setContentAreaFilled(false);
        btnCarta35.setFocusable(false);
        btnCarta35.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta35MouseExited(evt);
            }
        });
        btnCarta35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta35ActionPerformed(evt);
            }
        });
        panelJuegoFacil.add(btnCarta35);
        btnCarta35.setBounds(614, 132, 102, 102);

        btnCarta36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta36.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta36.setBorderPainted(false);
        btnCarta36.setContentAreaFilled(false);
        btnCarta36.setFocusable(false);
        btnCarta36.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta36MouseExited(evt);
            }
        });
        btnCarta36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta36ActionPerformed(evt);
            }
        });
        panelJuegoFacil.add(btnCarta36);
        btnCarta36.setBounds(290, 240, 102, 102);

        btnCarta37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta37.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta37.setBorderPainted(false);
        btnCarta37.setContentAreaFilled(false);
        btnCarta37.setFocusable(false);
        btnCarta37.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta37MouseExited(evt);
            }
        });
        btnCarta37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta37ActionPerformed(evt);
            }
        });
        panelJuegoFacil.add(btnCarta37);
        btnCarta37.setBounds(614, 240, 102, 102);

        btnCarta38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta38.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta38.setBorderPainted(false);
        btnCarta38.setContentAreaFilled(false);
        btnCarta38.setFocusable(false);
        btnCarta38.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta38MouseExited(evt);
            }
        });
        btnCarta38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta38ActionPerformed(evt);
            }
        });
        panelJuegoFacil.add(btnCarta38);
        btnCarta38.setBounds(398, 240, 102, 102);

        btnCarta39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta39.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta39.setBorderPainted(false);
        btnCarta39.setContentAreaFilled(false);
        btnCarta39.setFocusable(false);
        btnCarta39.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta39MouseExited(evt);
            }
        });
        btnCarta39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta39ActionPerformed(evt);
            }
        });
        panelJuegoFacil.add(btnCarta39);
        btnCarta39.setBounds(182, 240, 102, 102);

        btnCarta40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta40.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta40.setBorderPainted(false);
        btnCarta40.setContentAreaFilled(false);
        btnCarta40.setFocusable(false);
        btnCarta40.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta40MouseExited(evt);
            }
        });
        btnCarta40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta40ActionPerformed(evt);
            }
        });
        panelJuegoFacil.add(btnCarta40);
        btnCarta40.setBounds(290, 132, 102, 102);

        lblModoDeJuegoFacil.setText("MODO DE JUEGO FACIL");
        panelJuegoFacil.add(lblModoDeJuegoFacil);
        lblModoDeJuegoFacil.setBounds(340, 59, 176, 28);

        lblTurno.setText("TURNO: ");
        panelJuegoFacil.add(lblTurno);
        lblTurno.setBounds(182, 98, 57, 17);

        txtQuienLlevaElTurnoFacil.setEditable(false);
        txtQuienLlevaElTurnoFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuienLlevaElTurnoFacilActionPerformed(evt);
            }
        });
        panelJuegoFacil.add(txtQuienLlevaElTurnoFacil);
        txtQuienLlevaElTurnoFacil.setBounds(251, 93, 172, 27);

        lblNombreJugador1Facil.setText("Puntuacion jugador 1: ");
        panelJuegoFacil.add(lblNombreJugador1Facil);
        lblNombreJugador1Facil.setBounds(44, 440, 153, 26);

        lblNombreJugador2Facil.setText("Puntuacion jugador 2:");
        panelJuegoFacil.add(lblNombreJugador2Facil);
        lblNombreJugador2Facil.setBounds(589, 440, 150, 17);
        panelJuegoFacil.add(lblPuntuacionJugador1Facil);
        lblPuntuacionJugador1Facil.setBounds(215, 440, 60, 26);
        panelJuegoFacil.add(lblPuntuacionJugador2Facil);
        lblPuntuacionJugador2Facil.setBounds(767, 440, 60, 20);
        panelJuegoFacil.add(jLabel38);
        jLabel38.setBounds(63, 0, 0, 0);
        panelJuegoFacil.add(jLabel39);
        jLabel39.setBounds(0, -4, 880, 490);

        panelJuegoNormal.setEnabled(false);
        panelJuegoNormal.setPreferredSize(new java.awt.Dimension(885, 585));

        btnCarta41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta41.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta41.setBorderPainted(false);
        btnCarta41.setContentAreaFilled(false);
        btnCarta41.setFocusable(false);
        btnCarta41.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta41MouseExited(evt);
            }
        });
        btnCarta41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta41ActionPerformed(evt);
            }
        });

        btnCarta42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta42.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta42.setBorderPainted(false);
        btnCarta42.setContentAreaFilled(false);
        btnCarta42.setFocusable(false);
        btnCarta42.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta42MouseExited(evt);
            }
        });
        btnCarta42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta42ActionPerformed(evt);
            }
        });

        btnCarta43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta43.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta43.setBorderPainted(false);
        btnCarta43.setContentAreaFilled(false);
        btnCarta43.setFocusable(false);
        btnCarta43.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta43MouseExited(evt);
            }
        });
        btnCarta43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta43ActionPerformed(evt);
            }
        });

        btnCarta44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta44.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta44.setBorderPainted(false);
        btnCarta44.setContentAreaFilled(false);
        btnCarta44.setFocusable(false);
        btnCarta44.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta44MouseExited(evt);
            }
        });
        btnCarta44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta44ActionPerformed(evt);
            }
        });

        btnCarta45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta45.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta45.setBorderPainted(false);
        btnCarta45.setContentAreaFilled(false);
        btnCarta45.setFocusable(false);
        btnCarta45.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta45MouseExited(evt);
            }
        });
        btnCarta45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta45ActionPerformed(evt);
            }
        });

        btnCarta46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta46.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta46.setBorderPainted(false);
        btnCarta46.setContentAreaFilled(false);
        btnCarta46.setFocusable(false);
        btnCarta46.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta46MouseExited(evt);
            }
        });
        btnCarta46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta46ActionPerformed(evt);
            }
        });

        btnCarta47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta47.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta47.setBorderPainted(false);
        btnCarta47.setContentAreaFilled(false);
        btnCarta47.setFocusable(false);
        btnCarta47.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta47MouseExited(evt);
            }
        });
        btnCarta47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta47ActionPerformed(evt);
            }
        });

        btnCarta48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta48.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta48.setBorderPainted(false);
        btnCarta48.setContentAreaFilled(false);
        btnCarta48.setFocusable(false);
        btnCarta48.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta48MouseExited(evt);
            }
        });
        btnCarta48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta48ActionPerformed(evt);
            }
        });

        btnCarta49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta49.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta49.setBorderPainted(false);
        btnCarta49.setContentAreaFilled(false);
        btnCarta49.setFocusable(false);
        btnCarta49.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta49MouseExited(evt);
            }
        });
        btnCarta49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta49ActionPerformed(evt);
            }
        });

        btnCarta50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta50.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta50.setBorderPainted(false);
        btnCarta50.setContentAreaFilled(false);
        btnCarta50.setFocusable(false);
        btnCarta50.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta50MouseExited(evt);
            }
        });
        btnCarta50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta50ActionPerformed(evt);
            }
        });

        btnCarta51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta51.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta51.setBorderPainted(false);
        btnCarta51.setContentAreaFilled(false);
        btnCarta51.setFocusable(false);
        btnCarta51.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta51MouseExited(evt);
            }
        });
        btnCarta51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta51ActionPerformed(evt);
            }
        });

        btnCarta52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta52.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta52.setBorderPainted(false);
        btnCarta52.setContentAreaFilled(false);
        btnCarta52.setFocusable(false);
        btnCarta52.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta52MouseExited(evt);
            }
        });
        btnCarta52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta52ActionPerformed(evt);
            }
        });

        btnCarta53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta53.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta53.setBorderPainted(false);
        btnCarta53.setContentAreaFilled(false);
        btnCarta53.setFocusable(false);
        btnCarta53.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta53MouseExited(evt);
            }
        });
        btnCarta53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta53ActionPerformed(evt);
            }
        });

        btnCarta54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta54.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta54.setBorderPainted(false);
        btnCarta54.setContentAreaFilled(false);
        btnCarta54.setFocusable(false);
        btnCarta54.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta54MouseExited(evt);
            }
        });
        btnCarta54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta54ActionPerformed(evt);
            }
        });

        btnCarta55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta55.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta55.setBorderPainted(false);
        btnCarta55.setContentAreaFilled(false);
        btnCarta55.setFocusable(false);
        btnCarta55.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta55MouseExited(evt);
            }
        });
        btnCarta55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta55ActionPerformed(evt);
            }
        });

        btnCarta56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta56.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta56.setBorderPainted(false);
        btnCarta56.setContentAreaFilled(false);
        btnCarta56.setFocusable(false);
        btnCarta56.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta56MouseExited(evt);
            }
        });
        btnCarta56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta56ActionPerformed(evt);
            }
        });

        btnCarta57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta57.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta57.setBorderPainted(false);
        btnCarta57.setContentAreaFilled(false);
        btnCarta57.setFocusable(false);
        btnCarta57.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta57MouseExited(evt);
            }
        });
        btnCarta57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta57ActionPerformed(evt);
            }
        });

        btnCarta58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta58.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta58.setBorderPainted(false);
        btnCarta58.setContentAreaFilled(false);
        btnCarta58.setFocusable(false);
        btnCarta58.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta58MouseExited(evt);
            }
        });
        btnCarta58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta58ActionPerformed(evt);
            }
        });

        btnCarta59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta59.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta59.setBorderPainted(false);
        btnCarta59.setContentAreaFilled(false);
        btnCarta59.setFocusable(false);
        btnCarta59.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta59MouseExited(evt);
            }
        });
        btnCarta59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta59ActionPerformed(evt);
            }
        });

        btnCarta60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta60.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta60.setBorderPainted(false);
        btnCarta60.setContentAreaFilled(false);
        btnCarta60.setFocusable(false);
        btnCarta60.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta60MouseExited(evt);
            }
        });
        btnCarta60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta60ActionPerformed(evt);
            }
        });

        lblModoDeJuegoNormal.setText("MODO DE JUEGO NORMAL");

        jLabel3.setText("Turno: ");

        txtQuienLlevaElTurnoNormal.setEditable(false);

        lblNombreJugador1Normal.setText("Puntuacion Jugador 1 : ");

        lblNombreJugador2Normal.setText("Puntuacion Jugador 2: ");

        javax.swing.GroupLayout panelJuegoNormalLayout = new javax.swing.GroupLayout(panelJuegoNormal);
        panelJuegoNormal.setLayout(panelJuegoNormalLayout);
        panelJuegoNormalLayout.setHorizontalGroup(
            panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuegoNormalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJuegoNormalLayout.createSequentialGroup()
                        .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombreJugador1Normal)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuienLlevaElTurnoNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPuntuacionJugador1Normal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelJuegoNormalLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelJuegoNormalLayout.createSequentialGroup()
                                .addComponent(btnCarta58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta54))
                            .addGroup(panelJuegoNormalLayout.createSequentialGroup()
                                .addComponent(btnCarta52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta48))
                            .addGroup(panelJuegoNormalLayout.createSequentialGroup()
                                .addComponent(btnCarta41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta45))
                            .addGroup(panelJuegoNormalLayout.createSequentialGroup()
                                .addComponent(btnCarta46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta59)
                                .addGap(6, 6, 6)
                                .addComponent(btnCarta47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta53)))))
                .addGap(0, 204, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuegoNormalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuegoNormalLayout.createSequentialGroup()
                        .addComponent(lblNombreJugador2Normal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPuntuacionJugador2Normal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuegoNormalLayout.createSequentialGroup()
                        .addComponent(lblModoDeJuegoNormal)
                        .addGap(348, 348, 348))))
        );
        panelJuegoNormalLayout.setVerticalGroup(
            panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuegoNormalLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lblModoDeJuegoNormal)
                .addGap(18, 18, 18)
                .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuienLlevaElTurnoNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelJuegoNormalLayout.createSequentialGroup()
                        .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCarta43)
                            .addComponent(btnCarta44)
                            .addComponent(btnCarta45)
                            .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCarta41)
                                .addComponent(btnCarta42)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCarta49)
                                .addComponent(btnCarta48)
                                .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCarta52)
                                    .addComponent(btnCarta51)))
                            .addComponent(btnCarta50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCarta55)
                                .addComponent(btnCarta54)
                                .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCarta58)
                                    .addComponent(btnCarta57)))
                            .addComponent(btnCarta56))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCarta60)
                                    .addComponent(btnCarta59, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(btnCarta46))
                            .addComponent(btnCarta47)))
                    .addComponent(btnCarta53))
                .addGap(25, 25, 25)
                .addGroup(panelJuegoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreJugador1Normal)
                    .addComponent(lblNombreJugador2Normal)
                    .addComponent(lblPuntuacionJugador1Normal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuntuacionJugador2Normal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        panelMostrarReporteJugadoresGanadores.setPreferredSize(new java.awt.Dimension(885, 585));

        jLabel16.setText("REPORTE DE JUGADORES GANADORES");

        tablaJugadoresGanadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave ", "Jugador Ganador", "Punteo", "Jugador Perdedor", "Hora", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaJugadoresGanadores.setRowHeight(30);
        jScrollPane1.setViewportView(tablaJugadoresGanadores);

        btnOrdenarGanadoresPorPunteo.setText("Ordenar Ganadores Por Punteo");
        btnOrdenarGanadoresPorPunteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarGanadoresPorPunteoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMostrarReporteJugadoresGanadoresLayout = new javax.swing.GroupLayout(panelMostrarReporteJugadoresGanadores);
        panelMostrarReporteJugadoresGanadores.setLayout(panelMostrarReporteJugadoresGanadoresLayout);
        panelMostrarReporteJugadoresGanadoresLayout.setHorizontalGroup(
            panelMostrarReporteJugadoresGanadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarReporteJugadoresGanadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panelMostrarReporteJugadoresGanadoresLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(btnOrdenarGanadoresPorPunteo)
                .addGap(38, 38, 38))
        );
        panelMostrarReporteJugadoresGanadoresLayout.setVerticalGroup(
            panelMostrarReporteJugadoresGanadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarReporteJugadoresGanadoresLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(panelMostrarReporteJugadoresGanadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarGanadoresPorPunteo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMostrarReporteJugadoresGanadoresOrdenados.setPreferredSize(new java.awt.Dimension(885, 585));

        jLabel17.setText("REPORTE DE JUGADORES GANADORES ORDENADOS");

        tablaJugadoresGanadores1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave ", "Jugador Ganador", "Punteo", "Jugador Perdedor", "Hora", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaJugadoresGanadores1.setRowHeight(30);
        jScrollPane2.setViewportView(tablaJugadoresGanadores1);

        javax.swing.GroupLayout panelMostrarReporteJugadoresGanadoresOrdenadosLayout = new javax.swing.GroupLayout(panelMostrarReporteJugadoresGanadoresOrdenados);
        panelMostrarReporteJugadoresGanadoresOrdenados.setLayout(panelMostrarReporteJugadoresGanadoresOrdenadosLayout);
        panelMostrarReporteJugadoresGanadoresOrdenadosLayout.setHorizontalGroup(
            panelMostrarReporteJugadoresGanadoresOrdenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarReporteJugadoresGanadoresOrdenadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarReporteJugadoresGanadoresOrdenadosLayout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        panelMostrarReporteJugadoresGanadoresOrdenadosLayout.setVerticalGroup(
            panelMostrarReporteJugadoresGanadoresOrdenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarReporteJugadoresGanadoresOrdenadosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel18.setText("REPORTES DE LOS JUGADORES ");

        jLabel19.setText("Escoge que reporte quieres ver: ");

        jLabel20.setText("Reporte Historial De Jugadores Ganadores:");

        jLabel21.setText("Reporte de Jugador Con Mayor Punteo: ");

        btnReporteJugadoresGanadores.setText("IR AL REPORTE");
        btnReporteJugadoresGanadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteJugadoresGanadoresActionPerformed(evt);
            }
        });

        btnReporteMayorPunteo.setText("IR AL REPORTE");
        btnReporteMayorPunteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteMayorPunteoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEscogerReporteLayout = new javax.swing.GroupLayout(panelEscogerReporte);
        panelEscogerReporte.setLayout(panelEscogerReporteLayout);
        panelEscogerReporteLayout.setHorizontalGroup(
            panelEscogerReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscogerReporteLayout.createSequentialGroup()
                .addGroup(panelEscogerReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEscogerReporteLayout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel18))
                    .addGroup(panelEscogerReporteLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel19))
                    .addGroup(panelEscogerReporteLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(panelEscogerReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(153, 153, 153)
                        .addGroup(panelEscogerReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReporteJugadoresGanadores, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnReporteMayorPunteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        panelEscogerReporteLayout.setVerticalGroup(
            panelEscogerReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscogerReporteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel18)
                .addGap(30, 30, 30)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(panelEscogerReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(btnReporteJugadoresGanadores))
                .addGap(95, 95, 95)
                .addGroup(panelEscogerReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(btnReporteMayorPunteo))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        panelAyuda.setPreferredSize(new java.awt.Dimension(885, 585));

        jLabel22.setText("MENU AYUDA");

        jLabel23.setText("¿Como iniciar una partida?");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(" Bien, para poder iniciar una partida deben de existir al\n menos 2 jugadores ya que si no es el juego no \ndejara iniciarla.");
        jScrollPane3.setViewportView(jTextArea1);

        jLabel24.setText("¿Que pasa si quedamos empate?");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Si quedan con el mismo punteo ambos jugadores\nsignifica que quedaron empates, si es asi no se añadira a \nninguno de los jugadores a los reportes\ny terminara la partida como es normal");
        jScrollPane4.setViewportView(jTextArea2);

        jLabel25.setText("¿Como funcionan los reportes?");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Estos se van agregando automaticamente cada vez que \nse termina una batalla, y si no quedo en empate, de esta\nmanera se actualiza la tabla que alberga a todos los datos\nde la lista.");
        jScrollPane5.setViewportView(jTextArea3);

        jLabel26.setText("¿Puedo borrar a algun jugador?");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("No, no  esta implementada esa opcion.");
        jScrollPane6.setViewportView(jTextArea4);

        jLabel27.setText("¿Se pueden crear jugadores con el mismo nombre?");

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("No, esto no es permitido por el algoritmo para no \nconfundir los nombres  y turnos a la hora de crear\nuna partida. Son fines puramente de jugabilidad.");
        jScrollPane7.setViewportView(jTextArea5);

        jLabel28.setText("¿Como funcionan los turnos y la puntuacion?");

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("Los turnos cambian cada vez que se levantan dos \ncartas, sin importar si son pareja o no.\nLa puntuacion esta: si encuentra pareja son 50 puntos\nsi no es pareja le restan 10 puntos.");
        jScrollPane8.setViewportView(jTextArea6);

        jLabel36.setText("¿Que hace el boton Acerca De?");

        jTextField1.setText("Muestra la informacion del desarrollador de la app.");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel37.setText("¿Que hace el boton Juego?");

        jTextField2.setText("Empieza una partida.");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAyudaLayout = new javax.swing.GroupLayout(panelAyuda);
        panelAyuda.setLayout(panelAyudaLayout);
        panelAyudaLayout.setHorizontalGroup(
            panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAyudaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelAyudaLayout.createSequentialGroup()
                            .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelAyudaLayout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(166, 166, 166))
                                .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                        .addGroup(panelAyudaLayout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addGroup(panelAyudaLayout.createSequentialGroup()
                        .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane6)
                    .addGroup(panelAyudaLayout.createSequentialGroup()
                        .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        panelAyudaLayout.setVerticalGroup(
            panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAyudaLayout.createSequentialGroup()
                .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAyudaLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAyudaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap())
        );

        panelMostrarReporteJugadorMayorPunteo.setPreferredSize(new java.awt.Dimension(885, 585));

        jLabel33.setText("¡¡¡JUGADOR CON MAYOR PUNTEO!!!");

        jLabel34.setText("Nombre jugador: ");

        jLabel35.setText("Punteo Jugador: ");

        txtNombreJugadorMayorPunteo.setEditable(false);
        txtNombreJugadorMayorPunteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreJugadorMayorPunteoActionPerformed(evt);
            }
        });

        txtPunteoJugadorMayorPunteo.setEditable(false);
        txtPunteoJugadorMayorPunteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPunteoJugadorMayorPunteoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMostrarReporteJugadorMayorPunteoLayout = new javax.swing.GroupLayout(panelMostrarReporteJugadorMayorPunteo);
        panelMostrarReporteJugadorMayorPunteo.setLayout(panelMostrarReporteJugadorMayorPunteoLayout);
        panelMostrarReporteJugadorMayorPunteoLayout.setHorizontalGroup(
            panelMostrarReporteJugadorMayorPunteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarReporteJugadorMayorPunteoLayout.createSequentialGroup()
                .addGroup(panelMostrarReporteJugadorMayorPunteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMostrarReporteJugadorMayorPunteoLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel33))
                    .addGroup(panelMostrarReporteJugadorMayorPunteoLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(panelMostrarReporteJugadorMayorPunteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addGap(80, 80, 80)
                        .addGroup(panelMostrarReporteJugadorMayorPunteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreJugadorMayorPunteo)
                            .addComponent(txtPunteoJugadorMayorPunteo, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        panelMostrarReporteJugadorMayorPunteoLayout.setVerticalGroup(
            panelMostrarReporteJugadorMayorPunteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarReporteJugadorMayorPunteoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(panelMostrarReporteJugadorMayorPunteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreJugadorMayorPunteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelMostrarReporteJugadorMayorPunteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPunteoJugadorMayorPunteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(321, Short.MAX_VALUE))
        );

        panelJuegoDificil.setEnabled(false);
        panelJuegoDificil.setMaximumSize(new java.awt.Dimension(885, 585));
        panelJuegoDificil.setMinimumSize(new java.awt.Dimension(885, 585));
        panelJuegoDificil.setPreferredSize(new java.awt.Dimension(885, 585));

        btnCarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta1.setBorderPainted(false);
        btnCarta1.setContentAreaFilled(false);
        btnCarta1.setFocusable(false);
        btnCarta1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta1MouseExited(evt);
            }
        });
        btnCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta1ActionPerformed(evt);
            }
        });

        btnCarta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta2.setBorderPainted(false);
        btnCarta2.setContentAreaFilled(false);
        btnCarta2.setFocusable(false);
        btnCarta2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta2MouseExited(evt);
            }
        });
        btnCarta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta2ActionPerformed(evt);
            }
        });

        btnCarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta3.setBorderPainted(false);
        btnCarta3.setContentAreaFilled(false);
        btnCarta3.setFocusable(false);
        btnCarta3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta3MouseExited(evt);
            }
        });
        btnCarta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta3ActionPerformed(evt);
            }
        });

        btnCarta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta4.setBorderPainted(false);
        btnCarta4.setContentAreaFilled(false);
        btnCarta4.setFocusable(false);
        btnCarta4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta4MouseExited(evt);
            }
        });
        btnCarta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta4ActionPerformed(evt);
            }
        });

        btnCarta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta5.setBorderPainted(false);
        btnCarta5.setContentAreaFilled(false);
        btnCarta5.setFocusable(false);
        btnCarta5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta5MouseExited(evt);
            }
        });
        btnCarta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta5ActionPerformed(evt);
            }
        });

        btnCarta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta6.setBorderPainted(false);
        btnCarta6.setContentAreaFilled(false);
        btnCarta6.setFocusable(false);
        btnCarta6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta6MouseExited(evt);
            }
        });
        btnCarta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta6ActionPerformed(evt);
            }
        });

        btnCarta12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta12.setBorderPainted(false);
        btnCarta12.setContentAreaFilled(false);
        btnCarta12.setFocusable(false);
        btnCarta12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta12MouseExited(evt);
            }
        });
        btnCarta12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta12ActionPerformed(evt);
            }
        });

        btnCarta11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta11.setBorderPainted(false);
        btnCarta11.setContentAreaFilled(false);
        btnCarta11.setFocusable(false);
        btnCarta11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta11MouseExited(evt);
            }
        });
        btnCarta11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta11ActionPerformed(evt);
            }
        });

        btnCarta10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta10.setBorderPainted(false);
        btnCarta10.setContentAreaFilled(false);
        btnCarta10.setFocusable(false);
        btnCarta10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta10MouseExited(evt);
            }
        });
        btnCarta10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta10ActionPerformed(evt);
            }
        });

        btnCarta9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta9.setBorderPainted(false);
        btnCarta9.setContentAreaFilled(false);
        btnCarta9.setFocusable(false);
        btnCarta9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta9MouseExited(evt);
            }
        });
        btnCarta9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta9ActionPerformed(evt);
            }
        });

        btnCarta8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta8.setBorderPainted(false);
        btnCarta8.setContentAreaFilled(false);
        btnCarta8.setFocusable(false);
        btnCarta8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta8MouseExited(evt);
            }
        });
        btnCarta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta8ActionPerformed(evt);
            }
        });

        btnCarta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta7.setBorderPainted(false);
        btnCarta7.setContentAreaFilled(false);
        btnCarta7.setFocusable(false);
        btnCarta7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta7MouseExited(evt);
            }
        });
        btnCarta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta7ActionPerformed(evt);
            }
        });

        btnCarta18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta18.setBorderPainted(false);
        btnCarta18.setContentAreaFilled(false);
        btnCarta18.setFocusable(false);
        btnCarta18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta18MouseExited(evt);
            }
        });
        btnCarta18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta18ActionPerformed(evt);
            }
        });

        btnCarta17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta17.setBorderPainted(false);
        btnCarta17.setContentAreaFilled(false);
        btnCarta17.setFocusable(false);
        btnCarta17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta17MouseExited(evt);
            }
        });
        btnCarta17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta17ActionPerformed(evt);
            }
        });

        btnCarta16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta16.setBorderPainted(false);
        btnCarta16.setContentAreaFilled(false);
        btnCarta16.setFocusable(false);
        btnCarta16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta16MouseExited(evt);
            }
        });
        btnCarta16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta16ActionPerformed(evt);
            }
        });

        btnCarta15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta15.setBorderPainted(false);
        btnCarta15.setContentAreaFilled(false);
        btnCarta15.setFocusable(false);
        btnCarta15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta15MouseExited(evt);
            }
        });
        btnCarta15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta15ActionPerformed(evt);
            }
        });

        btnCarta14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta14.setBorderPainted(false);
        btnCarta14.setContentAreaFilled(false);
        btnCarta14.setFocusable(false);
        btnCarta14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta14MouseExited(evt);
            }
        });
        btnCarta14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta14ActionPerformed(evt);
            }
        });

        btnCarta13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta13.setBorderPainted(false);
        btnCarta13.setContentAreaFilled(false);
        btnCarta13.setFocusable(false);
        btnCarta13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta13MouseExited(evt);
            }
        });
        btnCarta13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta13ActionPerformed(evt);
            }
        });

        btnCarta24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta24.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta24.setBorderPainted(false);
        btnCarta24.setContentAreaFilled(false);
        btnCarta24.setFocusable(false);
        btnCarta24.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta24MouseExited(evt);
            }
        });
        btnCarta24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta24ActionPerformed(evt);
            }
        });

        btnCarta23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta23.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta23.setBorderPainted(false);
        btnCarta23.setContentAreaFilled(false);
        btnCarta23.setFocusable(false);
        btnCarta23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta23MouseExited(evt);
            }
        });
        btnCarta23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta23ActionPerformed(evt);
            }
        });

        btnCarta22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta22.setBorderPainted(false);
        btnCarta22.setContentAreaFilled(false);
        btnCarta22.setFocusable(false);
        btnCarta22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCarta22MousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta22MouseExited(evt);
            }
        });
        btnCarta22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta22ActionPerformed(evt);
            }
        });

        btnCarta21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta21.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta21.setBorderPainted(false);
        btnCarta21.setContentAreaFilled(false);
        btnCarta21.setFocusable(false);
        btnCarta21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta21MouseExited(evt);
            }
        });
        btnCarta21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta21ActionPerformed(evt);
            }
        });

        btnCarta20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta20.setBorderPainted(false);
        btnCarta20.setContentAreaFilled(false);
        btnCarta20.setFocusable(false);
        btnCarta20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta20MouseExited(evt);
            }
        });
        btnCarta20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta20ActionPerformed(evt);
            }
        });

        btnCarta19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta19.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta19.setBorderPainted(false);
        btnCarta19.setContentAreaFilled(false);
        btnCarta19.setFocusable(false);
        btnCarta19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta19MouseExited(evt);
            }
        });
        btnCarta19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta19ActionPerformed(evt);
            }
        });

        btnCarta30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta30.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta30.setBorderPainted(false);
        btnCarta30.setContentAreaFilled(false);
        btnCarta30.setFocusable(false);
        btnCarta30.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta30MouseExited(evt);
            }
        });
        btnCarta30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta30ActionPerformed(evt);
            }
        });

        btnCarta29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta29.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta29.setBorderPainted(false);
        btnCarta29.setContentAreaFilled(false);
        btnCarta29.setFocusable(false);
        btnCarta29.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta29MouseExited(evt);
            }
        });
        btnCarta29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta29ActionPerformed(evt);
            }
        });

        btnCarta28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta28.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta28.setBorderPainted(false);
        btnCarta28.setContentAreaFilled(false);
        btnCarta28.setFocusable(false);
        btnCarta28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta28MouseExited(evt);
            }
        });
        btnCarta28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta28ActionPerformed(evt);
            }
        });

        btnCarta27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta27.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta27.setBorderPainted(false);
        btnCarta27.setContentAreaFilled(false);
        btnCarta27.setFocusable(false);
        btnCarta27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta27MouseExited(evt);
            }
        });
        btnCarta27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta27ActionPerformed(evt);
            }
        });

        btnCarta26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta26.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta26.setBorderPainted(false);
        btnCarta26.setContentAreaFilled(false);
        btnCarta26.setFocusable(false);
        btnCarta26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta26MouseExited(evt);
            }
        });
        btnCarta26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta26ActionPerformed(evt);
            }
        });

        btnCarta25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartas.png"))); // NOI18N
        btnCarta25.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCarta25.setBorderPainted(false);
        btnCarta25.setContentAreaFilled(false);
        btnCarta25.setFocusable(false);
        btnCarta25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partedeatrascartasiluminado.png"))); // NOI18N
        btnCarta25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarta25MouseExited(evt);
            }
        });
        btnCarta25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta25ActionPerformed(evt);
            }
        });

        jLabel29.setText("Turno");

        txtQuienLlevaElTurnoDificil.setEditable(false);
        txtQuienLlevaElTurnoDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuienLlevaElTurnoDificilActionPerformed(evt);
            }
        });

        lblNombreJugador1Dificil.setText("Puntuacion  Jugador 1:");

        lblNombreJugador2Dificil.setText("Puntuacion Jugador 2:");

        javax.swing.GroupLayout panelJuegoDificilLayout = new javax.swing.GroupLayout(panelJuegoDificil);
        panelJuegoDificil.setLayout(panelJuegoDificilLayout);
        panelJuegoDificilLayout.setHorizontalGroup(
            panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuegoDificilLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJuegoDificilLayout.createSequentialGroup()
                        .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelJuegoDificilLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuienLlevaElTurnoDificil))
                            .addGroup(panelJuegoDificilLayout.createSequentialGroup()
                                .addComponent(btnCarta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta6))
                    .addGroup(panelJuegoDificilLayout.createSequentialGroup()
                        .addComponent(btnCarta25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta30))
                    .addGroup(panelJuegoDificilLayout.createSequentialGroup()
                        .addComponent(btnCarta19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta24))
                    .addGroup(panelJuegoDificilLayout.createSequentialGroup()
                        .addComponent(btnCarta13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombreJugador2Dificil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPuntuacionJugador2Dificil, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelJuegoDificilLayout.createSequentialGroup()
                        .addComponent(btnCarta7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarta12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreJugador1Dificil)
                            .addComponent(lblPuntuacionJugador1Dificil, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelJuegoDificilLayout.setVerticalGroup(
            panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuegoDificilLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtQuienLlevaElTurnoDificil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJuegoDificilLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCarta3)
                            .addComponent(btnCarta4)
                            .addComponent(btnCarta5)
                            .addComponent(btnCarta6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCarta1)
                                .addComponent(btnCarta2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCarta10)
                                .addComponent(btnCarta11)
                                .addComponent(btnCarta12, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCarta7)
                                    .addComponent(btnCarta8)))
                            .addComponent(btnCarta9)))
                    .addGroup(panelJuegoDificilLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lblNombreJugador1Dificil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPuntuacionJugador1Dificil, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCarta16)
                            .addComponent(btnCarta17)
                            .addComponent(btnCarta18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCarta13)
                                .addComponent(btnCarta14)))
                        .addComponent(btnCarta15))
                    .addGroup(panelJuegoDificilLayout.createSequentialGroup()
                        .addComponent(lblNombreJugador2Dificil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPuntuacionJugador2Dificil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCarta22)
                        .addComponent(btnCarta23)
                        .addComponent(btnCarta24, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCarta19)
                            .addComponent(btnCarta20)))
                    .addComponent(btnCarta21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCarta28)
                        .addComponent(btnCarta29)
                        .addComponent(btnCarta30, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelJuegoDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCarta25)
                            .addComponent(btnCarta26)))
                    .addComponent(btnCarta27)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMenuInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelIniciarPartida, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1426, Short.MAX_VALUE)
                        .addGap(98, 98, 98))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelJuegoFacil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelJuegoNormal, javax.swing.GroupLayout.DEFAULT_SIZE, 1512, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelMostrarReporteJugadoresGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelMostrarReporteJugadoresGanadoresOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelEscogerReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelMostrarReporteJugadorMayorPunteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelJuegoDificil, javax.swing.GroupLayout.DEFAULT_SIZE, 1512, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenuInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addComponent(panelIniciarPartida, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelJuegoFacil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelJuegoNormal, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelMostrarReporteJugadoresGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelMostrarReporteJugadoresGanadoresOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelEscogerReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelMostrarReporteJugadorMayorPunteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelJuegoDificil, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        setBounds(0, 0, 919, 743);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta1ActionPerformed
        btnHabilitado(btnCarta1);
    }//GEN-LAST:event_btnCarta1ActionPerformed

    private void btnCarta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta2ActionPerformed
        btnHabilitado(btnCarta2);
    }//GEN-LAST:event_btnCarta2ActionPerformed

    private void btnCarta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta3ActionPerformed
        btnHabilitado(btnCarta3);
    }//GEN-LAST:event_btnCarta3ActionPerformed

    private void btnCarta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta4ActionPerformed
        btnHabilitado(btnCarta4);
    }//GEN-LAST:event_btnCarta4ActionPerformed

    private void btnCarta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta5ActionPerformed
        btnHabilitado(btnCarta5);
    }//GEN-LAST:event_btnCarta5ActionPerformed

    private void btnCarta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta6ActionPerformed
        btnHabilitado(btnCarta6);
    }//GEN-LAST:event_btnCarta6ActionPerformed

    private void btnCarta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta7ActionPerformed
        btnHabilitado(btnCarta7);
    }//GEN-LAST:event_btnCarta7ActionPerformed

    private void btnCarta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta8ActionPerformed
        btnHabilitado(btnCarta8);
    }//GEN-LAST:event_btnCarta8ActionPerformed

    private void btnCarta9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta9ActionPerformed
       btnHabilitado(btnCarta9);
    }//GEN-LAST:event_btnCarta9ActionPerformed

    private void btnCarta10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta10ActionPerformed
        btnHabilitado(btnCarta10);
    }//GEN-LAST:event_btnCarta10ActionPerformed

    private void btnCarta11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta11ActionPerformed
        btnHabilitado(btnCarta11);
    }//GEN-LAST:event_btnCarta11ActionPerformed

    private void btnCarta12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta12ActionPerformed
        btnHabilitado(btnCarta12);
    }//GEN-LAST:event_btnCarta12ActionPerformed

    private void btnCarta13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta13ActionPerformed
        btnHabilitado(btnCarta13);
    }//GEN-LAST:event_btnCarta13ActionPerformed

    private void btnCarta14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta14ActionPerformed
        btnHabilitado(btnCarta14);
    }//GEN-LAST:event_btnCarta14ActionPerformed

    private void btnCarta15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta15ActionPerformed
        btnHabilitado(btnCarta15);
    }//GEN-LAST:event_btnCarta15ActionPerformed

    private void btnCarta16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta16ActionPerformed
        btnHabilitado(btnCarta16);
    }//GEN-LAST:event_btnCarta16ActionPerformed

    private void btnCarta17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta17ActionPerformed
        btnHabilitado(btnCarta17);
    }//GEN-LAST:event_btnCarta17ActionPerformed

    private void btnCarta18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta18ActionPerformed
        btnHabilitado(btnCarta18);
    }//GEN-LAST:event_btnCarta18ActionPerformed

    private void btnCarta19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta19ActionPerformed
        btnHabilitado(btnCarta19);
    }//GEN-LAST:event_btnCarta19ActionPerformed

    private void btnCarta20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta20ActionPerformed
        btnHabilitado(btnCarta20);
    }//GEN-LAST:event_btnCarta20ActionPerformed

    private void btnCarta21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta21ActionPerformed
        btnHabilitado(btnCarta21);
    }//GEN-LAST:event_btnCarta21ActionPerformed

    private void btnCarta22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta22ActionPerformed
        btnHabilitado(btnCarta22);
    }//GEN-LAST:event_btnCarta22ActionPerformed

    private void btnCarta23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta23ActionPerformed
        btnHabilitado(btnCarta23);
    }//GEN-LAST:event_btnCarta23ActionPerformed

    private void btnCarta24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta24ActionPerformed
        btnHabilitado(btnCarta24);
    }//GEN-LAST:event_btnCarta24ActionPerformed

    private void btnCarta25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta25ActionPerformed
       btnHabilitado(btnCarta25);
    }//GEN-LAST:event_btnCarta25ActionPerformed

    private void btnCarta26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta26ActionPerformed
        btnHabilitado(btnCarta26);
    }//GEN-LAST:event_btnCarta26ActionPerformed

    private void btnCarta27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta27ActionPerformed
        btnHabilitado(btnCarta27);
    }//GEN-LAST:event_btnCarta27ActionPerformed

    private void btnCarta28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta28ActionPerformed
        btnHabilitado(btnCarta28);
    }//GEN-LAST:event_btnCarta28ActionPerformed

    private void btnCarta29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta29ActionPerformed
       btnHabilitado(btnCarta29);
    }//GEN-LAST:event_btnCarta29ActionPerformed

    private void btnCarta30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta30ActionPerformed
        btnHabilitado(btnCarta30);
    }//GEN-LAST:event_btnCarta30ActionPerformed
    // compara las cartas cuando se aleja de la carta
    private void btnCarta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta1MouseExited
         compararCartas();
    }//GEN-LAST:event_btnCarta1MouseExited

    private void btnCarta2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta2MouseExited
         compararCartas();
    }//GEN-LAST:event_btnCarta2MouseExited

    private void btnCarta3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta3MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta3MouseExited

    private void btnCarta4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta4MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta4MouseExited

    private void btnCarta5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta5MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta5MouseExited

    private void btnCarta6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta6MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta6MouseExited

    private void btnCarta7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta7MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta7MouseExited

    private void btnCarta8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta8MouseExited
       compararCartas();
    }//GEN-LAST:event_btnCarta8MouseExited

    private void btnCarta9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta9MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta9MouseExited

    private void btnCarta10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta10MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta10MouseExited

    private void btnCarta11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta11MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta11MouseExited

    private void btnCarta12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta12MouseExited
       compararCartas();
    }//GEN-LAST:event_btnCarta12MouseExited

    private void btnCarta13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta13MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta13MouseExited

    private void btnCarta14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta14MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta14MouseExited

    private void btnCarta15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta15MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta15MouseExited

    private void btnCarta16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta16MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta16MouseExited

    private void btnCarta17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta17MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta17MouseExited

    private void btnCarta18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta18MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta18MouseExited

    private void btnCarta19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta19MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta19MouseExited

    private void btnCarta20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta20MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta20MouseExited

    private void btnCarta21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta21MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta21MouseExited

    
    private void btnCarta22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta22MousePressed
        
    }//GEN-LAST:event_btnCarta22MousePressed

    private void btnCarta22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta22MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta22MouseExited

    private void btnCarta23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta23MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta23MouseExited

    private void btnCarta24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta24MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta24MouseExited

    private void btnCarta25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta25MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta25MouseExited

    private void btnCarta26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta26MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta26MouseExited

    private void btnCarta27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta27MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta27MouseExited

    private void btnCarta28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta28MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta28MouseExited

    private void btnCarta29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta29MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta29MouseExited

    private void btnCarta30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta30MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta30MouseExited
    // activa el panel escoger reporte
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        activarUnPanel("panelEscogerReporte");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCarta33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta33ActionPerformed
        btnHabilitado(btnCarta33);
        
    }//GEN-LAST:event_btnCarta33ActionPerformed

    private void btnCarta33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta33MouseExited
        compararCartas();
        
    }//GEN-LAST:event_btnCarta33MouseExited

    private void btnCarta34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta34ActionPerformed
        btnHabilitado(btnCarta34);
        
    }//GEN-LAST:event_btnCarta34ActionPerformed

    private void btnCarta34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta34MouseExited
        compararCartas();
        
    }//GEN-LAST:event_btnCarta34MouseExited

    private void btnCarta36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta36ActionPerformed
        btnHabilitado(btnCarta36);
        
    }//GEN-LAST:event_btnCarta36ActionPerformed

    private void btnCarta36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta36MouseExited
        compararCartas();
        
    }//GEN-LAST:event_btnCarta36MouseExited

    private void btnCarta38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta38ActionPerformed
        btnHabilitado(btnCarta38);
        
    }//GEN-LAST:event_btnCarta38ActionPerformed

    private void btnCarta38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta38MouseExited
        compararCartas();
        
    }//GEN-LAST:event_btnCarta38MouseExited

    private void btnCarta40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta40ActionPerformed
        btnHabilitado(btnCarta40);
        
    }//GEN-LAST:event_btnCarta40ActionPerformed

    private void btnCarta40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta40MouseExited
        compararCartas();
        
    }//GEN-LAST:event_btnCarta40MouseExited

    private void btnCarta39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta39ActionPerformed
        btnHabilitado(btnCarta39);
        
    }//GEN-LAST:event_btnCarta39ActionPerformed

    private void btnCarta39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta39MouseExited
        compararCartas();
        
    }//GEN-LAST:event_btnCarta39MouseExited

    private void btnCarta37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta37ActionPerformed
        btnHabilitado(btnCarta37);
        
    }//GEN-LAST:event_btnCarta37ActionPerformed

    private void btnCarta37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta37MouseExited
        compararCartas();
        
    }//GEN-LAST:event_btnCarta37MouseExited

    private void btnCarta35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta35ActionPerformed
        btnHabilitado(btnCarta35);
        
    }//GEN-LAST:event_btnCarta35ActionPerformed

    private void btnCarta35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta35MouseExited
        compararCartas();
        
    }//GEN-LAST:event_btnCarta35MouseExited

    private void btnCarta31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta31ActionPerformed
        btnHabilitado(btnCarta31);
        
    }//GEN-LAST:event_btnCarta31ActionPerformed

    private void btnCarta31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta31MouseExited
        compararCartas();
        
    }//GEN-LAST:event_btnCarta31MouseExited

    private void btnCarta32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta32ActionPerformed
       btnHabilitado(btnCarta32);
       
    }//GEN-LAST:event_btnCarta32ActionPerformed

    private void btnCarta32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta32MouseExited
        compararCartas();
        
    }//GEN-LAST:event_btnCarta32MouseExited

    private void btnCarta41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta41MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta41MouseExited

    private void btnCarta41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta41ActionPerformed
        btnHabilitado(btnCarta41);
    }//GEN-LAST:event_btnCarta41ActionPerformed

    private void btnCarta42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta42MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta42MouseExited

    private void btnCarta42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta42ActionPerformed
        btnHabilitado(btnCarta42);
    }//GEN-LAST:event_btnCarta42ActionPerformed

    private void btnCarta43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta43MouseExited
       compararCartas();
    }//GEN-LAST:event_btnCarta43MouseExited

    private void btnCarta43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta43ActionPerformed
        btnHabilitado(btnCarta43);
    }//GEN-LAST:event_btnCarta43ActionPerformed

    private void btnCarta44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta44MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta44MouseExited

    private void btnCarta44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta44ActionPerformed
        btnHabilitado(btnCarta44);
    }//GEN-LAST:event_btnCarta44ActionPerformed

    private void btnCarta45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta45MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta45MouseExited

    private void btnCarta45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta45ActionPerformed
        btnHabilitado(btnCarta45);
    }//GEN-LAST:event_btnCarta45ActionPerformed

    private void btnCarta46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta46MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta46MouseExited

    private void btnCarta46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta46ActionPerformed
        btnHabilitado(btnCarta46);
    }//GEN-LAST:event_btnCarta46ActionPerformed

    private void btnCarta47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta47MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta47MouseExited

    private void btnCarta47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta47ActionPerformed
        btnHabilitado(btnCarta47);
    }//GEN-LAST:event_btnCarta47ActionPerformed

    private void btnCarta48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta48MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta48MouseExited

    private void btnCarta48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta48ActionPerformed
        btnHabilitado(btnCarta48);
    }//GEN-LAST:event_btnCarta48ActionPerformed

    private void btnCarta49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta49MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta49MouseExited

    private void btnCarta49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta49ActionPerformed
        btnHabilitado(btnCarta49);
    }//GEN-LAST:event_btnCarta49ActionPerformed

    private void btnCarta50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta50MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta50MouseExited

    private void btnCarta50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta50ActionPerformed
        btnHabilitado(btnCarta50);
    }//GEN-LAST:event_btnCarta50ActionPerformed

    private void btnCarta51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta51MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta51MouseExited

    private void btnCarta51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta51ActionPerformed
        btnHabilitado(btnCarta51);
    }//GEN-LAST:event_btnCarta51ActionPerformed

    private void btnCarta52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta52MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta52MouseExited

    private void btnCarta52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta52ActionPerformed
        btnHabilitado(btnCarta52);
    }//GEN-LAST:event_btnCarta52ActionPerformed

    private void btnCarta53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta53MouseExited
       compararCartas();
    }//GEN-LAST:event_btnCarta53MouseExited

    private void btnCarta53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta53ActionPerformed
        btnHabilitado(btnCarta53);
    }//GEN-LAST:event_btnCarta53ActionPerformed

    private void btnCarta54MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta54MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta54MouseExited

    private void btnCarta54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta54ActionPerformed
        btnHabilitado(btnCarta54);
    }//GEN-LAST:event_btnCarta54ActionPerformed

    private void btnCarta55MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta55MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta55MouseExited

    private void btnCarta55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta55ActionPerformed
        btnHabilitado(btnCarta55);
    }//GEN-LAST:event_btnCarta55ActionPerformed

    private void btnCarta56MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta56MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta56MouseExited

    private void btnCarta56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta56ActionPerformed
        btnHabilitado(btnCarta56);
    }//GEN-LAST:event_btnCarta56ActionPerformed

    private void btnCarta57MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta57MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta57MouseExited

    private void btnCarta57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta57ActionPerformed
        btnHabilitado(btnCarta57);
    }//GEN-LAST:event_btnCarta57ActionPerformed

    private void btnCarta58MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta58MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta58MouseExited

    private void btnCarta58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta58ActionPerformed
        btnHabilitado(btnCarta58);
    }//GEN-LAST:event_btnCarta58ActionPerformed

    private void btnCarta59MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta59MouseExited
        compararCartas();
    }//GEN-LAST:event_btnCarta59MouseExited

    private void btnCarta59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta59ActionPerformed
        btnHabilitado(btnCarta59);
    }//GEN-LAST:event_btnCarta59ActionPerformed

    private void btnCarta60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarta60MouseExited
       compararCartas();
    }//GEN-LAST:event_btnCarta60MouseExited

    private void btnCarta60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta60ActionPerformed
        btnHabilitado(btnCarta60);
    }//GEN-LAST:event_btnCarta60ActionPerformed

    private void txtQuienLlevaElTurnoFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuienLlevaElTurnoFacilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuienLlevaElTurnoFacilActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void txtDondeVaElNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDondeVaElNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDondeVaElNombreActionPerformed

    private void btnEnviarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarNombreActionPerformed
        crearNuevoJugador( txtDondeVaElNombre.getText());
        
    }//GEN-LAST:event_btnEnviarNombreActionPerformed

    private void btnRadioCrearJugadorSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRadioCrearJugadorSiMouseClicked
        mostrarInformacionParaNuevoJugador();
    }//GEN-LAST:event_btnRadioCrearJugadorSiMouseClicked

    private void btnRadioCrearJugadorNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRadioCrearJugadorNoMouseClicked
        ocultarInformacionParaNuevojugador();
    }//GEN-LAST:event_btnRadioCrearJugadorNoMouseClicked

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        mostrarInformacionDeLaAplicacion();
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    private void btnJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegoActionPerformed
        crearPartida();
    }//GEN-LAST:event_btnJuegoActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        activarUnPanel("panelMenuInicio");
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void comboBoxNombreJugadores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNombreJugadores1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxNombreJugadores1ActionPerformed

    private void ComboBoxNombreJugadores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNombreJugadores2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxNombreJugadores2ActionPerformed

    private void btnEmpezarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarPartidaActionPerformed
        verificarDatosParaEmpezarPartida();
        elegirTurno();
    }//GEN-LAST:event_btnEmpezarPartidaActionPerformed

    private void btnRadioDificultadFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioDificultadFacilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadioDificultadFacilActionPerformed

    private void btnRadioDificultadFacilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRadioDificultadFacilMouseClicked
        
    }//GEN-LAST:event_btnRadioDificultadFacilMouseClicked

    private void btnOrdenarGanadoresPorPunteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarGanadoresPorPunteoActionPerformed
        ordenarJugadoresGanadoresPorPunteo();
    }//GEN-LAST:event_btnOrdenarGanadoresPorPunteoActionPerformed

    private void btnReporteJugadoresGanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteJugadoresGanadoresActionPerformed
        irAlPanelConJugadoresGanadores();
    }//GEN-LAST:event_btnReporteJugadoresGanadoresActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        activarUnPanel("panelAyuda");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtQuienLlevaElTurnoDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuienLlevaElTurnoDificilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuienLlevaElTurnoDificilActionPerformed

    private void btnReporteMayorPunteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteMayorPunteoActionPerformed
        mostrarReporteMayorPunteo();
    }//GEN-LAST:event_btnReporteMayorPunteoActionPerformed

    private void txtNombreJugadorMayorPunteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreJugadorMayorPunteoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreJugadorMayorPunteoActionPerformed

    private void txtPunteoJugadorMayorPunteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPunteoJugadorMayorPunteoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPunteoJugadorMayorPunteoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JugarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JugarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JugarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JugarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JugarJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxNombreJugadores2;
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btnCarta1;
    private javax.swing.JButton btnCarta10;
    private javax.swing.JButton btnCarta11;
    private javax.swing.JButton btnCarta12;
    private javax.swing.JButton btnCarta13;
    private javax.swing.JButton btnCarta14;
    private javax.swing.JButton btnCarta15;
    private javax.swing.JButton btnCarta16;
    private javax.swing.JButton btnCarta17;
    private javax.swing.JButton btnCarta18;
    private javax.swing.JButton btnCarta19;
    private javax.swing.JButton btnCarta2;
    private javax.swing.JButton btnCarta20;
    private javax.swing.JButton btnCarta21;
    private javax.swing.JButton btnCarta22;
    private javax.swing.JButton btnCarta23;
    private javax.swing.JButton btnCarta24;
    private javax.swing.JButton btnCarta25;
    private javax.swing.JButton btnCarta26;
    private javax.swing.JButton btnCarta27;
    private javax.swing.JButton btnCarta28;
    private javax.swing.JButton btnCarta29;
    private javax.swing.JButton btnCarta3;
    private javax.swing.JButton btnCarta30;
    private javax.swing.JButton btnCarta31;
    private javax.swing.JButton btnCarta32;
    private javax.swing.JButton btnCarta33;
    private javax.swing.JButton btnCarta34;
    private javax.swing.JButton btnCarta35;
    private javax.swing.JButton btnCarta36;
    private javax.swing.JButton btnCarta37;
    private javax.swing.JButton btnCarta38;
    private javax.swing.JButton btnCarta39;
    private javax.swing.JButton btnCarta4;
    private javax.swing.JButton btnCarta40;
    private javax.swing.JButton btnCarta41;
    private javax.swing.JButton btnCarta42;
    private javax.swing.JButton btnCarta43;
    private javax.swing.JButton btnCarta44;
    private javax.swing.JButton btnCarta45;
    private javax.swing.JButton btnCarta46;
    private javax.swing.JButton btnCarta47;
    private javax.swing.JButton btnCarta48;
    private javax.swing.JButton btnCarta49;
    private javax.swing.JButton btnCarta5;
    private javax.swing.JButton btnCarta50;
    private javax.swing.JButton btnCarta51;
    private javax.swing.JButton btnCarta52;
    private javax.swing.JButton btnCarta53;
    private javax.swing.JButton btnCarta54;
    private javax.swing.JButton btnCarta55;
    private javax.swing.JButton btnCarta56;
    private javax.swing.JButton btnCarta57;
    private javax.swing.JButton btnCarta58;
    private javax.swing.JButton btnCarta59;
    private javax.swing.JButton btnCarta6;
    private javax.swing.JButton btnCarta60;
    private javax.swing.JButton btnCarta7;
    private javax.swing.JButton btnCarta8;
    private javax.swing.JButton btnCarta9;
    private javax.swing.JButton btnEmpezarPartida;
    private javax.swing.JButton btnEnviarNombre;
    private javax.swing.ButtonGroup btnGroupCrearJugador;
    private javax.swing.ButtonGroup btnGroupSeleccionarDificultad;
    private javax.swing.JButton btnJuego;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnOrdenarGanadoresPorPunteo;
    private javax.swing.JRadioButton btnRadioCrearJugadorNo;
    private javax.swing.JRadioButton btnRadioCrearJugadorSi;
    private javax.swing.JRadioButton btnRadioDificultadDificil;
    private javax.swing.JRadioButton btnRadioDificultadFacil;
    private javax.swing.JRadioButton btnRadioDificultadNormal;
    private javax.swing.JButton btnReporteJugadoresGanadores;
    private javax.swing.JButton btnReporteMayorPunteo;
    private javax.swing.JComboBox<String> comboBoxNombreJugadores1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblEscogerNombre;
    private javax.swing.JLabel lblModoDeJuegoFacil;
    private javax.swing.JLabel lblModoDeJuegoNormal;
    private javax.swing.JLabel lblNombreJugador1Dificil;
    private javax.swing.JLabel lblNombreJugador1Facil;
    private javax.swing.JLabel lblNombreJugador1Normal;
    private javax.swing.JLabel lblNombreJugador2Dificil;
    private javax.swing.JLabel lblNombreJugador2Facil;
    private javax.swing.JLabel lblNombreJugador2Normal;
    private javax.swing.JLabel lblPuntuacionJugador1Dificil;
    private javax.swing.JLabel lblPuntuacionJugador1Facil;
    private javax.swing.JLabel lblPuntuacionJugador1Normal;
    private javax.swing.JLabel lblPuntuacionJugador2Dificil;
    private javax.swing.JLabel lblPuntuacionJugador2Facil;
    private javax.swing.JLabel lblPuntuacionJugador2Normal;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JPanel panelAyuda;
    private javax.swing.JPanel panelEscogerReporte;
    private javax.swing.JPanel panelIniciarPartida;
    private javax.swing.JPanel panelJuegoDificil;
    private javax.swing.JPanel panelJuegoFacil;
    private javax.swing.JPanel panelJuegoNormal;
    private javax.swing.JPanel panelMenuInicio;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel panelMostrarReporteJugadorMayorPunteo;
    private javax.swing.JPanel panelMostrarReporteJugadoresGanadores;
    private javax.swing.JPanel panelMostrarReporteJugadoresGanadoresOrdenados;
    private javax.swing.JTable tablaJugadoresGanadores;
    private javax.swing.JTable tablaJugadoresGanadores1;
    private javax.swing.JTextField txtDondeVaElNombre;
    private javax.swing.JTextField txtNombreJugadorMayorPunteo;
    private javax.swing.JTextField txtPunteoJugadorMayorPunteo;
    private javax.swing.JTextField txtQuienLlevaElTurnoDificil;
    private javax.swing.JTextField txtQuienLlevaElTurnoFacil;
    private javax.swing.JTextField txtQuienLlevaElTurnoNormal;
    // End of variables declaration//GEN-END:variables
}
