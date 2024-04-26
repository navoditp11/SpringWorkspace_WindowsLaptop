
public class MergeSortImplementation {

	public void mergeSort(int[] array, int low, int high) {
		if(low < high) {
			int mid = (low + high)/2;
			// 2, 3, 4, 5, 6, 7, 8, 9     low = 0  high = 7 mid = 3 array.lngth= 8 
			mergeSort(array, low, mid);
			mergeSort(array, mid + 1, high);
			
			merge(array, low, mid, high);
		}
		
	}

	private void merge(int[] array, int low, int mid, int high) {
		
		int n1 = mid - low + 1; // 3 - 0 + 1 = 4
		int n2 = high - mid; // 7 - 3 = 4
		
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			leftArray[i] = array[low + i]; // 0, 1, 2, 3 
		}
		
		for(int j = 0; j < n2; j++) {
			rightArray[j] = array[mid + 1 + j]; // 4, 5, 6, 7
		}
		
		int i = 0, j = 0;
		int k = low;
		
		while((i < n1) && (j < n2)) {
			if(leftArray[i] < rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			}
			else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i < n2) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}

}
