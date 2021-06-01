
public class Sorted_Rotated {
	
	public static int pivot(int arr[],int n,int key) {
		
		int pivot= findpivot(arr,0,n-1);
		if(pivot==-1)
			return binary(arr,0,n-1,key);
		
		if(arr[pivot]==key)
			return key;
		if(arr[0]<=key)
			return binary(arr, 0, pivot - 1, key);
        return binary(arr, pivot + 1, n - 1, key);
	}
	
	public static int binary(int arr[],int low,int high,int key) {
		
		if(high<low)
			return -1;
		
		int mid=(low+high)/2;
		if(key==arr[mid])
			return mid;
		if(key>arr[mid])
			return binary(arr,mid+1,high,key);
		
		return binary(arr,low,mid-1,key);
		
	}
	
	public static int findpivot(int arr[],int low,int high) {
		
		if(high<low )
			return -1;
		int mid;
		mid=(high+low)/2;
		
		if(mid<high && arr[mid]>arr[mid+1]) {
			return mid;
		}
		if (mid > low && arr[mid] < arr[mid - 1])
	        return (mid - 1);
		
		if(arr[low] >=arr[mid])
			return findpivot(arr,low,mid-1);
		return findpivot(arr,mid+1,high);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={ 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int n=arr.length;
		int key=8;
		System.out.println("Index of element is:" + pivot(arr,n,key));

	}

}
