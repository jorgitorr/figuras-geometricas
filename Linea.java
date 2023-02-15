/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author jorge
 */
public class Linea {
    Punto punto1;
    Punto punto2;

    public Linea(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Linea(int x1, int y1, int x2, int y2) {
        this(new Punto(x1,y1), new Punto(x2,y2));
    }

    @Override
    public String toString() {
        return "{" + "punto1=" + punto1 + ", punto2=" + punto2 + '}';
    }
    
    public double pendiente(){
        return punto1.pendiente(punto2);
    }
    
    public boolean esColineal(Punto unPunto){
        return unPunto.esColineal(punto1, punto2);
    }
    
    
    public static void main(String[] args) {
        
    }

}
