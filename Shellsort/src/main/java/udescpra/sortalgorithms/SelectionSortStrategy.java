package udescpra.sortalgorithms;
/**
 * Ordena usando o método da seleção
 * @author udesc
 */
public class SelectionSortStrategy extends AbstractSortStrategy {
	/**
	 * Implementa a ordenação pelo método da seleção
	 */
	@Override
	public void sort() {
        int[] elementos = this.getElements();
        int tamanho = elementos.length;
        int k =tamanho-1;
        int min;
        for (int i = 0; i < tamanho; i++) {
        	min = i;
			for (int j = i; j < tamanho; j++) {
				if (elementos[j]<elementos[min]) {
					min = j;
				}
			}
			if(min!=i) {
				swap(i, min);
			}
		}
	}
}
