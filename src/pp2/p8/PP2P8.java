/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p8;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class PP2P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double c1, c2, hipotenusa;
        c1 = pedirCateto();
        c2 = pedirCateto();
        hipotenusa = CalcularHipotenusa(c1, c2);
        Mostrar(c1, c2, hipotenusa);
    }
    public static double pedirCateto (){
        double cateto;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el valor del cateto ");
        cateto = entrada.nextDouble();
        return cateto;
    }
    public static double CalcularHipotenusa(double c1, double c2){
        double hipotenusa, a;
        a = (Math.pow(c1,2))+(Math.pow(c2, 2));
        hipotenusa = Math.sqrt(a);
        return hipotenusa;
    }
    public static void Mostrar(double c1, double c2, double hipotenusa){
        System.out.println("La hipotenusa es igual a " +hipotenusa +" de los catetos " +c1 +" y "+c2);
    }
}
