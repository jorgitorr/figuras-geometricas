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

    @Override
    public String toString() {
        return "Rectangulo{" + esqI + ", ancho=" + ancho + ", alto=" + alto + '}';
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }
    
    
    public boolean contiene(int x, int y){
        boolean interior = false;
        if(x<ancho && y<alto)
            interior = true;
   
        return interior;
    }
    
    
    public boolean contiene(Punto unPunto){
        boolean interior = false;
        if(esqI.distanciaManhattan(unPunto)>=0)
            interior = true;
        
        return interior;
    }
    
    public boolean contiene(Rectangulo rectangulo){
        boolean esContenido = false;
        if(rectangulo.getAncho()<this.ancho && rectangulo.getAlto()<this.alto)
            esContenido = true;
        
        return esContenido;
    }
    
    public Rectangulo union(Rectangulo rectangulo){
        Rectangulo rectanguloDevuelto;
        
        if(this.contiene(rectangulo))
            rectanguloDevuelto = this;
        else
            rectanguloDevuelto = rectangulo;
        
        return rectanguloDevuelto;
    }
    
    public Rectangulo interseccion(Rectangulo rectangulo){
        Rectangulo rectanguloDevuelto;
        int alto, ancho;
        
        if(this.contiene(rectangulo)){
            alto = this.getAlto() + rectangulo.getAlto();
            ancho = this.getAncho() + rectangulo.getAncho();
            rectanguloDevuelto = new Rectangulo(esqI, ancho, alto);
        }else{
            rectanguloDevuelto = new Rectangulo(esqI, 0, 0);
        }
        
        return rectanguloDevuelto;
    }
    
    
}
