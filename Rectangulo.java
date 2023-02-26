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
        if((esqI.getX()+x)<ancho && (esqI.getX()+y)<alto)
            interior = true;
        
        return interior;
    }
    
    
    public boolean contiene(Punto unPunto){
        boolean interior = false;
        if(contiene(unPunto.getX(), unPunto.getY()))
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
        
        int newX      = Math.min(esqI.getX(), rectangulo.getAncho());
        int newY      = Math.min(esqI.getY(), rectangulo.getAlto());
        int newWidth  = Math.max(esqI.getX() + ancho - newX, esqI.getX() + rectangulo.getAncho() - newX);
        int newHeight = Math.max(esqI.getY() + alto - newY, esqI.getY() + rectangulo.getAlto() - newY);
        
        return new Rectangulo(newX, newY, newWidth, newHeight);
    }
    
    public Rectangulo interseccion(Rectangulo rectangulo){
        Rectangulo rect;
        int newX      = Math.min(esqI.getX(), rectangulo.getAncho());
        int newY      = Math.min(esqI.getY(), rectangulo.getAlto());
        int newWidth  = Math.max(esqI.getX() + ancho - newX, esqI.getX() + rectangulo.getAncho() - newX);
        int newHeight = Math.max(esqI.getY() + alto - newY, esqI.getY() + rectangulo.getAlto() - newY);
        
        
        if (newWidth <= 0 || newHeight <= 0)
            rect = null;
        else
            rect = new Rectangulo(newX, newY, newWidth, newHeight);
        
        return rect;
    }
    
    
}
