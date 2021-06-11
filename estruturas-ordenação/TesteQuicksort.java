
public class TesteQuicksort {

	public static void main(String[] args) {
		
		QuickSort ordenar = new QuickSort();
		
//	    Integer vetor[] = {5, 4, 6, 8, 2, 7, 3, 1, 9};
	    Integer vetor[] = {5, 4, 9, 3, 2, 1, 10};
		
	    imprimirVetor(vetor);
	    
		imprimirVetor(ordenar.sort(vetor));

	}
	
	private static void imprimirVetor(Integer[] vetor) {
		System.out.println("Vetor...\n");
	    for(int num : vetor) {
	        System.out.print(num + ", ");
	      }
	}

}
