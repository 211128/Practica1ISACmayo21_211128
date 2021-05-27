
package Hora;
import java.util.Scanner;

public class Hora {
    Scanner leer = new Scanner(System.in);
    private int hora;
    private int minuto;
    private int segundo;  
    
    public void SetHora(){
        this.hora=leer.nextInt();
    }
    public void SetMin(){
        this.minuto=leer.nextInt();
    }
    public void SetSeg(){
        this.segundo=leer.nextInt();
    }
    
    public int GetHora(){
        return hora;
    }
    
    public int GetMin(){
        return minuto;
    }
    public int GetSeg(){
        return segundo;
    }
}
