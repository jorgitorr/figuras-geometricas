/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author alumno
 */
public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0,0);
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distancia(int x1, int y1){
        return Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1 - y),2));
    }
    
    public double distancia(Punto unPunto){
        return distancia(unPunto.getX(), unPunto.getY());
    }
    
    public double distancia(){
        return distancia(0,0);
    }
    
    private void voltear(){
        int almacenX = x;
        this.x = -y;
        this.y = -almacenX;
    }
    
    public int distanciaManhattan(Punto unPunto){
        return Math.abs(this.x - unPunto.getX()) + Math.abs(this.y - unPunto.getY());
    }
    
    private boolean esVertical(Punto unPunto){
        boolean iguales = false;
        if(this.x==unPunto.getX())
            iguales = true;
        
        return iguales;
    }
    
    
    public double pendiente(Punto unPunto){
        double resultado = 0;
        
        if(x!=unPunto.getX() && y!=unPunto.getY()){
            resultado = (unPunto.getY() - y) / (unPunto.getX() - x);
        }
        
        return resultado;
    }
    
    public boolean esColineal(Punto unPunto1, Punto unPunto2){
        boolean esColineal = false;
        
        double pendiente1 = Math.round(this.pendiente(unPunto1)*10000.0)/1000.0;
        double pendiente2 = Math.round(unPunto1.pendiente(unPunto2)*10000.0)/1000.0;
        
        if(unPunto1.getX() == unPunto2.getX() && this.x == unPunto1.getX() 
                || pendiente1 == pendiente2)
            esColineal = true;
        
        return esColineal;
    }
    
    public static void main(String[] args) {
        Punto p1 = new Punto();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("X de p1: " + p1.getX());
        System.out.println("Y de p1: " + p1.getY());
        
        Punto p2 = new Punto(3,4);
        System.out.println(p2);
        System.out.println("distancia de p1 al p2: " + p2.distancia(p1));
        System.out.println("distancia de p2 al p1: " + p1.distancia(p2));
        
        System.out.println("distancia de p1 a coordenadas: " + p1.distancia(5,6));
        System.out.println("del p1 al origen: " + p1.distancia());
        
        Punto p3 = new Punto(5,-3);
        p3.voltear();
        System.out.println(p3);
        System.out.println(p3.esColineal(p1, p2));
        System.out.println(p3.distanciaManhattan(p2));
        System.out.println("Es vertical: " + p3.esVertical(p2));
        
        
    }

    
}
