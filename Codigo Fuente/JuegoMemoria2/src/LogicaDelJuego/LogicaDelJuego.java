
package LogicaDelJuego;

import java.util.Random;

public class LogicaDelJuego {
    // sirve para ordenar las cartas en parejas y luego darle un numero aleatorio en dificil
    public int[] getNumeroCartasDificil(){
        int[] numeros= new int[30];
        int contador=0;
        
        while(contador<30){
            Random aleatorionumero= new Random();
            int numeroAleatorio = aleatorionumero.nextInt(15)+1;
            int numeroVecesRepetido = 0;
            
            for(int i=0;i<30;i++){
                if(numeros[i]==numeroAleatorio){
                    numeroVecesRepetido++;
                }
            }
            if(numeroVecesRepetido<2){
                numeros[contador]=numeroAleatorio;
                contador++;
            }
        }
        return numeros;
    }
    // sirve para ordenar las cartas en parejas y luego darle un numero aleatorio en normal
    public int[] getNumeroCartasNormal(){
        int[] numeros= new int[20];
        int contador=0;
        
        while(contador<20){
            Random aleatorionumero= new Random();
            int numeroAleatorio = aleatorionumero.nextInt(10)+1;
            int numeroVecesRepetido = 0;
            
            for(int i=0;i<20;i++){
                if(numeros[i]==numeroAleatorio){
                    numeroVecesRepetido++;
                }
            }
            if(numeroVecesRepetido<2){
                numeros[contador]=numeroAleatorio;
                contador++;
            }
        }
        return numeros;
    }
    // sirve para ordenar las cartas en parejas y luego darle un numero aleatorio en facil
    public int[] getNumeroCartasFacil(){
        int[] numeros= new int[10];
        int contador=0;
        
        while(contador<10){
            Random aleatorionumero= new Random();
            int numeroAleatorio = aleatorionumero.nextInt(5)+1;
            int numeroVecesRepetido = 0;
            
            for(int i=0;i<10;i++){
                if(numeros[i]==numeroAleatorio){
                    numeroVecesRepetido++;
                }
            }
            if(numeroVecesRepetido<2){
                numeros[contador]=numeroAleatorio;
                contador++;
            }
        }
        return numeros;
    }
    


    


}