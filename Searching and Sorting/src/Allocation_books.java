import java.util.Arrays;

public class Allocation_books {
	
	static boolean is(int arr[],int n,int m,int curr) {
		int st=1;int count =0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]> curr)
				return false;
//	System.out.println(Arrays.toString(arr));
			
			if(count +arr[i]>curr)
				st++;count=arr[i];
				if(st>m) return false;
				else count+=arr[i];
//				System.out.println(st);
//				System.out.println(curr);
		}
		return true;
	}
	
	static int find(int arr[],int n,int m) {
		int sum=0;
		if(n<m) return -1;
		for(int i=0;i<n;i++) {
			sum +=arr[i];
		}
		int s=0;int e=sum;
		int result=Integer.MAX_VALUE;
		while(s<=e) {
			int mid=(s+e)/2;
			if (is(arr,n,m,mid)) {
				result=mid;
				e=mid-1;
			}
			else s=mid+1;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {12, 34, 67, 90};
        
        int m = 2; 
      
        System.out.println("Minimum number of pages = " +
                          find(arr, arr.length, m));

	}

}
