/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udescpra.sortalgorithms;

/**
 *
 * @author james
 */
public class ShellSort extends AbstractSortStrategy {
    
    @Override
    public void sort() {
        int[] elementos = this.getElements();
        int tamanho = elementos.length;
        int valor;
        int k;
        int h = 1;
        while (h < tamanho) {
            h = h * 3 + 1;
        }
        while (h > 1) {
            h = h / 3;
            for (int i = h; i < tamanho; i++) {
                valor = elementos[i];
                k = i;
                while (k >= h && elementos[k - h] > valor) {
                    elementos[k] = elementos[k - h];
                    k = k - h;
                }
                elementos[k] = valor;
            }
        }
        print();
    }
    
}
