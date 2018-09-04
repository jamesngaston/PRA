package udescpra.sortalgorithms;

import java.util.Random;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	int[] data = new int[5000];

	/**
	 * Inicializa o conjunto que será usado para testes
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
		Random rnd = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt();
		}
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Verifica se o conjunto esta ordenado pela estratégia passada
	 * 
	 * @param strategy
	 * @return
	 */
	private boolean isSorted(IStrategy strategy) {
		int[] elements = data.clone(); 
		StrategyCommand.execute(elements, strategy);
		for (int i = 0; i < elements.length - 1; i++) {
			int j = elements[i];
			boolean cond = (j <= elements[i + 1]);
			if (cond == false) {
				return false;
			}
		}
		return true;
	}
	/**
	 * Verifica se o BubbleSort foi executado corretamente
	 */
	public void testShell() {
		IStrategy strategy = new ShellSort();
		boolean   sorted   = isSorted(strategy); 
		assertTrue(sorted);
	}
	
}
