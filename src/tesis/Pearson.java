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
public class Pearson {

    private double[] x;
    private double[] y;
    private int n;
    public double a, b;

    public Pearson(double[] x, double[] y) {
        this.x = x;
        this.y = y;
        n = x.length;
    }

    public double correlacion() {
        double suma = 0.0;
        for (int i = 0; i < n; i++) {
            suma += x[i];
        }
        double mediaX = suma / n;
        suma = 0.0;
        for (int i = 0; i < n; i++) {
            suma += y[i];
        }
        double mediaY = suma / n;
        double pxy, sx2, sy2;
        pxy = sx2 = sy2 = 0.0;
        for (int i = 0; i < n; i++) {
            pxy += (x[i] - mediaX) * (y[i] - mediaY);
            sx2 += (x[i] - mediaX) * (x[i] - mediaX);
            sy2 += (y[i] - mediaY) * (y[i] - mediaY);
        }
        return pxy / Math.sqrt(sx2 * sy2);
    }
}