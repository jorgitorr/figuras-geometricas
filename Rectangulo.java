/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author jorge
 */
public class Rectangulo {
    private Punto esqI;
    private int ancho;
    private int alto;

    public Rectangulo(Punto esqI, int ancho, int alto) {
        this.esqI = esqI;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(int x, int y, int ancho, int alto) {
        this(new Punto(x,y),ancho,alto);
    }
    
    
    
    
}
