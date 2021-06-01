
public class Max_and_min {
	static class pair{
		int min;int max;
	}
	
	static pair mm(int arr[],int n) {
		pair mm=new pair();
		int i;
		
		if(n==1) {mm.max=arr[0]; mm.min=arr[0]; }
		
		if(arr[0]>arr[1]) {
		     mm.min =arr[1];
		     mm.max=arr[0];
		}
		else{
		     mm.min =arr[0];
		     mm.max=arr[1];
		}
		
		for(i=2;i<n;i++) {
			if(arr[i]>mm.max)
				mm.max=arr[i];
			else if(arr[i]<mm.min)
				mm.min=arr[i];
		}
		
		return mm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 12,4,58,63,28,100,45,3,18,41};
		int n=arr.length;
		pair dd=mm(arr,n);
		System.out.println("Minimum element is :" + dd.min);
		System.out.println("Maximum element is :" + dd.max);

	}

}
