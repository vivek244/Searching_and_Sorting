
public class incl_excl {
	
	public static int find(int arr[],int n) {
		int inc=arr[0];
		int exc=0;
		int excn,i;
		for(i=1;i<n;i++) {
			excn=(inc>exc)?inc:exc;
			inc=exc+arr[i];
			exc=excn;
		}
		return(inc>exc)?inc:exc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{5, 5, 10, 100, 10, 5};
        System.out.println(find(arr, arr.length));

	}

}
