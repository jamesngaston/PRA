package udescpra.sortalgorithms;
/**
 * Ordena usando o método da bolha
 * @author udesc
 */
public class BubbleSortStrategy extends AbstractSortStrategy {
	/**
	 * Implementa a ordenação pelo método da bolha
	 */
	@Override
	public void sort() {
        int[] elementos = this.getElements();
        int tamanho = elementos.length;
        int k =tamanho-1;
        for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < k; j++) {
				if (elementos[j]>elementos[j+1]) {
					swap(j,j+1);
				}
			}
			k--;
		}
	}
}
