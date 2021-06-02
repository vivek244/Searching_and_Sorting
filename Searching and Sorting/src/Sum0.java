import java.util.ArrayList;
import java.util.HashMap;

class pair {
	int a,b;
	pair(int c,int d){
		a=c;b=d;
	}
}

public class Sum0 {
	
	static ArrayList<pair> sum(int arr[], int n){
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
		
		ArrayList<pair> out=new ArrayList<>();
		int s=0;
		for(int i=0;i<n;i++) {
			s +=arr[i];
			if(s==0)
				out.add(new pair(0,i));
			ArrayList<Integer> al=new ArrayList<>();
			if(map.containsKey(s)) {
				al=map.get(s);
				for(int it=0;it<al.size();it++) {
					out.add(new pair(al.get(it) +i,1));
				}
			}
			al.add(i);
            map.put(s, al);
		}
		return out;
	}
	
	static void print(ArrayList<pair> out)
    {
            for (int i = 0; i < out.size(); i++)
            {
                pair p = out.get(i);
                System.out.println("Subarray found from Index "
                        + p.a + " to " + p.b); 
            }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
         int n = arr.length;
           
         ArrayList<pair> out = sum(arr, n);

         if (out.size() == 0)
             System.out.println("No subarray exists");
         else
             print(out);

	}

}
