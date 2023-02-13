/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author alumno
 */
public class Circulo {
    private Punto centro;
    private double radio;
    
    public Circulo(int x, int y, double radio){
        this(new Punto(x,y),radio);
    }
    
    public Circulo(Punto centro, double radio) {
        this.centro = centro;//usar la pasada por parámetros
        this.radio = radio;
    }

    public Circulo() {
        this(new Punto(0,0),1);
    }

    @Override
    public String toString() {
        return "Circulo["  + "radio=" + radio + "centro=" + centro +']';
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double getCircunferencia(){
        return Math.PI * 2* radio;
    }
    
    public double distancia(Circulo otroCirculo){
        return centro.distancia(otroCirculo.centro);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
