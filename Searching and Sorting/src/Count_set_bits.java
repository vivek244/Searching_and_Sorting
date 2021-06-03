import java.util.Arrays;

public class Count_set_bits {
	
	public static int[] sort(int arr[],int n) {
		int aux[]=new int[n];
		for(int i=0;i<n;i++)
			aux[i]=countbits(arr[i]);
		
		insertion(arr,aux,n);
		return aux;
	}
	
	public static void insertion(int arr[],int aux[],int n) {
		for(int i=0;i<n;i++) {
			 int key1 = aux[i];
		     int key2 = arr[i];
		     int j=i-1;
		     while (j >= 0 && aux[j] < key1)
		        {
		            aux[j + 1] = aux[j];
		            arr[j + 1] = arr[j];
		            j = j - 1;
		        }
		     aux[j + 1] = key1;
		     arr[j + 1] = key2;
		}
	}
	
	public static int countbits(int a) {
		int count=0;
		while(a>0) {
			if((a & 1)>0)
				count+=1;
			a=a>>1;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6};
	    int n = arr.length;
	    int aux[]=new int[n];
	    aux=sort(arr, n);
	    System.out.println(Arrays.toString(arr));

	}

}
