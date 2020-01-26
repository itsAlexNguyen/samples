package sample;


/**
 * The class Heap has methods to sort array in O(NlgN) time and in place
 * <br>
 * Heapsort works by building a max-heap then doing sortdown
 *
 */
public class Heap {
	/**
	 * heap sort (case-insensitive)
	 * @param x array of subjects
	 * @param y associated array
	 * @param n problem size
	 */
	public static void sortHeap (String[] x, String[] y, int n ) {
		this.construct(x,y,n);		
		this.sort(x,y,n);
	}
	
	/**
	 * heap sort (case-insensitive)
	 * @param x array of subjects
	 * @param y associated array
	 * @param n problem size
	 */
	public static void sortHeap (String[] x, Integer[] y, int n ) {
		this.construct(x,y,n);		
		this.sort(x,y,n);
	}
	
	/**
	 * Builds a max heap
	 * @param x input string array
	 * @param y associated array
	 * @param n problem size
	 */
	private static void construct(String[] x, String[] y, int n){

		for (int i = (n-1)/2; i >= 0; i--){
			int index = i;			
			while (index*2+1 < n && ((lower(x[2*index+1]).compareTo(lower(x[index])) > 0) || (index*2+2 < n && lower(x[2*index+2]).compareTo(lower(x[index])) > 0))){

				if (index*2+2 >= n){
					exchange (x,y, 2*index+1,index);
					index = 2*index+1;
					break;
				}				
				if (lower(x[2*index+2]).compareTo(lower(x[2*index+1])) > 0) {
					exchange(x,y, 2*index+2, index);
					index = 2*index+2;
				} else {
					exchange (x,y, 2*index+1,index);
					index = 2*index+1;
				}							
			}			
		}

	}
	
	/**
	 * Builds a max heap
	 * @param x input string array
	 * @param y associated array
	 * @param n problem size
	 */
	private static void construct(String[] x, Integer[] y, int n){

		for (int i = (n-1)/2; i >= 0; i--){
			int index = i;			
			while (index*2+1 < n && ((lower(x[2*index+1]).compareTo(lower(x[index])) > 0) || (index*2+2 < n && lower(x[2*index+2]).compareTo(lower(x[index])) > 0))){

				if (index*2+2 >= n){
					exchange (x,y, 2*index+1,index);
					index = 2*index+1;
					break;
				}				
				if (lower(x[2*index+2]).compareTo(lower(x[2*index+1])) > 0) {
					exchange(x,y, 2*index+2, index);
					index = 2*index+2;
				} else {
					exchange (x,y, 2*index+1,index);
					index = 2*index+1;
				}							
			}			
		}

	}

	/**
	 * Performs sortdown of a max-oriented heap to produce a sorted array
	 * @param x input array organized as max-oriented heap
	 * @param y associated array
	 * @param n size of input array
	 */
	private static void sort(String[] x, String[] y, int n){		

		int end = n - 1;
		while (end > 0){

			if (end == 1 && lower(x[1]).compareTo(lower(x[0])) > 0) break;

			exchange(x, y, 0, end);

			//fix heap order by checking root node with child nodes and switching where necessary 
			int i = 0;			
			while (2*i+1 < end && 2*i+2 < end && ((lower(x[2*i+1]).compareTo(lower(x[i])) > 0) || (lower(x[2*i+2]).compareTo(lower(x[i])) > 0))){
				//If at least one of the children is non-null and bigger				
				int replaced = end;

				if (lower(x[2*i+2]).compareTo(lower(x[2*i+1])) > 0) {
					exchange(x,y, 2*i+2, i);
					replaced = 2*i+2;
				} else {
					exchange (x,y, 2*i+1,i);
					replaced = 2*i+1;
				}					
				i = replaced;
			}					
			end--;
		}
	}
	
	/**
	 * Performs sortdown of a max-oriented heap to produce a sorted array
	 * @param x input array organized as max-oriented heap
	 * @param y associated array
	 * @param n size of input array
	 */
	private static void sort(String[] x, Integer[] y, int n){		

		int end = n - 1;
		while (end > 0){

			if (end == 1 && lower(x[1]).compareTo(lower(x[0])) > 0) break;

			exchange(x, y, 0, end);

			//fix heap order by checking root node with child nodes and switching where necessary 
			int i = 0;			
			while (2*i+1 < end && 2*i+2 < end && ((lower(x[2*i+1]).compareTo(lower(x[i])) > 0) || (lower(x[2*i+2]).compareTo(lower(x[i])) > 0))){
				//If at least one of the children is non-null and bigger				
				int replaced = end;

				if (lower(x[2*i+2]).compareTo(lower(x[2*i+1])) > 0) {
					exchange(x,y, 2*i+2, i);
					replaced = 2*i+2;
				} else {
					exchange (x,y, 2*i+1,i);
					replaced = 2*i+1;
				}					
				i = replaced;
			}					
			end--;
		}
	}

	private static String lower(String str){
		String lowercase = "";
		for (int i = 0; i < str.length(); i++){
			lowercase += java.lang.Character.toLowerCase(str.charAt(i));
		}
		return lowercase;
	}
	
	
	/**
	 * Swaps elements x[a] and x[b]
	 * @param x input array
	 * @param y input array
	 * @param a index of first element
	 * @param b index of second element
	 */
	private static void exchange(Comparable[] x, Comparable[] y, int a, int b){
		Comparable temp = x[a];
		x[a] = x[b];
		x[b] = temp;
		
		Comparable temp1 = y[a];
		y[a] = y[b];
		y[b] = temp1;
	}

	/**
	 * Checks if the array is sorted (natural order)
	 * @param x test array
	 * @param n length of array
	 * @return true if sorted, otherwise false
	 */
	private static boolean isSorted(String[] x, int n){
		for (int i = 0; i < n - 1; i++){
			if (lower(x[i]).compareTo(lower(x[i+1])) > 0) {
				return false;			
			}
		}
		return true;
	}
}
