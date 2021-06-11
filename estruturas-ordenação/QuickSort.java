
public class QuickSort {
	private static int start;
	private static int end;
	private Integer pivoStart;
	private Integer indexPivoStart;
	private Integer indextroca = 0;
	
	public Integer[] sort(Integer[] array) {
		start = 0;
		end = array.length - 1;
		pivoStart = array[0];
		quickSort(array, start, end);
		return array;
	}

	private void quickSort(Integer[] array, int inicio, int fim) {
		
		if (inicio > fim) {
			return;
		}
		else {
		Integer indexPivo = inicio;
		Integer temp = 0;

		while (array[indexPivo] >= array[indexPivo + 1]) {
			temp = array[indexPivo];
			array[indexPivo] = array[indexPivo + 1];
			array[indexPivo + 1] = temp;
			indextroca = indexPivo + 1;
			indexPivo++;
		}

		for (int i = indextroca; i <= fim; i++) {
			if (array[indexPivo] > array[i]) {
//				int tempM = array[i];
				array[indexPivo] = array[i];
				indextroca = i;
				while (indextroca > indexPivo + 1) {
					array[indextroca] = array[indextroca - 1];
					indextroca--;
				}
				array[indexPivo + 1] = temp;
				indexPivo++;
			}
		}
		
//			indexPivoStart = indexPivo;
		/*
		 * Chamada recursiva para redivisao do vetor de elementos menores que o pivô.
		 */
		quickSort(array, inicio, indexPivo - 1);
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]  == pivoStart) {
				indexPivoStart = i;
				break;
			}
		}
		indextroca = indexPivoStart + 1;
		quickSort(array, indexPivoStart++, array.length-1);}
	}
}
