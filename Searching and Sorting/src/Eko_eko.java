
public class Eko_eko {
	
	public static int kk(int arr[],int m) {
		int n=arr.length;
		int beg,mid,end,i,cutted;
		int h=0; int max=0;
		
		for(i=0;i<n;i++){
			if(arr[i]>max)
				max=arr[i];
		}

		beg=0; end=max; 
//        System.out.println(end);

		while ( beg <= end ) {
	        mid = ( beg + end ) / 2;

	        cutted = 0;
	        for ( i = 0; i < n; ++i ) {
	            if ( arr[ i ] - mid > 0 ) {
	                cutted += arr[ i ] - mid;
	            }
	        }
	        if ( cutted > m ) {
	            beg = mid + 1;
	            if ( mid > h ) {
	                h = mid;
	            }
	        }
	        else if ( cutted < m ) {
	            end = mid - 1;
	        }
	        else {
	            h = mid;
	            break;
	        }
	    }
		return h;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,15,10,17};
		System.out.println(kk(arr,7));

	}

}
