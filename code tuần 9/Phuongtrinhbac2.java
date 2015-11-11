/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongtrinhbac2;



/**
 *
 * @author Musashi
 */
public class Phuongtrinhbac2 {


  static double[] solve(double a, double b, double c) {

        double x1, x2, delta;
        double[] results = new double[2];
        delta = b*b-4*a*c; 
        if (a != 0) {
            if (delta > 0) {
                x1 = ((-b) - Math.sqrt(delta)) / (2 * a);
                x2 = ((-b) + Math.sqrt(delta)) / (2 * a);
                results[0] = x1;
                results[1] = x2;
                System.out.println("x1=" + x1 + "\n" + "x2=" + x2);
            } else if (delta == 0) {
                x1 = (-b) / (2 * a);
                results[0] = results[1]=x1;

                System.out.println("x1=" + x1);
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            if (b!=0){
                x1=-c/b;
                results[0] = results[1]=x1;
            }
            else{
                if(c!=0)
                System.out.println("Vo nghiem");  
            }
            
            
        }

        return results;
    }
}
