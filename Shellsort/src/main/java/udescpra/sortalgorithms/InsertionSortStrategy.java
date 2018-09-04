package udescpra.sortalgorithms;
/**
 * Ordena usando o método da inserção
 * @author udesc
 */
public class InsertionSortStrategy extends AbstractSortStrategy {
	/**
	 * Implementa a ordenação pelo método da inserção
	 */
	@Override
	public void sort() {
        int[] elementos = this.getElements();
        int tamanho = elementos.length;
        int k;
        int valor;
        for (int i = 1; i < tamanho; i++) {
        	valor = elementos[i];
        	k = i - 1;
			while(k >= 0 && elementos[k] > valor) {
				elementos[k+1] = elementos[k];
				k--;
			}
			elementos[k+1] = valor;
		}
        print();
	}
}
