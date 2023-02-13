/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PruebaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Triangulo t1 = new Triangulo(new Punto(-2,-3), new Punto(-4,-5), new Punto(-1,-6));
        Triangulo t2 = new Triangulo(new Punto(3,6), new Punto(1,2), new Punto(5,3));
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(new Punto(10,10),3);
        int opcion;
        do{
            System.out.println("**************************************************************");
            System.out.println("*                          MENU                              *");
            System.out.println("**************************************************************");
            System.out.println("*  1.Muestra vértices, perímetro y tipo de triángulo 1       *");
            System.out.println("*  2.Muestra vértices, perímetro y tipo de triángulo 2       *");
            System.out.println("*  3.Muestra centro, radio, circunsferencia y área circulo 1 *");
            System.out.println("*  4.Muestra centro, radio, circunsferencia y área círculo 2 *");
            System.out.println("*  5.Muestra distancia de círculo 1 a círculo 2              *");
            System.out.println("*  6.Modifica radio y centro círculo 1                       *");
            System.out.println("*  7.Halla la circunsferencia de un círculo dado:            *");
            System.out.println("*    el centro en (0,0) y el punto (3,4) en circunsferencia  *");
            System.out.println("*  8.Salir                                                   *");
            System.out.println("**************************************************************");
            System.out.println("*  Introduce tu opción: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println(t1);
                    System.out.println("El perímetro del triángulo es: " + t1.getPerimetro());
                    switch(t1.getTipo()){
                        case 1:
                            System.out.println("EQUILATERO");
                            break;
                        case 2:
                            System.out.println("ISOSCELES");
                            break;
                        case 3:
                            System.out.println("ESCALENO");
                            break;
                    }
                    break;
                case 2:
                    System.out.println(t2);
                    System.out.println("El perímetro del triángulo es: " + t2.getPerimetro());
                    switch(t2.getTipo()){
                        case 1:
                            System.out.println("EQUILATERO");
                            break;
                        case 2:
                            System.out.println("ISOSCELES");
                            break;
                        case 3:
                            System.out.println("ESCALENO");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("El centro del círculo es: " + c1.getCentro());
                    System.out.println("El rádio del círculo es: " + c1.getRadio());
                    System.out.println("La círcunferencia del círculo es: " + c1.getCircunferencia());
                    System.out.println("El área del círculo es: " + c1.getArea());
                    break;
                case 4:
                    System.out.println("El centro del círculo es: " + c2.getCentro());
                    System.out.println("El rádio del círculo es: " + c2.getRadio());
                    System.out.println("La círcunferencia del círculo es: " + c2.getCircunferencia());
                    System.out.println("El área del círculo es: " + c2.getArea());
                    break;
                case 5:
                    System.out.println("la distancia de círculo 1 al 2 es: " + c2.distancia(c1));
                    break;
                case 6:
                    System.out.println("Introduce el nuevo radio del círculo 1");
                    int radio = sc.nextInt();
                    c1.setRadio(radio);
                    System.out.println("Introduce el nuevo centro del círculo 1");
                    System.out.println("Introduce x: ");
                    int x = sc.nextInt();
                    System.out.println("Introduce y: ");
                    int y = sc.nextInt();
                    c1.setCentro(new Punto(x,y));
                    break;
                case 7:
                    Punto centro = new Punto();
                    Punto p = new Punto(3,4);
                    radio = (int) centro.distancia(p);
                    Circulo c = new Circulo(centro,radio);
                    System.out.println(c);
                    System.out.println(c.getCircunferencia());
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                    
            }
            
        }while(opcion!=8);
        
    }
    
}
