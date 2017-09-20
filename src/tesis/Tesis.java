/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis;

/**
 *
 * @author mbernedo
 */
public class Tesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] a = {2, 2, 5};
        double[] u = {3, 5, 2};
        Pearson corr = new Pearson(a, u);
        double rpta = corr.correlacion();
        System.out.println(rpta);
    }

}
