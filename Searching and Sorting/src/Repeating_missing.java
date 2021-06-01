import java.util.Arrays;

public class Repeating_missing {
	
	public static void rs(int arr[],int n) {
		Arrays.sort(arr);
		int j = 0;
		for(int i=1;i<=n-1;i++) {
				if( arr[i]==arr[i-1])
					
				System.out.println("Repeating element is:" + arr[i]);
			
			if(arr[i+1]-arr[i]>1)
				 j=i+1;
				
		}
		System.out.println("Missing element is:" + j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,3,3,6,6,4,7,7};
		int n=arr.length;
		rs(arr,n);

	}

}
