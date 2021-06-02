
public class zeros_n_factorial {
	
	static boolean ch(int p,int n) {
		int temp=p;int f=5;int count=0;
		while(f<=temp) {
			count +=temp/f;
			f=f*5;
		}
		return count>=n;
	}
	
	static int find(int n) {
		if(n==1) return 5;
		int l=0;int h=5*n;
		while(l<h) {
			int mid=(l+h)/2;
			if (ch(mid,n))
				h=mid;
			else l=mid+1;
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(6));
		

	}

}
