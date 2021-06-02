import java.util.Arrays;
import java.util.Comparator;

class job{
	int s,f,p;

	public job(int s,int f,int p){
		this.s=s;
		this.f=f;
		this.p=p;
	}
}
class JobComparator implements Comparator<job>
{
    public int compare(job a, job b)
    {
        return a.f < b.f ? -1 : a.f == b.f ? 0 : 1;
    }
}
  

public class Job_Scheduling {
	
	static int bs(job arr[],int n) {
		int l=0;
		int h=n-1;
		
		while(l<=h) {
			
			int mid=(l+h)/2;
			
			if(arr[mid].f <=arr[n].s) {
				
				if(arr[mid+1].f <arr[n].s)
					l=mid+1;
				
				else return mid;
			}
			else h=mid-1;
		}
		return -1;
	}
	
	static public int sch(job jj[]) {
		
		Arrays.sort(jj,new JobComparator());
		int n=jj.length;
		int table[]=new int[n];
		table[0]=jj[0].p;
		for(int i=1;i<n;i++) {
			int incl=jj[i].p;
			int l=bs(jj,i);
			if(l!=-1)
				incl+=table[i];
			
			table[i]=Math.max(incl, table[i-1]);
		}
		return table[n-1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		job jobs[] = {new job(1,2,50) , new job(3,5,20), new job(20,100,60), new job(3,100,20) };

  System.out.println("Optimal profit is " + sch(jobs));

	}

}
