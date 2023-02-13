/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author alumno
 */
public class Triangulo {
    //static porque se usa en todos los objetos
    //con el mismo valor
    //y final porque el valor es siempre el mismo
    private static final int EQUILATERO = 1;
    private static final int ISOSCELES = 2;
    private static final int ESCALENO = 3;
    private Punto v1;
    private Punto v2;
    private Punto v3;

    public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(new Punto(x1, y1),new Punto(x2, y2),new Punto(x3, y3));
        //lama al constructor de abajo
    }

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "Triangulo[" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + ']';
    }

    public Punto getV1() {
        return v1;
    }

    public void setV1(Punto v1) {
        this.v1 = v1;
    }

    public Punto getV2() {
        return v2;
    }

    public void setV2(Punto v2) {
        this.v2 = v2;
    }

    public Punto getV3() {
        return v3;
    }

    public void setV3(Punto v3) {
        this.v3 = v3;
    }
    
    public double getPerimetro(){
        return v1.distancia(v3) + v3.distancia(v2) + v2.distancia(v1);
    }
    
    public int getTipo(){
        int tipo;
        //cada distacia entre vx y vy representa el lado (la distancia entre los vertices)
        if(v1.distancia(v2) == v2.distancia(v3)){
            tipo = ISOSCELES;
            if(v2.distancia(v3)== v3.distancia(v1))
                tipo = EQUILATERO;
        }else if(v2.distancia(v3)== v3.distancia(v1))
            tipo = ISOSCELES;
        else
            tipo = ESCALENO;
        return tipo;
    }
    
    
    
    
    
    
    
    
    
}
