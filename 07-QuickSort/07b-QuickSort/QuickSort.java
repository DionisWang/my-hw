import java.util.*;
public class QuickSort{
    //Really don't understand how to do the 7b part. Everytime I fix something the code gets more messed up.
    public static int[] qsort(int[] a, int l, int r){
	if(l>=r){
	    return a;
	}
	Random rnd=new Random();
	int ind=rnd.nextInt(r-l)+l;
	int rwall=r;
	int p=a[ind];
	ind=0;
	int wall=l;
	int temp=0;
	for(int i=l;i<rwall;i++){
	    if(a[i]==p&&a[r-ind]!=p){
		temp=a[r-ind];
		a[r-ind]=p;
		a[i]=temp;
		ind++;
		rwall--;
	    }else if(a[i]==p){
		ind++;
		rwall--;
		i--;
	    }
	}
	for(int i=l;i<=r;i++){
	    if(a[i]<p){
		temp=a[wall];
		a[wall]=a[i];
		a[i]=temp;
		wall++;
	    }
	}
	for(int i=0;i<ind;i++){
	    temp=a[wall+i];
	    a[wall+i]=a[r-i];
	    a[r-i]=temp;
	}
	if(ind==0){
	    ind=1;
	}
	qsort(a,wall+ind,r);
	qsort(a,l,wall-1);
	return a;
    }
    public static int[] qsort(int[] a){
	return qsort(a,0,a.length-1);
    }
    public static void main(String[] args){
	int n=0;
	int m=0;
	try{
	    n=Integer.parseInt(args[0]);
	    m=Integer.parseInt(args[1]);
	}catch(Exception e){
	    System.out.println("Failed input. Using default!");
	    n=10000;
	    m=10000;
	}
	Random r= new Random();
	int[] a=new int[n];
	for(int i=0;i<a.length;i++){
	    a[i]=r.nextInt(m);
	}
	int start =(int)System.currentTimeMillis();
	qsort(a);
	int elapsed =(int)System.currentTimeMillis()-start;
	System.out.println("Time: "+elapsed+"\n");
    }
}
